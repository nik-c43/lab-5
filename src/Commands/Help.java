package Commands;

import Controller.CommandWithoutArg;
import Controller.Commandable;
import Controller.OrganizationCollection;

public class Help implements CommandWithoutArg {
    String name = "help";
    OrganizationCollection collection = new OrganizationCollection(); // for what collection is needed?

    @Override
    public void execute(Object o) {
        System.out.println("help : вывести справку по доступным командам\n" +
                "info : вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)\n" +
                "show : вывести в стандартный поток вывода все элементы коллекции в строковом представлении\n" +
                "insert null {element} : добавить новый элемент с заданным ключом\n" +
                "update id {element} : обновить значение элемента коллекции, id которого равен заданному\n" +
                "remove_key null : удалить элемент из коллекции по его ключу\n" +
                "clear : очистить коллекцию\n" +
                "save : сохранить коллекцию в файл\n" +
                "execute_script file_name : считать и исполнить скрипт из указанного файла. В скрипте содержатся команды в таком же виде, в котором их вводит пользователь в интерактивном режиме.\n" +
                "exit : завершить программу (без сохранения в файл)\n" +
                "history : вывести последние 5 команд (без их аргументов)\n" +
                "remove_lower_key null : удалить из коллекции все элементы, ключ которых меньше, чем заданный\n" +
                "max_by_creation_date : вывести любой объект из коллекции, значение поля creationDate которого является максимальным\n" +
                "count_by_type type : вывести количество элементов, значение поля type которых равно заданному\n" +
                "print_unique_annual_turnover : вывести уникальные значения поля annualTurnover всех элементов в коллекции");
    }

    @Override
    public String getName() {
        return name;
    }
}
