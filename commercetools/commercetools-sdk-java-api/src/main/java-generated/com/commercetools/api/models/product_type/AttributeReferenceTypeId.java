
package com.commercetools.api.models.product_type;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Name of the resource type that the value should reference. Supported resource type identifiers:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AttributeReferenceTypeId extends JsonEnum {

    /**
    	<p>References a <a href="ctp:api:type:Cart">Cart</a>.</p>

    */
    AttributeReferenceTypeId CART = AttributeReferenceTypeIdEnum.CART;
    /**
    	<p>References a <a href="ctp:api:type:Category">Category</a>.</p>

    */
    AttributeReferenceTypeId CATEGORY = AttributeReferenceTypeIdEnum.CATEGORY;
    /**
    	<p>References a <a href="ctp:api:type:Channel">Channel</a>.</p>

    */
    AttributeReferenceTypeId CHANNEL = AttributeReferenceTypeIdEnum.CHANNEL;
    /**
    	<p>References a <a href="ctp:api:type:Customer">Customer</a>.</p>

    */
    AttributeReferenceTypeId CUSTOMER = AttributeReferenceTypeIdEnum.CUSTOMER;
    /**
    	<p>References a <a href="ctp:api:type:CustomObject">CustomObject</a>.</p>

    */
    AttributeReferenceTypeId KEY_VALUE_DOCUMENT = AttributeReferenceTypeIdEnum.KEY_VALUE_DOCUMENT;
    /**
    	<p>References an <a href="ctp:api:type:Order">Order</a>.</p>

    */
    AttributeReferenceTypeId ORDER = AttributeReferenceTypeIdEnum.ORDER;
    /**
    	<p>References a <a href="ctp:api:type:Product">Product</a>.</p>

    */
    AttributeReferenceTypeId PRODUCT = AttributeReferenceTypeIdEnum.PRODUCT;
    /**
    	<p>References a <a href="ctp:api:type:ProductType">ProductType</a>.</p>

    */
    AttributeReferenceTypeId PRODUCT_TYPE = AttributeReferenceTypeIdEnum.PRODUCT_TYPE;
    /**
    	<p>References a <a href="ctp:api:type:Review">Review</a>.</p>

    */
    AttributeReferenceTypeId REVIEW = AttributeReferenceTypeIdEnum.REVIEW;
    /**
    	<p>References a <a href="ctp:api:type:ShippingMethod">ShippingMethod</a>.</p>

    */
    AttributeReferenceTypeId SHIPPING_METHOD = AttributeReferenceTypeIdEnum.SHIPPING_METHOD;
    /**
    	<p>References a <a href="ctp:api:type:State">State</a>.</p>

    */
    AttributeReferenceTypeId STATE = AttributeReferenceTypeIdEnum.STATE;
    /**
    	<p>References a <a href="ctp:api:type:Zone">Zone</a>.</p>

    */
    AttributeReferenceTypeId ZONE = AttributeReferenceTypeIdEnum.ZONE;

    /**
     * possible values of AttributeReferenceTypeId
     */
    enum AttributeReferenceTypeIdEnum implements AttributeReferenceTypeId {
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
         * shipping-method
         */
        SHIPPING_METHOD("shipping-method"),

        /**
         * state
         */
        STATE("state"),

        /**
         * zone
         */
        ZONE("zone");
        private final String jsonName;

        private AttributeReferenceTypeIdEnum(final String jsonName) {
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
     * factory method for a enum value of AttributeReferenceTypeId
     * if no enum has been found an anonymous instance will be created
     * @return enum instance
     */
    @JsonCreator
    public static AttributeReferenceTypeId findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new AttributeReferenceTypeId() {
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
    public static Optional<AttributeReferenceTypeId> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static AttributeReferenceTypeId[] values() {
        return AttributeReferenceTypeIdEnum.values();
    }

}
