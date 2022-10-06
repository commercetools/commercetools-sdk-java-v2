
package com.commercetools.api.models.business_unit;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The type of the Business Unit indicating its position in a hierarchy.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface BusinessUnitType {

    /**
    	<p>Top-level Business Unit. Must not have a <code>parentUnit</code> defined.</p>

    */
    BusinessUnitType COMPANY = BusinessUnitTypeEnum.COMPANY;
    /**
    	<p>Business Unit with a <code>parentUnit</code> reference to a <a href="ctp:api:type:Division">Company</a> or another Division.</p>

    */
    BusinessUnitType DIVISION = BusinessUnitTypeEnum.DIVISION;

    enum BusinessUnitTypeEnum implements BusinessUnitType {
        COMPANY("Company"),

        DIVISION("Division");
        private final String jsonName;

        private BusinessUnitTypeEnum(final String jsonName) {
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
    public static BusinessUnitType findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new BusinessUnitType() {
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

    public static Optional<BusinessUnitType> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static BusinessUnitType[] values() {
        return BusinessUnitTypeEnum.values();
    }
}
