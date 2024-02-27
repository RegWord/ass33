class AppFactory {
    public Application createApp(String appName) {
        switch (appName.toLowerCase()) {
            case "photoshop":
                return new Photoshop();
            case "chrome":
                return new Chrome();
            case "discord":
                return new Discord();
            // Добавьте другие приложения сюда
            default:
                throw new IllegalArgumentException("Unknown application: " + appName);
        }
    }
}