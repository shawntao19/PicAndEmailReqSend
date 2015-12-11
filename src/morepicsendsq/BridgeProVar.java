/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morepicsendsq;

/**
 *
 * @author JasonYang
 */
public class BridgeProVar {

    public class ProKEY {

        public final static String CONTENTTYPE = "contentType";
        public final static String TASKNAME = "taskName";
        public final static String RESULTCODE = "resultCode";
        public final static String CONTENTLENGTH = "contentLength";
        public final static String CAMERASEQ = "serialNumber";

        public final static String STARTHOUR = "beginHour";
        public final static String ENDHOUR = "endHour";
        public final static String INTERVALMIN = "frequencyMinute";

        public final static String CAMERASTATUS = "connected";
    }

    public class ContentType {

        public final static String JASON = "json";
        public final static String BYTEARRAY = "binary";
        public final static String JASON_BYTEARRAY = "json_binary";
    }

    public class TaskName {

        /**
         * 定时拍照参数查询
         */
        public final static String TIMINGPARAGRAM = "monitoring.ObtainShootRuleTask";   //camera.ObtainShootRuleTask
        /**
         * 查询黑名单
         */
        public final static String OBTAINBLACKLIST = "camera.ObtainBlacklistTask";
        /**
         * 黑名单删除
         */
        public final static String DELETEBLACKLIST = "camera.DeleteBlacklistTask";
        /**
         * 云平台控制
         */
        public final static String CONTROLPTZ = "camera.ControlPtzTask";

        /**
         * 设备连接状态
         */
        public final static String CONNECTIONSTATUS = "camera.InformConnexityTask";

        /**
         * 获取所有当前连接信息
         */
        public final static String GETALLCONNECTINFO = "camera.AllInformConnexityTask";

        /**
         * 查询摄像头连接状态(页面刷新时，会发送)
         */
        public final static String QUEARYCAMERACONNECTSTATUS = "camera.QueryCameraConnexityStatusTask";

        /**
         * 图像数据传输任务
         */
        public final static String PICDATA = "picture.CreatePictureTask";

        /**
         * 实时拍照任务
         */
        public final static String REALTIMECAPTURE = "camera.RealTimeCaptureTask";

        /**
         * 实时视频任务（拍摄视频）
         */
        public final static String REALTIMEVIDEO = "camera.RealTimeVideoTask";

        /**
         * 发送mp4测试
         */
        public final static String SENDMP4TEST = "camera.SendMp4TestTask";

        /**
         * 清除之前存在的连接
         */
        public final static String CLEAROLDCONNECTION = "camera.EliminateConnexityTask";
        /**
         * 查询某个时刻之后的图片数量
         */
        public final static String OBTAINPICQUANTITY = "picture.ObtainPicturesQuantityTask";
        /**
         * 查询摄像头数量
         */
        public final static String OBTAIN_CAMERA_QUANTITY = "camera.ObtainCamerasTask";
        /**
         * 通知获得权限，并返回唯一码
         */
        public final static String OBTAIN_ONLY_CODE = "camera.ObtainCodeTask";
        /**
         * 发送视频参数，用于rtsp连接完成后向核心 报送所使用的分钟数
         */
        public final static String VIDEO_REQUEST_INFO = "video.VideoRequestInformTask";
        /**
         * 7.5.22视频录像检索（IPC、NVR）
         */
        public final static String VIDEO_FILE_QUERY = "camera.VideoFileQueryTask";
        /**
         * 7.5.23视频录像回放验证（IPC、NVR）
         */
        public final static String VIDEO_RECORD_PLAY = "camera.VideoRecordPlayTask";
        /**
         * 更新 拍照规则
         */
        public final static String UPDATE_SHOOT_RULE = "camera.UpdateShootRuleTask";
        /**
         * 更新 查询分辨率请求(2015年3月5日 10:46:49)
         */
        public final static String INQUIRY_FRAME_SIZE = "camera.InquiryFrameSizeTask";
        /**
         * 7.5.13存储录像策略添加（IPC、NVR）
         */
        public final static String ADD_RECOND_POLICY = "camera.AddRecondPolicyTask";

        /**
         * 测试端口，用于调用新的命令
         */
        public final static String INITIATIVE_TEST = "test.initiativeTestTask";
        /**
         * 视频播放
         */
        public final static String VIDEO_PLAY = "video.VideoPlayTask";
        /**
         * 视频播放停止
         */
        public final static String VIDEO_PLAY_STOP = "video.VideoPlayStopTask";
        /**
         * 卡尔中间层注册
         */
        public final static String TN_CAMERA_KAER_MIDDLEWARE_ADD = "camera.KaerMidWareAddCamTask";
        /**
         * 卡尔中间层删除
         */
        public final static String TN_CAMERA_KAER_MIDDLEWARE_DELETE = "camera.KaerMidWareDelCamTask";
        /**
         * 更新puid等信息，devlist
         */
        public final static String TN_CAMERA_KAER_MIDDLEWARE_UPDATE = "camera.KaerMidWareUpdCamTask";
        /**
         * 设置 监控区域
         */
        public final static String TN_KAER_MIDDLEWARE_SETMOVINGAREA = "monitoring.SetMovingAreaTask";
        /**
         * 查询 监控区域
         */
        public final static String TN_KAER_MIDDLEWARE_GETMOVINGAREA = "monitoring.GetMovingAreaTask";
        /**
         * 查询 POLLECAMERA
         */
        public final static String OBTAIN_POLLECAMERA = "camera.ObtainPolleCameraTask";
        /**
         * 刷新 中间层在线设备列表
         */
        public final static String TN_UPDATE_CENTRRALLIST="camera.UpdateDevList";
    }
}
