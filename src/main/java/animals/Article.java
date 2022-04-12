package animals;


import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.File;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.apache.log4j.helpers.Loader.getResource;

public class Article {

    public static void main(String[] args) throws IOException {
        File file = new File(getResource("Lions").getFile());
        File file2 = new File("result.txt");

        Map<String, Integer> resultMap = new HashMap<>();

        String text = FileUtils.readFileToString(file);
        text = StringUtils.lowerCase(text);
        text = text.replace(".", "");
        text = text.replace(",", "");
        text = text.replace("!", "");
        text = text.replace("(", "");
        text = text.replace(")", "");
        text = text.replace("-", "");
        text = text.replace(":", "");

        String[] words = text.split(" ");

        for (String word : words) {
            int count = StringUtils.countMatches(text, word);
            resultMap.put(word, count);
        }

        resultMap.forEach(
                (key, value) -> {
                    try {
                        FileUtils.writeStringToFile(file2, key + ", " + value + "\n", true);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }
}

