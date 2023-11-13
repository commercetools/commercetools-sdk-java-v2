
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
 *  <p>Describes the sequence in which Associates can approve an Order.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApproverHierarchyDraftImpl implements ApproverHierarchyDraft, ModelBase {

    private java.util.List<com.commercetools.api.models.approval_rule.ApproverConjunctionDraft> tiers;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApproverHierarchyDraftImpl(
            @JsonProperty("tiers") final java.util.List<com.commercetools.api.models.approval_rule.ApproverConjunctionDraft> tiers) {
        this.tiers = tiers;
    }

    /**
     * create empty instance
     */
    public ApproverHierarchyDraftImpl() {
    }

    /**
     *  <p>Nested conjunctions representing tiers of approvers in a hierarchy.</p>
     */

    public java.util.List<com.commercetools.api.models.approval_rule.ApproverConjunctionDraft> getTiers() {
        return this.tiers;
    }

    public void setTiers(final com.commercetools.api.models.approval_rule.ApproverConjunctionDraft... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
    }

    public void setTiers(
            final java.util.List<com.commercetools.api.models.approval_rule.ApproverConjunctionDraft> tiers) {
        this.tiers = tiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApproverHierarchyDraftImpl that = (ApproverHierarchyDraftImpl) o;

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

}
