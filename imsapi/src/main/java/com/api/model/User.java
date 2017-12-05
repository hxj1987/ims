package com.api.model;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
@Data
@NoArgsConstructor
@XmlRootElement
public class User implements Serializable{
    private static final long serialVersionUID = 1L;

    @NotNull
    private String id;

    @NotNull
    @Size(min = 6, max = 50)
    private String name;
}
