package com.commercetools.api.models.project;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Specifies the status of the Order Search index.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface OrderSearchStatus extends JsonEnum {

    /**
    	<p>indicates that the <a href="/../api/projects/order-search#search-orders">Search Orders</a> endpoint is fully operational.</p>
    	
    */
    OrderSearchStatus ACTIVATED = OrderSearchStatusEnum.ACTIVATED;
    /**
    	<p>indicates that the Order Search feature is currently not active, but can be activated by <a href="#change-order-search-status">update action</a>.</p>
    	
    */
    OrderSearchStatus DEACTIVATED = OrderSearchStatusEnum.DEACTIVATED;
    
    /**
     * possible values of OrderSearchStatus
     */
    enum OrderSearchStatusEnum implements OrderSearchStatus {
        /**
         * Activated
         */
        ACTIVATED("Activated"),
        
        /**
         * Deactivated
         */
        DEACTIVATED("Deactivated");
        private final String jsonName;

        private OrderSearchStatusEnum(final String jsonName) {
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
     * factory method for a enum value of OrderSearchStatus
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static OrderSearchStatus findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new OrderSearchStatus() {
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
    public static Optional<OrderSearchStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static OrderSearchStatus[] values() {
        return OrderSearchStatusEnum.values();
    }
    
}
