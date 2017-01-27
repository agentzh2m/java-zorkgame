Setting up the git

1. I exclude the excessive Maven projects files that is generate when I build the project such as pom.xml.tag
these file are generate differently in different machines it is like a log file.
2. Not including target directory because user can compile that by themselves using the source code and mvn package.
The target file is usually big
3. Exclude all the intellij files such as .idea folder and iml. because it is a user specific setting
