
package com.commercetools.api.models.order;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Possible values for the <code>customType</code> property on <span>simple expressions</span> indicating the data type of the <code>field</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface OrderSearchCustomType extends JsonEnum {

    /**
    <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldBooleanType" rel="nofollow">CustomFieldBooleanType</a> Custom Fields.</p> */
    OrderSearchCustomType BOOLEAN_TYPE = OrderSearchCustomTypeEnum.BOOLEAN_TYPE;
    /**
    <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldStringType" rel="nofollow">CustomFieldStringType</a> Custom Fields.</p> */
    OrderSearchCustomType STRING_TYPE = OrderSearchCustomTypeEnum.STRING_TYPE;
    /**
    <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldLocalizedStringType" rel="nofollow">CustomFieldLocalizedStringType</a> Custom Fields.</p> */
    OrderSearchCustomType LOCALIZED_STRING_TYPE = OrderSearchCustomTypeEnum.LOCALIZED_STRING_TYPE;
    /**
    <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldEnumType" rel="nofollow">CustomFieldEnumType</a> Custom Fields.</p> */
    OrderSearchCustomType ENUM_TYPE = OrderSearchCustomTypeEnum.ENUM_TYPE;
    /**
    <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldLocalizedEnumType" rel="nofollow">CustomFieldLocalizedEnumType</a> Custom Fields.</p> */
    OrderSearchCustomType LOCALIZED_ENUM_TYPE = OrderSearchCustomTypeEnum.LOCALIZED_ENUM_TYPE;
    /**
    <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldNumberType" rel="nofollow">CustomFieldNumberType</a> Custom Fields.</p> */
    OrderSearchCustomType NUMBER_TYPE = OrderSearchCustomTypeEnum.NUMBER_TYPE;
    /**
    <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldDateType" rel="nofollow">CustomFieldDateType</a> Custom Fields.</p> */
    OrderSearchCustomType DATE_TYPE = OrderSearchCustomTypeEnum.DATE_TYPE;
    /**
    <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldTimeType" rel="nofollow">CustomFieldTimeType</a> Custom Fields.</p> */
    OrderSearchCustomType TIME_TYPE = OrderSearchCustomTypeEnum.TIME_TYPE;
    /**
    <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldDateTimeType" rel="nofollow">CustomFieldDateTimeType</a> Custom Fields.</p> */
    OrderSearchCustomType DATE_TIME_TYPE = OrderSearchCustomTypeEnum.DATE_TIME_TYPE;
    /**
    <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">CustomFieldSetType</a> of <code>StringType</code> Custom Fields.</p> */
    OrderSearchCustomType SET_TYPE_STRING_TYPE = OrderSearchCustomTypeEnum.SET_TYPE_STRING_TYPE;
    /**
    <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">CustomFieldSetType</a> of <code>LocalizedStringType</code> Custom Fields.</p> */
    OrderSearchCustomType SET_TYPE_LOCALIZED_STRING_TYPE = OrderSearchCustomTypeEnum.SET_TYPE_LOCALIZED_STRING_TYPE;
    /**
    <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">CustomFieldSetType</a> of <code>EnumType</code> Custom Fields.</p> */
    OrderSearchCustomType SET_TYPE_ENUM_TYPE = OrderSearchCustomTypeEnum.SET_TYPE_ENUM_TYPE;
    /**
    <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">CustomFieldSetType</a> of <code>LocalizedEnumType</code> Custom Fields.</p> */
    OrderSearchCustomType SET_TYPE_LOCALIZED_ENUM_TYPE = OrderSearchCustomTypeEnum.SET_TYPE_LOCALIZED_ENUM_TYPE;
    /**
    <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">CustomFieldSetType</a> of <code>NumberType</code> Custom Fields.</p> */
    OrderSearchCustomType SET_TYPE_NUMBER_TYPE = OrderSearchCustomTypeEnum.SET_TYPE_NUMBER_TYPE;
    /**
    <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">CustomFieldSetType</a> of <code>DateType</code> Custom Fields.</p> */
    OrderSearchCustomType SET_TYPE_DATE_TYPE = OrderSearchCustomTypeEnum.SET_TYPE_DATE_TYPE;
    /**
    <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">CustomFieldSetType</a> of <code>TimeType</code> Custom Fields.</p> */
    OrderSearchCustomType SET_TYPE_TIME_TYPE = OrderSearchCustomTypeEnum.SET_TYPE_TIME_TYPE;
    /**
    <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">CustomFieldSetType</a> of <code>DateTimeType</code> Custom Fields.</p> */
    OrderSearchCustomType SET_TYPE_DATE_TIME_TYPE = OrderSearchCustomTypeEnum.SET_TYPE_DATE_TIME_TYPE;

    /**
     * possible values of OrderSearchCustomType
     */
    enum OrderSearchCustomTypeEnum implements OrderSearchCustomType {
        /**
         * BooleanType
         */
        BOOLEAN_TYPE("BooleanType"),

        /**
         * StringType
         */
        STRING_TYPE("StringType"),

        /**
         * LocalizedStringType
         */
        LOCALIZED_STRING_TYPE("LocalizedStringType"),

        /**
         * EnumType
         */
        ENUM_TYPE("EnumType"),

        /**
         * LocalizedEnumType
         */
        LOCALIZED_ENUM_TYPE("LocalizedEnumType"),

        /**
         * NumberType
         */
        NUMBER_TYPE("NumberType"),

        /**
         * DateType
         */
        DATE_TYPE("DateType"),

        /**
         * TimeType
         */
        TIME_TYPE("TimeType"),

        /**
         * DateTimeType
         */
        DATE_TIME_TYPE("DateTimeType"),

        /**
         * SetType.StringType
         */
        SET_TYPE_STRING_TYPE("SetType.StringType"),

        /**
         * SetType.LocalizedStringType
         */
        SET_TYPE_LOCALIZED_STRING_TYPE("SetType.LocalizedStringType"),

        /**
         * SetType.EnumType
         */
        SET_TYPE_ENUM_TYPE("SetType.EnumType"),

        /**
         * SetType.LocalizedEnumType
         */
        SET_TYPE_LOCALIZED_ENUM_TYPE("SetType.LocalizedEnumType"),

        /**
         * SetType.NumberType
         */
        SET_TYPE_NUMBER_TYPE("SetType.NumberType"),

        /**
         * SetType.DateType
         */
        SET_TYPE_DATE_TYPE("SetType.DateType"),

        /**
         * SetType.TimeType
         */
        SET_TYPE_TIME_TYPE("SetType.TimeType"),

        /**
         * SetType.DateTimeType
         */
        SET_TYPE_DATE_TIME_TYPE("SetType.DateTimeType");
        private final String jsonName;

        private OrderSearchCustomTypeEnum(final String jsonName) {
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
     * factory method for a enum value of OrderSearchCustomType
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static OrderSearchCustomType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new OrderSearchCustomType() {
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
    public static Optional<OrderSearchCustomType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static OrderSearchCustomType[] values() {
        return OrderSearchCustomTypeEnum.values();
    }

}
