/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package morepicsendsq;

/**
 *
 * @author Administrator
 */
public class ConnectBridgeServerException extends Exception{

    public ConnectBridgeServerException() {
    }

    public ConnectBridgeServerException(String message) {
        super(message);
    }

    public ConnectBridgeServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConnectBridgeServerException(Throwable cause) {
        super(cause);
    }

    public ConnectBridgeServerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
