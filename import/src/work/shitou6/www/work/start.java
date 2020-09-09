package work.shitou6.www.work;

import work.shitou6.www.work.factory.Factory;

public class start {

    public static void main(String[] args) throws Exception {
        //下面两个是  city 城市   cap省会
        String cityPath = "C:\\Users\\admin\\Desktop\\test1\\chengshi.txt";
        String capitalPath = "C:\\Users\\admin\\Desktop\\test1\\sheng.txt";
        //生成sql的路径
        String sql="C:\\Users\\admin\\Desktop\\test11.sql";


        Factory factory=new Factory();
        factory.Factory1(136,10,cityPath,capitalPath,sql);
    }
}
