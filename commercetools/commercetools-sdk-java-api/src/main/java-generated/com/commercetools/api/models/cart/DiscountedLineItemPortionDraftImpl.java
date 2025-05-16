
package com.commercetools.api.models.cart;

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
 * DiscountedLineItemPortionDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountedLineItemPortionDraftImpl implements DiscountedLineItemPortionDraft, ModelBase {

    private com.commercetools.api.models.common.Reference discount;

    private com.commercetools.api.models.common.TypedMoneyDraft discountedAmount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountedLineItemPortionDraftImpl(
            @JsonProperty("discount") final com.commercetools.api.models.common.Reference discount,
            @JsonProperty("discountedAmount") final com.commercetools.api.models.common.TypedMoneyDraft discountedAmount) {
        this.discount = discount;
        this.discountedAmount = discountedAmount;
    }

    /**
     * create empty instance
     */
    public DiscountedLineItemPortionDraftImpl() {
    }

    /**
     *  <p>A CartDiscountReference or DirectDiscountReference for the discount applicable on the Line Item.</p>
     */

    public com.commercetools.api.models.common.Reference getDiscount() {
        return this.discount;
    }

    /**
     *  <p>Money value for the discount applicable.</p>
     */

    public com.commercetools.api.models.common.TypedMoneyDraft getDiscountedAmount() {
        return this.discountedAmount;
    }

    public void setDiscount(final com.commercetools.api.models.common.Reference discount) {
        this.discount = discount;
    }

    public void setDiscountedAmount(final com.commercetools.api.models.common.TypedMoneyDraft discountedAmount) {
        this.discountedAmount = discountedAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountedLineItemPortionDraftImpl that = (DiscountedLineItemPortionDraftImpl) o;

        return new EqualsBuilder().append(discount, that.discount)
                .append(discountedAmount, that.discountedAmount)
                .append(discount, that.discount)
                .append(discountedAmount, that.discountedAmount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(discount).append(discountedAmount).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("discount", discount)
                .append("discountedAmount", discountedAmount)
                .build();
    }

    @Override
    public DiscountedLineItemPortionDraft copyDeep() {
        return DiscountedLineItemPortionDraft.deepCopy(this);
    }
}
