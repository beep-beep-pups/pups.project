package watchdemoprilozhka;

public class watchdemoscreenlogin {
    public static void main(String[] args) {
        // Показываем окно входа
        if (Login.show()) {
            // Если вход успешен, показываем основное окно
            watchdemoscreen.show();
        }
    }
}
