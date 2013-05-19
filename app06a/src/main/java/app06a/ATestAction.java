package app06a;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;

import javax.servlet.http.HttpServletRequest;

public class ATestAction extends ActionSupport implements ServletRequestAware {
    private HttpServletRequest request;

    @Override
    public void setServletRequest(HttpServletRequest request) {
        this.request = request;
    }

    public String doAction() {
        ValueStack vs = ServletActionContext.getActionContext(request).getValueStack();
        System.out.println(vs);
        System.out.println("ValueStack context: "+vs.getContext().get("date"));
        System.out.println("request attribute: "+request.getAttribute("date"));
        System.out.println("ATestAction.doAction ...");
        return ActionSupport.SUCCESS;
    }
}
