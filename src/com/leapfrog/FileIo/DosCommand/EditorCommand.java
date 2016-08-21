/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.FileIo.DosCommand;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author apple
 */
public class EditorCommand extends DosCommand {

    @Override
    public void execute(String[] cmd) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = "";
            StringBuilder content = new StringBuilder();
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                content.append(line).append("\r\n");
            }
            reader.close();

            FileWriter writer = new FileWriter(cmd[1]);
            writer.write(content.toString());
            writer.close();

        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }
}
