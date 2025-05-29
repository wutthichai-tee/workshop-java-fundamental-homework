run:
	gradle bootRun

curl1:
	curl -v -X GET "localhost:8080/accumulate/1234?id=aaaaa"

curl2:
	curl -v -X GET "localhost:8080/greet/Tee+"

curl3:
	curl -v -X GET "localhost:8080/leap/2526"

test:
	./gradlew test

clean:
	rm -rf ./classes

compile-one: clean copy-deps
	javac -cp .:libs/\* -d classes src/main/java/dev/anuchito/demo/DemoApplication.java

compile: clean copy-deps
	javac -cp .:libs/\* -d classes src/main/java/dev/anuchito/demo/*

runcp:
	java -cp .:"libs/*":classes dev.anuchito.demo.DemoApplication

copy-deps:
	gradle copyDependencies

wrapper:
	gradle wrapper

install-java17-openjdk:
	sdk install java 17.0.9-tem