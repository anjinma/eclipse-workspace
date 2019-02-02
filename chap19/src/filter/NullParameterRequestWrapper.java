package filter;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class NullParameterRequestWrapper extends HttpServletRequestWrapper{
	// 요청 래퍼 클래스로 동작하기 위해 HttpServletRequestWrapper 클래스를 상속받는다.

	private Map<String, String[]> parameterMap = null;
	
	public NullParameterRequestWrapper(HttpServletRequest request) {
		super(request);
		parameterMap = new HashMap<String, String[]>(request.getParameterMap());
	}// 생성자는 전달받은 request의 파라미터 정보를 14행에 정의한 parameterMap에 저장한다.
	
	public void checkNull(String[] parameterNames) {
		              // 검사할 파라미터의 이름 목록을 인자로 전달받는다.
		for(int i=0;i<parameterNames.length;i++) {
			if(!parameterMap.containsKey(parameterNames[i])) {
				// 인자로 전달받은 각각의 이름을 검사해서 해당 이름의 파라미터가 존재하지 않으면!
				String[] values = new String[] {""};
				parameterMap.put(parameterNames[i], values);
				// 빈 문자열을 저장...!
			}
		}
	}
	
	@Override
	public String getParameter(String name) {
		String[] values = getParameterValues(name);
		if(values != null && values.length>0)
			return values[0];
		return null;
	}
	
	@Override
	public Map<String, String[]> getParameterMap() {
		return parameterMap;
	}
	
	@Override
	public Enumeration<String> getParameterNames() {
		return Collections.enumeration(parameterMap.keySet());
	}
	
	@Override
	public String[] getParameterValues(String name) {
		return (String[]) parameterMap.get(name);
	}
}
