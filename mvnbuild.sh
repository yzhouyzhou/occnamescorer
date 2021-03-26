#!/bin/ksh
#Make a clean maven build and copy the jar file to proper place.
#

mvn clean
mvn install
cp -p target/*.jar jars
ls -ltr jars
