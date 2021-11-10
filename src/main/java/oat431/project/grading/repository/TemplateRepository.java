package oat431.project.grading.repository;

import oat431.project.grading.entity.Template;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TemplateRepository extends JpaRepository<Template,Long> {
    List<Template> findAll();
}
