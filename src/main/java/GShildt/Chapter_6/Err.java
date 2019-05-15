package GShildt.Chapter_6;

public class Err {
    String msg;
    int severity;

    Err(String s, int i) {
        msg = s;
        severity = i;
    }

}

class ErrorInfo {
    String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход за границы диапазона"
    };
    int howband[] = {3, 3, 2, 4};

    Err getErrorInfo(int i) {
        if (i >= 0 & i < msgs.length)
            return new Err(msgs[i], howband[i]);
        else
        return new Err("Error not found", 0);

    }

}

class ErrInfo{
    public static void main(String[] args) {
        ErrorInfo err = new ErrorInfo();
Err e;

e= err.getErrorInfo(2);
        System.out.println(e.msg  + " level of severity "+e.severity );


        e= err.getErrorInfo(19);
        System.out.println(e.msg  + " level of severity "+e.severity );



    }
}