package com.commercetools.api.models.state;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Resource or object type the State can be assigned to.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface StateTypeEnum extends JsonEnum {

    /**
    	<p>Used by <a href="ctp:api:type:Order">Orders</a>.</p>
    	
    */
    StateTypeEnum ORDER_STATE = StateTypeEnumEnum.ORDER_STATE;
    /**
    	<p>Used by <a href="ctp:api:type:LineItem">LineItems</a> and <a href="ctp:api:type:CustomLineItem">CustomLineItems</a> in <a href="ctp:api:type:Cart">Carts</a> and <a href="ctp:api:type:Order">Orders</a>.</p>
    	
    */
    StateTypeEnum LINE_ITEM_STATE = StateTypeEnumEnum.LINE_ITEM_STATE;
    /**
    	<p>Used by <a href="ctp:api:type:Product">Products</a>.</p>
    	
    */
    StateTypeEnum PRODUCT_STATE = StateTypeEnumEnum.PRODUCT_STATE;
    /**
    	<p>Used by <a href="ctp:api:type:Review">Reviews</a>.</p>
    	
    */
    StateTypeEnum REVIEW_STATE = StateTypeEnumEnum.REVIEW_STATE;
    /**
    	<p>Used by <a href="ctp:api:type:PaymentStatus">PaymentStatus</a> in <a href="ctp:api:type:Payment">Payments</a>.</p>
    	
    */
    StateTypeEnum PAYMENT_STATE = StateTypeEnumEnum.PAYMENT_STATE;
    /**
    	<p>Used by <a href="ctp:api:type:QuoteRequest">QuoteRequest</a>.</p>
    	
    */
    StateTypeEnum QUOTE_REQUEST_STATE = StateTypeEnumEnum.QUOTE_REQUEST_STATE;
    /**
    	<p>Used by <a href="ctp:api:type:StagedQuote">StagedQuote</a>.</p>
    	
    */
    StateTypeEnum STAGED_QUOTE_STATE = StateTypeEnumEnum.STAGED_QUOTE_STATE;
    /**
    	<p>Used by <a href="ctp:api:type:Quote">Quote</a>.</p>
    	
    */
    StateTypeEnum QUOTE_STATE = StateTypeEnumEnum.QUOTE_STATE;
    
    /**
     * possible values of StateTypeEnum
     */
    enum StateTypeEnumEnum implements StateTypeEnum {
        /**
         * OrderState
         */
        ORDER_STATE("OrderState"),
        
        /**
         * LineItemState
         */
        LINE_ITEM_STATE("LineItemState"),
        
        /**
         * ProductState
         */
        PRODUCT_STATE("ProductState"),
        
        /**
         * ReviewState
         */
        REVIEW_STATE("ReviewState"),
        
        /**
         * PaymentState
         */
        PAYMENT_STATE("PaymentState"),
        
        /**
         * QuoteRequestState
         */
        QUOTE_REQUEST_STATE("QuoteRequestState"),
        
        /**
         * StagedQuoteState
         */
        STAGED_QUOTE_STATE("StagedQuoteState"),
        
        /**
         * QuoteState
         */
        QUOTE_STATE("QuoteState");
        private final String jsonName;

        private StateTypeEnumEnum(final String jsonName) {
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
     * factory method for a enum value of StateTypeEnum
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static StateTypeEnum findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new StateTypeEnum() {
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
    public static Optional<StateTypeEnum> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static StateTypeEnum[] values() {
        return StateTypeEnumEnum.values();
    }
    
}
