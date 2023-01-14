fun main() {
    val taskList = mutableListOf<String>()
    println("Input the tasks (enter a blank line to end):")
    var inputList = true
    while (inputList) {
        val taskInput = readln().trim()
        if (taskInput.isBlank()) {
            inputList = false
        } else {
            val num = taskList.size + 1
            if (num <= 9) {
                taskList.add("$num  $taskInput")
            } else {
                taskList.add("$num $taskInput")
            }
        }
    }

    if (taskList.isEmpty()) {
        println("No tasks have been input")
    } else {
        for (task in taskList) {
            println(task)
        }
    }
}