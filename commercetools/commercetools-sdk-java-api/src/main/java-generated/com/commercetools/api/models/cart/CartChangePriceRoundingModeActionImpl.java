
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
 *  <p>Changing the price rounding mode leads to recalculation of taxes.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartChangePriceRoundingModeActionImpl implements CartChangePriceRoundingModeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.cart.RoundingMode priceRoundingMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartChangePriceRoundingModeActionImpl(
            @JsonProperty("priceRoundingMode") final com.commercetools.api.models.cart.RoundingMode priceRoundingMode) {
        this.priceRoundingMode = priceRoundingMode;
        this.action = CHANGE_PRICE_ROUNDING_MODE;
    }

    /**
     * create empty instance
     */
    public CartChangePriceRoundingModeActionImpl() {
        this.action = CHANGE_PRICE_ROUNDING_MODE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set.</p>
     */

    public com.commercetools.api.models.cart.RoundingMode getPriceRoundingMode() {
        return this.priceRoundingMode;
    }

    public void setPriceRoundingMode(final com.commercetools.api.models.cart.RoundingMode priceRoundingMode) {
        this.priceRoundingMode = priceRoundingMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartChangePriceRoundingModeActionImpl that = (CartChangePriceRoundingModeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(priceRoundingMode, that.priceRoundingMode)
                .append(action, that.action)
                .append(priceRoundingMode, that.priceRoundingMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(priceRoundingMode).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("priceRoundingMode", priceRoundingMode)
                .build();
    }

    @Override
    public CartChangePriceRoundingModeAction copyDeep() {
        return CartChangePriceRoundingModeAction.deepCopy(this);
    }
}
