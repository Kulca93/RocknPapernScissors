class AI {

  def aiRPS: String ={


    var aiInput : String = " "
    val aiRandom = scala.util.Random.nextInt(2)

    aiRandom match{

      case 0 => aiInput = "Rock"
      case 1 => aiInput = "Paper"
      case 2 => aiInput = "Scissors"

    }
      aiInput
    }
  }



