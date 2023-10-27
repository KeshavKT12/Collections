fun main() {
    val user1=User("keshav")
    val user2=User("virat")
    val user3=User("kane")
    val user4=User("david")
    val user5=User("boult")
    val user6=User("siraj")
    val user7=User("keshav")

    val names = mutableSetOf<User>(user1,user2,user3,user4,user5,user6,user7)
    names.forEach { println(it.name) }
}
data class User(val name:String)