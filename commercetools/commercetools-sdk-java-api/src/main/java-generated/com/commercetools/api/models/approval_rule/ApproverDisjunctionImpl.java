
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
 * ApproverDisjunction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApproverDisjunctionImpl implements ApproverDisjunction, ModelBase {

    private java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> or;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApproverDisjunctionImpl(
            @JsonProperty("or") final java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> or) {
        this.or = or;
    }

    /**
     * create empty instance
     */
    public ApproverDisjunctionImpl() {
    }

    /**
     *  <p>Any of the nested approvers must approve in order for the disjunction to be considered approved.</p>
     */

    public java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> getOr() {
        return this.or;
    }

    public void setOr(final com.commercetools.api.models.approval_rule.RuleApprover... or) {
        this.or = new ArrayList<>(Arrays.asList(or));
    }

    public void setOr(final java.util.List<com.commercetools.api.models.approval_rule.RuleApprover> or) {
        this.or = or;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApproverDisjunctionImpl that = (ApproverDisjunctionImpl) o;

        return new EqualsBuilder().append(or, that.or).append(or, that.or).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(or).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("or", or).build();
    }

}
