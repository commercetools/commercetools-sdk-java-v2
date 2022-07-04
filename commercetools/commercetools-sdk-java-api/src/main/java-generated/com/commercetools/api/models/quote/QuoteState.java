
package com.commercetools.api.models.quote;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Predefined states tracking the status of the Quote.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface QuoteState {

    /**
    	<p>A state indicating the Quote has been submitted to the <a href="/../api/quotes-overview#buyer">Buyer</a>, but the <a href="/../api/quotes-overview#buyer">Buyer</a> has not replied yet.</p>

    */
    QuoteState PENDING = QuoteStateEnum.PENDING;
    /**
    	<p>A state indicating the Quote has been declined the <a href="/../api/quotes-overview#buyer">Buyer</a>.</p>

    */
    QuoteState DECLINED = QuoteStateEnum.DECLINED;
    /**
    	<p>A state indicating the <a href="/../api/quotes-overview#buyer">Buyer</a> has accepted the Quote.</p>

    */
    QuoteState ACCEPTED = QuoteStateEnum.ACCEPTED;
    /**
    	<p>A state indicating a circumstance other than declining by the <a href="/../api/quotes-overview#buyer">Buyer</a> that led the quote to fail.</p>

    */
    QuoteState FAILED = QuoteStateEnum.FAILED;
    /**
    	<p>A state indicating the <a href="/../api/quotes-overview#seller">Seller</a> has withdrawn the Quote before the <a href="/../api/quotes-overview#buyer">Buyer</a> has accepted it.</p>

    */
    QuoteState WITHDRAWN = QuoteStateEnum.WITHDRAWN;

    enum QuoteStateEnum implements QuoteState {
        PENDING("Pending"),

        DECLINED("Declined"),

        ACCEPTED("Accepted"),

        FAILED("Failed"),

        WITHDRAWN("Withdrawn");
        private final String jsonName;

        private QuoteStateEnum(final String jsonName) {
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
    public static QuoteState findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new QuoteState() {
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

    public static Optional<QuoteState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static QuoteState[] values() {
        return QuoteStateEnum.values();
    }
}
