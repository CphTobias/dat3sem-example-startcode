package utils;

import dtos.DTOEntity;
import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;

public class DtoUtils {

    public static DTOEntity convertToDto(Object obj, DTOEntity mapper) {
        return new ModelMapper().map(obj, mapper.getClass());
    }

    public static List<DTOEntity> convertList(List<?> obj, DTOEntity mapper) {
        List<DTOEntity> l = new ArrayList<>();
            for (Object p : obj) {
                System.out.println(p);
                DTOEntity dtoEntity = new ModelMapper().map(p, mapper.getClass());
                System.out.println(dtoEntity);
                l.add(dtoEntity);
            }
        return l;
    }

}
