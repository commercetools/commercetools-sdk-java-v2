
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountedLineItemPriceDraftImpl implements DiscountedLineItemPriceDraft {

    private com.commercetools.importapi.models.common.Money value;

    private java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPortion> includedDiscounts;

    @JsonCreator
    DiscountedLineItemPriceDraftImpl(@JsonProperty("value") final com.commercetools.importapi.models.common.Money value,
            @JsonProperty("includedDiscounts") final java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPortion> includedDiscounts) {
        this.value = value;
        this.includedDiscounts = includedDiscounts;
    }

    public DiscountedLineItemPriceDraftImpl() {
    }

    public com.commercetools.importapi.models.common.Money getValue() {
        return this.value;
    }

    public java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPortion> getIncludedDiscounts() {
        return this.includedDiscounts;
    }

    public void setValue(final com.commercetools.importapi.models.common.Money value) {
        this.value = value;
    }

    public void setIncludedDiscounts(
            final com.commercetools.importapi.models.orders.DiscountedLineItemPortion... includedDiscounts) {
        this.includedDiscounts = new ArrayList<>(Arrays.asList(includedDiscounts));
    }

    public void setIncludedDiscounts(
            final java.util.List<com.commercetools.importapi.models.orders.DiscountedLineItemPortion> includedDiscounts) {
        this.includedDiscounts = includedDiscounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountedLineItemPriceDraftImpl that = (DiscountedLineItemPriceDraftImpl) o;

        return new EqualsBuilder().append(value, that.value).append(includedDiscounts,
            that.includedDiscounts).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(value).append(includedDiscounts).toHashCode();
    }

}
