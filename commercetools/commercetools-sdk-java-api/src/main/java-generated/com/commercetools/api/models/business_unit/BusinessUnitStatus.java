package com.commercetools.api.models.business_unit;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Arrays;
import java.util.Optional;
import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates whether the Business Unit can be edited and used in Carts, Orders, Quote Requests, or Quotes.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public interface BusinessUnitStatus extends JsonEnum {

    /**
    	<p>The Business Unit can be used in Carts, Orders, Quote Requests, and Quotes and can be edited.</p>
    	
    */
    BusinessUnitStatus ACTIVE = BusinessUnitStatusEnum.ACTIVE;
    /**
    	<p>The Business Unit cannot be used in Carts, Orders, Quote Requests, and Quotes and can only be edited using the <a href="ctp:api:endpoint:/{projectKey}/me/business-units:POST">general endpoint</a>.</p>
    	
    */
    BusinessUnitStatus INACTIVE = BusinessUnitStatusEnum.INACTIVE;
    
    /**
     * possible values of BusinessUnitStatus
     */
    enum BusinessUnitStatusEnum implements BusinessUnitStatus {
        /**
         * Active
         */
        ACTIVE("Active"),
        
        /**
         * Inactive
         */
        INACTIVE("Inactive");
        private final String jsonName;

        private BusinessUnitStatusEnum(final String jsonName) {
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
     * factory method for a enum value of BusinessUnitStatus
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static BusinessUnitStatus findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new BusinessUnitStatus() {
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
    public static Optional<BusinessUnitStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }
    
    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static BusinessUnitStatus[] values() {
        return BusinessUnitStatusEnum.values();
    }
    
}
