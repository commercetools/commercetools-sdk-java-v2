
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
 *  <p>Setting the <span>Order Predicate</span> for an <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRule" rel="nofollow">Approval Rule</a> generates an <a href="https://docs.commercetools.com/apis/ctp:api:type:ApprovalRulePredicateSetMessage" rel="nofollow">ApprovalRulePredicateSet</a> Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApprovalRuleSetPredicateActionImpl implements ApprovalRuleSetPredicateAction, ModelBase {

    private String action;

    private String predicate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApprovalRuleSetPredicateActionImpl(@JsonProperty("predicate") final String predicate) {
        this.predicate = predicate;
        this.action = SET_PREDICATE;
    }

    /**
     * create empty instance
     */
    public ApprovalRuleSetPredicateActionImpl() {
        this.action = SET_PREDICATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>A valid <span>Order Predicate</span> to set for the Approval Rule.</p>
     */

    public String getPredicate() {
        return this.predicate;
    }

    public void setPredicate(final String predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApprovalRuleSetPredicateActionImpl that = (ApprovalRuleSetPredicateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(predicate, that.predicate)
                .append(action, that.action)
                .append(predicate, that.predicate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(predicate).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("predicate", predicate)
                .build();
    }

    @Override
    public ApprovalRuleSetPredicateAction copyDeep() {
        return ApprovalRuleSetPredicateAction.deepCopy(this);
    }
}
