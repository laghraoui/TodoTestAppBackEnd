package ntl.todo;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		
		for(int i=0; i<5; i++) {
			System.out.println(bCryptPasswordEncoder.encode("123"));
		}
		System.out.println("### ### ### ###");
		for(int i=0; i<5; i++) {
			System.out.println(bCryptPasswordEncoder.encode("passWordToTest@1#"));
		}
	}
	
	/*
	 * for user mehdi the generated token is :
	 * "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtZWhkaSIsImV4cCI6MTU1NTEwMzc3NywiaWF0IjoxNTU0NDk4OTc3fQ.COektpPlKp7rBIbrrG_98QUPi46VPPA3UO7jcIT092LCEG1er7cEKIGmNqypWLMyFumwsF8ULFH4hQce039omQ"
	 */
	
	/*
	 * for user userTest1 the generated token is :
	 * "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyVGVzdDEiLCJleHAiOjE1NTUxMDM4OTEsImlhdCI6MTU1NDQ5OTA5MX0.rKaFKFWWKUu13UIPbyl39jWIH0R1o-tBPSeJZnPVxrbF3SuI4Bi_PN4sF_qcKCuuQSuUjOBf9gfzzrG8g0ejzg"
	 */
}
