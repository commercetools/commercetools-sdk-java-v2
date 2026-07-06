
package com.commercetools.api.models.type;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Defines which resource type a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldReferenceType" rel="nofollow">CustomFieldReferenceType</a> can reference.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CustomFieldReferenceValue extends JsonEnum {

    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalFlow" rel="nofollow">ApprovalFlow</a> - Only available for <span>B2B</span>-enabled Projects.</p> */
    CustomFieldReferenceValue APPROVAL_FLOW = CustomFieldReferenceValueEnum.APPROVAL_FLOW;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">ApprovalRule</a> - Only available for <span>B2B</span>-enabled Projects.</p> */
    CustomFieldReferenceValue APPROVAL_RULE = CustomFieldReferenceValueEnum.APPROVAL_RULE;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">AssociateRole</a> - Only available for <span>B2B</span>-enabled Projects.</p> */
    CustomFieldReferenceValue ASSOCIATE_ROLE = CustomFieldReferenceValueEnum.ASSOCIATE_ROLE;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> - Only available for <span>B2B</span>-enabled Projects.</p> */
    CustomFieldReferenceValue BUSINESS_UNIT = CustomFieldReferenceValueEnum.BUSINESS_UNIT;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a></p> */
    CustomFieldReferenceValue CART = CustomFieldReferenceValueEnum.CART;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a></p> */
    CustomFieldReferenceValue CART_DISCOUNT = CustomFieldReferenceValueEnum.CART_DISCOUNT;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a></p> */
    CustomFieldReferenceValue CATEGORY = CustomFieldReferenceValueEnum.CATEGORY;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Channel</a></p> */
    CustomFieldReferenceValue CHANNEL = CustomFieldReferenceValueEnum.CHANNEL;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a></p> */
    CustomFieldReferenceValue CUSTOMER = CustomFieldReferenceValueEnum.CUSTOMER;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a></p> */
    CustomFieldReferenceValue CUSTOMER_GROUP = CustomFieldReferenceValueEnum.CUSTOMER_GROUP;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomObject" rel="nofollow">CustomObject</a></p> */
    CustomFieldReferenceValue KEY_VALUE_DOCUMENT = CustomFieldReferenceValueEnum.KEY_VALUE_DOCUMENT;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a></p> */
    CustomFieldReferenceValue ORDER = CustomFieldReferenceValueEnum.ORDER;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a></p> */
    CustomFieldReferenceValue PRODUCT = CustomFieldReferenceValueEnum.PRODUCT;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductType" rel="nofollow">ProductType</a></p> */
    CustomFieldReferenceValue PRODUCT_TYPE = CustomFieldReferenceValueEnum.PRODUCT_TYPE;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Review" rel="nofollow">Review</a></p> */
    CustomFieldReferenceValue REVIEW = CustomFieldReferenceValueEnum.REVIEW;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:State" rel="nofollow">State</a></p> */
    CustomFieldReferenceValue STATE = CustomFieldReferenceValueEnum.STATE;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a></p> */
    CustomFieldReferenceValue SHIPPING_METHOD = CustomFieldReferenceValueEnum.SHIPPING_METHOD;
    /**
    <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Zone" rel="nofollow">Zone</a></p> */
    CustomFieldReferenceValue ZONE = CustomFieldReferenceValueEnum.ZONE;

    /**
     * possible values of CustomFieldReferenceValue
     */
    enum CustomFieldReferenceValueEnum implements CustomFieldReferenceValue {
        /**
         * approval-flow
         */
        APPROVAL_FLOW("approval-flow"),

        /**
         * approval-rule
         */
        APPROVAL_RULE("approval-rule"),

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
