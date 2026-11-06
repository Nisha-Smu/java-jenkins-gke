pipeline
 {
  stages
   {
    stage ('Checkout')
     {
       steps {
              checkout scm
             }
     }
     stage
      {
       steps {
              bat 'mvnw.cmd -B clean verify'
             }
       }
     }
   
    post {
           success {
            archiveArtifacts artifacts: 'target/*.jar',
                             fingerprint: true        
                   }         
	   always {
            junit testResults: 'target/surefire-reports/*.xml',
                  allowEmptyResults: true
        }
      }
 }     