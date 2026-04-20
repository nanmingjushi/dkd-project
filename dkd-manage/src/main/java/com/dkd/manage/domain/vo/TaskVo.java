package com.dkd.manage.domain.vo;

import com.dkd.manage.domain.Task;
import com.dkd.manage.domain.TaskType;
import lombok.Data;

/**
 * @author nan chao
 * @since 2026/4/20 16:59
 */


@Data
public class TaskVo extends Task {

    private TaskType taskType;
}
