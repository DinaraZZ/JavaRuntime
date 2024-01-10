package oop_prac17_input_stream;

import java.io.*;
import java.util.*;

import static oop_prac17_input_stream.Main.readLine;

public class UsersMain2Buffered {
    public static void main(String[] args) throws Exception {
        findUserIO();
       /* InputStream inputStream = System.in;
//        System.out.println(inputStream.read());

        InputStreamReader streamReader = new InputStreamReader(inputStream);
        System.out.println(streamReader.read());*/
        /*1)BufferedWriter(FileWriter);
        2) BufferedReader;
        3) BufferedInputStream;
        4) BufferedOutputStream;*/
    }

    private static Map<String, String> users = new HashMap<>();
    private static List<User> userList = new ArrayList<>();

    public static void findUserIO() {
        try (BufferedInputStream bufferedReader = new BufferedInputStream(System.in)) {
            System.out.print("Введите логин: ");
            String login = readLine(bufferedReader);
            System.out.print("Введите пароль: ");
            String password = readLine(bufferedReader);
            System.out.println();
            getUsersFromFile();
            if (userExists(login, password)) optionsIO(login, password);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean userExists(String login, String password) {
        try {
            if (users.get(login).equals(password)) return true;
        } catch (NullPointerException e) {
            return false;
        }
        return false;
    }

    public static void optionsIO(String login, String password) {
        try (BufferedInputStream bufferedReader = new BufferedInputStream(System.in)) {
            String line;
            int action;
            do {
                System.out.println("Просмотреть данные [1]");
                System.out.println("Изменить данные [2]");
                System.out.println("Удалить данные [3]");
                System.out.println("Сортировать данные [4]");
                System.out.print("Выберите действие: ");
                line = readLine(bufferedReader);
                action = Integer.parseInt(line);
                System.out.println();
            } while (action < 1 || action > 4);

            switch (action) {
                case 1:
                    showUser(login, password);
                    break;
                case 2:
                    changeUserIO(login, password);
                    System.out.println("Пользователь изменён");
                    break;
                case 3:
                    deleteUser(login);
                    System.out.println("Пользователь удалён");
                    break;
                case 4:
                    sortByIncome();
                    System.out.println("Данные отсортированы");
                    break;
                default:
                    break;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void showUser(String login, String password) {
        StringBuilder sb = new StringBuilder();
        try (FileReader fileReader = new FileReader("./users.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String user = readLine(bufferedReader);
            while (user != null) {
                String[] userInfo = user.split(", ");
                if (userInfo[0].equals(login) && userInfo[1].equals(password)) {
                    sb.append("Name: ");
                    sb.append(userInfo[2]);
                    sb.append("\nIncome: ");
                    sb.append(userInfo[3]);
                    break;
                }
                user = readLine(bufferedReader);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(sb);
    }

    public static void changeUserIO(String login, String password) {
        try (BufferedInputStream bufferedReader = new BufferedInputStream(System.in)) {
            System.out.print("Введите новое Имя: ");
            String name = readLine(bufferedReader);
            System.out.print("Введите новый доход: ");
            String income = readLine(bufferedReader);
            System.out.println();
            changeUser(login, password, name, income);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void changeUser(String login, String password, String name, String income) {
        deleteUser(login);

        StringBuilder sb = new StringBuilder();
        sb.append(login);
        sb.append(", ");
        sb.append(password);
        sb.append(", ");
        sb.append(name);
        sb.append(", ");
        sb.append(income);

        try (FileWriter fileWriter = new FileWriter("./users.txt", true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(sb.toString() + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void deleteUser(String login) {
        getUsersListFromFile();
        for (User user : userList) {
            if (user.login.equals(login)) {
                userList.remove(user);
                break;
            }
        }
        rewriteByList();
    }

    public static void sortByIncome() {
        getUsersListFromFile();
        Collections.sort(userList, new UserIncomeComparator());
        rewriteByList();
    }

    public static void rewriteByList() {
        try (FileWriter fileWriter = new FileWriter("./users.txt", false);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (User user : userList) {
                StringBuilder sb = new StringBuilder();
                sb.append(user.login);
                sb.append(", ");
                sb.append(user.password);
                sb.append(", ");
                sb.append(user.name);
                sb.append(", ");
                sb.append(user.income);
                bufferedWriter.write(sb.toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getUsersListFromFile() {
        userList.clear();

        try (FileReader fileReader = new FileReader("./users.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String user = readLine(bufferedReader);
            while (user != null) {
                String[] userInfo = user.split(", ");

                User userOb = new User();
                userOb.login = userInfo[0];
                userOb.password = userInfo[1];
                userOb.name = userInfo[2];
                userOb.income = userInfo[3];
                userList.add(userOb);

                user = readLine(bufferedReader);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void getUsersFromFile() {
        try (FileReader fileReader = new FileReader("./users.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String user = readLine(bufferedReader);
            while (user != null) {
                String[] userInfo = user.split(", ");
                users.put(userInfo[0], userInfo[1]);
                user = readLine(bufferedReader);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}