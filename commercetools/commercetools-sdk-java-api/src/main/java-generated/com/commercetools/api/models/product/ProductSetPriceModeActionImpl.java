
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSetPriceModeActionImpl implements ProductSetPriceModeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.product.ProductPriceModeEnum priceMode;

    @JsonCreator
    ProductSetPriceModeActionImpl(
            @JsonProperty("priceMode") final com.commercetools.api.models.product.ProductPriceModeEnum priceMode) {
        this.priceMode = priceMode;
        this.action = SET_PRICE_MODE;
    }

    public ProductSetPriceModeActionImpl() {
        this.action = SET_PRICE_MODE;
    }

    public String getAction() {
        return this.action;
    }

    /**
    *  <p>Specifies which type of prices should be used when looking up a price for this product. If not set, <code>Embedded</code> <a href="ctp:api:type:ProductPriceModeEnum">ProductPriceMode</a> is used.</p>
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

        return new EqualsBuilder().append(action, that.action).append(priceMode, that.priceMode).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(priceMode).toHashCode();
    }

}
