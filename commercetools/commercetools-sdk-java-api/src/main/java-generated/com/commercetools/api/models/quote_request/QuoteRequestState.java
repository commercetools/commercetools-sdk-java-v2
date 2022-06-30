
package com.commercetools.api.models.quote_request;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Predefined states tracking the status of the Quote Request in the negotiation process.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface QuoteRequestState {

    /**
    	<p>Initial state of the negotiation process. Indicates that the Quote Request has been submitted by the Buyer, but the Seller has not yet decided whether to accept or to reject the request.</p>

    */
    QuoteRequestState SUBMITTED = QuoteRequestStateEnum.SUBMITTED;
    /**
    	<p>Indicates that the Quote Request has been accepted by the Seller and the negotiation process continues with preparing a Staged Quote for the Buyer.</p>

    */
    QuoteRequestState ACCEPTED = QuoteRequestStateEnum.ACCEPTED;
    /**
    	<p>Final state of the negotiation process. Indicates that the Quote Request had been accepted by the Seller and there is no further action that can be performed by any party.</p>

    */
    QuoteRequestState CLOSED = QuoteRequestStateEnum.CLOSED;
    /**
    	<p>Indicates that the Quote Request has been rejected by the Seller and the negotiation process terminated.</p>

    */
    QuoteRequestState REJECTED = QuoteRequestStateEnum.REJECTED;
    /**
    	<p>Indicates that the Buyer has withdrawn the Quote Request.</p>

    */
    QuoteRequestState CANCELLED = QuoteRequestStateEnum.CANCELLED;

    enum QuoteRequestStateEnum implements QuoteRequestState {
        SUBMITTED("Submitted"),

        ACCEPTED("Accepted"),

        CLOSED("Closed"),

        REJECTED("Rejected"),

        CANCELLED("Cancelled");
        private final String jsonName;

        private QuoteRequestStateEnum(final String jsonName) {
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
    public static QuoteRequestState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new QuoteRequestState() {
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

    public static Optional<QuoteRequestState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static QuoteRequestState[] values() {
        return QuoteRequestStateEnum.values();
    }
}
