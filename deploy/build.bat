@echo on
"%JAVA_HOME%/bin/java" -cp lib/ant/ant.jar;lib/ant/ant-launcher.jar;lib/ant/ant-contrib.jar;"%JAVA_HOME%/lib/tools.jar" -Dmode=%2 org.apache.tools.ant.launch.Launcher -buildfile build.xml %1

pause
