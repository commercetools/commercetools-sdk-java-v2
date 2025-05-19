
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Setting the status for an Approval Rule generates an ApprovalRuleStatusSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleSetStatusActionImpl implements ApprovalRuleSetStatusAction, ModelBase {

    private String action;

    private com.commercetools.api.models.approval_rule.ApprovalRuleStatus status;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalRuleSetStatusActionImpl(
            @JsonProperty("status") final com.commercetools.api.models.approval_rule.ApprovalRuleStatus status) {
        this.status = status;
        this.action = SET_STATUS;
    }

    /**
     * create empty instance
     */
    public ApprovalRuleSetStatusActionImpl() {
        this.action = SET_STATUS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New status to set for the Approval Rule.</p>
     */

    public com.commercetools.api.models.approval_rule.ApprovalRuleStatus getStatus() {
        return this.status;
    }

    public void setStatus(final com.commercetools.api.models.approval_rule.ApprovalRuleStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalRuleSetStatusActionImpl that = (ApprovalRuleSetStatusActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(status, that.status)
                .append(action, that.action)
                .append(status, that.status)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(status).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("status", status)
                .build();
    }

    @Override
    public ApprovalRuleSetStatusAction copyDeep() {
        return ApprovalRuleSetStatusAction.deepCopy(this);
    }
}
