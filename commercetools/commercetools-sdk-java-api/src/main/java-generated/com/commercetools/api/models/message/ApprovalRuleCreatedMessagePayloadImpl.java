
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
 *  <p>Generated after an Approval Rule is created.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleCreatedMessagePayloadImpl implements ApprovalRuleCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.approval_rule.ApprovalRule approvalRule;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalRuleCreatedMessagePayloadImpl(
            @JsonProperty("approvalRule") final com.commercetools.api.models.approval_rule.ApprovalRule approvalRule) {
        this.approvalRule = approvalRule;
        this.type = APPROVAL_RULE_CREATED;
    }

    /**
     * create empty instance
     */
    public ApprovalRuleCreatedMessagePayloadImpl() {
        this.type = APPROVAL_RULE_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The Approval Rule that was created.</p>
     */

    public com.commercetools.api.models.approval_rule.ApprovalRule getApprovalRule() {
        return this.approvalRule;
    }

    public void setApprovalRule(final com.commercetools.api.models.approval_rule.ApprovalRule approvalRule) {
        this.approvalRule = approvalRule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalRuleCreatedMessagePayloadImpl that = (ApprovalRuleCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(approvalRule, that.approvalRule)
                .append(type, that.type)
                .append(approvalRule, that.approvalRule)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(approvalRule).toHashCode();
    }

}
