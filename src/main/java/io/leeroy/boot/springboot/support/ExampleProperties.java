package io.leeroy.boot.springboot.support;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

@ConfigurationProperties("example")
public class ExampleProperties {
    private final List<MyPojo> list = new ArrayList();
    public List<MyPojo> getList() {
        return this.list;
    }

    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    @Getter
    public static class MyPojo {
        private String name;
        private String description;

        @Builder
        public MyPojo(String name, String description) {
            this.name = name;
            this.description = description;
        }
    }
}
