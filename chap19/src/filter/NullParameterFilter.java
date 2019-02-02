package filter;

import java.io.IOException;
import java.util.StringTokenizer;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;


public class NullParameterFilter implements Filter{
							// 필터로 사용하기 위해 Filter 인터페이스를 구현한다.

	private String[] parameterNames = null;
	
	@Override
	public void init(FilterConfig config) throws ServletException {
		String names = config.getInitParameter("parameterNames");
		// parameterNames 초기화 파라미터의 값을 읽어온다.
		StringTokenizer st = new StringTokenizer(names, ",");
		parameterNames = new String[st.countTokens()];
		// 기본값을 저장할 파라미터 목록을 parameterNames필드에 저장한다.(목록은 콤마로 구분한다.)
		
		for (int i = 0; st.hasMoreTokens(); i++) {
			parameterNames[i] = st.nextToken();
		}
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		NullParameterRequestWrapper requestWrapper = 
				new NullParameterRequestWrapper((HttpServletRequest)request);
		// NullParameterRequestWrapper객체를 생성한 뒤
		requestWrapper.checkNull(parameterNames);
		// 전달!
		
		chain.doFilter(requestWrapper, response);
	}
	
	@Override
	public void destroy() {
	}
}
