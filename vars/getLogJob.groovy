def call(String jobName, String buildNumber) {
    def jenkins = Jenkins.getInstance()
    def job = jenkins.getItem(jobName)
    def bld = job.getBuildByNumber(buildNumber.toInteger())
    return bld.logFile.text
}
