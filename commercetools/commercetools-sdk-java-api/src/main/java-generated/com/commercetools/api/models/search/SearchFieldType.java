
package com.commercetools.api.models.search;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Possible values for the <code>fieldType</code> property on <span>simple expressions</span> indicating the data type of the <code>field</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface SearchFieldType extends JsonEnum {

    /**
    <p>For Boolean fields, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeBooleanType" rel="nofollow">AttributeBooleanType</a> Attributes, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldBooleanType" rel="nofollow">BooleanType</a> Custom Fields.</p> */
    SearchFieldType BOOLEAN = SearchFieldTypeEnum.BOOLEAN;
    /**
    <p>For string fields, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeTextType" rel="nofollow">AttributeTextType</a> Attributes, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldStringType" rel="nofollow">StringType</a> Custom Fields.</p> */
    SearchFieldType TEXT = SearchFieldTypeEnum.TEXT;
    /**
    <p>For <span>LocalizedString</span> fields, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizableTextType" rel="nofollow">AttributeLocalizableTextType</a> Attributes, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldLocalizedStringType" rel="nofollow">LocalizedStringType</a> Custom Fields.</p> */
    SearchFieldType LTEXT = SearchFieldTypeEnum.LTEXT;
    /**
    <p>For enum fields, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeEnumType" rel="nofollow">AttributeEnumType</a> Attributes, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldEnumType" rel="nofollow">EnumType</a> Custom Fields.</p> */
    SearchFieldType ENUM = SearchFieldTypeEnum.ENUM;
    /**
    <p>For localized enum fields, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeLocalizedEnumType" rel="nofollow">AttributeLocalizedEnumType</a> Attributes, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldLocalizedEnumType" rel="nofollow">LocalizedEnumType</a> Custom Fields.</p> */
    SearchFieldType LENUM = SearchFieldTypeEnum.LENUM;
    /**
    <p>For number fields, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeNumberType" rel="nofollow">AttributeNumberType</a> Attributes, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldNumberType" rel="nofollow">NumberType</a> Custom Fields.</p> */
    SearchFieldType NUMBER = SearchFieldTypeEnum.NUMBER;
    /**
    <p>For <span>Money</span> fields and <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeMoneyType" rel="nofollow">AttributeMoneyType</a> Attributes.</p> */
    SearchFieldType MONEY = SearchFieldTypeEnum.MONEY;
    /**
    <p>For <span>Date</span> fields, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDateType" rel="nofollow">AttributeDateType</a> Attributes, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldDateType" rel="nofollow">DateType</a> Custom Fields.</p> */
    SearchFieldType DATE = SearchFieldTypeEnum.DATE;
    /**
    <p>For <span>DateTime</span> fields, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDateTimeType" rel="nofollow">AttributeDateTimeType</a> Attributes, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldDateTimeType" rel="nofollow">DateTimeType</a> Custom Fields.</p> */
    SearchFieldType DATETIME = SearchFieldTypeEnum.DATETIME;
    /**
    <p>For <span>Time</span> fields, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeTimeType" rel="nofollow">AttributeTimeType</a> Attributes, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldTimeType" rel="nofollow">TimeType</a> Custom Fields.</p> */
    SearchFieldType TIME = SearchFieldTypeEnum.TIME;
    /**
    <p>For <span>Reference</span> fields and <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeReferenceType" rel="nofollow">AttributeReferenceType</a> Attributes.</p> */
    SearchFieldType REFERENCE = SearchFieldTypeEnum.REFERENCE;
    /**
    <p>For Set of Boolean fields, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">AttributeSetType</a> of <code>boolean</code> Attributes, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">SetType</a> of <code>boolean</code> Custom Fields.</p> */
    SearchFieldType SET_BOOLEAN = SearchFieldTypeEnum.SET_BOOLEAN;
    /**
    <p>For Set of string fields, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">AttributeSetType</a> of <code>text</code> Attributes, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">SetType</a> of <code>text</code> Custom Fields.</p> */
    SearchFieldType SET_TEXT = SearchFieldTypeEnum.SET_TEXT;
    /**
    <p>For Set of <span>LocalizedString</span> fields, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">AttributeSetType</a> of <code>ltext</code> Attributes, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">SetType</a> of <code>ltext</code> Custom Fields.</p> */
    SearchFieldType SET_LTEXT = SearchFieldTypeEnum.SET_LTEXT;
    /**
    <p>For Set of enum fields, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">AttributeSetType</a> of <code>enum</code> Attributes, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">SetType</a> of <code>enum</code> Custom Fields.</p> */
    SearchFieldType SET_ENUM = SearchFieldTypeEnum.SET_ENUM;
    /**
    <p>For Set of localized enum fields, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">AttributeSetType</a> of <code>lenum</code> Attributes, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">SetType</a> of <code>lenum</code> Custom Fields.</p> */
    SearchFieldType SET_LENUM = SearchFieldTypeEnum.SET_LENUM;
    /**
    <p>For Set of number fields, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">AttributeSetType</a> of <code>number</code> Attributes, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">SetType</a> of <code>number</code> Custom Fields.</p> */
    SearchFieldType SET_NUMBER = SearchFieldTypeEnum.SET_NUMBER;
    /**
    <p>For Set of <span>Money</span> fields and <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">AttributeSetType</a> of <code>money</code> Attributes.</p> */
    SearchFieldType SET_MONEY = SearchFieldTypeEnum.SET_MONEY;
    /**
    <p>For Set of <span>Date</span> fields, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">AttributeSetType</a> of <code>date</code> Attributes, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">SetType</a> of <code>date</code> Custom Fields.</p> */
    SearchFieldType SET_DATE = SearchFieldTypeEnum.SET_DATE;
    /**
    <p>For Set of <span>DateTime</span> fields, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">AttributeSetType</a> of <code>datetime</code> Attributes, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">SetType</a> of <code>datetime</code> Custom Fields.</p> */
    SearchFieldType SET_DATETIME = SearchFieldTypeEnum.SET_DATETIME;
    /**
    <p>For Set of <span>Time</span> fields, <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">AttributeSetType</a> of <code>time</code> Attributes, and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldSetType" rel="nofollow">SetType</a> of <code>time</code> Custom Fields.</p> */
    SearchFieldType SET_TIME = SearchFieldTypeEnum.SET_TIME;
    /**
    <p>For Set of <span>Reference</span> fields and <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeSetType" rel="nofollow">AttributeSetType</a> of <code>reference</code> Attributes.</p> */
    SearchFieldType SET_REFERENCE = SearchFieldTypeEnum.SET_REFERENCE;

    /**
     * possible values of SearchFieldType
     */
    enum SearchFieldTypeEnum implements SearchFieldType {
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

        private SearchFieldTypeEnum(final String jsonName) {
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
     * factory method for a enum value of SearchFieldType
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static SearchFieldType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new SearchFieldType() {
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
    public static Optional<SearchFieldType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static SearchFieldType[] values() {
        return SearchFieldTypeEnum.values();
    }

}
