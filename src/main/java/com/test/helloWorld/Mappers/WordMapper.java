package com.test.helloWorld.Mappers;

import com.test.helloWorld.Entities.Word;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface WordMapper {

    @Select("SELECT * FROM WORD WHERE id = #{id}")
    Word getWord(@Param("id") Long id);
}
