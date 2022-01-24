def modulesList = []
pipeline {
    agent {
        node {
            label 'master'
        }
    }
    
    stages {
        stage ('first') {
            steps {
                script {
                    env.WORKSPACE = pwd()
                    modulesFile = readFile('modules.txt').trim()
                    modules = modulesFile.split("\n")
                    for (i in modules) {
                        if (i.contains('#')) {
                            continue
                        }
                        m = i.split("/")[2]
                        modulesList.add(m)
                        print("------------")
                        print(m)
                        print("-----------------")
                    }
                    print(modulesList)
                }
            }
        }
        stage ('second') {
            steps {
                script {
                    for (module in modulesList) {
                        print("moduliki to:" + module)
                    }
                }
            }
        }
    }
}