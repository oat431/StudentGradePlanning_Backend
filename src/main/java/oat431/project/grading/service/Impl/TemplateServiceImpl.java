package oat431.project.grading.service.Impl;

import oat431.project.grading.dao.TemplateDao;
import oat431.project.grading.entity.Template;
import oat431.project.grading.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateServiceImpl implements TemplateService {
    @Autowired
    TemplateDao templateDao;
    @Override
    public List<Template> getTemplates() {
        return templateDao.getTemplates();
    }
}
