/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morepicsendsq;

import fina.ceebrid.client.TaskClient;

/**
 * 初始化socket，首选地址服务器连接异常后 选择其他备用服务器
 *
 * @author 基地 杨宸
 */
public class InitValidTaskClient {

    public static TaskClient init() throws ConnectBridgeServerException {
        TaskClient client;
        // 先尝试首选IP地址服务器
        String nodeIp = "192.168.102.87";
        int port = 6000;

        client = new TaskClient(nodeIp, port, 60 * 1000);   //设置成3s  抛出异常后写入日志

        // 
        if (client.isReady()) {
            return client;
        }
//        } else {
//            int serverNumber = BridgeServerIPConfig.BRIDGE_SERVER_IP_MAP.size();
//            int counter = 1;
//            while (counter < serverNumber) {
//                nodeIp = BridgeServerIPConfig.BRIDGE_SERVER_IP_MAP.
//                        get(BridgeServerIPConfig.BridgeServerConfigKey.BRIDGE_SERVER_IP_PRE + counter);
//                client = new TaskClient(nodeIp, port);
//                if (client.isReady()) {
//                    return client;
//                }
//                counter++;
//            }
//            if (counter >= serverNumber && !client.isReady()) {
//                throw new ConnectBridgeServerException();
//            }
//        }
        return client;
    }
}
