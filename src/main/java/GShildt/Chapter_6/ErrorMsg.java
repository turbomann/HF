package GShildt.Chapter_6;

public class ErrorMsg {
    String msg[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход за границы диапазона"
    };

    String getErrorMsg(int i) {
        if (i >= 0 & i < msg.length)
            return msg[i];
        else
            return "Code of error not found";
    }
}

class ErrMSG {
    public static void main(String[] args) {
        ErrorMsg error = new ErrorMsg();

        System.out.println(error.getErrorMsg(2));
        System.out.println(error.getErrorMsg(19));

    }
}