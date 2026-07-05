pipeline {

agent any

    tools {

        maven 'Maven3'

    }

stages {


stage('Checkout'){
steps{
echo "Getting Code"
}
}


stage('Build'){
steps{
sh "mvn clean package"
}
}


stage('Docker Build'){
steps{

sh """
docker build \
-t devops-app .
"""

}

}


stage('Deploy') {

steps {

sh '''

docker compose down || true

docker compose up -d

'''

}

}


}

}
