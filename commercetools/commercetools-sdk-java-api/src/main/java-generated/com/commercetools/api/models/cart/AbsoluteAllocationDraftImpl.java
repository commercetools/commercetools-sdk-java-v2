
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Allocates a fixed amount of the Order total to a Payment Method.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AbsoluteAllocationDraftImpl implements AbsoluteAllocationDraft, ModelBase {

    private String type;

    private com.commercetools.api.models.common.HighPrecisionMoneyDraft amount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AbsoluteAllocationDraftImpl(
            @JsonProperty("amount") final com.commercetools.api.models.common.HighPrecisionMoneyDraft amount) {
        this.amount = amount;
        this.type = ABSOLUTE;
    }

    /**
     * create empty instance
     */
    public AbsoluteAllocationDraftImpl() {
        this.type = ABSOLUTE;
    }

    /**
     *  <p>Type of the Allocation.</p>
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Amount of the Order total allocated to the Payment Method.</p>
     */

    public com.commercetools.api.models.common.HighPrecisionMoneyDraft getAmount() {
        return this.amount;
    }

    public void setAmount(final com.commercetools.api.models.common.HighPrecisionMoneyDraft amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AbsoluteAllocationDraftImpl that = (AbsoluteAllocationDraftImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(amount, that.amount)
                .append(type, that.type)
                .append(amount, that.amount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(amount).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("amount", amount)
                .build();
    }

    @Override
    public AbsoluteAllocationDraft copyDeep() {
        return AbsoluteAllocationDraft.deepCopy(this);
    }
}
