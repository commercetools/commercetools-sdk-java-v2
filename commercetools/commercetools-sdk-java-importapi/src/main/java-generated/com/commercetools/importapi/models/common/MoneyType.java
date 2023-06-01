package com.commercetools.importapi.models.common;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MoneyType
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface MoneyType extends JsonEnum {

    
    MoneyType CENT_PRECISION = MoneyTypeEnum.CENT_PRECISION;
    
    MoneyType HIGH_PRECISION = MoneyTypeEnum.HIGH_PRECISION;
    
    /**
     * possible values of MoneyType
     */
    enum MoneyTypeEnum implements MoneyType {
        /**
         * centPrecision
         */
        CENT_PRECISION("centPrecision"),
        
        /**
         * highPrecision
         */
        HIGH_PRECISION("highPrecision");
        private final String jsonName;

        private MoneyTypeEnum(final String jsonName) {
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
     * factory method for a enum value of MoneyType
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static MoneyType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new MoneyType() {
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
    public static Optional<MoneyType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static MoneyType[] values() {
        return MoneyTypeEnum.values();
    }
    
}
