fun main() {
    val taskList = mutableListOf<String>()
    var end = false
    do {
        println("Input an action (add, print, end):")
        when(readln().lowercase()) {
            "add" -> {
                println("Input a new task (enter a blank line to end):")
                var inputList = true
                var task = ""
                while (inputList) {
                    val taskInput = readln().trim()
                    if (taskInput.isBlank()) {
                        if (task.isNotBlank()) taskList.add(task)
                        if (task.isBlank()) println("The task is blank")
                        inputList = false
                    } else {
                        val num = taskList.size + 1
                        if (num <= 9) {
                            if (task.isBlank())  task = "$num  $taskInput"
                            else  task += "\n   $taskInput"
                        } else {
                            if (task.isBlank())  task = "$num $taskInput"
                            else  task += "\n  $taskInput"
                        }
                    }
                }
            }
            "print" -> {
                if (taskList.isEmpty()) {
                    println("No tasks have been input")
                } else {
                    for (task in taskList) {
                        println(task)
                        println()
                    }
                }
            }
            "end" -> {
                println("Tasklist exiting!")
                end = true
            }
            else -> println("The input action is invalid")
        }
    } while (!end)
}