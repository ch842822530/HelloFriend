package cn.itcast.maven;

import static junit.framework.Assert.assertEquals;

import org.junit.Test;

import cn.itcast.maven.Hello;


public class HelloFriendTest {
	@Test
	public void tesHelloFriend(){
		
		HelloFriend helloFriend = new HelloFriend();
		String results = helloFriend.sayHelloToFriend("lisi");
		assertEquals("Hello lisi! I am John",results);		

	}
}