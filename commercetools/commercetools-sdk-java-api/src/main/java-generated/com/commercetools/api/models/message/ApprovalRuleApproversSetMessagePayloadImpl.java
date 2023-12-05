
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Generated after a successful Set Approvers update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleApproversSetMessagePayloadImpl implements ApprovalRuleApproversSetMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.approval_rule.ApproverHierarchy approvers;

    private com.commercetools.api.models.approval_rule.ApproverHierarchy oldApprovers;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalRuleApproversSetMessagePayloadImpl(
            @JsonProperty("approvers") final com.commercetools.api.models.approval_rule.ApproverHierarchy approvers,
            @JsonProperty("oldApprovers") final com.commercetools.api.models.approval_rule.ApproverHierarchy oldApprovers) {
        this.approvers = approvers;
        this.oldApprovers = oldApprovers;
        this.type = APPROVAL_RULE_APPROVERS_SET;
    }

    /**
     * create empty instance
     */
    public ApprovalRuleApproversSetMessagePayloadImpl() {
        this.type = APPROVAL_RULE_APPROVERS_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Approver hierarchy of the ApprovalRule after the Set Approvers update action.</p>
     */

    public com.commercetools.api.models.approval_rule.ApproverHierarchy getApprovers() {
        return this.approvers;
    }

    /**
     *  <p>Approver hierarchy of the ApprovalRule before the Set Approvers update action.</p>
     */

    public com.commercetools.api.models.approval_rule.ApproverHierarchy getOldApprovers() {
        return this.oldApprovers;
    }

    public void setApprovers(final com.commercetools.api.models.approval_rule.ApproverHierarchy approvers) {
        this.approvers = approvers;
    }

    public void setOldApprovers(final com.commercetools.api.models.approval_rule.ApproverHierarchy oldApprovers) {
        this.oldApprovers = oldApprovers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalRuleApproversSetMessagePayloadImpl that = (ApprovalRuleApproversSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(approvers, that.approvers)
                .append(oldApprovers, that.oldApprovers)
                .append(type, that.type)
                .append(approvers, that.approvers)
                .append(oldApprovers, that.oldApprovers)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(approvers).append(oldApprovers).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("approvers", approvers)
                .append("oldApprovers", oldApprovers)
                .build();
    }

}
