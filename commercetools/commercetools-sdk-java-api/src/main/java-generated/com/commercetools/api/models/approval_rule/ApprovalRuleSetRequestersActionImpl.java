
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
 *  <p>Sets the requesters for an <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">Approval Rule</a> generates an <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRuleRequestersSetMessage" rel="nofollow">ApprovalRuleRequestersSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleSetRequestersActionImpl implements ApprovalRuleSetRequestersAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.approval_rule.RuleRequesterDraft> requesters;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalRuleSetRequestersActionImpl(
            @JsonProperty("requesters") final java.util.List<com.commercetools.api.models.approval_rule.RuleRequesterDraft> requesters) {
        this.requesters = requesters;
        this.action = SET_REQUESTERS;
    }

    /**
     * create empty instance
     */
    public ApprovalRuleSetRequestersActionImpl() {
        this.action = SET_REQUESTERS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New requesters to set for the Approval Rule.</p>
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleRequesterDraft> getRequesters() {
        return this.requesters;
    }

    public void setRequesters(final com.commercetools.api.models.approval_rule.RuleRequesterDraft... requesters) {
        this.requesters = new ArrayList<>(Arrays.asList(requesters));
    }

    public void setRequesters(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleRequesterDraft> requesters) {
        this.requesters = requesters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalRuleSetRequestersActionImpl that = (ApprovalRuleSetRequestersActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(requesters, that.requesters)
                .append(action, that.action)
                .append(requesters, that.requesters)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(requesters).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("requesters", requesters)
                .build();
    }

    @Override
    public ApprovalRuleSetRequestersAction copyDeep() {
        return ApprovalRuleSetRequestersAction.deepCopy(this);
    }
}
