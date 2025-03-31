# spring_native_demo
spring_native_demo
 ## --source code 放置
C:\20250318_spring-native\demo

 ## --調整POM.XML 檔
增加以下
	<build>
		<plugins>
			<plugin>
				<groupId>org.graalvm.buildtools</groupId>
				<artifactId>native-maven-plugin</artifactId>
			</plugin>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>
 
 ## --產生執行檔
C:\20250318_spring-native\demo>mvn -Pnative native:compile

C:\20250318_spring-native\demo\target>cd target

C:\20250318_spring-native\demo\target>demo.exe 

