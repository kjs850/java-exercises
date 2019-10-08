package hadoop;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import java.io.IOException;


public class HdfsTest {

    //http://localhost:8088/cluster
    public static final String inputPath = "hdfs://10.195.25.133:9000/test/aaa.txt";
    public static final String inputmsg = "hello~ jake\n";

    /**
     * 시험 삼아..
     * @param args
     */
    public static void main(String [] args) throws IOException {

        // hadoop의 configuration을 생성
        Configuration config = new Configuration();

        Path filenamePath = new Path(inputPath);

        // config를 HDFS로 parse
        FileSystem fs = filenamePath.getFileSystem(config);

        try {

            // inputmsg를 HDFS에 write
            FSDataOutputStream fin = fs.create(filenamePath);
            fin.writeUTF(inputmsg);
            fin.close();

            // filenamePath file을 읽어들임
            FSDataInputStream fout = fs.open(filenamePath);
            String msgIn = fout.readUTF();

            // 콘솔창에 출력
            System.out.println(msgIn);

            fout.close();
            fs.close();

        }catch(IOException ioe){
            System.err.println("IOException during operation " + ioe.toString());
            System.exit(1);
        }

    }
}
