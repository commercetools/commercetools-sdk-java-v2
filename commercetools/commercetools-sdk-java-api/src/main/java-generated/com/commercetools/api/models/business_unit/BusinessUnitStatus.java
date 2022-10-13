
package com.commercetools.api.models.business_unit;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates whether the Business Unit can be edited and used in Orders, Carts, or Quotes.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface BusinessUnitStatus {

    /**
    	<p>The Business Unit can be used in Orders, Carts, and Quotes and can be edited.</p>

    */
    BusinessUnitStatus ACTIVE = BusinessUnitStatusEnum.ACTIVE;
    /**
    	<p>The Business Unit can be edited by an Admin, but not by a Buyer. The Business Unit cannot be used in Orders, Carts, and Quotes.</p>

    */
    BusinessUnitStatus INACTIVE = BusinessUnitStatusEnum.INACTIVE;

    enum BusinessUnitStatusEnum implements BusinessUnitStatus {
        ACTIVE("Active"),

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

    @JsonValue
    String getJsonName();

    String name();

    String toString();

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

    public static Optional<BusinessUnitStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static BusinessUnitStatus[] values() {
        return BusinessUnitStatusEnum.values();
    }
}
