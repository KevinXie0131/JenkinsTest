pipeline{
    agent any
    stages{
        stage('Build') {
            steps {
                cmd 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                cmd 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
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
