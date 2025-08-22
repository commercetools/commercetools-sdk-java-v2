
package com.commercetools.importapi.models.business_units;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Determines whether a Business Unit can inherit Approval Rules from a parent. Only Business Units of type <code>Division</code> can use <code>ExplicitAndFromParent</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface BusinessUnitApprovalRuleMode extends JsonEnum {

    /**
    <p>Approval Rules of a Business Unit must be explicitly assigned. The Business Unit cannot inherit Approval Rules from a parent.</p> */
    BusinessUnitApprovalRuleMode EXPLICIT = BusinessUnitApprovalRuleModeEnum.EXPLICIT;
    /**
    <p>Approval Rules of a Business Unit are inherited from a parent and can also be explicitly assigned.</p> */
    BusinessUnitApprovalRuleMode EXPLICIT_AND_FROM_PARENT = BusinessUnitApprovalRuleModeEnum.EXPLICIT_AND_FROM_PARENT;

    /**
     * possible values of BusinessUnitApprovalRuleMode
     */
    enum BusinessUnitApprovalRuleModeEnum implements BusinessUnitApprovalRuleMode {
        /**
         * Explicit
         */
        EXPLICIT("Explicit"),

        /**
         * ExplicitAndFromParent
         */
        EXPLICIT_AND_FROM_PARENT("ExplicitAndFromParent");
        private final String jsonName;

        private BusinessUnitApprovalRuleModeEnum(final String jsonName) {
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
     * factory method for a enum value of BusinessUnitApprovalRuleMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static BusinessUnitApprovalRuleMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new BusinessUnitApprovalRuleMode() {
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
    public static Optional<BusinessUnitApprovalRuleMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static BusinessUnitApprovalRuleMode[] values() {
        return BusinessUnitApprovalRuleModeEnum.values();
    }

}
