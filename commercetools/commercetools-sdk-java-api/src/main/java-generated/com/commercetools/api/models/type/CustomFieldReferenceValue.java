
package com.commercetools.api.models.type;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Defines which resource type a CustomFieldReferenceType can reference.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CustomFieldReferenceValue extends JsonEnum {

    /**
    	<p><a href="ctp:api:type:AssociateRole">AssociateRole</a></p>

    */
    CustomFieldReferenceValue ASSOCIATE_ROLE = CustomFieldReferenceValueEnum.ASSOCIATE_ROLE;
    /**
    	<p><a href="ctp:api:type:BusinessUnit">BusinessUnit</a></p>

    */
    CustomFieldReferenceValue BUSINESS_UNIT = CustomFieldReferenceValueEnum.BUSINESS_UNIT;
    /**
    	<p><a href="ctp:api:type:Cart">Cart</a></p>

    */
    CustomFieldReferenceValue CART = CustomFieldReferenceValueEnum.CART;
    /**
    	<p><a href="ctp:api:type:Category">Category</a></p>

    */
    CustomFieldReferenceValue CATEGORY = CustomFieldReferenceValueEnum.CATEGORY;
    /**
    	<p><a href="ctp:api:type:Channel">Channel</a></p>

    */
    CustomFieldReferenceValue CHANNEL = CustomFieldReferenceValueEnum.CHANNEL;
    /**
    	<p><a href="ctp:api:type:Customer">Customer</a></p>

    */
    CustomFieldReferenceValue CUSTOMER = CustomFieldReferenceValueEnum.CUSTOMER;
    /**
    	<p><a href="ctp:api:type:CustomObject">CustomObject</a></p>

    */
    CustomFieldReferenceValue KEY_VALUE_DOCUMENT = CustomFieldReferenceValueEnum.KEY_VALUE_DOCUMENT;
    /**
    	<p><a href="ctp:api:type:Order">Order</a></p>

    */
    CustomFieldReferenceValue ORDER = CustomFieldReferenceValueEnum.ORDER;
    /**
    	<p><a href="ctp:api:type:Product">Product</a></p>

    */
    CustomFieldReferenceValue PRODUCT = CustomFieldReferenceValueEnum.PRODUCT;
    /**
    	<p><a href="ctp:api:type:ProductType">ProductType</a></p>

    */
    CustomFieldReferenceValue PRODUCT_TYPE = CustomFieldReferenceValueEnum.PRODUCT_TYPE;
    /**
    	<p><a href="ctp:api:type:Review">Review</a></p>

    */
    CustomFieldReferenceValue REVIEW = CustomFieldReferenceValueEnum.REVIEW;
    /**
    	<p><a href="ctp:api:type:State">State</a></p>

    */
    CustomFieldReferenceValue STATE = CustomFieldReferenceValueEnum.STATE;
    /**
    	<p><a href="ctp:api:type:ShippingMethod">ShippingMethod</a></p>

    */
    CustomFieldReferenceValue SHIPPING_METHOD = CustomFieldReferenceValueEnum.SHIPPING_METHOD;
    /**
    	<p><a href="ctp:api:type:Zone">Zone</a></p>

    */
    CustomFieldReferenceValue ZONE = CustomFieldReferenceValueEnum.ZONE;

    /**
     * possible values of CustomFieldReferenceValue
     */
    enum CustomFieldReferenceValueEnum implements CustomFieldReferenceValue {
        /**
         * associate-role
         */
        ASSOCIATE_ROLE("associate-role"),

        /**
         * business-unit
         */
        BUSINESS_UNIT("business-unit"),

        /**
         * cart
         */
        CART("cart"),

        /**
         * category
         */
        CATEGORY("category"),

        /**
         * channel
         */
        CHANNEL("channel"),

        /**
         * customer
         */
        CUSTOMER("customer"),

        /**
         * key-value-document
         */
        KEY_VALUE_DOCUMENT("key-value-document"),

        /**
         * order
         */
        ORDER("order"),

        /**
         * product
         */
        PRODUCT("product"),

        /**
         * product-type
         */
        PRODUCT_TYPE("product-type"),

        /**
         * review
         */
        REVIEW("review"),

        /**
         * state
         */
        STATE("state"),

        /**
         * shipping-method
         */
        SHIPPING_METHOD("shipping-method"),

        /**
         * zone
         */
        ZONE("zone");
        private final String jsonName;

        private CustomFieldReferenceValueEnum(final String jsonName) {
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
     * factory method for a enum value of CustomFieldReferenceValue
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static CustomFieldReferenceValue findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new CustomFieldReferenceValue() {
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
    public static Optional<CustomFieldReferenceValue> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static CustomFieldReferenceValue[] values() {
        return CustomFieldReferenceValueEnum.values();
    }

}
