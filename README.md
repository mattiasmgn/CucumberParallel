# CucumberParallel
Demo: Run Cucumber tests faster by running them in parallel using maven plugins cucumber-jvm-parallel-plugin and maven-failsafe-plugin

Video: https://www.youtube.com/watch?v=4NJgyzvflAw

Execute in parallel using the command: 

mvn  -Dtest=SomePatternThatDontMatchAnything -DfailIfNoTests=false verify
