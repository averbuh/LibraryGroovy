def call(int lines) {
    def jenkins = Jenkins.getInstance()
    def job = jenkins.getItem(${JOB_NAME})
    def bld = job.getBuildByNumber(${BUILD_NUMBER})
    return bld.getLog(lines)
}
