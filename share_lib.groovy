
//You can mix and match groovy and DSL in this file
def call() {
   sh 'echo Hello world'

   def varHere = "Something else"
   echo "${varHere}"
}