package com.commercetools.api.models.staged_quote;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Predefined states tracking the status of the Staged Quote.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface StagedQuoteState extends JsonEnum {

    /**
    	<p>Initial state after creating the StagedQuote indicating that the <a href="/../api/quotes-overview#seller">Seller</a> is preparing the Quote.</p>
    	
    */
    StagedQuoteState IN_PROGRESS = StagedQuoteStateEnum.IN_PROGRESS;
    /**
    	<p>A state indicating that the StagedQuote has been sent to the <a href="/../api/quotes-overview#buyer">Buyer</a>.</p>
    	
    */
    StagedQuoteState SENT = StagedQuoteStateEnum.SENT;
    /**
    	<p>A state indicating that the StagedQuote flow was finished.</p>
    	
    */
    StagedQuoteState CLOSED = StagedQuoteStateEnum.CLOSED;
    
    /**
     * possible values of StagedQuoteState
     */
    enum StagedQuoteStateEnum implements StagedQuoteState {
        /**
         * InProgress
         */
        IN_PROGRESS("InProgress"),
        
        /**
         * Sent
         */
        SENT("Sent"),
        
        /**
         * Closed
         */
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
     * factory method for a enum value of StagedQuoteState
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<StagedQuoteState> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static StagedQuoteState[] values() {
        return StagedQuoteStateEnum.values();
    }
    
}
