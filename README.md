# podia_server
Server for podia-clone website

1. Логин в Docker
```shell script
docker login
```

2. Сборка
```shell script
docker build --progress=plain -t refxlexj/podia-server:1.0.0 .
```

3. Тэг для yandex clound
```shell script
docker tag refxlexj/podia-server:1.0.0 cr.yandex/<идентификатор_реестра>/podia-server:1.0.0
```

4. Логин в yandex cloud
```shell script 
echo <OAuth-токен>|docker login --username oauth --password-stdin cr.yandex
```

4. Пуш в yandex cloud
```shell script
docker push cr.yandex/<идентификатор_реестра>/podia-server:1.0.0
```

Пуш в dockerhub
```shell script
docker push refxlexj/podia-server:1.0.0
```

Локальный запуск 
```shell script
docker run -d -p 8081:8081 --name podia-server refxlexj/podia-server:1.0.0
```
