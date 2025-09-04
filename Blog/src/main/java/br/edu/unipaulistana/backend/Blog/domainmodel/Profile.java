package br.edu.unipaulistana.backend.Blog.domainmodel;

import br.edu.unipaulistana.backend.Blog.controller.User;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Profile {
    private @Getter @Setter Long id;
    private  @Getter @Setter String Bio;
    private @Getter @Setter String PictureUrl;
    private @Getter @Setter User user;


}
