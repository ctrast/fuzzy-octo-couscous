package context;

public class ContextUtil {

    public static final ThreadLocal<Context> threadLocal = new ThreadLocal<Context>();

    public static void set(Context context) {
        threadLocal.set(context);
    }

    public static void unset() {
        threadLocal.remove();
    }

    public static Context get() {
        return threadLocal.get();
    }

}
