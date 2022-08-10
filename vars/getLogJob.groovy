def jenkins = Jenkins.getInstance()
def job = jenkins.getItem(jobName)
def bld = job.getBuildByNumber(buildNumber)
bld.getLog(100) // number of lines to read
bld.getLogFile()
bld.getLogReader() 
