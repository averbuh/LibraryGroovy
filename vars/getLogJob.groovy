def call(int lines) {
    def jenkins = Jenkins.getInstance()
    def job = jenkins.getItem(jobName)
    def bld = job.getBuildByNumber(buildNumber)
    return bld.getLog(lines)
}
