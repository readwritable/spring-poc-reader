SPRING POC README

----

# Download spring-framework-3.1.2.RELEASE
curl -OL http://s3.amazonaws.com/dist.springframework.org/release/SPR/spring-framework-3.1.2.RELEASE.zip

# Download commons logging
curl -OL http://www.poolsaboveground.com/apache//commons/logging/binaries/commons-logging-1.1.1-bin.zip

# Copy minimal Spring jars
cd ~/downloads/spring-framework-3.1.2.RELEASE/dist/
cp -p \
org.springframework.asm-3.1.2.RELEASE.jar \
org.springframework.beans-3.1.2.RELEASE.jar \
org.springframework.context-3.1.2.RELEASE.jar \
org.springframework.context.support-3.1.2.RELEASE.jar \
org.springframework.core-3.1.2.RELEASE.jar \
org.springframework.expression-3.1.2.RELEASE.jar \
spring-poc/lib/

# Copy minimal Logging jars
cd ~/downloads/commons-logging-1.1.1/
cp -p commons-logging-1.1.1.jar spring-poc/lib/

# Set classpath environment
export JAVA_HOME=/usr/java/default
export SPRING_LIB=/home/leo/jstuff/spring-poc/lib/*
export CLASSPATH=.:$SPRING_LIB:$CLASSPATH

----

# To compile:
cd spring-poc
ant clean
ant compile

# To run:
cd spring-poc
java -cp build/spring-reader-r1.0.0.jar:.:lib/* com.genuine.poc.spring.reader.MyReaderClient

----

