/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morepicsendsq;

import fina.ceebrid.JSON;
import fina.ceebrid.Piece;
import fina.ceebrid.client.TaskClient;
import fina.ceebrid.model.camera.InformConnexityParam;
import fina.ceebrid.model.camera.PolleCamera;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author asus
 */
public class DoSth extends Thread {
    
    public void run() {
        try {
            //        Piece req = Piece.instanceRequest("test.initiativeTestTask");  //
//        Piece req = Piece.instanceRequest("camera.UpdateDevList");
//        Piece req = Piece.instanceRequest("camera.AllInformConnexityTask");
            //      public final static String INITIATIVE_TEST = "test.initiativeTestTask";
            
            Piece req = Piece.instanceRequest("camera.RealTimeCaptureTask");
            RealTimeSendEmailReq rsr = new RealTimeSendEmailReq();
            PolleCamera pc = new PolleCamera();
            pc.setConnectMode((byte) 3);
            pc.setPUID("1");
            pc.setSerialNumber("0090B01C2AFE");
            req.setLiteral(JSON.unparse(pc));
//        rsr.setContent("666");
//        rsr.setDesAdd("myscan@qq.com");
//        rsr.setSubject("help");
//        req.setLiteral(JSON.unparse(rsr));
//        req.setSN(Function.getPieceSN());
//        InformConnexityParam icp = new InformConnexityParam();
//        icp.setSerialNumber("00:90:b0:1a:d5:f9");
//        icp.setConnected(false);
//        icp.setIsAlarm(false);
//        req.setLiteral(JSON.unparse(icp));

//         CreateMonitorInterParam para = new CreateMonitorInterParam();
//
//                para.setMonitorNo("11649042");
//                para.setSerialNumber("11649042");
//                para.setLocation(createMonitorPro.getLocation());
//                para.setEnterpriseNO(createMonitorPro.getEnterpriseNo());
//                para.setCategory((byte) createMonitorPro.getCategory());
//                para.setSn(createMonitorPro.getSn());
//                para.setResultCode(resultCode);
//                para.setLocation("");
//                para.setAccnbr(createMonitorPro.getAccNbr());
//
//        
//        req.setLiteral(para);
            TaskClient client = InitValidTaskClient.init();
            
            Piece resp = client.send(req);
            if (resp == null || resp.getHead() == null) {
//            throw new ConnectBridgeServerException();
                System.out.println("回复为空");
            }
            
//        try {
//            this.sleep(1000);
//        } catch (InterruptedException ex) {
//            Logger.getLogger(DoSth.class.getName()).log(Level.SEVERE, null, ex);
//        }
        } catch (ConnectBridgeServerException ex) {
            Logger.getLogger(DoSth.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
