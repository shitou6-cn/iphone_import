package work.shitou6.www.work.factory.use;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Input {
    public static synchronized void Input(List<String> work, String url) {
        {


            FileWriter fw = null;
            try {
        //如果文件存在，则追加内容；如果文件不存在，则创建文件
                File f = new File(url);
                fw = new FileWriter(f, true);
            } catch (IOException e) {
                e.printStackTrace();
            }
            PrintWriter pw = new PrintWriter(fw);
            //得到所有sql语句 将其建成sql
            for (String s : work) {
                pw.println(s);
            }
            pw.flush();
            try {
                fw.flush();
                pw.close();
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
        }
    }
}
