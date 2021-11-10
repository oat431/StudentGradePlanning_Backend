package oat431.project.grading.config;

import oat431.project.grading.entity.Template;
import oat431.project.grading.repository.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    TemplateRepository templateRepository;

    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent){
        Template template;
        template = Template.builder()
                .name("The initialize Template Entity")
                .createAt(Timestamp.valueOf(LocalDateTime.now()))
                .build();

        templateRepository.save(template);
    }
}
