SHA-1 Hashing Example
=====================

### Java example of a SHA-1 hash for my CSCE 320 group

This is a small program that implements both SHA-1 and SHA-256 hashes in Java. I made this small program mainly to demonstrate one-way hashing to my group members for CSCE 320 during Spring 2015 at [Pacific Lutheran Unviersity](http://cs.plu.edu).

Simply enter a text string and the specified algorithm. The program will output the resulting hash in hexadecimal format.

---

### Sources

- [Apache Common Codec for peer-reviewed hashing](http://commons.apache.org/proper/commons-codec/)
- [Apache's excellend sha256 method with a passed String for easy hashing](http://commons.apache.org/proper/commons-codec/apidocs/org/apache/commons/codec/digest/DigestUtils.html#sha256(java.lang.String))
- [How to bundle external JAR libs in Netbeans projects](http://stackoverflow.com/questions/18451052/how-to-include-jars-in-lib-into-project-jar-file-in-netbeans)

---

### Setup

1. Download the .jar file from the ```releases``` folder.

2. Open a Terminal in the folder where you downloaded the jar.

3. Execute the jar by using ```java -jar *.jar``` where * is whatever you named the file upon download.