layui.config({
    base: '/layuiadmin/' //静态资源所在路径
}).extend({
    index: 'lib/index' //主入口模块
}).use(['index', 'table'], function(){
    var admin = layui.admin
        ,table = layui.table;
    var prefix = "/system/sysDept"
    table.render({
        elem: '#app-table-height'
        ,url: prefix + '/list'
        ,height: 'full-100'
        ,cellMinWidth: 80
        ,page: true
        ,limit: 30
        ,cols: [[
            {type:'checkbox'}
            ,{field:'deptId', title: '编号', width:100, sort: true}
            ,{field:'name', title: '部门名称', width:100}
            ,{field:'orderNum', title: '排序', width:100, sort: true}
            ,{field:'delFlag', title: '状态', minWidth: 150}
            ,{field:'id', title: '操作', sort: true, align: 'right'}
        ]]
    });

});