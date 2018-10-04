package io.leeroy.boot.springboot.config;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Data
@Validated
@ConfigurationProperties("example")
public class ExampleProperties {
    private boolean enabled;
    @NotNull
    private InetAddress remoteAddress;
    @Valid
    private final Security security = new Security();

    private final List<MyPojo> list = new ArrayList();
    public List<MyPojo> getList() {
        return this.list;
    }

    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @Data
    public static class MyPojo {
        private String name;
        private String description;

        @Builder
        public MyPojo(String name, String description) {
            this.name = name;
            this.description = description;
        }
    }

    @Data
    public static class Security {
        @NotEmpty
        private String username;
//        @NotEmpty // 값이 없을때 실행시 BindValidationException 발생
        private String password;
        private List<String> roles = new ArrayList<>(Collections.singleton("USER"));
    }
}
