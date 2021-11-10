package oat431.project.grading.dao.Impl;

import oat431.project.grading.dao.TemplateDao;
import oat431.project.grading.entity.Template;
import oat431.project.grading.repository.TemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TemplateDaoImpl implements TemplateDao {
    @Autowired
    TemplateRepository templateRepository;

    @Override
    public List<Template> getTemplates() {
        return templateRepository.findAll();
    }
}
