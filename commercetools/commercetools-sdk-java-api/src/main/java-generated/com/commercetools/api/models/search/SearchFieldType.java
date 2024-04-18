
package com.commercetools.api.models.search;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Possible values for the <code>fieldType</code> property on query expressions indicating the data type of the <code>field</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface SearchFieldType extends JsonEnum {

    /**
    <p>For Boolean fields and AttributeBooleanType Attributes.</p> */
    SearchFieldType BOOLEAN = SearchFieldTypeEnum.BOOLEAN;
    /**
    <p>For string fields and AttributeTextType Attributes.</p> */
    SearchFieldType TEXT = SearchFieldTypeEnum.TEXT;
    /**
    <p>For LocalizedString fields and AttributeLocalizableTextType Attributes.</p> */
    SearchFieldType LTEXT = SearchFieldTypeEnum.LTEXT;
    /**
    <p>For enum fields and AttributeEnumType Attributes.</p> */
    SearchFieldType ENUM = SearchFieldTypeEnum.ENUM;
    /**
    <p>For localized enum fields and AttributeLocalizedEnumType Attributes.</p> */
    SearchFieldType LENUM = SearchFieldTypeEnum.LENUM;
    /**
    <p>For number fields and AttributeNumberType Attributes.</p> */
    SearchFieldType NUMBER = SearchFieldTypeEnum.NUMBER;
    /**
    <p>For Money fields and AttributeMoneyType Attributes.</p> */
    SearchFieldType MONEY = SearchFieldTypeEnum.MONEY;
    /**
    <p>For Date fields and AttributeDateType Attributes.</p> */
    SearchFieldType DATE = SearchFieldTypeEnum.DATE;
    /**
    <p>For DateTime fields and AttributeDateTimeType Attributes.</p> */
    SearchFieldType DATETIME = SearchFieldTypeEnum.DATETIME;
    /**
    <p>For Time fields and AttributeTimeType Attributes.</p> */
    SearchFieldType TIME = SearchFieldTypeEnum.TIME;
    /**
    <p>For Reference fields and AttributeReferenceType Attributes.</p> */
    SearchFieldType REFERENCE = SearchFieldTypeEnum.REFERENCE;
    /**
    <p>For Set of Boolean fields and AttributeSetType of <code>boolean</code> Attributes.</p> */
    SearchFieldType SET_BOOLEAN = SearchFieldTypeEnum.SET_BOOLEAN;
    /**
    <p>For Set of string fields and AttributeSetType of <code>text</code> Attributes.</p> */
    SearchFieldType SET_TEXT = SearchFieldTypeEnum.SET_TEXT;
    /**
    <p>For Set of LocalizedString fields and AttributeSetType of <code>ltext</code> Attributes.</p> */
    SearchFieldType SET_LTEXT = SearchFieldTypeEnum.SET_LTEXT;
    /**
    <p>For Set of enum fields and AttributeSetType of <code>enum</code> Attributes.</p> */
    SearchFieldType SET_ENUM = SearchFieldTypeEnum.SET_ENUM;
    /**
    <p>For Set of localized enum fields and AttributeSetType of <code>lenum</code> Attributes.</p> */
    SearchFieldType SET_LENUM = SearchFieldTypeEnum.SET_LENUM;
    /**
    <p>For Set of number fields and AttributeSetType of <code>number</code> Attributes.</p> */
    SearchFieldType SET_NUMBER = SearchFieldTypeEnum.SET_NUMBER;
    /**
    <p>For Set of Money fields and AttributeSetType of <code>money</code> Attributes.</p> */
    SearchFieldType SET_MONEY = SearchFieldTypeEnum.SET_MONEY;
    /**
    <p>For Set of Date fields and AttributeSetType of <code>date</code> Attributes.</p> */
    SearchFieldType SET_DATE = SearchFieldTypeEnum.SET_DATE;
    /**
    <p>For Set of DateTime fields and AttributeSetType of <code>datetime</code> Attributes.</p> */
    SearchFieldType SET_DATETIME = SearchFieldTypeEnum.SET_DATETIME;
    /**
    <p>For Set of Time fields and AttributeSetType of <code>time</code> Attributes.</p> */
    SearchFieldType SET_TIME = SearchFieldTypeEnum.SET_TIME;
    /**
    <p>For Set of Reference fields and AttributeSetType of <code>reference</code> Attributes.</p> */
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
