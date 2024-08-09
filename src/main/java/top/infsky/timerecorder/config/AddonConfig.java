package top.infsky.timerecorder.config;


import lombok.Getter;
import lombok.Setter;
import org.spongepowered.configurate.objectmapping.ConfigSerializable;
import org.spongepowered.configurate.objectmapping.meta.Comment;

import java.util.List;

@Getter
@Setter
public class AddonConfig extends AutoLoadTomlConfig {

    @Comment("允许定时消息")
    private boolean allowGoodMorning = true;
    @Comment("允许撤回消息")
    private boolean allowRecall = true;
    @Comment("消息记录上限")
    private long maxMessageHistory = 10;  // 目前用于撤回
    @Comment("允许消息过滤器")
    private boolean allowFilter = true;
    @Comment("允许OP绕过过滤器")
    private boolean allowOPBypassFilter = false;
    @Comment("过滤消息部分")
    private List<String> filterWords = List.of("fuck");
    @Comment("允许计算OP活跃度 (Vanish状态下也会计算活跃度！)")
    private boolean allowOPActiveCount = true;
    @Comment("活跃度权重：移动距离")
    private double moveDistanceWeight = 140;
    @Comment("活跃度权重：拾起物品")
    private double itemPickWeight = 375;
    @Comment("活跃度权重：破坏方块")
    private double blockBreakWeight = 450;
    @Comment("活跃度权重：放置方块")
    private double blockPlaceWeight = 500;
    @Comment("活跃度权重：击杀生物")
    private double entityKilledWeight = 600;

}