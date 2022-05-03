package com.ms.email.models;

import com.ms.email.enums.StatusEmail;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//geração automatica
    private Long emailId;
    private String ownerRef;//ref do proprietario da mens.
    private String emailFrom;//quem manda
    private String emailTo;//quem recebe
    private String subject;//titulo do e-mail
    @Column(columnDefinition = "TEXT")//inserir >255 caracteres
    private String text;//corpo do e-mail
    private LocalDateTime sendDateEmail;
    private StatusEmail statusEmail;//enum
}
