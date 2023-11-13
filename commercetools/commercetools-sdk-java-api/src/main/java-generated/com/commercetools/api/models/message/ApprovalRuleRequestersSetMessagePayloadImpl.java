
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
 *  <p>Generated after a successful Set Requester update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleRequestersSetMessagePayloadImpl implements ApprovalRuleRequestersSetMessagePayload, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> requesters;

    private java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> oldRequesters;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalRuleRequestersSetMessagePayloadImpl(
            @JsonProperty("requesters") final java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> requesters,
            @JsonProperty("oldRequesters") final java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> oldRequesters) {
        this.requesters = requesters;
        this.oldRequesters = oldRequesters;
        this.type = APPROVAL_RULE_REQUESTERS_SET;
    }

    /**
     * create empty instance
     */
    public ApprovalRuleRequestersSetMessagePayloadImpl() {
        this.type = APPROVAL_RULE_REQUESTERS_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> getRequesters() {
        return this.requesters;
    }

    /**
     *  <p>RuleRequester of the ApprovalRule after the Set Requester update action.</p>
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> getOldRequesters() {
        return this.oldRequesters;
    }

    public void setRequesters(final com.commercetools.api.models.approval_rule.RuleRequester... requesters) {
        this.requesters = new ArrayList<>(Arrays.asList(requesters));
    }

    public void setRequesters(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> requesters) {
        this.requesters = requesters;
    }

    public void setOldRequesters(final com.commercetools.api.models.approval_rule.RuleRequester... oldRequesters) {
        this.oldRequesters = new ArrayList<>(Arrays.asList(oldRequesters));
    }

    public void setOldRequesters(
            final java.util.List<com.commercetools.api.models.approval_rule.RuleRequester> oldRequesters) {
        this.oldRequesters = oldRequesters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalRuleRequestersSetMessagePayloadImpl that = (ApprovalRuleRequestersSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(requesters, that.requesters)
                .append(oldRequesters, that.oldRequesters)
                .append(type, that.type)
                .append(requesters, that.requesters)
                .append(oldRequesters, that.oldRequesters)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(requesters).append(oldRequesters).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("requesters", requesters)
                .append("oldRequesters", oldRequesters)
                .build();
    }

}
