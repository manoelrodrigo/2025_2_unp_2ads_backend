package br.edu.unipaulistana.backend.Blog.domainmodel;

import lombok.*;

import java.util.Date;
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Post {
    private @Getter @Setter Long Id;
    private @Getter @Setter String Title;
    private @Getter @Setter String Content;
    private @Getter @Setter Date CreatedOn;



}
