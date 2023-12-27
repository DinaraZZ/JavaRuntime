package oop_prac17_input_stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import static oop_prac17_input_stream.Main.readLine;

public class UsersMain {
    public static void main(String[] args) {
        //login, parol, imya, dohod

//        System.out.println(findUser("iaq_w", "jo9!"));

//        findUserInput();
        addUserInput();
    }

    private static void findUserInput() {
        InputStreamReader systemReader = new InputStreamReader(System.in);
        try {
            System.out.print("Введите логин: ");
            String login = readLine(systemReader);
            System.out.print("Введите пароль: ");
            String password = readLine(systemReader);
            System.out.println();
            System.out.println(findUser(login, password));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static String findUser(String login, String password) {
        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader("./users.txt")) {
            String user = readLine(fileReader);
            while (user != null) {
                String[] userInfo = user.split(", ");
                if (userInfo[0].equals(login) && userInfo[1].equals(password)) {
                    sb.append("Login: ");
                    sb.append(login);
                    sb.append("\nPassword: ");
                    sb.append(password);
                    sb.append("\nName: ");
                    sb.append(userInfo[2]);
                    sb.append("\nIncome: ");
                    sb.append(userInfo[3]);
                }
                user = readLine(fileReader);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        if (sb.length() == 0) {
            System.out.println("Пользователь не найден. Добавьте пользователя");
            addUserInput();
        }
        return sb.toString();
    }

    private static void addUserInput() {
        InputStreamReader systemReader = new InputStreamReader(System.in);
        String login = new String();
        String password = new String();
        String name = new String();
        String income = new String();

        try {
            boolean unique;
            boolean noNumbers;
            boolean noLetters;
            boolean emptyStr;

            // Login
            do {
                System.out.print("Введите логин: ");
                login = readLine(systemReader);
                unique = uniqueLogin(login);
                emptyStr = emptyString(login);
                if (!unique || emptyStr) System.out.println("Данный логин не доступен.\n");
            } while (!unique || emptyStr);

            // Password
            do {
                System.out.print("Введите пароль: ");
                password = readLine(systemReader);
                emptyStr = emptyString(password);
                if (emptyStr) System.out.println("Неккоректный формат пароля.\n");
            }
            while (emptyStr);

            // Name
            do {
                System.out.print("Введите имя: ");
                name = readLine(systemReader);
                noNumbers = name.matches("\\D+");
                emptyStr = emptyString(name);
                if (!noNumbers || emptyStr) System.out.println("Неккоректный формат имени.\n");
                else name = name.substring(0, 1).toUpperCase() + name.substring(1);
            } while (!noNumbers || emptyStr);

            // Income
            do {
                System.out.print("Введите доход: ");
                income = readLine(systemReader);
                noLetters = true;
                emptyStr = emptyString(login);
                try {
                    Integer.parseInt(income);
                } catch (NumberFormatException n) {
                    noLetters = false;
                }
                if (!noLetters || emptyStr) System.out.println("Неккоректный формат дохода.\n");
            } while (!noLetters || emptyStr);
        } catch (IOException e) {
            System.out.println(e);
        }

        addUser(login, password, name, income);
        System.out.println("\nПользователь добавлен");
        System.out.println(findUser(login, password));
    }

    private static void addUser(String login, String password, String name, String income) {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append(login);
        sb.append(", ");
        sb.append(password);
        sb.append(", ");
        sb.append(name);
        sb.append(", ");
        sb.append(income);
        String user = sb.toString();
        try (FileWriter fileWriter = new FileWriter("./users.txt", true)) {
            fileWriter.write(user);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean uniqueLogin(String login) {
        try (FileReader fileReader = new FileReader("./users.txt")) {
            String user = readLine(fileReader);
            while (user != null) {
                String[] userInfo = user.split(", ");
                if (userInfo[0].equals(login)) {
                    return false;
                }
                user = readLine(fileReader);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    private static boolean emptyString(String str) {
        if (str.matches("[a-z\\d]+")) return false;
        return true;
    }
}
