# Selenide #1. Часть II.

## Домашнее задание
1. На главной странице GitHub выберите меню Pricing -> Compare Plans с помощью команды hover для Pricing. Убедитесь что загрузилась нужная страница (например что заголовок - "Choose the plan that’s right for you."



2. Запрограммируйте Drag&Drop с помощью Selenide.actions()

- Откройте https://the-internet.herokuapp.com/drag_and_drop

- Перенесите прямоугольник А на место В

- Проверьте, что прямоугольники действительно поменялись

- В Selenide есть команда $(element).dragAndDrop($(to-element)), проверьте работает ли тест, если использовать её вместо actions()

