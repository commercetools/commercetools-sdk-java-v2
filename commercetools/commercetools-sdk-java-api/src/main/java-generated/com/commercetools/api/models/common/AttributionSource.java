
package com.commercetools.api.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributionSource
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AttributionSource extends JsonEnum {

    /**
    <p>Resource was created or updated during import.</p> */
    AttributionSource IMPORT = AttributionSourceEnum.IMPORT;
    /**
    <p>Resource was created or updated during export.</p> */
    AttributionSource EXPORT = AttributionSourceEnum.EXPORT;

    /**
     * possible values of AttributionSource
     */
    enum AttributionSourceEnum implements AttributionSource {
        /**
         * Import
         */
        IMPORT("Import"),

        /**
         * Export
         */
        EXPORT("Export");
        private final String jsonName;

        private AttributionSourceEnum(final String jsonName) {
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
     * factory method for a enum value of AttributionSource
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static AttributionSource findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new AttributionSource() {
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
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<AttributionSource> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static AttributionSource[] values() {
        return AttributionSourceEnum.values();
    }

}
