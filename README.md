# Spring01

1.- Create a Maven Application

2.- Download dependency. Put into Pom.xml file

		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>5.2.5.RELEASE</version>
		</dependency>
3. Create a folder "resources" inside src/main, in order to create a ContextContainer Configuration file.

4.- Create a java class inside.

5.- Create an xml file inside resources folder.

<bean id="helloWorld" class="com.eflu.beans.World">
	<property name="hello" value="Hello World"></property>
</bean>

6.- Finally, create a context where all objects will be handled.
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/eflu/xml/beans.xml");
		World world =  context.getBean("helloWorld",World.class);
	  System.out.println(world.getHello());
	    
	}

}
