package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Node;
import com.dkd.manage.domain.Partner;
import com.dkd.manage.domain.Region;
import lombok.Data;

/**
 * @author nan chao
 * @since 2026/4/16 10:57
 */

@Data
public class NodeVo extends Node {

    //设备数量
    private Integer vmCount;


    //区域
     private Region region;

    //合作商
    private Partner partner;

}
