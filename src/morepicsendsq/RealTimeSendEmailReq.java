/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morepicsendsq;

/**
 *
 * @author asus2
 */
public class RealTimeSendEmailReq {

    private String subject;
    private String content;
    private String desAdd;  //目的地址

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the desAdd
     */
    public String getDesAdd() {
        return desAdd;
    }

    /**
     * @param desAdd the desAdd to set
     */
    public void setDesAdd(String desAdd) {
        this.desAdd = desAdd;
    }



}
