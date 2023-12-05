
package com.commercetools.api.models.approval_flow;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Indicates whether the Approval Flow is under review, approved, or rejected.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface ApprovalFlowStatus extends JsonEnum {

    /**
    	<p>Default status of Approval Flows, indicating that the Approval Flow has not been fully approved or rejected.</p>

    */
    ApprovalFlowStatus PENDING = ApprovalFlowStatusEnum.PENDING;
    /**
    	<p>Automatically set when all approvers from matching Approval Rules have approved. It indicates that the Approval Flow has been fully approved and is completed.</p>

    */
    ApprovalFlowStatus APPROVED = ApprovalFlowStatusEnum.APPROVED;
    /**
    	<p>Automatically set when a rejection occurs in the Approval Flow. A single rejection is sufficient to reject the entire Approval Flow.</p>

    */
    ApprovalFlowStatus REJECTED = ApprovalFlowStatusEnum.REJECTED;

    /**
     * possible values of ApprovalFlowStatus
     */
    enum ApprovalFlowStatusEnum implements ApprovalFlowStatus {
        /**
         * Pending
         */
        PENDING("Pending"),

        /**
         * Approved
         */
        APPROVED("Approved"),

        /**
         * Rejected
         */
        REJECTED("Rejected");
        private final String jsonName;

        private ApprovalFlowStatusEnum(final String jsonName) {
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
     * factory method for a enum value of ApprovalFlowStatus
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static ApprovalFlowStatus findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new ApprovalFlowStatus() {
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
    public static Optional<ApprovalFlowStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static ApprovalFlowStatus[] values() {
        return ApprovalFlowStatusEnum.values();
    }

}
