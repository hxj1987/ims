package com.api.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
@Data
@NoArgsConstructor
@XmlRootElement
public class UserModel implements Serializable{
    private static final long serialVersionUID = 1L;
    private Long id;
    private String userName;
    private String userNo;


}
