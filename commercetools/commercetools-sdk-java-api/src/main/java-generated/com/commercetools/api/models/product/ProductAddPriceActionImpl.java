
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Adds the given Price to the <code>prices</code> array of the ProductVariant. Either <code>variantId</code> or <code>sku</code> is required.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductAddPriceActionImpl implements ProductAddPriceAction, ModelBase {

    private String action;

    private Long variantId;

    private String sku;

    private com.commercetools.api.models.common.PriceDraft price;

    private Boolean staged;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductAddPriceActionImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku,
            @JsonProperty("price") final com.commercetools.api.models.common.PriceDraft price,
            @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.sku = sku;
        this.price = price;
        this.staged = staged;
        this.action = ADD_PRICE;
    }

    /**
     * create empty instance
     */
    public ProductAddPriceActionImpl() {
        this.action = ADD_PRICE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     */

    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>Embedded Price to add to the Product Variant.</p>
     */

    public com.commercetools.api.models.common.PriceDraft getPrice() {
        return this.price;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>prices</code> is updated. If <code>false</code>, both the current and staged <code>prices</code> are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setSku(final String sku) {
        this.sku = sku;
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

        ProductAddPriceActionImpl that = (ProductAddPriceActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(price, that.price)
                .append(staged, that.staged)
                .append(action, that.action)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(price, that.price)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(variantId)
                .append(sku)
                .append(price)
                .append(staged)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("variantId", variantId)
                .append("sku", sku)
                .append("price", price)
                .append("staged", staged)
                .build();
    }

    @Override
    public ProductAddPriceAction copyDeep() {
        return ProductAddPriceAction.deepCopy(this);
    }
}
