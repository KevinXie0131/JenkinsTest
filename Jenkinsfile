pipeline{
    agent any
    environment {
        CC = 'clang'
    }
    stages{
        stage('Build'){
            steps{
                echo 'Hello World@@@'
            }
            post{
                always{
                    echo "stage post alwasy"
                }
            }
        }
        stage('Example'){
            environment {
                DEBUG_FLAGS = '-g'
            }
            steps{
                script{
                    def browsers = ['chrome','firefox']
                    for (int i = 0; i < browsers.size(); ++i){
                        echo "Testing the ${browsers[i]} browsers"
                    }
                    echo "${CC} ${DEBUG_FLAGS}"
                    echo "${env.g_name}"
                }
            }
        }
    }
    post{
      changed{
         echo "pipeline post changed"
      }
      always{
         echo "pipeline post alwasy"
      }
      success{
         echo "pipeline post success"
      }
   }
}
