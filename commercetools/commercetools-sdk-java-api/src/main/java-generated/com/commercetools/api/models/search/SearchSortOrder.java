
package com.commercetools.api.models.search;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchSortOrder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface SearchSortOrder extends JsonEnum {

    /**
    <p>Ascending sort order, the lowest value is listed first.</p> */
    SearchSortOrder ASC = SearchSortOrderEnum.ASC;
    /**
    <p>Descending sort order, the highest value listed first.</p> */
    SearchSortOrder DESC = SearchSortOrderEnum.DESC;

    /**
     * possible values of SearchSortOrder
     */
    enum SearchSortOrderEnum implements SearchSortOrder {
        /**
         * asc
         */
        ASC("asc"),

        /**
         * desc
         */
        DESC("desc");
        private final String jsonName;

        private SearchSortOrderEnum(final String jsonName) {
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
     * factory method for a enum value of SearchSortOrder
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static SearchSortOrder findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new SearchSortOrder() {
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
    public static Optional<SearchSortOrder> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static SearchSortOrder[] values() {
        return SearchSortOrderEnum.values();
    }

}
