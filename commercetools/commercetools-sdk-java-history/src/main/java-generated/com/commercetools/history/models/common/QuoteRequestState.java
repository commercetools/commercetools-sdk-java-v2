
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestState
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface QuoteRequestState {

    QuoteRequestState SUBMITTED = QuoteRequestStateEnum.SUBMITTED;

    QuoteRequestState ACCEPTED = QuoteRequestStateEnum.ACCEPTED;

    QuoteRequestState CLOSED = QuoteRequestStateEnum.CLOSED;

    QuoteRequestState REJECTED = QuoteRequestStateEnum.REJECTED;

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
