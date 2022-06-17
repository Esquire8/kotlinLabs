fun main() {
    var myPhone = MobilePhone("89005553535")

    println("Добавление нового контакта test1 (Имя: Сергей, Номер: 123) -> " + myPhone.addNewContact(Contact("Сергей", "123")))
    println("Добавление нового контакта test2 (Имя: Армен, Номер: 321) -> " + myPhone.addNewContact(Contact("Армен", "321")))

    println("\nИзменение контакта test2 на test3 (Имя: Максим, Номер: 456) ->" +
            myPhone.updateContact(Contact("Армен", "321"), Contact("Максим", "456")))

    println("\nУдаление контакта test3 -> " + myPhone.removeContact(Contact("Максим", "456")))

    println("Добавление нового контакта test4 (Имя: Егор, Номер: 1337) -> " + myPhone.addNewContact(Contact("Егор", "1337")))

    println("\nНайти контакт(find) test3 -> " + myPhone.findContact(Contact("Максим", "456")))
    println("\nНайти контакт test1 -> " + myPhone.findContact(Contact("Сергей", "123")))

    println("\nНайти контакт(query) test1 ->" + myPhone.queryContact("Сергей"))

    println("\nprintContacts: ")

    myPhone.printContacts()
}