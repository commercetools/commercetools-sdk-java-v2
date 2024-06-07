
package com.commercetools.api.models.search;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchMatchType
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface SearchMatchType extends JsonEnum {

    /**
    <p>Returns resources for which at least one of the provided search terms match.</p> */
    SearchMatchType ANY = SearchMatchTypeEnum.ANY;
    /**
    <p>Returns only those resources for which all the provided search terms match.</p> */
    SearchMatchType ALL = SearchMatchTypeEnum.ALL;

    /**
     * possible values of SearchMatchType
     */
    enum SearchMatchTypeEnum implements SearchMatchType {
        /**
         * any
         */
        ANY("any"),

        /**
         * all
         */
        ALL("all");
        private final String jsonName;

        private SearchMatchTypeEnum(final String jsonName) {
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
     * factory method for a enum value of SearchMatchType
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static SearchMatchType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new SearchMatchType() {
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
    public static Optional<SearchMatchType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static SearchMatchType[] values() {
        return SearchMatchTypeEnum.values();
    }

}
