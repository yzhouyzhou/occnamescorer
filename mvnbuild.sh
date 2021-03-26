#!/bin/ksh
#Make a clean maven build and copy the jar file to proper place.
#

mvn clean | tee build.output.txt
mvn install | tee build.output.txt 
cp -p target/*.jar jars
ls -ltr jars | tee build.output.txt
