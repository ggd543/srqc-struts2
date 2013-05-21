package interceptor;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class DataSourceInjectorInterceptor extends AbstractInterceptor {

    public void init() {
        System.out.println("DataSourceInjectorInterceptor.init...");
    }

    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("DataSourceInjectorInterceptor.intercept ");
        return invocation.invoke();
    }

}
