public class Err {
    String msg;
    int severity;

    Err(String m, int s){
        msg = m;
        severity = s;
    }
}
class ErrorInfo{
    String msg[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-of-Bounds"
    };
    int howdad[] = {3, 3, 2, 4};

    Err getErrInfo(int i){
        if (i >= 0 & i < msg.length)
            return new Err(msg[i], howdad[i]);
        else
            return new Err("Invalid Error Code", 0);
        }
    }

    class ErrInfo{
        public static void main(String[] args) {
            ErrorInfo err = new ErrorInfo();
            Err e;

            e =  err.getErrInfo(2);
            System.out.println(e.msg + " severity: " + e.severity);

            e = err.getErrInfo(19);
            System.out.println(e.msg + " severity: " + e.severity);
        }
}