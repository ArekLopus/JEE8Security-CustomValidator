package custom_validator;

import java.util.Arrays;
import java.util.HashSet;

import javax.enterprise.context.ApplicationScoped;
import javax.security.enterprise.AuthenticationException;
import javax.security.enterprise.AuthenticationStatus;
import javax.security.enterprise.authentication.mechanism.http.AutoApplySession;
import javax.security.enterprise.authentication.mechanism.http.HttpAuthenticationMechanism;
import javax.security.enterprise.authentication.mechanism.http.HttpMessageContext;
import javax.security.enterprise.credential.Password;
import javax.security.enterprise.credential.UsernamePasswordCredential;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@AutoApplySession
@ApplicationScoped
@SuppressWarnings("unused")
public class CustomValidator {
//public class CustomValidator implements HttpAuthenticationMechanism {
//
//	@Override
//	public AuthenticationStatus validateRequest(HttpServletRequest request, HttpServletResponse response,
//			HttpMessageContext httpMessageContext) throws AuthenticationException {
//
//		//-Checks if the current call to an authentication mechanism is the result from the application
//        // calling SecurityContext.authenticate(HttpServletRequest, HttpServletResponse, AuthenticationParameters) 
//        //-If SecurityContext#authenticate was not called, the authentication mechanism may have been
//        // invoked by thecontainer at the start of a request.
//		if (httpMessageContext.isAuthenticationRequest()) {
//
//			System.out.println("---cred: " + httpMessageContext.getAuthParameters().getCredential());
//
//			UsernamePasswordCredential credential = (UsernamePasswordCredential) httpMessageContext.getAuthParameters()
//					.getCredential();
//
//			String name = credential.getCaller();
//			Password pass = credential.getPassword();
//
//			System.out.println("name: " + name + ", pass: " + pass);
//			// Check credentials somewhere...
//
//			boolean credentialsOk = true;
//
//			if (credentialsOk) {
//				return httpMessageContext.notifyContainerAboutLogin(
//						name,	// or new CallerPrincipal("aa"),
//						new HashSet<>(Arrays.asList("admin")));
//			} else {
//				httpMessageContext.responseUnauthorized();
//			}
//
//		}
//
//		return httpMessageContext.doNothing();
//
//	}
}
