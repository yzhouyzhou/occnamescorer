# occnamescorer

Name Scorer Project

*   Souce Code URL https://github.com/yzhouyzhou/occnamescorer

*   This project is a maven project created on eclipse. pom.xml contains all the dependenses. 



*   Output from eclipse is showed as following:
   
    *   Outputs with samples.txt

        ![node-image1](images/node1.JPG)
    


    *   Outputs with names.txt, 

        ![node-image2](images/node2.JPG)



    *   Outputs with a bad file with exception error handling

        ![node-image3](images/node3.JPG)



    *   6 unit test cases were created including 1 perftest. 

        ![node-image4](images/node4.JPG)



*   Output from command line is showed as following:

    *   mvnbuild.sh is a shell scripts, which is able to make a maven clean build, and copy the jar file to the proper place.  Build log is written to the file build.output.txt. 

        ![node-image5](images/node5.JPG)


    *   With a success build, you can using this command to run the application:
        java -classpath ./jars/* com.occ.namescorer.App

        ![node-image6](images/node6.JPG)

