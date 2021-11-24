pipeline {
   agent {
      any
   }

def file=readFile(modules.txt)
def modules=file.readLines()


   stages {
      stage ('Create modules') {
         for (module in modules) {
            if (module.startsWith("#")) {
               continue
            }
            
         }
      }
   }
}