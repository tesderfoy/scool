<!DOCTYPE html>
<html>
<head>
    <title>Электронный журнал</title>

<body>
<h1>Electron journal</h1><hr>
<h4>Подробная информация о студентах</h4>
<b>Имя студента: </b>${student.name}<br>
<b>Фамилия студента: </b>${student.surname}<br>
<hr>
<form action="/student/delete/${student.id}" method="post">
   <input type="submit" value="Удалить"/>

</form>
</body>
</head>
</html>