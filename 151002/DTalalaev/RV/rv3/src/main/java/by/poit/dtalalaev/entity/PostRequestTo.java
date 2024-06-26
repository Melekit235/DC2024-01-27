package by.poit.dtalalaev.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Size;
import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
public class PostRequestTo {
    private BigInteger id;
    private BigInteger storyId;
    @Size(min =2 , max = 2048, message = "Content must be between 2 and 2048 characters")
    private String content;
}
