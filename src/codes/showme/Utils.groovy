package codes.showme

class Utils implements Serializable {
    def getVersion(String buildNumber, String gitCommit) {
        return new Date().format("yyMM") + "-${buildNumber}" + "-${gitCommit}"
    }
}