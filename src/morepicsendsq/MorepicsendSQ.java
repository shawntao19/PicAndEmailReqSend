/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morepicsendsq;

import fina.ceebrid.JSON;
import fina.ceebrid.Piece;
import fina.ceebrid.client.TaskClient;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author asus
 */
public class MorepicsendSQ {

    /**
     * @param args the command line arguments
     */
    public static String centralServerIP = "61.161.127.166";
//    public static String centralServerIP = "192.168.102.97";
//    public static String centralServerIP = "222.174.213.182";
    public static String devSeq1 = "81110100001";
    public static String devSeq2 = "81110100002";
    public static String devSeq3 = "81110100003";
    public static String devSeq4 = "81110100004";
    public static String devSeq5 = "81110100005";
    public static String devSeq6 = "81110100006";
    public static String devSeq7 = "81110100007";
    public static String devSeq8 = "81110100008";
    public static String devSeq9 = "81110100009";
    public static String devSeq10 = "81110100010";
    public static String devSeqHead = "811101000";

    public static String filename = "C:\\Users\\asus\\Desktop\\Test Report\\";

    public static String filename1 = "C:\\Users\\asus\\Desktop\\Test Report\\1433383472678.jpg";
    public static String filename2 = "C:\\Users\\asus\\Desktop\\Test Report\\1433383472678.jpg";
    public static String filename3 = "C:\\Users\\asus\\Desktop\\Test Report\\1433383472678.jpg";
    public static String filename4 = "C:\\Users\\asus\\Desktop\\Test Report\\1433383472678.jpg";
    public static String filename5 = "C:\\Users\\asus\\Desktop\\Test Report\\1433383472678.jpg";
    public static String filename6 = "C:\\Users\\asus\\Desktop\\Test Report\\1433383472678.jpg";
    public static String filename7 = "C:\\Users\\asus\\Desktop\\Test Report\\1433383472678.jpg";
    public static String filename8 = "C:\\Users\\asus\\Desktop\\Test Report\\1433383472678.jpg";
    public static String filename9 = "C:\\Users\\asus\\Desktop\\Test Report\\1433383472678.jpg";
    public static String filename10 = "C:\\Users\\asus\\Desktop\\Test Report\\1433383472678.jpg";

    public static void main(String[] args) throws IOException, ConnectBridgeServerException {
//        MonitorServer.startKaerCentralServerMain16(centralServerIP);
        getfilename();

    }

    public static void proPicData(PicDataReq picReq) throws ConnectBridgeServerException, IOException {
        Piece req;
        String contentType;
        if (picReq.getPicData() != null) {
            contentType = BridgeProVar.ContentType.JASON_BYTEARRAY;
        } else {
            contentType = BridgeProVar.ContentType.JASON;
        }

        req = Piece.instanceRequest(BridgeProVar.TaskName.PICDATA, contentType);
//        req.setSN(FunctionTools.getPieceSN());
        req.getHead().setContentLength(picReq.getContentLength());

        req.setLiteral(JSON.unparse("serialNumber", picReq.getSerialNumber()));

        req.setEssence(picReq.getPicData());

        TaskClient client = InitValidTaskClient.init();

        Piece resp = client.send(req);
        if (resp == null) {
            throw new ConnectBridgeServerException();
        }
    }

    public static byte[] readFileByBytes(String fileName) {
//        File file = new File(fileName);
//        InputStream in = null;
        byte[] getArr = null;
        try {
            FileInputStream in = new FileInputStream(fileName);
//          File file = new File(dec);  
//          if(!file.exists())  
//              file.createNewFile();  

//            FileOutputStream out = new FileOutputStream();  
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte buffer[] = new byte[1024];

            int count, i;
            while ((count = in.read(buffer)) != -1) {
                // for循环保证只写入count个byte, 否则会写入1024个byte  
                for (i = 0; i < count; i++) {
                    out.write(buffer[i]);
                }
            }
            in.close();
            getArr = out.toByteArray();
            out.close();

            System.out.println("Success!");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block  
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block  
            e.printStackTrace();
        }
        return getArr;
    }

    public static void getfilename() throws ConnectBridgeServerException, IOException {
        String[] str = {"jpg", "gif", "png", "jpeg"};
        System.out.println("获取目录下的图片");
        File dir = new File("C:\\Users\\asus\\Desktop\\Test Report\\testpicSQchose\\81110100001");
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            //过滤非图片
            String fileType = files[i].getName().substring(files[i].getName().lastIndexOf('.') + 1, files[i].getName().length());
            for (int t = 0; t < str.length; t++) {
                if (str[t].equals(fileType.toLowerCase())) {
                    System.out.println(files[i].getPath());
                    byte[] picdata = readFileByBytes(files[i].getPath());
                    proPicData(new PicDataReq(devSeq1, picdata));
                }
            }
        }
    }

}
