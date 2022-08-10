def call(int lines) {
    def jenkins = Jenkins.getInstance()
    def job = jenkins.getItem(${env.JOB_NAME})
    def bld = job.getBuildByNumber(${env.BUILD_NUMBER})
    return bld.getLog(lines)
}
