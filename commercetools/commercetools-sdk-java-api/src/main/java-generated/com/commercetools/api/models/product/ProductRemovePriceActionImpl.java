
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
 * ProductRemovePriceAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductRemovePriceActionImpl implements ProductRemovePriceAction, ModelBase {

    private String action;

    private String priceId;

    private String sku;

    private Long variantId;

    private com.commercetools.api.models.common.PriceDraft price;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductRemovePriceActionImpl(@JsonProperty("priceId") final String priceId, @JsonProperty("sku") final String sku,
            @JsonProperty("variantId") final Long variantId,
            @JsonProperty("price") final com.commercetools.api.models.common.PriceDraft price,
            @JsonProperty("staged") final Boolean staged) {
        this.priceId = priceId;
        this.sku = sku;
        this.variantId = variantId;
        this.price = price;
        this.staged = staged;
        this.action = REMOVE_PRICE;
    }

    /**
     * create empty instance
     */
    public ProductRemovePriceActionImpl() {
        this.action = REMOVE_PRICE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>id</code> of the Embedded Price to remove.</p>
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant the provided Price should be removed from. Either 'variantId' or 'sku' is required" when <code>priceId</code> is not provided. This field is now deprecated, use 'priceId' instead.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>The <code>id</code> of the ProductVariant the provided Price should be removed from. Either 'variantId' or 'sku' is required" when <code>priceId</code> is not provided. This field is now deprecated, use 'priceId' instead.</p>
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The Price identical to the one to be removed from the ProductVariant. This field is now deprecated, use 'priceId' instead.</p>
     */

    public com.commercetools.api.models.common.PriceDraft getPrice() {
        return this.price;
    }

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price is removed. If <code>false</code>, both the current and staged Embedded Price are removed.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setPriceId(final String priceId) {
        this.priceId = priceId;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setPrice(final com.commercetools.api.models.common.PriceDraft price) {
        this.price = price;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductRemovePriceActionImpl that = (ProductRemovePriceActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(priceId, that.priceId)
                .append(sku, that.sku)
                .append(variantId, that.variantId)
                .append(price, that.price)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(priceId)
                .append(sku)
                .append(variantId)
                .append(price)
                .append(staged)
                .toHashCode();
    }

}
