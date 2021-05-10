package pl.wsb.students.course.app.mapper;

import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import pl.wsb.students.course.app.dto.PositionDTO;
import pl.wsb.students.course.app.dto.TDListDTO;
import pl.wsb.students.course.app.model.Positions;
import pl.wsb.students.course.app.model.TDList;

import java.util.List;

public interface PositionMapper {
    @Mappings({
            @Mapping(target="id", source="entity.id"),
            @Mapping(target="title", source="entity.title"),
            @Mapping(target="description", source="entity.description"),
    })
    PositionDTO positionToPositionDTO(Positions entity);

    @Mappings({
            @Mapping(target="id", source="dto.id"),
            @Mapping(target="title", source="dto.title"),
            @Mapping(target="description", source="dto.description"),
    })
    Positions TDListDTOToTDList(PositionDTO dto);

    List<PositionDTO> map(Iterable<Positions> positions);
}
