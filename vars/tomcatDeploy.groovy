def call(ip,user,credid){
  sshagent([credid]){
        // copy
        sh "scp -o StrictHostKeyChecking=no target/*.war ${user}@${ip}:/opt/tomcat9/webapps"
        // stop
       sh "ssh ${user}@${ip} /opt/tomcat9/bin/shutdown.sh"
       // start
       sh "ssh ${user}@${ip} /opt/tomcat9/bin/startup.sh"
  }
}
