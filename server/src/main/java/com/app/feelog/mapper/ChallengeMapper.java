package com.app.feelog.mapper;

import com.app.feelog.domain.vo.CommonTaskVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ChallengeMapper {

    // 2025.04.16 조승찬  :: 공통 과제 생성하기
    void insertCommonTask(CommonTaskVO common);

    Long getmaxIdOfTask();

    int checkIfExists(@Param("id") Long id);

    void insertMemberTask(@Param("id") Long id);
}
