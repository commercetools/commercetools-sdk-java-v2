
package com.commercetools.history.models.common;

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
 *  <p>Information about recurring orders and frequencies.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomLineItemRecurrenceInfoImpl implements CustomLineItemRecurrenceInfo, ModelBase {

    private com.commercetools.history.models.common.RecurrencePolicyReference recurrencePolicy;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomLineItemRecurrenceInfoImpl(
            @JsonProperty("recurrencePolicy") final com.commercetools.history.models.common.RecurrencePolicyReference recurrencePolicy) {
        this.recurrencePolicy = recurrencePolicy;
    }

    /**
     * create empty instance
     */
    public CustomLineItemRecurrenceInfoImpl() {
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a RecurrencePolicy.</p>
     */

    public com.commercetools.history.models.common.RecurrencePolicyReference getRecurrencePolicy() {
        return this.recurrencePolicy;
    }

    public void setRecurrencePolicy(
            final com.commercetools.history.models.common.RecurrencePolicyReference recurrencePolicy) {
        this.recurrencePolicy = recurrencePolicy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomLineItemRecurrenceInfoImpl that = (CustomLineItemRecurrenceInfoImpl) o;

        return new EqualsBuilder().append(recurrencePolicy, that.recurrencePolicy)
                .append(recurrencePolicy, that.recurrencePolicy)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(recurrencePolicy).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("recurrencePolicy", recurrencePolicy)
                .build();
    }

    @Override
    public CustomLineItemRecurrenceInfo copyDeep() {
        return CustomLineItemRecurrenceInfo.deepCopy(this);
    }
}
