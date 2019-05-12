def call(String lang) {
    if (lang == 'go') {
        pipeline {
            agent any
            stages {
                stage('set GOPATH') {
                    steps {
                        echo "GOPATH is ready"
                    }
                }
            }
        }
    } else if (lang == 'java') {
        pipeline {
            agent any
            stages {
                stage('clean install') {
                    steps {
                        sh "mvn clean install"
                    }
                }
            }
        }

    }
}