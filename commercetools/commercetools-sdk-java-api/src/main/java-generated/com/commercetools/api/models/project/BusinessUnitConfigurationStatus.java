
package com.commercetools.api.models.project;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Default value for Business Unit Status configured though Project settings.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface BusinessUnitConfigurationStatus {

    /**
    	<p>The <a href="ctp:api:type:BusinessUnit">Business Unit</a> can be used in <a href="ctp:api:type:Order">Orders</a>, <a href="ctp:api:type:Cart">Carts</a>, and <a href="/../api/quotes-overview">Quotes</a> and can be updated using the <a href="/../api/projects/me-business-units#update-businessunit">My Business Unit endpoint</a>.</p>

    */
    BusinessUnitConfigurationStatus ACTIVE = BusinessUnitConfigurationStatusEnum.ACTIVE;
    /**
    	<p>The <a href="ctp:api:type:BusinessUnit">Business Unit</a> cannot be used in <a href="ctp:api:type:Order">Orders</a>, <a href="ctp:api:type:Cart">Carts</a>, and <a href="/../api/quotes-overview">Quotes</a> and cannot be updated using the <a href="/../api/projects/me-business-units#update-businessunit">My Business Unit endpoint</a>.</p>

    */
    BusinessUnitConfigurationStatus INACTIVE = BusinessUnitConfigurationStatusEnum.INACTIVE;

    enum BusinessUnitConfigurationStatusEnum implements BusinessUnitConfigurationStatus {
        ACTIVE("Active"),

        INACTIVE("Inactive");
        private final String jsonName;

        private BusinessUnitConfigurationStatusEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    String toString();

    @JsonCreator
    public static BusinessUnitConfigurationStatus findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new BusinessUnitConfigurationStatus() {
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

    public static Optional<BusinessUnitConfigurationStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static BusinessUnitConfigurationStatus[] values() {
        return BusinessUnitConfigurationStatusEnum.values();
    }

}
