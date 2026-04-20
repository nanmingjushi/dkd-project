package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Channel;
import com.dkd.manage.domain.Sku;
import lombok.Data;

/**
 * @author nan chao
 * @since 2026/4/20 14:45
 */




@Data
public class ChannelVo extends Channel {

    private Sku sku;

}
