import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jinhongliang on 2017/9/19.
 */
public class LogService {

    private static Logger log = LoggerFactory.getLogger(LogService.class);

    public  static  void  main(String[] args){
        System.out.println("LogService");
        log.info("LogService");
    }
}
