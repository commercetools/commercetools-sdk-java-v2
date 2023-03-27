
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

/**
 *  <p>Can be used if the Cart has the <code>External</code> TaxMode.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomLineItemTaxRateActionImpl implements CartSetCustomLineItemTaxRateAction, ModelBase {

    private String action;

    private String customLineItemId;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetCustomLineItemTaxRateActionImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.customLineItemId = customLineItemId;
        this.externalTaxRate = externalTaxRate;
        this.action = SET_CUSTOM_LINE_ITEM_TAX_RATE;
    }

    /**
     * create empty instance
     */
    public CartSetCustomLineItemTaxRateActionImpl() {
        this.action = SET_CUSTOM_LINE_ITEM_TAX_RATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>Value to set. If empty, an existing value is removed.</p>
     */

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
