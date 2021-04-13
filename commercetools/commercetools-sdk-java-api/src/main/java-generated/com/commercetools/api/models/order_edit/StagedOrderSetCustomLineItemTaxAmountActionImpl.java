
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
public final class StagedOrderSetCustomLineItemTaxAmountActionImpl
        implements StagedOrderSetCustomLineItemTaxAmountAction {

    private String action;

    private String customLineItemId;

    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    @JsonCreator
    StagedOrderSetCustomLineItemTaxAmountActionImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("externalTaxAmount") final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.customLineItemId = customLineItemId;
        this.externalTaxAmount = externalTaxAmount;
        this.action = SET_CUSTOM_LINE_ITEM_TAX_AMOUNT;
    }

    public StagedOrderSetCustomLineItemTaxAmountActionImpl() {
        this.action = SET_CUSTOM_LINE_ITEM_TAX_AMOUNT;
    }

    public String getAction() {
        return this.action;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public com.commercetools.api.models.cart.ExternalTaxAmountDraft getExternalTaxAmount() {
        return this.externalTaxAmount;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
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

        StagedOrderSetCustomLineItemTaxAmountActionImpl that = (StagedOrderSetCustomLineItemTaxAmountActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(externalTaxAmount, that.externalTaxAmount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(customLineItemId)
                .append(externalTaxAmount)
                .toHashCode();
    }

}
