
package com.commercetools.ml.models.image_search_config;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ImageSearchConfigStatus {

    ImageSearchConfigStatus ON = ImageSearchConfigStatusEnum.ON;

    ImageSearchConfigStatus OFF = ImageSearchConfigStatusEnum.OFF;

    enum ImageSearchConfigStatusEnum implements ImageSearchConfigStatus {
        ON("on"),

        OFF("off");
        private final String jsonName;

        private ImageSearchConfigStatusEnum(final String jsonName) {
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
    public static ImageSearchConfigStatus findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ImageSearchConfigStatus() {
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

    public static Optional<ImageSearchConfigStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static ImageSearchConfigStatus[] values() {
        return ImageSearchConfigStatusEnum.values();
    }
}
