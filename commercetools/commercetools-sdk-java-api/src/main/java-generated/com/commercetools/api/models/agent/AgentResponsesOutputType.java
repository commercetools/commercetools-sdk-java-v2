
package com.commercetools.api.models.agent;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Entity that the Intake Agent creates from a <span>/responses</span> request. Never inferred from the input.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AgentResponsesOutputType extends JsonEnum {

    /**
    <p>Create a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a>.</p> */
    AgentResponsesOutputType CART = AgentResponsesOutputTypeEnum.CART;
    /**
    <p>Create a <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">QuoteRequest</a>. Requires a verified <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a>, identified by email.</p> */
    AgentResponsesOutputType QUOTE_REQUEST = AgentResponsesOutputTypeEnum.QUOTE_REQUEST;

    /**
     * possible values of AgentResponsesOutputType
     */
    enum AgentResponsesOutputTypeEnum implements AgentResponsesOutputType {
        /**
         * Cart
         */
        CART("Cart"),

        /**
         * QuoteRequest
         */
        QUOTE_REQUEST("QuoteRequest");
        private final String jsonName;

        private AgentResponsesOutputTypeEnum(final String jsonName) {
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
     * factory method for a enum value of AgentResponsesOutputType
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static AgentResponsesOutputType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new AgentResponsesOutputType() {
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
    public static Optional<AgentResponsesOutputType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static AgentResponsesOutputType[] values() {
        return AgentResponsesOutputTypeEnum.values();
    }

}
