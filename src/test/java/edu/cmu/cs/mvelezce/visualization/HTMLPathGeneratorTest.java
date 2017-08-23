package edu.cmu.cs.mvelezce.visualization;

import org.junit.Test;

import java.io.IOException;

public class HTMLPathGeneratorTest {

    @Test
    public void generateHTMLRunningExample() throws IOException {
        String root = "/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/running-example/src/main/java";
        String systemName = "running-example";

        HTMLPathGenerator.generateHTMLForSystem(root, systemName);

//        HTMLBaseGenerator generator = new HTMLPathGenerator(root, systemName);
//        generator.generateHTMLPage();
    }

    @Test
    public void generateHTMLColorCounter() throws IOException {
        String root = "/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/pngtastic-counter/src";
        String systemName = "pngtasticColorCounter";

        HTMLPathGenerator.generateHTMLForSystem(root, systemName);
    }

}