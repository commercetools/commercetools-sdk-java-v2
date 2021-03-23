
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetShippingMethodTaxAmountActionImpl
        implements StagedOrderSetShippingMethodTaxAmountAction {

    private String action;

    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    @JsonCreator
    StagedOrderSetShippingMethodTaxAmountActionImpl(
            @JsonProperty("externalTaxAmount") final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.externalTaxAmount = externalTaxAmount;
        this.action = SET_SHIPPING_METHOD_TAX_AMOUNT;
    }

    public StagedOrderSetShippingMethodTaxAmountActionImpl() {
        this.action = SET_SHIPPING_METHOD_TAX_AMOUNT;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.cart.ExternalTaxAmountDraft getExternalTaxAmount() {
        return this.externalTaxAmount;
    }

    public void setExternalTaxAmount(final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.externalTaxAmount = externalTaxAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetShippingMethodTaxAmountActionImpl that = (StagedOrderSetShippingMethodTaxAmountActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(externalTaxAmount, that.externalTaxAmount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(externalTaxAmount).toHashCode();
    }

}
