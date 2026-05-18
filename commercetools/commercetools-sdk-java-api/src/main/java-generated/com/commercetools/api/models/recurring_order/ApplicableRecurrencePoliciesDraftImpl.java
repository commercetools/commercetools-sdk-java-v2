
package com.commercetools.api.models.recurring_order;

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
 *  <p>Applies Cart Discounts to recurring Orders that match the Recurrence Policies.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApplicableRecurrencePoliciesDraftImpl implements ApplicableRecurrencePoliciesDraft, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier> recurrencePolicies;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ApplicableRecurrencePoliciesDraftImpl(
            @JsonProperty("recurrencePolicies") final java.util.List<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier> recurrencePolicies) {
        this.recurrencePolicies = recurrencePolicies;
        this.type = APPLICABLE_RECURRENCE_POLICIES;
    }

    /**
     * create empty instance
     */
    public ApplicableRecurrencePoliciesDraftImpl() {
        this.type = APPLICABLE_RECURRENCE_POLICIES;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Recurrence Policies for which the Cart Discount is valid.</p>
     *  <p>If a Recurrence Policy does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error will be returned.</p>
     *  <p>If fewer or more Recurrence Policies are provided, an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error will be returned.</p>
     */

    public java.util.List<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier> getRecurrencePolicies() {
        return this.recurrencePolicies;
    }

    public void setRecurrencePolicies(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier... recurrencePolicies) {
        this.recurrencePolicies = new ArrayList<>(Arrays.asList(recurrencePolicies));
    }

    public void setRecurrencePolicies(
            final java.util.List<com.commercetools.api.models.recurrence_policy.RecurrencePolicyResourceIdentifier> recurrencePolicies) {
        this.recurrencePolicies = recurrencePolicies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ApplicableRecurrencePoliciesDraftImpl that = (ApplicableRecurrencePoliciesDraftImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(recurrencePolicies, that.recurrencePolicies)
                .append(type, that.type)
                .append(recurrencePolicies, that.recurrencePolicies)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(recurrencePolicies).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("recurrencePolicies", recurrencePolicies)
                .build();
    }

    @Override
    public ApplicableRecurrencePoliciesDraft copyDeep() {
        return ApplicableRecurrencePoliciesDraft.deepCopy(this);
    }
}
