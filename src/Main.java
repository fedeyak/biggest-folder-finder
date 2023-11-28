import java.io.File;

public class Main {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\Пользователь\\Desktop";
        File file = new File(folderPath);

        System.out.println(getFolderSize(file));
    }

    public static long getFolderSize(File folder) {
        if (folder.isFile()) {
            return folder.length();
        }

        File[] files = folder.listFiles();
        long folderLength = 0;

        for (File file : files) {
            folderLength += getFolderSize(file);
        }

        return folderLength;
    }


}
