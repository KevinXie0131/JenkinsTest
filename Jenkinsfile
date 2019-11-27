pipeline{
    agent any
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
