Для подключения дополнительного репозитория MySQL можно выполнить следующие шаги:

1. Откроем терминал и перейдем в режим суперпользователя с помощью команды:

```
sudo su
```

2. Добавим ключ репозитория с помощью команды:

```
wget -O- https://repo.mysql.com/RPM-GPG-KEY-mysql-2022 | sudo apt-key add -
```

3. Добавим репозиторий MySQL в систему с помощью команды:

```
echo "deb http://repo.mysql.com/apt/ubuntu/ $(lsb_release -sc) mysql-8.0" | sudo tee /etc/apt/sources.list.d/mysql.list
```

4. Обновим список пакетов с помощью команды:

```
sudo apt update
```

5. Установим любой пакет из репозитория MySQL, например, пакет `mysql-shell`, с помощью команды:

```
sudo apt install mysql-shell
```

Для установки и удаления deb-пакета с помощью dpkg можно выполнить следующие шаги:

1. Скачаем deb-пакет, например, Midnight Commander (MC), с помощью команды:

```
wget http://archive.ubuntu.com/ubuntu/pool/universe/m/mc/mc_4.8.25-2ubuntu2_amd64.deb
```

2. Установим deb-пакет с помощью команды:

```
sudo dpkg -i mc_4.8.25-2ubuntu2_amd64.deb
```

3. Если в процессе установки возникнут ошибки, которые необходимо исправить, выполним команду:

```
sudo apt --fix-broken install
```

4. Удалим установленный пакет с помощью команды:

```
sudo dpkg -r mc
```