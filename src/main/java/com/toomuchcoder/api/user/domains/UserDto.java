package com.toomuchcoder.api.user.domains;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * packageName: com.toomuchcoder.api.auth.domains
 * fileName        : UserDto.java
 * author          : solyikwon
 * date            : 2022-05-24
 * desc            :
 * =============================================
 * DATE              AUTHOR        NOTE
 * =============================================
 * 2022-05-24         solyikwon      최초 생성
 **/
@Component @Data
public class UserDto {
    @ApiModelProperty(position=1) private long userid;
    @ApiModelProperty(position=2) private long username;
    @ApiModelProperty(position=3) private long password;
    @ApiModelProperty(position=4) private long name;
    @ApiModelProperty(position=5) private long email;
    @ApiModelProperty(position=6) private long regDate;
    @ApiModelProperty(position=7) private long token;
    @ApiModelProperty(position=8) private List<Role> roles;


}
