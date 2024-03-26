
package com.commercetools.api.models.search;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>For set-type fields, only a single value of the set is taken into account for sorting. The sort mode determines whether the minimum or maximum value, or a calculated statistical value should be used as sorting value.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface SearchSortMode extends JsonEnum {

    /**
    <p>Use the minimum of all available values.</p> */
    SearchSortMode MIN = SearchSortModeEnum.MIN;
    /**
    <p>Use the maximum of all available values.</p> */
    SearchSortMode MAX = SearchSortModeEnum.MAX;
    /**
    <p>Use the average of all available values.</p> */
    SearchSortMode AVG = SearchSortModeEnum.AVG;
    /**
    <p>Use the sum of all available values.</p> */
    SearchSortMode SUM = SearchSortModeEnum.SUM;

    /**
     * possible values of SearchSortMode
     */
    enum SearchSortModeEnum implements SearchSortMode {
        /**
         * min
         */
        MIN("min"),

        /**
         * max
         */
        MAX("max"),

        /**
         * avg
         */
        AVG("avg"),

        /**
         * sum
         */
        SUM("sum");
        private final String jsonName;

        private SearchSortModeEnum(final String jsonName) {
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
     * factory method for a enum value of SearchSortMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static SearchSortMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new SearchSortMode() {
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
    public static Optional<SearchSortMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static SearchSortMode[] values() {
        return SearchSortModeEnum.values();
    }

}
