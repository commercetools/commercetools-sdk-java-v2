
package com.commercetools.history.models.common;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedQuoteState
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface StagedQuoteState extends JsonEnum {

    StagedQuoteState IN_PROGRESS = StagedQuoteStateEnum.IN_PROGRESS;

    StagedQuoteState SENT = StagedQuoteStateEnum.SENT;

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
