package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Partner;
import lombok.Data;

/**
 * @author nan chao
 * @since 2026/4/14 15:40
 */


@Data
public class PartnerVo extends Partner {

    //点位数量
    private Integer nodeCount;
}
