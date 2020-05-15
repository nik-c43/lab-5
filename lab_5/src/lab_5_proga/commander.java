package lab_5_proga;

public class commander {
    public static void commander(String buf){
        System.out.println("commander working");
        String command, arg;
        buf = buf.trim();
        int fin, lin;
        if ((fin =buf.indexOf("{")) == -1){
            command = buf;
            System.out.println("-1");
        }
        else {
            System.out.println("1");
            lin = buf.indexOf("}");
            command = buf.substring(0,fin);
            arg = buf.substring(fin+ 1, lin);
        }
        switch (command.toLowerCase()){
            case "help":
                System.out.println("\thelp : вывести справку по доступным командам\n" +
                        "\tinfo : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\n" +
                        "\tshow : вывести в стандартный поток вывода все элементы коллекции в строковом представлении\n" +
                        "\tinsert key {element} : добавить новый элемент с заданным ключом\n" +
                        "\tupdate id {element} : обновить значение элемента коллекции, id которого равен заданному\n" +
                        "\tremove_key key : удалить элемент из коллекции по его ключу\n" +
                        "\tclear : очистить коллекцию\n" +
                        "\tsave : сохранить коллекцию в файл\n" +
                        "\texecute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.\n" +
                        "\texit : завершить программу (без сохранения в файл)\n" +
                        "\tremove_lower {element} : удалить из коллекции все элементы, меньшие, чем заданный\n" +
                        "\thistory : вывести последние 7 команд (без их аргументов)\n" +
                        "\treplace_if_lowe key {element} : заменить значение по ключу, если новое значение меньше старого\n" +
                        "\tmax_by_creation_date : вывести любой объект из коллекции, значение поля creationDate которого является максимальным\n" +
                        "\tcount_by_type type : вывести количество элементов, значение поля type которых равно заданному\n");
                break;
            case "info":

            case "show":
            case "insert key":
            case "update key":
            case "remove key":
            case "clear":
            case "save":
            case "execute script from the file":
            case "exit":
            case "remove lover":
            case "history":
            case "replace if lowe key":
            case "max by creation date":
            case "count by type type":
                break;

        }
    }
}
