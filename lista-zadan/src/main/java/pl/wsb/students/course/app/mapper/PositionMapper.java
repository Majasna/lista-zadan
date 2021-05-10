package pl.wsb.students.course.app.mapper;

import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import pl.wsb.students.course.app.dto.TDListDTO;
import pl.wsb.students.course.app.model.TDList;

import java.util.List;

public interface PositionMapper {
    @Mappings({
            @Mapping(target="id", source="entity.id"),
            @Mapping(target="firstName", source="entity.firstName"),
            @Mapping(target="lastName", source="entity.lastName")
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
