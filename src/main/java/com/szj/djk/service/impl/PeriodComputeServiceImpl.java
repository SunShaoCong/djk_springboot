package com.szj.djk.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.szj.djk.entity.PeriodCompute;
import com.szj.djk.mapper.PeriodComputeMapper;
import com.szj.djk.service.PeriodComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 周期计算Service业务层处理
 *
 * @author jiahua
 * @date 2022-11-07
 */
@Service
public class PeriodComputeServiceImpl extends ServiceImpl<PeriodComputeMapper, PeriodCompute> implements PeriodComputeService {
    @Autowired
    PeriodComputeMapper periodComputeMapper;

    @Override
    public List<PeriodCompute> autoAdd(String startTime) {
        List<PeriodCompute> list = periodComputeMapper.autAdd(startTime);
        return list;
    }
}
