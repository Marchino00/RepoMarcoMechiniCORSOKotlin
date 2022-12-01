/*- Deve partire e far inserire le task e dare la possibilità di segnarle come completate
* - Deve avere un sistema CRUD (Create, read, update e destroid) isolato ( richiamato da funzione )
* - Le task devono essere integrate con tutte le funzioni crud funzionanti su le medesime
* - Il sistema si deve chiudere previo conferma
*/

fun main(args: Array<String>) {

    // Inizializzo le varibili
    var option: Int
    var Option: String
    var menu: Boolean = true
    var menu2: Boolean = true
    var arraylist = ArrayList<String>()
    var Conferma = true
    var Conferma2 =true
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
                    arraylist.add(Task) // Effettivo inserimento della task nell'array
                    Conferma = false
                } else if (option == 2){
                    println("Inserisci task corretta")
                    val Task = readLine()!!.toString()
                    println("La task che hai inserito è: $Task")
                    arraylist.add(Task) // Effettivo inserimento della task nell'array
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
                            arraylist.add(Task)
                            Conferma2 = false
                        } else if (option == 2){
                            println("Inserisci task corretta")
                            val Task = readLine()!!.toString()
                            println("La task che hai inserito è: $Task")
                            arraylist.add(Task)
                            Conferma2 = false
                        }

                    }

                } else if (option == 2) {

                    //stampa array completo

                    println("Le task che hai inserito sono:")
                    for (item in arraylist){
                        println(item)
                    }


                } else if (option == 3) {

                    // elimina task dall'array
                    for (item in arraylist){
                        println(item+" "+i)
                        i++
                        println("La task numero: " +i+ " è stata rimossa")
                        println("-----------------------------------")
                        println("Vuoi vedre la lista aggiornata?")
                        println("Si (1)")
                        println("No (2)")
                        option = readLine()!!.toInt()
                        println("-----------------------------------")
                        if (option == 1){

                            println("Le task che hai inserito sono:")
                            for (item in arraylist){
                                println(item)
                            }
                        }


                    }

                    println("Quale task vuoi rimuovere? (Usa i numeri accanto alla task!!)")

                    var Remove : Int = readLine()!!.toInt()
                    Remove = Remove - 1
                    arraylist.removeAt(Remove)
                    i = 0

                } else if (option == 4){
                    println("Sei uscito")
                    menu2 = false
                } else {
                    println("Valore inserito non corretto")

                }
            }

        } else {
            println("Sei Uscito")
            menu == false

        }


    } while (menu == false)
}
