<!DOCTYPE html>
<html>
<head>
    <title>Электронный журнал</title>
</head>
<body>
<h1>Electron journal</h1><hr>
<#include "sidebar/admin-sidebar.ftlh">
<h4>Список администраторов</h4>
<#list admins as admin>
    <div>
        <p>${admin.name} ${admin.surname} | <a href="/admin/${admin.id}">Подробнее</a> </p>
    </div>
</#list>
<hr>
</body>


</html>