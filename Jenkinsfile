env.dockerimagename="devopsbasservice/buildonframework:buildon-jenkinsfile"
node {
   stage ('HelloWorld_Build') 
   {
   //If some other Repository is to be given apart from current repo, provide git URL as below...
   //git url:'http://50.17.36.28/root/helloworld.git'

        checkout scm
        sh 'mvn clean package -DskipTests=True'
    }
   stage ('HelloWorld_CodeAnalysis') 
   {
        sh 'mvn sonar:sonar -Dsonar.host.url=http://54.209.104.148:9001/ -Dmaven.test.failure.ignore=true -DskipTests=true -Dsonar.sources=src/main/java'
   }
   stage ('HelloWorld_NexusUpload')
   {
        sh 'mvn deploy -DskipTests=true'
   }
}
