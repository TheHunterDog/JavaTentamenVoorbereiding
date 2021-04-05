package Example;

public class WindowManager {
    public static boolean isloggedin = false;
    private mainWindow mw;
    private Window w;
    private boolean memLogged = true;
    public WindowManager() {
        while (true) {
            if(memLogged != isloggedin) {
                if (isloggedin) {
                    mainWindow mw = new mainWindow();

                } else {
                    Window w = new Window();
                }
                memLogged = isloggedin;
            }
        }
    }
}
