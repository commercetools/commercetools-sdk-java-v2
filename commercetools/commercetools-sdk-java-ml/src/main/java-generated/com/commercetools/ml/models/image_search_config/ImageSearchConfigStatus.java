
package com.commercetools.ml.models.image_search_config;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImageSearchConfigStatus
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ImageSearchConfigStatus {

    ImageSearchConfigStatus ON = ImageSearchConfigStatusEnum.ON;

    ImageSearchConfigStatus OFF = ImageSearchConfigStatusEnum.OFF;

    /**
     * possible values of ImageSearchConfigStatus
     */
    enum ImageSearchConfigStatusEnum implements ImageSearchConfigStatus {
        /**
         * on
         */
        ON("on"),

        /**
         * off
         */
        OFF("off");
        private final String jsonName;

        private ImageSearchConfigStatusEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    /**
     * the JSON value
     * @return json value
     */
    @JsonValue
    String getJsonName();

    /**
     * the enum value
     * @return name
     */
    String name();

    /**
     * convert value to string
     * @return string representation
     */
    String toString();

    /**
     * factory method for a enum value of ImageSearchConfigStatus
     * if no enum has been found an anonymous instance will be created
     * @return enum instance
     */
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

            public String toString() {
                return value;
            }
        });
    }

    /**
     * method to find enum using the JSON value
     * @return optional of enum instance
     */
    public static Optional<ImageSearchConfigStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ImageSearchConfigStatus[] values() {
        return ImageSearchConfigStatusEnum.values();
    }

}
