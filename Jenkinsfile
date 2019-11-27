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
        stage('Example'){
            steps{
                script{
                    def browsers = ['chrome','firefox']
                    for (int i = 0; i < browsers.size(); ++i){
                        echo "Testing the ${browsers[i]} browsers"
                    }
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
