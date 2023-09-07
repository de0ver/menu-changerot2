import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите путь до OTC.dll: "); //без разницы как длл называется, главное путь до нее
        String filePath = input.nextLine();
        input.close();
        if (filePath != null) {
            try {
                File file = new File(filePath);
                FileInputStream inputStream = new FileInputStream(file);

                byte[] fileBytes = new byte[(int) file.length()];
                inputStream.read(fileBytes);
                inputStream.close();
                //снизу меняете цвета R = (byte) 255 [FF]
                //тут вантапу гг      G = (byte) 10 [0A]
                //надо поменять цвета B = (byte) 0 [0]
                fileBytes[1511015] = (byte) 255; //unknown
                fileBytes[1511015 + 1] = (byte) 255;
                fileBytes[1511015 + 2] = (byte) 0;

                fileBytes[1511962] = (byte) 255; //unknown
                fileBytes[1511962 + 1] = (byte) 255;
                fileBytes[1511962 + 2] = (byte) 0;

                fileBytes[1580701] = (byte) 255; //watermark bg
                fileBytes[1580701 + 1] = (byte) 255;
                fileBytes[1580701 + 2] = (byte) 0;

                fileBytes[1734205] = (byte) 255; //unknown
                fileBytes[1734205 + 1] = (byte) 255;
                fileBytes[1734205 + 2] = (byte) 0;

                fileBytes[1738866] = (byte) 255; //multicombobox bg mouse
                fileBytes[1738866 + 1] = (byte) 255;
                fileBytes[1738866 + 2] = (byte) 0;

                fileBytes[1743099] = (byte) 255; //combobox bg mouse
                fileBytes[1743099 + 1] = (byte) 255;
                fileBytes[1743099 + 2] = (byte) 0;

                fileBytes[1750873] = (byte) 255; //multitab bg
                fileBytes[1750873 + 1] = (byte) 255;
                fileBytes[1750873 + 2] = (byte) 0;

                fileBytes[1752264] = (byte) 50; //end of menu
                fileBytes[1752264 + 1] = (byte) 50;
                fileBytes[1752264 + 2] = (byte) 50;

                fileBytes[1749016] = (byte) 0; // menu bg
                fileBytes[1749016 + 1] = (byte) 0;
                fileBytes[1749016 + 2] = (byte) 0;

                fileBytes[1747202] = (byte) 50; //tabs in menu
                fileBytes[1747202 + 1] = (byte) 50;
                fileBytes[1747202 + 2] = (byte) 50;

                fileBytes[2769810] = (byte) 0; //unknown
                fileBytes[2769810 + 1] = (byte) 255;
                fileBytes[2769810 + 2] = (byte) 0;

                fileBytes[2869810] = (byte) 0; //unknown
                fileBytes[2869810 + 1] = (byte) 255;
                fileBytes[2869810 + 2] = (byte) 0;

                fileBytes[1727963] = (byte) 0; //unknown
                fileBytes[1727963 + 1] = (byte) 255;
                fileBytes[1727963 + 2] = (byte) 0;

                fileBytes[1733623] = (byte) 0; //unknown
                fileBytes[1733623 + 1] = (byte) 255;
                fileBytes[1733623 + 2] = (byte) 0;

                fileBytes[1738506] = (byte) 0; //multicombobox bg always
                fileBytes[1738506 + 1] = (byte) 255;
                fileBytes[1738506 + 2] = (byte) 0;

                fileBytes[1742766] = (byte) 0; //combobox bg always
                fileBytes[1742766 + 1] = (byte) 255;
                fileBytes[1742766 + 2] = (byte) 0;

                fileBytes[1750196] = (byte) 0; //active tab
                fileBytes[1750196 + 1] = (byte) 255;
                fileBytes[1750196 + 2] = (byte) 0;

                fileBytes[1726894] = (byte) 0; //textbox outline
                fileBytes[1726894 + 1] = (byte) 255;
                fileBytes[1726894 + 2] = (byte) 0;

                fileBytes[1727455] = (byte) 0; //unknown
                fileBytes[1727455 + 1] = (byte) 255;
                fileBytes[1727455 + 2] = (byte) 0;

                fileBytes[1730323] = (byte) 0; //checkbox outline ch1
                fileBytes[1730323 + 1] = (byte) 255;
                fileBytes[1730323 + 2] = (byte) 0;

                fileBytes[1730401] = (byte) 0; //checkbox active ch2
                fileBytes[1730401 + 1] = (byte) 0;
                fileBytes[1730401 + 2] = (byte) 255;

                fileBytes[1732849] = (byte) 0; //checkbox outline ch2
                fileBytes[1732849 + 1] = (byte) 255;
                fileBytes[1732849 + 2] = (byte) 0;

                fileBytes[1732943] = (byte) 0; //checkbox active ch1
                fileBytes[1732943 + 1] = (byte) 0;
                fileBytes[1732943 + 2] = (byte) 255;

                fileBytes[1735095] = (byte) 0; //keybind menu outline
                fileBytes[1735095 + 1] = (byte) 0;
                fileBytes[1735095 + 2] = (byte) 255;

                fileBytes[1738590] = (byte) 0; //multicombobox outline active
                fileBytes[1738590 + 1] = (byte) 255;
                fileBytes[1738590 + 2] = (byte) 255;

                fileBytes[1741593] = (byte) 0; //multicombobox outline always
                fileBytes[1741593 + 1] = (byte) 255;
                fileBytes[1741593 + 2] = (byte) 255;

                fileBytes[1742849] = (byte) 255; //combobox outline active
                fileBytes[1742849 + 1] = (byte) 0;
                fileBytes[1742849 + 2] = (byte) 0;

                fileBytes[1744780] = (byte) 0; //combobox outline always
                fileBytes[1744780 + 1] = (byte) 255;
                fileBytes[1744780 + 2] = (byte) 0;

                fileBytes[1745917] = (byte) 0; //buttons outline
                fileBytes[1745917 + 1] = (byte) 255;
                fileBytes[1745917 + 2] = (byte) 0;

                fileBytes[1750217] = (byte) 0; //active tab mouse
                fileBytes[1750217 + 1] = (byte) 0;
                fileBytes[1750217 + 2] = (byte) 255;

                fileBytes[1726818] = (byte) 0; //unknown
                fileBytes[1726818 + 1] = (byte) 255;
                fileBytes[1726818 + 2] = (byte) 0;

                fileBytes[1741516] = (byte) 0; //multicombobox bg always
                fileBytes[1741516 + 1] = (byte) 255;
                fileBytes[1741516 + 2] = (byte) 0;

                fileBytes[1744703] = (byte) 0; //combobox bg always
                fileBytes[1744703 + 1] = (byte) 255;
                fileBytes[1744703 + 2] = (byte) 0;

                fileBytes[1745733] = (byte) 255; //buttons fill bg
                fileBytes[1745733 + 1] = (byte) 0;
                fileBytes[1745733 + 2] = (byte) 0;

                fileBytes[1511343] = (byte) 0; //unknown
                fileBytes[1511343 + 1] = (byte) 0;
                fileBytes[1511343 + 2] = (byte) 255;

                fileBytes[1512082] = (byte) 0; //unknown
                fileBytes[1512082 + 1] = (byte) 0;
                fileBytes[1512082 + 2] = (byte) 255;

                fileBytes[1513143] = (byte) 0; //unknown
                fileBytes[1513143 + 1] = (byte) 0;
                fileBytes[1513143 + 2] = (byte) 255;

                fileBytes[1513385] = (byte) 0; //unknown
                fileBytes[1513385 + 1] = (byte) 0;
                fileBytes[1513385 + 2] = (byte) 255;

                fileBytes[1581088] = (byte) 0; //unknown
                fileBytes[1581088 + 1] = (byte) 0;
                fileBytes[1581088 + 2] = (byte) 255;

                fileBytes[1728333] = (byte) 255; //color chose outline
                fileBytes[1728333 + 1] = (byte) 0;
                fileBytes[1728333 + 2] = (byte) 0;

                fileBytes[1728682] = (byte) 0; //gray to white outline
                fileBytes[1728682 + 1] = (byte) 255;
                fileBytes[1728682 + 2] = (byte) 0;

                fileBytes[1729320] = (byte) 0; //alpha outline
                fileBytes[1729320 + 1] = (byte) 0;
                fileBytes[1729320 + 2] = (byte) 255;

                fileBytes[1732421] = (byte) 0; //colorpicker outline
                fileBytes[1732421 + 1] = (byte) 255;
                fileBytes[1732421 + 2] = (byte) 20;

                fileBytes[1736738] = (byte) 0; //slider bg
                fileBytes[1736738 + 1] = (byte) 0;
                fileBytes[1736738 + 2] = (byte) 255;

                fileBytes[1737099] = (byte) 0; //slider active outline
                fileBytes[1737099 + 1] = (byte) 255;
                fileBytes[1737099 + 2] = (byte) 0;

                fileBytes[1749305] = (byte) 255; //scroller bar
                fileBytes[1749305 + 1] = (byte) 0;
                fileBytes[1749305 + 2] = (byte) 0;

                fileBytes[1751493] = (byte) 0; //tabs outline
                fileBytes[1751493 + 1] = (byte) 0;
                fileBytes[1751493 + 2] = (byte) 255;

                fileBytes[1752342] = (byte) 0; //menu outline
                fileBytes[1752342 + 1] = (byte) 0;
                fileBytes[1752342 + 2] = (byte) 255;

                fileBytes[1725453] = (byte) 255; //unknown
                fileBytes[1725453 + 1] = (byte) 0;
                fileBytes[1725453 + 2] = (byte) 0;

                fileBytes[1725629] = (byte) 255; //unknown
                fileBytes[1725629 + 1] = (byte) 0;
                fileBytes[1725629 + 2] = (byte) 255;

                fileBytes[1726340] = (byte) 255; //unknown
                fileBytes[1726340 + 1] = (byte) 0;
                fileBytes[1726340 + 2] = (byte) 255;

                fileBytes[1726613] = (byte) 255; //text color ch1
                fileBytes[1726613 + 1] = (byte) 0;
                fileBytes[1726613 + 2] = (byte) 255;

                fileBytes[1727287] = (byte) 255; //text in textbox
                fileBytes[1727287 + 1] = (byte) 0;
                fileBytes[1727287 + 2] = (byte) 255;

                fileBytes[1730467] = (byte) 0; //text color ch2
                fileBytes[1730467 + 1] = (byte) 0;
                fileBytes[1730467 + 2] = (byte) 255;

                fileBytes[1734307] = (byte) 255; //text keybind chose (hold, toggle)
                fileBytes[1734307 + 1] = (byte) 0;
                fileBytes[1734307 + 2] = (byte) 0;

                fileBytes[1734719] = (byte) 0; //keybind menu text
                fileBytes[1734719 + 1] = (byte) 255;
                fileBytes[1734719 + 2] = (byte) 0;

                fileBytes[1735365] = (byte) 0; //text in keybind
                fileBytes[1735365 + 1] = (byte) 0;
                fileBytes[1735365 + 2] = (byte) 255;

                fileBytes[1735883] = (byte) 0; //text with keybind (toggle, hold)
                fileBytes[1735883 + 1] = (byte) 0;
                fileBytes[1735883 + 2] = (byte) 255;

                fileBytes[1736503] = (byte) 255; // text slider
                fileBytes[1736503 + 1] = (byte) 0;
                fileBytes[1736503 + 2] = (byte) 0;

                fileBytes[1738991] = (byte) 0; // unselected text multicombo
                fileBytes[1738991 + 1] = (byte) 0;
                fileBytes[1738991 + 2] = (byte) 255;

                fileBytes[1741351] = (byte) 0; //text color ch3
                fileBytes[1741351 + 1] = (byte) 255;
                fileBytes[1741351 + 2] = (byte) 0;

                fileBytes[1743476] = (byte) 255; //unselected text combo
                fileBytes[1743476 + 1] = (byte) 0;
                fileBytes[1743476 + 2] = (byte) 0;

                fileBytes[1744532] = (byte) 0; //combo text
                fileBytes[1744532 + 1] = (byte) 255;
                fileBytes[1744532 + 2] = (byte) 0;

                fileBytes[1486380] = (byte) 255; //accent color //blue
                fileBytes[1486380 + 2] = (byte) 204; //green
                fileBytes[1486380 + 4] = (byte) 0; //red

                FileOutputStream outputStream = new FileOutputStream(file);

                outputStream.write(fileBytes);
                outputStream.close();
                System.out.println("Файл успешно изменен.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Введен неверный путь до файла!");
        }
    }
}
