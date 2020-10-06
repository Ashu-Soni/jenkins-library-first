import org.example.Contants

def call(Map config=[:]) {
    if (config.type == "slack") {
        echo Contants.SLACK_MESSAGE
        echo config.message
    } else {
        echo Contants.EMAIL_MESSAGE
        echo config.message
    }
}