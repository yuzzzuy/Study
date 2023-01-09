package json;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Synchronized;
import lombok.experimental.Tolerate;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/**
 * @author WangChen
 * @date 2023/1/9 15:48
 * @description
 */
@Data
public class Person {
    private String id;
    private String name;
    private List<String> skills;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "Asia/Shanghai")
    private LocalDateTime createTime;

}
