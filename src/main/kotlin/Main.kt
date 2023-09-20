fun main(args: Array<String>) {
    /*
    Задание 1. Создал констану myAge со значением 17
    Создал константу isTeenager, которая использует булеву логику для опередления,
    находится ли константа myAge в промежутке между 13 и 19, а если так и есть,
    то получаем в выводе ответ true
     */
    val myAge = 17;
    val isTeenager = myAge >= 13 && myAge <= 19;
    println(isTeenager)
    /*
    Задание 2. Создал константу theirAge со значением 30.
    Создал константу bothTeenagers, которая, используя булеву логику, определяет, являются ли
    оба чел-ка подростками
     */
    val theirAge = 30;
    val bothTeenagers = (myAge and theirAge >= 13) &&  (myAge and theirAge <= 19);
    println(bothTeenagers)
    /*
    Задание 3. Создал константу reader, значением которой является мое имя.
    Создал константу author со значением "Richard Lucas"
    Создал константу, которая определяет, равны ли константы reader и author
     */
    val reader = "Артем";
    val author = "Richard Lucas"
    val authorIsReader = reader == author;
    println(authorIsReader)
    /*
    Задание 4. Создал константу readerBeforeAuthor, которая определяет,
    следует ли reader перед author по алфавиту
     */
    val readerBeforeAuthor = reader < author;
    println(readerBeforeAuthor)
    /*
    Задание 5. Создал константу myAge2 со значением 17 (мой возраст).
    Через выражение if вывел значение "Подросток", если myAge2 находится в промежутке от 13
    до 19, и "Не подросток", если myAge2 не находится в этом промежутке
     */
    val myAge2 = 17;
    if (myAge2 >= 13 && myAge2 <= 19)
    {
        println("Подросток")
    }
    else { println("Не подросток") }
    /*
    Задание 6. Создал константу answer и установил ее равным результату, как и в задании 5.
    используя выражение if в одну строку
     */
    val answer = if (myAge2 >= 13 && myAge2 <= 19) "Подросток" else "Не подросток"
    println(answer)
    /*
    Задание 7. Создал переменную counter = 0.
    Создал цикл while с условием counter < 10, выводящий counter со значением Х, затем
    увеличивающий counter на 1
     */
    var counter = 0
    while (counter < 10)
    {
        println("Счетчик: $counter")
        counter += 1
    }
    /*
    Задание 8. создал переменную counter1 со значением 0 и переменную roll со значением 0
    Указал, что переменная roll = Random().nextInt(6)
    Увеличил counter1 на 1
    Цикл будет выполняться до тех пор, пока roll не станет равно 0
     */
    var counter1: Int=0
    var roll: Int=0
    do {
        roll = Random().nextInt(6)
        counter1+=1
        println("После $counter1 бросков, roll=$roll")
    }
    while (roll!=0)
}