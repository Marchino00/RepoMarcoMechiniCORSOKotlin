/*- Deve partire e far inserire le task e dare la possibilità di segnarle come completate
* - Deve avere un sistema CRUD (Create, read, update e destroid) isolato ( richiamato da funzione )
* - Le task devono essere integrate con tutte le funzioni crud funzionanti su le medesime
* - Il sistema si deve chiudere previo conferma
*/

fun main(args: Array<String>) {

    // Inizializzo le varibili
    var option : Int

    var menu : Boolean = true

    do {
        println("Vuoi inserire una Task?")
        println("Si (1)")
        println("No (2)")
        option = readLine()!!.toInt()

        if (option == 1){

            print("Inserisci Task: ")

            val enteredString = readLine()
            println("Task inserita: $enteredString")
        } else {
            menu == false
        }
    } while (menu==false)


}