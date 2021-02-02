
package com.commercetools.ml.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface TaskStatusEnum {

    TaskStatusEnum PENDING = TaskStatusEnumEnum.PENDING;

    TaskStatusEnum SUCCESS = TaskStatusEnumEnum.SUCCESS;

    enum TaskStatusEnumEnum implements TaskStatusEnum {
        PENDING("PENDING"),

        SUCCESS("SUCCESS");
        private final String jsonName;

        private TaskStatusEnumEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    @JsonCreator
    public static TaskStatusEnum findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new TaskStatusEnum() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }
        });
    }

    public static Optional<TaskStatusEnum> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static TaskStatusEnum[] values() {
        return TaskStatusEnumEnum.values();
    }
}
