
package com.commercetools.api.models.staged_quote;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Predefined states tracking the status of the Staged Quote.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface StagedQuoteState {

    /**
    	<p>Initial state after creating the StagedQuote indicating the <a href="/../api/quotes-overview#seller">Seller</a> is preparing the Quote.</p>

    */
    StagedQuoteState IN_PROGRESS = StagedQuoteStateEnum.IN_PROGRESS;
    /**
    	<p>A state indicating the StagedQuote has been sent to the <a href="/../api/quotes-overview#buyer">Buyer</a>.</p>

    */
    StagedQuoteState SENT = StagedQuoteStateEnum.SENT;
    /**
    	<p>A state indicating the StagedQuote flow was finished.</p>

    */
    StagedQuoteState CLOSED = StagedQuoteStateEnum.CLOSED;

    enum StagedQuoteStateEnum implements StagedQuoteState {
        IN_PROGRESS("InProgress"),

        SENT("Sent"),

        CLOSED("Closed");
        private final String jsonName;

        private StagedQuoteStateEnum(final String jsonName) {
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
    public static StagedQuoteState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new StagedQuoteState() {
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

    public static Optional<StagedQuoteState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static StagedQuoteState[] values() {
        return StagedQuoteStateEnum.values();
    }
}
