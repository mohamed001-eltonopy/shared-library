def call(Map config = [:]) {
    sh "echo Building the ${config.name} app with ${config.version}"
}
