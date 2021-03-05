/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import entities.renameme.RenameMe;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author tha
 */
public class RenameMeDTO {
    private long id;
    private String str1;
    private String str2;

    public RenameMeDTO(String dummyStr1, String dummyStr2) {
        this.str1 = dummyStr1;
        this.str2 = dummyStr2;
    }
    
    public static List<RenameMeDTO> getFromRenameMeList(List<RenameMe> rms){
        return rms.stream()
            .map(rm -> new RenameMeDTO(rm))
            .collect(Collectors.toList());
    }


    public RenameMeDTO(RenameMe rm) {
        this.id = rm.getId();
        this.str1 = rm.getDummyStr1();
        this.str2 = rm.getDummyStr2();
    }

    public String getDummyStr1() {
        return str1;
    }

    public void setDummyStr1(String dummyStr1) {
        this.str1 = dummyStr1;
    }

    public String getDummyStr2() {
        return str2;
    }

    public void setDummyStr2(String dummyStr2) {
        this.str2 = dummyStr2;
    }

    @Override
    public String toString() {
        return "RenameMeDTO{" + "id=" + id + ", str1=" + str1 + ", str2=" + str2 + '}';
    }
    
    
    
    
    
    
}
