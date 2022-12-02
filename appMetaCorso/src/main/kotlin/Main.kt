/*- Deve partire e far inserire le task e dare la possibilità di segnarle come completate
* - Deve avere un sistema CRUD (Create, read, update e destroid) isolato ( richiamato da funzione )
* - Le task devono essere integrate con tutte le funzioni crud funzionanti su le medesime
* - Il sistema si deve chiudere previo conferma
*/

fun main(args: Array<String>) {

    // Inizializzo le varibili
    var option: Int
    var menu: Boolean = true
    var menu2: Boolean = true
    var ToDo : ArrayList<String> = ArrayList()
    var Conferma = true
    var i = 0


    do {
        println("-----------------------------------")
        println("Vuoi inserire una Task?")
        println("Si (1)")
        println("No (2)")
        option = readLine()!!.toInt()

        if (option == 1) {

            println("-----------------------------------")
            println("Inserisci Task: ")
            val Task = readLine()!!.toString()
            println("-----------------------------------")
            println("La task che vuoi inserire è: $Task") // La task verrà inserita dopo la conferma

            // richiesta conferma di inserimento task
            while (Conferma == true) {
                println("Confermi?")
                println("Si (1)")
                println("No (2)")
                option = readLine()!!.toInt()

                if (option == 1){
                    ToDo.add(Task) // Effettivo inserimento della task nell'array
                    Conferma = false
                } else if (option == 2){
                    println("Inserisci task corretta")
                    val Task = readLine()!!.toString()
                    println("La task che hai inserito è: $Task")
                    ToDo.add(Task) // Effettivo inserimento della task nell'array
                    Conferma = false
                }

            }


            //inizio while
            while (menu2 == true) {
                println("-----------------------------------")
                println("Cosa vuoi fare?")
                println("Inserire Task (1)")
                println("Stampare Task (2)")
                println("Eliminare Task (3)")
                println("Completa Task")
                println("Esci (4)")
                option = readLine()!!.toInt()
                println("-----------------------------------")

                if (option == 1) {

                    var Conferma2 =true
                    println("Inserisci Task: ")
                    val Task = readLine()!!.toString()
                    println("-----------------------------------")
                    println("La task che vuoi inserire è: $Task") // La task verrà inserita dopo la conferma

                    while (Conferma2 == true) {
                        println("Confermi?")
                        println("Si (1)")
                        println("No (2)")
                        option = readLine()!!.toInt()

                        if (option == 1){
                            ToDo.add(Task)
                            Conferma2 = false
                        } else if (option == 2){
                            println("Inserisci task corretta")
                            val Task = readLine()!!.toString()
                            println("La task che hai inserito è: $Task")
                            ToDo.add(Task)
                            Conferma2 = false
                        }

                    }

                } else if (option == 2) {

                    //stampa array completo

                    println("Le task che hai inserito sono:")
                    for (item in ToDo){
                        println(item)
                    }


                } else if (option == 3) {

                    // elimina task dall'array
                    for (item in ToDo) {
                        println(item + " " + i)
                        i++
                    }

                    println("Quale task vuoi rimuovere? (Usa i numeri accanto alla task!!)")
                    i = 0

                    var Remove : Int = readLine()!!.toInt()

                    ToDo.removeAt(Remove)
                    println("La task numero: " +i+ " è stata rimossa")
                    println("-----------------------------------")
                    println("Vuoi vedre la lista aggiornata?")
                    println("Si (1)")
                    println("No (2)")
                    option = readLine()!!.toInt()
                    println("-----------------------------------")
                    if (option == 1){

                        println("Le task che hai inserito sono:")
                        for (item in ToDo){
                            println(item)
                        }
                    }

                }else if (option == 4) {

                    // Completa task dall'array
                    for (item in ToDo) {
                        println(item + " " + i)
                        i++
                    }

                    println("Quale task hai completato? (Usa i numeri accanto alla task!!)")
                    i = 0

                    var Remove : Int = readLine()!!.toInt()

                    ToDo.removeAt(Remove)
                    println("La task numero: " +i+ " è stata completata")
                    println("-----------------------------------")
                    println("Vuoi vedre la lista aggiornata?")
                    println("Si (1)")
                    println("No (2)")
                    option = readLine()!!.toInt()
                    println("-----------------------------------")
                    if (option == 1){

                        println("Le task che hai inserito sono:")
                        for (item in ToDo){
                            println(item)
                        }
                    }

                }else if (option == 5){
                    println("Sei sicuro di voler uscire?")
                    println("Si (1)")
                    println("No (2)")
                    option = readLine()!!.toInt()

                    if (option == 1){
                        println("Sei uscito")
                        menu2 = false

                    } else if (option == 2) {
                        menu = true

                    } else {
                        menu = true
                        println("Valore inserito non corretto")
                    }


                } else {
                    println("Valore inserito non corretto")

                }
            }

        } else if (option == 2) {
            println("-----------------------------------")
            println("Sei sicuro di voler uscire?")
            println("Si (1)")
            println("No (2)")
            option = readLine()!!.toInt()

            if (option == 1){
                println("Sei Uscito")
                menu = true

            } else if (option == 2) {
                menu = false
            } else {
                menu = false
                println("Valore inserito non corretto")
            }

        } else {
            println("Valore inserito non corretto")
        }


    } while (menu == false)
}
