import java.util.ArrayList;
import java.util.List;


public class ComputerInfo {
    public static void main(String[] args) {
        AppFactory appFactory = new AppFactory();
        List<String> installedApps = getInstalledApps();

        System.out.println("Установленные приложения:");
        for (String app : installedApps) {
            Application application = appFactory.createApp(app);
            application.run();
        }
    }

    private static List<String> getInstalledApps() {
        List<String> apps = new ArrayList<>();
        apps.add("Photoshop");
        apps.add("Chrome");
        apps.add("Discord");
        // Добавьте другие приложения сюда
        return apps;
    }
}
