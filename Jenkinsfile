pipeline {

agent any

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


stage('Deploy'){
steps{

sh """

docker rm -f devops-app || true

docker run -d \
--name devops-app \
-p 8080:8080 \
devops-app

"""

}

}


}

}
