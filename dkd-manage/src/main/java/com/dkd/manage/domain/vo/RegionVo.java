package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Region;
import lombok.Data;

/**
 * @author nan chao
 * @since 2026/4/14 14:29
 */

@Data
public class RegionVo extends Region {

    //点位数量
    private Integer nodeCount;
}
