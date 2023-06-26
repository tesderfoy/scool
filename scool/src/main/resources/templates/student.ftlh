<!DOCTYPE html>
<html>
<head>
    <title>Электронный журнал</title>

<body>
<h1>Electron journal</h1><hr>
<h4>Список студентов</h4>
<#list students as student>
    <div>
        <p>${student.name} ${student.surname} | <a href="/student/${student.id}">Подробнее</a> </p>
    </div>

</#list>
<hr>
<h3>Добавить нового ученика</h3>
<form action="/student/create" method="post">
    Имя ученика: <input type="text", name="name"/><br><br>
    Фамилия ученика: <input type="text", name="surname"/><br><br>
<input type="submit" value="Добавить"/>

</form>
</body>
</head>
</html>