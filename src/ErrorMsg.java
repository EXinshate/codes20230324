public class ErrorMsg {
    String msg[] = {
            "Output Error",
            "Input Error",
            "Disk Full",
            "Index Out-of-Bounds"
    };

    String getErrorMsg(int i){
        if (i >= 0 & i < msg.length)
            return msg[i];
        else
            return "Invalid Error";
    }
}
class ErrMsg{
    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        System.out.println(err.getErrorMsg(2));
        System.out.println(err.getErrorMsg(19));
    }
}