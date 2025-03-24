<template>
  <div >
   <div class="card" style="margin-bottom: 5px">
     <el-input style="width: 260px;margin-right: 5px" v-model="input" placeholder="请输入名称查询" :prefix-icon="Search"></el-input>
     <el-button type="primary">查询</el-button>
   </div>
    <div class="card" style="margin-bottom: 5px">
      <el-button type="danger">批量删除</el-button>
      <el-button type="primary">新 增</el-button>
      <el-button type="success">批量导入</el-button>
      <el-button type="info">批量导出</el-button>
    </div>
    <div class="card" style="margin-bottom: 5px">
      <el-table :data="data.tableData" style="width: 100%" :header-cell-style="{color:'#333',backgroundColor:'#eaf4ff'}">
        <el-table-column type="selection" width="55" />
        <el-table-column prop="name" label="名称" width="180" />
        <el-table-column prop="phone" label="电话"  />
        <el-table-column prop="address" label="地址" width="180"/>
      </el-table>
    </div>
    <div class="card" style="margin-bottom: 5px">
      <el-pagination
          v-model:current-page="data.pageNum"
          :page-size="data.pageSize"
          :size="data.pageSize"
          layout="total, prev, pager, next"
          :total="data.total"
      />
    </div>
  </div>
</template>

<script setup>
import {reactive} from "vue";
const data= reactive({
  name:null,
  tableData:[
    {name:'小虎',phone:'123456789',address:'西安邮电大学'},
    {name:'小李',phone:'987654321',address:'西安邮电大学'},
    {name:'小王',phone:'741852963',address:'西安邮电大学'},
    {name:'小陆',phone:'147852369',address:'西安邮电大学'},
    {name:'小刘',phone:'123654789',address:'西安邮电大学'},
    {name:'小徐',phone:'789654123',address:'西安邮电大学'},
  ],
  pageNum:1,
  pageSize:5,
  total:6
})
</script>
