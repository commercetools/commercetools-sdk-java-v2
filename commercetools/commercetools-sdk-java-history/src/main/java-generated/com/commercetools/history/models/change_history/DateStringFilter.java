
package com.commercetools.history.models.change_history;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This type consists of one enum value:</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface DateStringFilter extends JsonEnum {

    DateStringFilter NOW = DateStringFilterEnum.NOW;

    /**
     * possible values of DateStringFilter
     */
    enum DateStringFilterEnum implements DateStringFilter {
        /**
         * now
         */
        NOW("now");
        private final String jsonName;

        private DateStringFilterEnum(final String jsonName) {
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
     * factory method for a enum value of DateStringFilter
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static DateStringFilter findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new DateStringFilter() {
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
     * @param value the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<DateStringFilter> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static DateStringFilter[] values() {
        return DateStringFilterEnum.values();
    }

}
