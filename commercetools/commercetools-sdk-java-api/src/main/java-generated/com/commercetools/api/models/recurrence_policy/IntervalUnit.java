
package com.commercetools.api.models.recurrence_policy;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Supported interval units for Recurrence Policies which are used in Recurring Orders.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface IntervalUnit extends JsonEnum {

    /**
    <p>Use to set a daily schedule.</p> */
    IntervalUnit DAYS = IntervalUnitEnum.DAYS;
    /**
    <p>Use to set a weekly schedule.</p> */
    IntervalUnit WEEKS = IntervalUnitEnum.WEEKS;
    /**
    <p>Use to set a monthly schedule.</p> */
    IntervalUnit MONTHS = IntervalUnitEnum.MONTHS;

    /**
     * possible values of IntervalUnit
     */
    enum IntervalUnitEnum implements IntervalUnit {
        /**
         * Days
         */
        DAYS("Days"),

        /**
         * Weeks
         */
        WEEKS("Weeks"),

        /**
         * Months
         */
        MONTHS("Months");
        private final String jsonName;

        private IntervalUnitEnum(final String jsonName) {
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
     * factory method for a enum value of IntervalUnit
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static IntervalUnit findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new IntervalUnit() {
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
    public static Optional<IntervalUnit> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static IntervalUnit[] values() {
        return IntervalUnitEnum.values();
    }

}
