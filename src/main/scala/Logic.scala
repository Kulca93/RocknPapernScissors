import scala.io.StdIn.{readLine, readInt}



class Logic {

  val ai = new AI

  def play(): Unit = {

    var i: Int = 0
    var userScore: Int = 0
    var aiScore: Int = 0


    //Users name
    val userName = readLine("Enter your name")
    println(userName)

    //Users choice


    //Game loop
    for (x <- 0 to 2) {

      val userInput = readLine("Rock paper scissors...")

      //Users input
      userInput match {

        case "rock" => i = 0
        case "paper" => i = 1
        case "scissors" => i = 2
      }

      //Match user input
      i match {

        //User chooses rock
        case 0 =>

          if (ai.aiPlay == 0){}
          else if (ai.aiPlay == 1){aiScore = aiScore + 1}
          else { userScore = userScore + 1}

        case 1 =>
          if (ai.aiPlay == 1){}
          else if(ai.aiPlay == 2) {aiScore = aiScore +1}
          else {userScore = userScore + 1}

        case 2 =>
          if (ai.aiPlay == 2){}
          else if( ai.aiPlay == 0) {aiScore = aiScore + 1}
          else {userScore = userScore}
      }
        println("AI has picked " + ai.aiRPS)
         println(userName + " picked " + userInput)
        println("Player score is " + userScore)
      println("AI Score is " + aiScore)
    }

    if(userScore > aiScore){
      println("YOU WIN!!!")
    } else{
      println("LOOOOOOOSAH! EHEHEHEH")
    }

  }

}
