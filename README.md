## Приложение для организации розыгрыша игрушек

В программе заданы по умолчанию четыре игрушки:
Constructor
Robot
Teddy bear
Barbi
И для каждой из них указан "вес" (вероятность выпадения). При желании его можно поменять на любой необходимый

При запуске программы у пользователя запрашивается необходимое количество игрушек для розыгрыша, число проверяется.
Затем на основе данного количества и вероятностей формируется список игрушек с использованием коллекции java.util.PriorityQueue.
Туда они заносятся случайным образом.
Затем из коллекции извлекаются методом getToy() в цикле, основанном на колчестве элементов в PriorityQueue.
Сортировка в PriorityQueue настроена соглано ID
