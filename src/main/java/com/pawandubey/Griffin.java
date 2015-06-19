/*
 * Copyright 2015 Pawan Dubey pawandubey@outlook.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pawandubey;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author Pawan Dubey pawandubey@outlook.com
 */
public class Griffin {
    protected final static LinkedBlockingQueue<Path> fileQueue = new LinkedBlockingQueue<>();

    /**
     *
     */
    public Griffin() {

    }
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        DirectoryCrawler crawler = new DirectoryCrawler();
        crawler.readIntoQueue(Paths.get(DirectoryCrawler.SOURCEDIR));
        for (Path p : fileQueue) {
            System.out.println(p.toString());
        }
    }

}
