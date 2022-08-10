def call(int lines, String jobName, String buildNumber) {
    def jenkins = Jenkins.getInstance()
    def job = jenkins.getItem(jobName)
    def bld = job.getBuildByNumber(buildNumber.toInteger())
    return bld.getLog(lines).logFile.text
}
