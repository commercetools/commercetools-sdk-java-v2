
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
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a>. Only available for <span>B2B</span>-enabled Projects.</p> */
    AttributeReferenceTypeId ASSOCIATE_ROLE = AttributeReferenceTypeIdEnum.ASSOCIATE_ROLE;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>. Only available for <span>B2B</span>-enabled Projects.</p> */
    AttributeReferenceTypeId BUSINESS_UNIT = AttributeReferenceTypeIdEnum.BUSINESS_UNIT;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p> */
    AttributeReferenceTypeId CART = AttributeReferenceTypeIdEnum.CART;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a>.</p> */
    AttributeReferenceTypeId CART_DISCOUNT = AttributeReferenceTypeIdEnum.CART_DISCOUNT;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a>.</p> */
    AttributeReferenceTypeId CATEGORY = AttributeReferenceTypeIdEnum.CATEGORY;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a>.</p> */
    AttributeReferenceTypeId CHANNEL = AttributeReferenceTypeIdEnum.CHANNEL;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a>.</p> */
    AttributeReferenceTypeId CUSTOMER = AttributeReferenceTypeIdEnum.CUSTOMER;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a>.</p> */
    AttributeReferenceTypeId CUSTOMER_GROUP = AttributeReferenceTypeIdEnum.CUSTOMER_GROUP;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomObject" rel="nofollow">CustomObject</a>.</p> */
    AttributeReferenceTypeId KEY_VALUE_DOCUMENT = AttributeReferenceTypeIdEnum.KEY_VALUE_DOCUMENT;
    /**
    <p>References an <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p> */
    AttributeReferenceTypeId ORDER = AttributeReferenceTypeIdEnum.ORDER;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a>.</p> */
    AttributeReferenceTypeId PRODUCT = AttributeReferenceTypeIdEnum.PRODUCT;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a>.</p> */
    AttributeReferenceTypeId PRODUCT_TYPE = AttributeReferenceTypeIdEnum.PRODUCT_TYPE;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a>.</p> */
    AttributeReferenceTypeId REVIEW = AttributeReferenceTypeIdEnum.REVIEW;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a>.</p> */
    AttributeReferenceTypeId SHIPPING_METHOD = AttributeReferenceTypeIdEnum.SHIPPING_METHOD;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a>.</p> */
    AttributeReferenceTypeId STATE = AttributeReferenceTypeIdEnum.STATE;
    /**
    <p>References a <a href="https://docs.commercetools.com/apis/ctp:api:type:Zone" rel="nofollow">Zone</a>.</p> */
    AttributeReferenceTypeId ZONE = AttributeReferenceTypeIdEnum.ZONE;

    /**
     * possible values of AttributeReferenceTypeId
     */
    enum AttributeReferenceTypeIdEnum implements AttributeReferenceTypeId {
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
         * cart-discount
         */
        CART_DISCOUNT("cart-discount"),

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
         * customer-group
         */
        CUSTOMER_GROUP("customer-group"),

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
     * @param value the enum value to be wrapped
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
     * @param jsonName the json value to be wrapped
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
