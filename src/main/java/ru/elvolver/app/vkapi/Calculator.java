package ru.elvolver.app.vkapi;

class Calculator {

    private int result = 0;

    /**
     * Вычисляем сумму
     * @param args входящие аргументы
     * @throws UserException Если аргументов нет, выкидываем исключение
     */
    void add(int... args) throws UserException {
        if (args.length > 0) {
            for (int arg : args) {
                this.result += arg;
            }
        } else {
            throw new UserException("You should enter args");
        }
    }

    /**
     * Вычисляем деление
     * @param args входящие аргументы
     * @throws UserException Если аргументов нет, выкидываем исключение
     */
    void div(int... args) throws UserException {
        if (args.length > 0) {
            for (int arg : args) {
                this.result =+ arg;
            }
        } else {
            throw new UserException("You should enter args");
        }
    }

    int getResult() {
        return this.result;
    }

    void cleanResult() {
        this.result = 0;
    }
}
