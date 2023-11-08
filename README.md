# Практическрая работа №5
### Вариант №15: Посуда

## Инструкция по сборке и запуску
Убедитесь, что на вашем компьютере присутствует [JDK](https://www.oracle.com/java/technologies/downloads/#jdk17-windows)

```
git clone https://github.com/waffflezz/rkis-5.git
cd rkis-5
psql -U postgres -h localhost -f create_db.sql
sh mvnw package
java -jar target/rkis-5-0.0.1-SNAPSHOT.jar
```

Открываем в браузере [страницу localhost](http://127.0.0.1:8080)

_Для сборки необходимо иметь [Maven](https://maven.apache.org/download.cgi) на компьютере_
