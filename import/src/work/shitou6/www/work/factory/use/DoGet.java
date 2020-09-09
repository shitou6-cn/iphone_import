//package work.shitou6.www.work.factory.use;
//
//import org.apache.http.client.methods.CloseableHttpResponse;
//import org.apache.http.client.methods.HttpGet;
//import org.apache.http.impl.client.CloseableHttpClient;
//import org.apache.http.impl.client.HttpClients;
//import org.apache.http.util.EntityUtils;
//
//import java.util.List;
//
////get带参数请求
//public class DoGet {
//    public static void main(String[] args) throws Exception {
//        StringSet stringSet = new StringSet();
//        List<String> a = stringSet.String_Set(136, 10);
//        String1 xx1 = new String1();
//        //打开浏览器创建HttpClient对象
//        CloseableHttpClient httpClient = HttpClients.createDefault();
////            String xx="https://www.ip138.com/mobile.asp?mobile=";
//
////            String xx="https://haoma.baidu.com/phoneSearch?search="+s+
////            "1231&&position=&request_page=1";//需要验证  pass掉
//
//        for (String s : a) {
//            //创建HttpGet对象,设置URL访问地址
//            String xx = "https://www.ip138.com/mobile.asp?mobile=" + s + "&action=mobile";
//            HttpGet httpGet = new HttpGet(xx);
//            System.out.println("发送请求的信息" + httpGet);
//            //按回车发起请求,返回响应,使用HttpClient对象发起请求
//            CloseableHttpResponse response = null;
//            try {
//                response = httpClient.execute(httpGet);
//                //解析响应,
//                if (response.getStatusLine().getStatusCode() == 200) {
//                    String content = EntityUtils.toString(response.getEntity(), "UTF-8");
////                        content=xx1.subString(content,"locate_logo", "1</div>");
//                    System.out.println("---------" + content);
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            } finally {
//                //释放资源
//                if (response == null) {
//                    try {
//                        response.close();
//                        httpClient.close();//关闭浏览器
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            }
//
//        }
//
//    }
//
//}
