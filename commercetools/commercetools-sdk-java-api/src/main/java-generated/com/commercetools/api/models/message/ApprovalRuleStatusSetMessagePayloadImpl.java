
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Generated after a successful Set Status update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleStatusSetMessagePayloadImpl implements ApprovalRuleStatusSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.approval_rule.ApprovalRuleStatus status;

    private com.commercetools.api.models.approval_rule.ApprovalRuleStatus oldStatus;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalRuleStatusSetMessagePayloadImpl(
            @JsonProperty("status") final com.commercetools.api.models.approval_rule.ApprovalRuleStatus status,
            @JsonProperty("oldStatus") final com.commercetools.api.models.approval_rule.ApprovalRuleStatus oldStatus) {
        this.status = status;
        this.oldStatus = oldStatus;
        this.type = APPROVAL_RULE_STATUS_SET;
    }

    /**
     * create empty instance
     */
    public ApprovalRuleStatusSetMessagePayloadImpl() {
        this.type = APPROVAL_RULE_STATUS_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Status of the ApprovalRule after the Set Status update action.</p>
     */

    public com.commercetools.api.models.approval_rule.ApprovalRuleStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Status of the ApprovalRule before the Set Status update action.</p>
     */

    public com.commercetools.api.models.approval_rule.ApprovalRuleStatus getOldStatus() {
        return this.oldStatus;
    }

    public void setStatus(final com.commercetools.api.models.approval_rule.ApprovalRuleStatus status) {
        this.status = status;
    }

    public void setOldStatus(final com.commercetools.api.models.approval_rule.ApprovalRuleStatus oldStatus) {
        this.oldStatus = oldStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalRuleStatusSetMessagePayloadImpl that = (ApprovalRuleStatusSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(status, that.status)
                .append(oldStatus, that.oldStatus)
                .append(type, that.type)
                .append(status, that.status)
                .append(oldStatus, that.oldStatus)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(status).append(oldStatus).toHashCode();
    }

}
