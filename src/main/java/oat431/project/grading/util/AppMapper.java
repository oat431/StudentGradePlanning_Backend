package oat431.project.grading.util;

import oat431.project.grading.dto.TemplateDto;
import oat431.project.grading.entity.Template;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.stream.Collectors;
import java.util.List;

@Mapper(imports = Collectors.class)
public interface AppMapper {
    AppMapper INSTANCE = Mappers.getMapper(AppMapper.class);

    TemplateDto getTempDto(Template template);
    List<TemplateDto> getTempDto(List<Template> templates);
}