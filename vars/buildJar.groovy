def call(Map config = [:]) {
    sh "echo Building the ${config.name} application with version ${config.version}"
}
