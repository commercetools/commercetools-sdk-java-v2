
package com.commercetools.api.models.approval_rule;

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
 *  <p>Setting the approvers for an Approval Rule generates an ApprovalRuleApproversSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleSetApproversActionImpl implements ApprovalRuleSetApproversAction, ModelBase {

    private String action;

    private com.commercetools.api.models.approval_rule.ApproverHierarchyDraft approvers;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalRuleSetApproversActionImpl(
            @JsonProperty("approvers") final com.commercetools.api.models.approval_rule.ApproverHierarchyDraft approvers) {
        this.approvers = approvers;
        this.action = SET_APPROVERS;
    }

    /**
     * create empty instance
     */
    public ApprovalRuleSetApproversActionImpl() {
        this.action = SET_APPROVERS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New approvers to set for the Approval Rule.</p>
     */

    public com.commercetools.api.models.approval_rule.ApproverHierarchyDraft getApprovers() {
        return this.approvers;
    }

    public void setApprovers(final com.commercetools.api.models.approval_rule.ApproverHierarchyDraft approvers) {
        this.approvers = approvers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalRuleSetApproversActionImpl that = (ApprovalRuleSetApproversActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(approvers, that.approvers)
                .append(action, that.action)
                .append(approvers, that.approvers)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(approvers).toHashCode();
    }

}
