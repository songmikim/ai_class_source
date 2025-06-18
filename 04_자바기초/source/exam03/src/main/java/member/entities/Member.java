package member.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    private long seq;
    private String email;
    private String name;
    private  String mobile;
    private  boolean terms;
    private LocalDateTime regDt;
}
