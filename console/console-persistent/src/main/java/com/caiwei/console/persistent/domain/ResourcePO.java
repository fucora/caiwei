package com.caiwei.console.persistent.domain;


import com.github.framework.server.shared.domain.po.BasePO;

public class ResourcePO extends BasePO {

    private static final long serialVersionUID = 8523958187302001936L;
    /**
     * 权限编码
     */
    private String resCode;

    /**
     * 权限名称
     */
    private String resName;

    /**
     * 权限入口URI
     */
    private String entryUrl;

    /**
     * 功能层级(1：子系统 2：模块 3：菜单 4：按钮)
     */
    private Byte resLevel;

    /**
     * 上级权限
     */
    private String parentRes;

    /**
     * 权限类型(1：子系统 2：模块 3：菜单 4：按钮)
     */
    private Byte resType;

    /**
     * 显示顺序
     */
    private Byte displayOrder;

    /**
     * 是否权限检查
     */
    private Byte checked;

    /**
     * 是否叶子节点
     */
    private Byte leafFlag;

    /**
     * 节点的CSS样式
     */
    private String nodeCls;

    /**
     * 图标的CSS样式
     */
    private String iconCls;

    /**
     * 所属系统类型
     */
    private String systemCode;

    /**
     * 权限描述
     */
    private String notes;

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getEntryUrl() {
        return entryUrl;
    }

    public void setEntryUrl(String entryUrl) {
        this.entryUrl = entryUrl;
    }

    public Byte getResLevel() {
        return resLevel;
    }

    public void setResLevel(Byte resLevel) {
        this.resLevel = resLevel;
    }

    public String getParentRes() {
        return parentRes;
    }

    public void setParentRes(String parentRes) {
        this.parentRes = parentRes;
    }

    public Byte getResType() {
        return resType;
    }

    public void setResType(Byte resType) {
        this.resType = resType;
    }

    public Byte getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Byte displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Byte getChecked() {
        return checked;
    }

    public void setChecked(Byte checked) {
        this.checked = checked;
    }

    public Byte getLeafFlag() {
        return leafFlag;
    }

    public void setLeafFlag(Byte leafFlag) {
        this.leafFlag = leafFlag;
    }

    public String getNodeCls() {
        return nodeCls;
    }

    public void setNodeCls(String nodeCls) {
        this.nodeCls = nodeCls;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public String getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(String systemCode) {
        this.systemCode = systemCode;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}