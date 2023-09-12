package com.simple.framework.common.model;


import java.util.List;

public interface TreeNode<T extends TreeNode<T>> {

    /**
     * 获取id
     *
     * @return long
     */
    Long getId();

    /**
     * 设置节点id
     *
     * @param id id
     */
    void setId(Long id);

    /**
     * 获取父节点id
     *
     * @return 父节点id
     */
    Long getParentId();

    /**
     * 设置父节点id
     *
     * @param parentId 父节点id
     */
    void setParentId(Long parentId);

    /**
     * 获取子节点列表
     *
     * @return list
     */
    List<T> getChildList();

    /**
     * 设置子节点列表
     *
     * @param childList 子节点列表
     */
    void setChildList(List<T> childList);
}
