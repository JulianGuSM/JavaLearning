package com.hs.ptscan.dao.ptppmc;

import com.hs.ptscan.model.PtPxjg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : Julian
 * @date : 2019/5/27 16:08
 */
@Mapper
public interface PtPxjgMapper {
    List<PtPxjg> getPtPxjgsByCustomerCode(@Param("khdm") String khdm);
}
