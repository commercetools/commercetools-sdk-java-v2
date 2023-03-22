
package com.commercetools.api.models.me;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>QuoteStates that can be set using the Change My Quote State update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface MyQuoteState {

    /**
    	<p>A state indicating that the <a href="/../api/quotes-overview#buyer">Buyer</a> has declined the <a href="ctp:api:type:Quote">Quote</a>.</p>

    */
    MyQuoteState DECLINED = MyQuoteStateEnum.DECLINED;
    /**
    	<p>A state indicating that the <a href="/../api/quotes-overview#buyer">Buyer</a> has accepted the <a href="ctp:api:type:Quote">Quote</a>.</p>

    */
    MyQuoteState ACCEPTED = MyQuoteStateEnum.ACCEPTED;

    enum MyQuoteStateEnum implements MyQuoteState {
        DECLINED("Declined"),

        ACCEPTED("Accepted");
        private final String jsonName;

        private MyQuoteStateEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    String toString();

    @JsonCreator
    public static MyQuoteState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new MyQuoteState() {
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

    public static Optional<MyQuoteState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static MyQuoteState[] values() {
        return MyQuoteStateEnum.values();
    }

}
