
package com.commercetools.api.models.product_search;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSearchAttributeType
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ProductSearchAttributeType extends JsonEnum {

    ProductSearchAttributeType BOOLEAN = ProductSearchAttributeTypeEnum.BOOLEAN;

    ProductSearchAttributeType TEXT = ProductSearchAttributeTypeEnum.TEXT;

    ProductSearchAttributeType LTEXT = ProductSearchAttributeTypeEnum.LTEXT;

    ProductSearchAttributeType ENUM = ProductSearchAttributeTypeEnum.ENUM;

    ProductSearchAttributeType LENUM = ProductSearchAttributeTypeEnum.LENUM;

    ProductSearchAttributeType NUMBER = ProductSearchAttributeTypeEnum.NUMBER;

    ProductSearchAttributeType MONEY = ProductSearchAttributeTypeEnum.MONEY;

    ProductSearchAttributeType DATE = ProductSearchAttributeTypeEnum.DATE;

    ProductSearchAttributeType DATETIME = ProductSearchAttributeTypeEnum.DATETIME;

    ProductSearchAttributeType TIME = ProductSearchAttributeTypeEnum.TIME;

    ProductSearchAttributeType REFERENCE = ProductSearchAttributeTypeEnum.REFERENCE;

    ProductSearchAttributeType SET_BOOLEAN = ProductSearchAttributeTypeEnum.SET_BOOLEAN;

    ProductSearchAttributeType SET_TEXT = ProductSearchAttributeTypeEnum.SET_TEXT;

    ProductSearchAttributeType SET_LTEXT = ProductSearchAttributeTypeEnum.SET_LTEXT;

    ProductSearchAttributeType SET_ENUM = ProductSearchAttributeTypeEnum.SET_ENUM;

    ProductSearchAttributeType SET_LENUM = ProductSearchAttributeTypeEnum.SET_LENUM;

    ProductSearchAttributeType SET_NUMBER = ProductSearchAttributeTypeEnum.SET_NUMBER;

    ProductSearchAttributeType SET_MONEY = ProductSearchAttributeTypeEnum.SET_MONEY;

    ProductSearchAttributeType SET_DATE = ProductSearchAttributeTypeEnum.SET_DATE;

    ProductSearchAttributeType SET_DATETIME = ProductSearchAttributeTypeEnum.SET_DATETIME;

    ProductSearchAttributeType SET_TIME = ProductSearchAttributeTypeEnum.SET_TIME;

    ProductSearchAttributeType SET_REFERENCE = ProductSearchAttributeTypeEnum.SET_REFERENCE;

    /**
     * possible values of ProductSearchAttributeType
     */
    enum ProductSearchAttributeTypeEnum implements ProductSearchAttributeType {
        /**
         * boolean
         */
        BOOLEAN("boolean"),

        /**
         * text
         */
        TEXT("text"),

        /**
         * ltext
         */
        LTEXT("ltext"),

        /**
         * enum
         */
        ENUM("enum"),

        /**
         * lenum
         */
        LENUM("lenum"),

        /**
         * number
         */
        NUMBER("number"),

        /**
         * money
         */
        MONEY("money"),

        /**
         * date
         */
        DATE("date"),

        /**
         * datetime
         */
        DATETIME("datetime"),

        /**
         * time
         */
        TIME("time"),

        /**
         * reference
         */
        REFERENCE("reference"),

        /**
         * set_boolean
         */
        SET_BOOLEAN("set_boolean"),

        /**
         * set_text
         */
        SET_TEXT("set_text"),

        /**
         * set_ltext
         */
        SET_LTEXT("set_ltext"),

        /**
         * set_enum
         */
        SET_ENUM("set_enum"),

        /**
         * set_lenum
         */
        SET_LENUM("set_lenum"),

        /**
         * set_number
         */
        SET_NUMBER("set_number"),

        /**
         * set_money
         */
        SET_MONEY("set_money"),

        /**
         * set_date
         */
        SET_DATE("set_date"),

        /**
         * set_datetime
         */
        SET_DATETIME("set_datetime"),

        /**
         * set_time
         */
        SET_TIME("set_time"),

        /**
         * set_reference
         */
        SET_REFERENCE("set_reference");
        private final String jsonName;

        private ProductSearchAttributeTypeEnum(final String jsonName) {
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
     * factory method for a enum value of ProductSearchAttributeType
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ProductSearchAttributeType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ProductSearchAttributeType() {
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
    public static Optional<ProductSearchAttributeType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ProductSearchAttributeType[] values() {
        return ProductSearchAttributeTypeEnum.values();
    }

}
