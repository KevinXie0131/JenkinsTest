pipeline{
    agent any
    environment {
        CC = 'clang'
    }
    parameters {
      string defaultValue: 'none', description: '字符串', name: 'D_ENV', trim: true
      text defaultValue: 'a\nb\nc\n', description: '文本', name: 'D_TEXT'
      choice choices: 'a\nb\nc\n', description: '选一个', name: 'D_CHOICE'
      booleanParam defaultValue: false, description: '布尔值参数', name: 'FLAG'
      password name: 'PASSWORD',defaultValue:'SECRET',description: 'password'
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
