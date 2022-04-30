package src.Potoki;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\User\\Desktop\\Games", "src");
        if (file.mkdir()) {
            System.out.println("Каталог src создан.");
        }
        File file2 = new File("C:\\Users\\User\\Desktop\\Games", "res");
        if (file2.mkdir()) {
            System.out.println("Каталог res создан.");
        }
        File file3 = new File("C:\\Users\\User\\Desktop\\Games", "savegames");
        if (file3.mkdir()) {
            System.out.println("Каталог savegames создан.");
        }
        File file4 = new File("C:\\Users\\User\\Desktop\\Games", "temp");
        if (file4.mkdir()) {
            System.out.println("Каталог temp создан.");
        }


        File fileSrc = new File("C:\\Users\\User\\Desktop\\Games/src", "main");
        if (fileSrc.mkdir()) {
            System.out.println("Каталог main создан.");
        }
        File fileSrc2 = new File("C:\\Users\\User\\Desktop\\Games/src", "test");
        if (fileSrc2.mkdir()) {
            System.out.println("Каталог test создан.");
        }

        File fileSrcMain = new File("C:\\Users\\User\\Desktop\\Games/src/main/Main.java");
        try {
            if (fileSrcMain.createNewFile()) {
                System.out.println("Файл Main.java создан");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File fileScrMain = new File("C:\\Users\\User\\Desktop\\Games/src/main/MUtils.java");
        try {
            if (fileScrMain.createNewFile()) {
                System.out.println("Файл MUtils.java создан");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        File fileRes = new File("C:\\Users\\User\\Desktop\\Games/res", "drawables");
        if (fileRes.mkdir()) {
            System.out.println("Каталог drawables создан.");
        }
        File fileRes2 = new File("C:\\Users\\User\\Desktop\\Games", "vectors");
        if (fileRes2.mkdir()) {
            System.out.println("Каталог vectors создан.");
        }
        File fileRes3 = new File("C:\\Users\\User\\Desktop\\Games/res", "icons");
        if (fileRes3.mkdir()) {
            System.out.println("Каталог icons создан.");
        }

        File fileTemp = new File("C:\\Users\\User\\Desktop\\Games/temp/temp.txt");
        try {
            if (fileTemp.createNewFile()) {
                System.out.println("Создан файл temp.txt");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String text = "Статус создание папок и файлов:";
        try (FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\Games/temp/temp.txt", true)) {
            writer.write(text);
            if (file.exists()) {
                writer.write("\nКаталог src создан.");
            } if (fileSrc.exists()) {
                writer.write("\nКаталог main создан.");
            } if (fileSrcMain.exists()) {
                writer.write("\nФайл Main.java создан.");
            } if (fileScrMain.exists()) {
                writer.write("\nФайл MUtils.java создан");
            } if (fileSrc2.exists()) {
                writer.write("\nКаталог test создан.");
            } if (file2.exists()) {
                writer.write("\nКаталог res создан.");
            } if (fileRes.exists()) {
                writer.write("\nКаталог drawables создан.");
            } if (fileRes2.exists()) {
                writer.write("\nКаталог vectors создан.");
            } if (fileRes3.exists()) {
                writer.write("\nКаталог icons создан.");
            } if (file3.exists()) {
                writer.write("\nКаталог savegames создан.");
            } if (file4.exists()) {
                writer.write("\nКаталог temp создан.");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
