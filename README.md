# Two Entity by CSV

### Постановка задачи:
#### Есть два типа сущностей:

- Человек:

	- ID
	- Имя
	- Пол
	- Подразделение
	- Зарплата
	- Дата рождения

- Подразделение:

	- ID (генерируется в программе)
	- Название
---
Дан ***CSV файл***, который содержит в себе информацию о людях. Необходимо считать данные из этого файла в ***список***.
В этой задаче ***нужно*** пользоваться встроенными ***Java коллекциями***.
На выходе должен получиться объект типа ***List*** в котором будут находится люди из файла.  
***ID*** подразделения сгенерировать в программе.

### Реализация:

- Описаны указанные задачей сущности
- Организовано чтение данных из ***CSV файла*** в связанный список
- Вывод полученного списка производится в файл ***output.txt*** (ввиду большого массива данных)

### Пример вывода:

```
[Person(id=28281, name='Aahan', gender='Male', birtDate='15.05.1970'', d_id=73 Division='I, salary=4800)
, Person(id=28282, name='Aala', gender='Female', birtDate='07.02.1983'', d_id=74 Division='J, salary=2600)
, Person(id=28283, name='Aaleahya', gender='Female', birtDate='06.11.1949'', d_id=70 Division='F, salary=1000)
, Person(id=28284, name='Aaleyah', gender='Female', birtDate='04.02.1944'', d_id=71 Division='G, salary=1000)
, Person(id=28285, name='Aalijah', gender='Female', birtDate='17.11.1951'', d_id=72 Division='H, salary=2400)
, Person(id=28286, name='Aaliyah', gender='Female', birtDate='10.11.1978'', d_id=71 Division='G, salary=1500)
, Person(id=28287, name='Aaliyah', gender='Female', birtDate='25.09.1987'', d_id=67 Division='C, salary=1100)
, Person(id=28288, name='Aamori', gender='Female', birtDate='07.12.1984'', d_id=73 Division='I, salary=9000)
, Person(id=28289, name='Aanjay', gender='Female', birtDate='05.03.1951'', d_id=79 Division='O, salary=7200)
, Person(id=28290, name='Aaralyn', gender='Female', birtDate='20.03.1993'', d_id=74 Division='J, salary=9000)
...
```
