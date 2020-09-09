package work.shitou6.www.work.factory;

import work.shitou6.www.work.factory.use.DoPost;
import work.shitou6.www.work.factory.use.Input;
import work.shitou6.www.work.factory.use.Manager;
import work.shitou6.www.work.factory.use.StringSet;
import java.util.ArrayList;
import java.util.List;
//工厂类
public class Factory {
    //传入 数字 循环1000 的List<String>
    public static StringSet stringSet = new StringSet();
    // 发送post请求
    public static DoPost post = new DoPost();
    //拼接sql的方法
    public static Manager sqlList=new Manager();
    public static void Factory1(int iphone,int size,String cityPath,String capitalPath,String sql) throws Exception {
        //生成所有号段   通过post方法得到所有需要格式化变为sql的集合
        System.out.println("生成所有号段   通过post方法得到所有需要格式化变为sql的集合-----------");
        List<String> iphoneList=post.Post(stringSet.String_Set(iphone,size));
//        System.out.println("iphoneList = " + iphoneList);
        //格式化为sql文件
        System.out.println("格式化为sql文件---");
        List<String> sqlList1=sqlList.sqlManager(iphoneList,cityPath,capitalPath);
//        System.out.println("sqlList1 = " + sqlList1);
        //生成sql文件
        System.out.println("写入sql文件----");
        Input input = new Input();
        //生成sql文件
        input.Input(sqlList1, sql);
        System.out.println("运行结束");

    }
}
