
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
 *  <p>Describes the order in which Associates can approve the matched Order.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApproverHierarchyImpl implements ApproverHierarchy, ModelBase {

    private java.util.List<com.commercetools.api.models.approval_rule.ApproverConjunction> tiers;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApproverHierarchyImpl(
            @JsonProperty("tiers") final java.util.List<com.commercetools.api.models.approval_rule.ApproverConjunction> tiers) {
        this.tiers = tiers;
    }

    /**
     * create empty instance
     */
    public ApproverHierarchyImpl() {
    }

    /**
     *  <p>All of the nested conjunctions must be approved in order for the hierarchy to be considered approved.</p>
     */

    public java.util.List<com.commercetools.api.models.approval_rule.ApproverConjunction> getTiers() {
        return this.tiers;
    }

    public void setTiers(final com.commercetools.api.models.approval_rule.ApproverConjunction... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
    }

    public void setTiers(final java.util.List<com.commercetools.api.models.approval_rule.ApproverConjunction> tiers) {
        this.tiers = tiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApproverHierarchyImpl that = (ApproverHierarchyImpl) o;

        return new EqualsBuilder().append(tiers, that.tiers).append(tiers, that.tiers).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(tiers).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("tiers", tiers).build();
    }

    @Override
    public ApproverHierarchy copyDeep() {
        return ApproverHierarchy.deepCopy(this);
    }
}
