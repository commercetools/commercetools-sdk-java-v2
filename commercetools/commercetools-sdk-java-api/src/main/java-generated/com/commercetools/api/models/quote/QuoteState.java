
package com.commercetools.api.models.quote;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Predefined states tracking the status of the Quote.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface QuoteState extends JsonEnum {

    /**
    <p>A state indicating that the Seller submitted the Quote to the Buyer, but the Buyer has not replied yet.</p>
    <p>This is the default state.</p> */
    QuoteState PENDING = QuoteStateEnum.PENDING;
    /**
    <p>A state indicating that the Buyer has declined the Quote.</p> */
    QuoteState DECLINED = QuoteStateEnum.DECLINED;
    /**
    <p>A state indicating that the Buyer has declined and requested to renegotiate the Quote.</p> */
    QuoteState DECLINED_FOR_RENEGOTIATION = QuoteStateEnum.DECLINED_FOR_RENEGOTIATION;
    /**
    <p>A state indicating that the Seller has created a new Quote after a renegotiation has been requested.</p> */
    QuoteState RENEGOTIATION_ADDRESSED = QuoteStateEnum.RENEGOTIATION_ADDRESSED;
    /**
    <p>A state indicating that the Buyer has accepted the Quote.</p> */
    QuoteState ACCEPTED = QuoteStateEnum.ACCEPTED;
    /**
    <p>A state indicating that the Seller has withdrawn the Quote before the Buyer has accepted it.</p> */
    QuoteState WITHDRAWN = QuoteStateEnum.WITHDRAWN;

    /**
     * possible values of QuoteState
     */
    enum QuoteStateEnum implements QuoteState {
        /**
         * Pending
         */
        PENDING("Pending"),

        /**
         * Declined
         */
        DECLINED("Declined"),

        /**
         * DeclinedForRenegotiation
         */
        DECLINED_FOR_RENEGOTIATION("DeclinedForRenegotiation"),

        /**
         * RenegotiationAddressed
         */
        RENEGOTIATION_ADDRESSED("RenegotiationAddressed"),

        /**
         * Accepted
         */
        ACCEPTED("Accepted"),

        /**
         * Withdrawn
         */
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
     * factory method for a enum value of QuoteState
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<QuoteState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static QuoteState[] values() {
        return QuoteStateEnum.values();
    }

}
