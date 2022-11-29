pipeline
{
    agent any
 tools{
      maven 'maven-home'    
 }
 stages
 {
              stage('git-clone')
              {
                  steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/d-aksh/jenkins-project']]])  
              }
          }
          stage("build project")
          {
              steps{
                  sh 'mvn -B -DskipTests clean package'
              }
          }
          stage('building')
          {
              steps{
                  sh 'docker build -t ImpressicoAkash/project-jankins :latest .'
              }
          }
          stage('push')
          {
              steps{
                  script{
                      withCredentials([string(credentialsId: 'akash-pw', variable: 'akash')]) {
                          sh 'docker login -u ImpressicoAkash -p $(akash)'
    // some block
}
sh "docker push ImpressicoAkash/project-jankins"

                  }
              }
          }
          
      }
        
}
