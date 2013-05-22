/*
 * @(#) Chain1Action.java
 * @Author:liuyongjian(liuyongjian@travelsky.com) 2013-05-17
 * @Copyright (c) 2002-2013 Travelsky Limited. All rights reserved.
 */
package actionchain;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author liuyongjian
 * @version 1.0
 */
public class Chain1Action2 extends ActionSupport {
    @Override
    public String execute() throws Exception {
        System.out.println("Chain1 action2 execute");
               return Action.SUCCESS;
    }
}
