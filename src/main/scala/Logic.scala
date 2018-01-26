import scala.io.StdIn.{readLine, readInt}



class Logic {

  val ai = new AI

  def play(): Unit = {

    var i: Int = 0
    var userScore: Int = 0
    var aiScore: Int = 0
    val winningScore : Int = 3



    //Users name
    val userName = readLine("Enter your name")
    println(userName)


    //Game loop
    while (userScore < winningScore && aiScore < winningScore) {

      val userInput = readLine("Rock, paper, scissors...")

println(userInput)
      //Match user input
      val aiPick = ai.aiRPS

      userInput match {

        //User chooses rock
        case "rock" => {

          if (aiPick == "Rock") {aiScore == aiScore && userScore == userScore}

          else if (aiPick == "Paper") {
            aiScore += 1
          }

          else {
            userScore += 1
          }
        }

        case "paper" => {
          if (aiPick == "Paper") {aiScore == aiScore && userScore == userScore}

          else if (aiPick == "Scissors") {
            aiScore += 1
          }
          else {
            userScore += 1
          }
        }

        case "scissors" => {
          if (aiPick == "Scissors") {aiScore == aiScore && userScore == userScore}

          else if (aiPick == "Rock") {
            aiScore += 1
          }
          else {
            userScore += 1
          }
        }
      }
        println(userName + " picked " + userInput + " and the AI has picked " + aiPick )
        println("Player score is " + userScore + " and the AI's score is " + aiScore)

      if(userScore == winningScore){
        println("YOU WIN!!!")
      } else if(aiScore == winningScore){
        println("LOOOOOOOSAH! EHEHEHEH")
      }
    }
  }
}
