def call(ip,user,credid){
  sshagent([credid]){
        // copy
        sh "scp -o StrictHostKeyChecking=no target/*.war ${user}@${ip}:/opt/tomcat3/webapps"
        // stop
       sh "ssh ${user}@${ip} /opt/tomcat3/bin/shutdown.sh"
       // start
       sh "ssh ${user}@${ip} /opt/tomcat3/bin/startup.sh"
  }
}
