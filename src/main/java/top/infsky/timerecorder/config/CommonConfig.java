package top.infsky.timerecorder.config;


import lombok.Getter;
import lombok.Setter;
import org.spongepowered.configurate.objectmapping.ConfigSerializable;
import org.spongepowered.configurate.objectmapping.meta.Comment;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: McBotSupport-fabric / CommonConfig
 * Author: cnlimiter
 * CreateTime: 2023/11/7 20:24
 * Description:
 */
@Getter
@Setter
public class CommonConfig {

    @Comment("允许定时输出统计数据")
    private boolean allowAutoReport = true;
    @Comment("统计数据输出时间(24小时制)")
    private String time = "00:00:00";
    @Comment("允许统计指令")
    private boolean allowCommandStats = true;
    @Comment("统计指令列表")
    private List<String> commandStatsList = List.of("gamemode", "tp");

    @Comment("开启Q群功能")
    private boolean groupOn = true;
    @Comment("Q群列表")
    private List<Long> groupIdList = new ArrayList<>();  // 支持多个q群



    public void removeGroupId(long id) {
        groupIdList.remove(id);
    }

    public void addGroupId(long id) {
        if (!groupIdList.contains(id)) groupIdList.add(id);
    }

}
