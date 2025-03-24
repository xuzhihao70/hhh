<template>
  <div><!--头部区域 -->
    <div style="height:60px;background-color:#eee;display: flex;align-items: center">
      <div style="display: flex;align-items: center;padding-left:20px ">
        <img style="width: 100px;height: 40px;border-radius:50%" src="@/assets/img/logo.jpg">
        <span style="font-size: 20px;font-weight: bold;color: #000000">校园心理健康助手</span>
      </div>
      <div style="flex: 1;display: flex;align-items: center;padding-left:20px;border-bottom:1px solid #ddd">
            首页/数据分析
      </div>
      <div style="width: fit-content;display: flex;align-items: center;padding-right: 20px;border-bottom:1px solid #ddd">
        <el-dropdown>
          <div style="display: flex;align-items: center;">
            <img style="width: 40px;height: 40px;border-radius: 50%" src="@/assets/img/机器人头像.png/" alt="">
            <span style="padding-left: 5px">管理员</span>
          </div>
          <template #dropdown>
            <el-dropdown-menu>
              <el-dropdown-item>个人信息</el-dropdown-item>
              <el-dropdown-item>修改密码</el-dropdown-item>
              <el-dropdown-item>退出登录</el-dropdown-item>
            </el-dropdown-menu>
          </template>
        </el-dropdown>
      </div>
    </div>
  </div>
  <div style="display: flex">
    <div style="width: 240px"><!--菜单区域 -->
      <el-menu router :default-openeds="['1']" default-active="/manager/home" style="min-height: calc(100vh - 60px)">
        <el-menu-item index="/manager/home">
          <el-icon><House /></el-icon>
          <span>首页</span>
        </el-menu-item>
        <el-sub-menu index="1">
          <template #title>
            <el-icon><location /></el-icon>
            <span>数据管理</span>
          </template>
          <el-menu-item index="/manager/about">关于数据</el-menu-item>
        </el-sub-menu>
      </el-menu>
    </div>
    <div style="flex:1;width:0;padding: 10px;background-color:#e9ecfb "><!--数据渲染区域 -->
      <RouterView />
    </div>
  </div>
</template>

<style>
  .el-menu {
    background-color: #3a456b;
    border: none;
  }
  .el-sub-menu__title {
    background-color: #3a456b;
    color: #ddd;
  }
  .el-menu-item {
    height: 50px;
    color: #ddd;
  }
  .el-menu .is-active {
    background-color: #537bee;
    color: #fff;
  }
  .el-sub-menu__title:hover {
    background-color: #3a456b;
  }
  .el-menu-item:not(.is-active):hover {
    background-color: #7a9fff;
    color: #333;
  }
  .el-dropdown{
    cursor: pointer;
  }
  .el-tooltip__trigger{
    outline: none;
  }
  .el-menu--inline .el-menu-item{
    padding-left: 48px !important;
  }
</style>
<script lang="ts">
</script>