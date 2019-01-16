package com.example.shruti.besa_application_project;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CSVFileWriter {

        private PrintWriter csvWriter;
        private File file;

        public CSVFileWriter(File file) {
            this.file = file;

        }

        public void writeHeader(String data) {

            try {
                if (data != null) {
                    System.out.println("I am printing");
                    csvWriter = new PrintWriter(new FileWriter(file, true));
                    csvWriter.print(",");
                    csvWriter.print("Student");
                    csvWriter.print(data);
                    csvWriter.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

