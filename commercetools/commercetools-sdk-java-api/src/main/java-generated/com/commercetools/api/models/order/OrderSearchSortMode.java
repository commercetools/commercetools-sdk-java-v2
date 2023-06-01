package com.commercetools.api.models.order;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSearchSortMode
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface OrderSearchSortMode extends JsonEnum {

    
    OrderSearchSortMode MIN = OrderSearchSortModeEnum.MIN;
    
    OrderSearchSortMode MAX = OrderSearchSortModeEnum.MAX;
    
    OrderSearchSortMode AVG = OrderSearchSortModeEnum.AVG;
    
    OrderSearchSortMode SUM = OrderSearchSortModeEnum.SUM;
    
    /**
     * possible values of OrderSearchSortMode
     */
    enum OrderSearchSortModeEnum implements OrderSearchSortMode {
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

        private OrderSearchSortModeEnum(final String jsonName) {
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
     * factory method for a enum value of OrderSearchSortMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static OrderSearchSortMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new OrderSearchSortMode() {
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
    public static Optional<OrderSearchSortMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static OrderSearchSortMode[] values() {
        return OrderSearchSortModeEnum.values();
    }
    
}
