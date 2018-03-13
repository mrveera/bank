rm *.class
javac -cp "src:dependencies/junit4-4.8.2.jar"  -d . test/AccountTest.java src/*.java
