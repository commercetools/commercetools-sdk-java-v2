
package com.commercetools.importapi.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The type of the referenced resource.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ReferenceType extends JsonEnum {

    /**
    	<p>References a cart.</p>

    */
    ReferenceType CART = ReferenceTypeEnum.CART;
    /**
    	<p>References a cart discount.</p>

    */
    ReferenceType CART_DISCOUNT = ReferenceTypeEnum.CART_DISCOUNT;
    /**
    	<p>References a category.</p>

    */
    ReferenceType CATEGORY = ReferenceTypeEnum.CATEGORY;
    /**
    	<p>References a channel.</p>

    */
    ReferenceType CHANNEL = ReferenceTypeEnum.CHANNEL;
    /**
    	<p>References a customer.</p>

    */
    ReferenceType CUSTOMER = ReferenceTypeEnum.CUSTOMER;
    /**
    	<p>References a customer group.</p>

    */
    ReferenceType CUSTOMER_GROUP = ReferenceTypeEnum.CUSTOMER_GROUP;
    /**
    	<p>References a discount code.</p>

    */
    ReferenceType DISCOUNT_CODE = ReferenceTypeEnum.DISCOUNT_CODE;
    /**
    	<p>References an order.</p>

    */
    ReferenceType ORDER = ReferenceTypeEnum.ORDER;
    /**
    	<p>References a payment</p>

    */
    ReferenceType PAYMENT = ReferenceTypeEnum.PAYMENT;
    /**
    	<p>References a price.</p>

    */
    ReferenceType PRICE = ReferenceTypeEnum.PRICE;
    /**
    	<p>References a product.</p>

    */
    ReferenceType PRODUCT = ReferenceTypeEnum.PRODUCT;
    /**
    	<p>References a product discount.</p>

    */
    ReferenceType PRODUCT_DISCOUNT = ReferenceTypeEnum.PRODUCT_DISCOUNT;
    /**
    	<p>References a product type.</p>

    */
    ReferenceType PRODUCT_TYPE = ReferenceTypeEnum.PRODUCT_TYPE;
    /**
    	<p>References a product variant.</p>

    */
    ReferenceType PRODUCT_VARIANT = ReferenceTypeEnum.PRODUCT_VARIANT;
    /**
    	<p>References a shipping method.</p>

    */
    ReferenceType SHIPPING_METHOD = ReferenceTypeEnum.SHIPPING_METHOD;
    /**
    	<p>References a state.</p>

    */
    ReferenceType STATE = ReferenceTypeEnum.STATE;
    /**
    	<p>References a store.</p>

    */
    ReferenceType STORE = ReferenceTypeEnum.STORE;
    /**
    	<p>References a tax-category.</p>

    */
    ReferenceType TAX_CATEGORY = ReferenceTypeEnum.TAX_CATEGORY;
    /**
    	<p>References a type.</p>

    */
    ReferenceType TYPE = ReferenceTypeEnum.TYPE;
    /**
    	<p>References a custom object</p>

    */
    ReferenceType KEY_VALUE_DOCUMENT = ReferenceTypeEnum.KEY_VALUE_DOCUMENT;

    /**
     * possible values of ReferenceType
     */
    enum ReferenceTypeEnum implements ReferenceType {
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
         * discount-code
         */
        DISCOUNT_CODE("discount-code"),

        /**
         * order
         */
        ORDER("order"),

        /**
         * payment
         */
        PAYMENT("payment"),

        /**
         * price
         */
        PRICE("price"),

        /**
         * product
         */
        PRODUCT("product"),

        /**
         * product-discount
         */
        PRODUCT_DISCOUNT("product-discount"),

        /**
         * product-type
         */
        PRODUCT_TYPE("product-type"),

        /**
         * product-variant
         */
        PRODUCT_VARIANT("product-variant"),

        /**
         * shipping-method
         */
        SHIPPING_METHOD("shipping-method"),

        /**
         * state
         */
        STATE("state"),

        /**
         * store
         */
        STORE("store"),

        /**
         * tax-category
         */
        TAX_CATEGORY("tax-category"),

        /**
         * type
         */
        TYPE("type"),

        /**
         * key-value-document
         */
        KEY_VALUE_DOCUMENT("key-value-document");
        private final String jsonName;

        private ReferenceTypeEnum(final String jsonName) {
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
     * factory method for a enum value of ReferenceType
     * if no enum has been found an anonymous instance will be created
     * @return enum instance
     */
    @JsonCreator
    public static ReferenceType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ReferenceType() {
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
    public static Optional<ReferenceType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ReferenceType[] values() {
        return ReferenceTypeEnum.values();
    }

}
