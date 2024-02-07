
package com.commercetools.api.models.approval_rule;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates whether the Approval Rule should be matched against Orders or not.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ApprovalRuleStatus extends JsonEnum {

    /**
    <p>The Approval Rule is in effect and will be used in evaluating approval requests for Orders.</p> */
    ApprovalRuleStatus ACTIVE = ApprovalRuleStatusEnum.ACTIVE;
    /**
    <p>The Approval Rule is not in effect and will not be used in evaluating approval requests for Orders.</p> */
    ApprovalRuleStatus INACTIVE = ApprovalRuleStatusEnum.INACTIVE;

    /**
     * possible values of ApprovalRuleStatus
     */
    enum ApprovalRuleStatusEnum implements ApprovalRuleStatus {
        /**
         * Active
         */
        ACTIVE("Active"),

        /**
         * Inactive
         */
        INACTIVE("Inactive");
        private final String jsonName;

        private ApprovalRuleStatusEnum(final String jsonName) {
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
     * factory method for a enum value of ApprovalRuleStatus
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ApprovalRuleStatus findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ApprovalRuleStatus() {
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
    public static Optional<ApprovalRuleStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ApprovalRuleStatus[] values() {
        return ApprovalRuleStatusEnum.values();
    }

}
