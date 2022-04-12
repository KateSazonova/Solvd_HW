package animals;


import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Article {
    private static final Logger LOGGER = LogManager.getLogger(LoggerRunner.class);

    public static void main(String[] args) {
        File file=new File(Article.class.getClassLoader().getResource("Lions").getFile());
        try {
            String str = FileUtils.readFileToString(file, "UTF-8");
            {
                LOGGER.info("the-" + StringUtils.countMatches(str, "the"));
                LOGGER.info("lions-" + StringUtils.countMatches(str, "lions"));
                LOGGER.info("Africa-" + StringUtils.countMatches(str, "Africa"));
                LOGGER.info("kill-" + StringUtils.countMatches(str, "kill"));
                LOGGER.info("born-" + StringUtils.countMatches(str, "born"));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


