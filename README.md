Java 13 Features (both preview features)

    1. Text Blocks
    2. Switch Expression
    
Set Java 13

    Linux/macOS
        export JAVA_HOME=<PATH_TO_INSTALLATION>\jdk-13.0.1
        export Path=%JAVA_HOME%\bin;%Path%    
    Windows
        set JAVA_HOME=<PATH_TO_INSTALLATION>\jdk-13.0.1
        set Path=%JAVA_HOME%\bin;%Path%
    
Run sample

    java --enable-preview -jar target/java-13-features-1.0.0.jar
    
Output should be

    <html>
            <body>
                    <h1>Java 13 Text Blocks</h1>
            </body>
    </html>
    
    
    {
            "firstName": "Koman",
            "surname": "Rudden",
            "website": "komanrudden.com",
    }
    
            Name: Koman Rudden
            Age: 43
            Salary: $170000,00
    
            Full Name: Koman Rudden
            Age: 43
            Salary: $170000,00
            
    THREE was sent in and 234 was printed            

POM file

To run using Java 13

        <properties>
            <maven.compiler.target>13</maven.compiler.target>
            <maven.compiler.source>13</maven.compiler.source>
            <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        </properties>
        
Preview needs to be enabled in the maven-compiler-plugin

        <configuration>
            <compilerArgs>
                <arg>--enable-preview</arg>
            </compilerArgs>
        </configuration>
        
Manifest must be set for the maven-jar-plugin. This tells the JRE where to find the 'main' class

        <configuration>
            <archive>
                <manifest>
                    <addClasspath>true</addClasspath>
                    <mainClass>com.komanrudden.Main</mainClass>
                </manifest>
            </archive>
        </configuration>