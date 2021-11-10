package oat431.project.grading.controller;

import oat431.project.grading.entity.Template;
import oat431.project.grading.service.TemplateService;
import oat431.project.grading.util.AppMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TemplateController {
    @Autowired
    TemplateService templateService;

    @GetMapping("/get-template")
    public ResponseEntity<?> getTemplates(){
        List<Template> outputs = templateService.getTemplates();
        return ResponseEntity.ok(AppMapper.INSTANCE.getTempDto(outputs));
    }
}
