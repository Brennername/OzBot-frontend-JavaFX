/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nexen.ozbotfrontendjavafx;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 *
 * @author NeXeN
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Model {
    String server;
    Integer port;
    String nick;
    Set<String> channels;
    
    
}
