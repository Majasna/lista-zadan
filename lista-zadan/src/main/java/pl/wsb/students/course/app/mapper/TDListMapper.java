package pl.wsb.students.course.app.mapper;

import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import pl.wsb.students.course.app.dto.TDListDTO;
import pl.wsb.students.course.app.model.TDList;

import java.util.List;

public interface TDListMapper {
    @Mappings({
            @Mapping(target="id", source="entity.id"),
            @Mapping(target="title", source="entity.title"),
            @Mapping(target="description", source="entity.description"),
            @Mapping(target="listType", source="entity.listType"),
            @Mapping(target="created", source="entity.created"),
            @Mapping(target="modified", source="entity.modified")
    })
    TDListDTO tdlistToTDListDTO(TDList entity);

    @Mappings({
            @Mapping(target="id", source="dto.id"),
            @Mapping(target="title", source="dto.title"),
            @Mapping(target="description", source="dto.description"),
            @Mapping(target="listType", source="dto.listType"),
            @Mapping(target="created", source="dto.created"),
            @Mapping(target="modified", source="dto.modified")
    })
    TDList TDListDTOTotdlist(TDListDTO dto);

    List<TDListDTO> map(Iterable<TDList> lists);
}
