def call(Map config = [:]) {
    node {
        stage("Hello") {
            echo "Hello World"
        }

        stage("Name") {
            echo "My name is Ashutosh Soni"
        }
    }
}