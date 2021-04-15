
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartSetCustomLineItemTaxRateActionImpl implements CartSetCustomLineItemTaxRateAction {

    private String action;

    private String customLineItemId;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @JsonCreator
    CartSetCustomLineItemTaxRateActionImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.customLineItemId = customLineItemId;
        this.externalTaxRate = externalTaxRate;
        this.action = SET_CUSTOM_LINE_ITEM_TAX_RATE;
    }

    public CartSetCustomLineItemTaxRateActionImpl() {
        this.action = SET_CUSTOM_LINE_ITEM_TAX_RATE;
    }

    public String getAction() {
        return this.action;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetCustomLineItemTaxRateActionImpl that = (CartSetCustomLineItemTaxRateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(externalTaxRate, that.externalTaxRate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customLineItemId).append(externalTaxRate).toHashCode();
    }

}
