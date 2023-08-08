
package com.commercetools.api.models.product;

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
 *  <p>Controls whether the Prices of a Product Variant are embedded into the Product or standalone.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetPriceModeActionImpl implements ProductSetPriceModeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.product.ProductPriceModeEnum priceMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductSetPriceModeActionImpl(
            @JsonProperty("priceMode") final com.commercetools.api.models.product.ProductPriceModeEnum priceMode) {
        this.priceMode = priceMode;
        this.action = SET_PRICE_MODE;
    }

    /**
     * create empty instance
     */
    public ProductSetPriceModeActionImpl() {
        this.action = SET_PRICE_MODE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Specifies which type of Prices should be used when looking up a price for the Product.</p>
     */

    public com.commercetools.api.models.product.ProductPriceModeEnum getPriceMode() {
        return this.priceMode;
    }

    public void setPriceMode(final com.commercetools.api.models.product.ProductPriceModeEnum priceMode) {
        this.priceMode = priceMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSetPriceModeActionImpl that = (ProductSetPriceModeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(priceMode, that.priceMode)
                .append(action, that.action)
                .append(priceMode, that.priceMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(priceMode).toHashCode();
    }

}
