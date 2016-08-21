/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.FileIo.DosCommand;

/**
 *
 * @author apple
 */
public class DosFactory {
    
    public static DosCommand get(String param){
        if(param.equalsIgnoreCase("md")){
        return new MkdirCommand();
    }else if (param.equalsIgnoreCase("rd")){
        return new RmdirCommand();
}else if (param.equalsIgnoreCase("rem")){
        return new RenameCommand();
}else if (param.equalsIgnoreCase("cp")){
        return new WriteCommand();
}else if (param.equalsIgnoreCase("dir")){
        return new DirectoryCommand();
}else if (param.equalsIgnoreCase("vi")){
        return new EditorCommand();
}
        
   return null;
    }
}

