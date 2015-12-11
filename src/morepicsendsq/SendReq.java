/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morepicsendsq;

import fina.ceebrid.JSON;
import fina.ceebrid.Piece;
import fina.ceebrid.client.TaskClient;
import fina.ceebrid.model.inter.CreateMonitorInterParam;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class SendReq extends Thread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   camera.UpdateDevList camera.AllInformConnexityTask
        int time = 100;
        for (int i = 0; i < time; i++) {
            DoSth ds = new DoSth();
            ds.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SendReq.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

//    public void doSth() {
////        Piece req = Piece.instanceRequest("test.initiativeTestTask");
////        Piece req = Piece.instanceRequest("camera.UpdateDevList");
//        Piece req = Piece.instanceRequest("camera.AllInformConnexityTask");
//
//        req.setSN("2001");
//
////         CreateMonitorInterParam para = new CreateMonitorInterParam();
////
////                para.setMonitorNo("11649042");
////                para.setSerialNumber("11649042");
////                para.setLocation(createMonitorPro.getLocation());
////                para.setEnterpriseNO(createMonitorPro.getEnterpriseNo());
////                para.setCategory((byte) createMonitorPro.getCategory());
////                para.setSn(createMonitorPro.getSn());
////                para.setResultCode(resultCode);
////                para.setLocation("");
////                para.setAccnbr(createMonitorPro.getAccNbr()); 
////        
////        
////        req.setLiteral(para);
//        TaskClient client = InitValidTaskClient.init();
//
//        Piece resp = client.send(req);
//        if (resp == null || resp.getHead() == null) {
////            throw new ConnectBridgeServerException();
//            System.out.println("回复为空");
//        }
//
//    }
}
