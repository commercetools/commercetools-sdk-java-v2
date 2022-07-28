
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
 *  <p>Either <code>variantId</code> or <code>sku</code> is required.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductChangeAssetOrderActionImpl implements ProductChangeAssetOrderAction, ModelBase {

    private String action;

    private Long variantId;

    private String sku;

    private Boolean staged;

    private java.util.List<String> assetOrder;

    @JsonCreator
    ProductChangeAssetOrderActionImpl(@JsonProperty("variantId") final Long variantId,
            @JsonProperty("sku") final String sku, @JsonProperty("staged") final Boolean staged,
            @JsonProperty("assetOrder") final java.util.List<String> assetOrder) {
        this.variantId = variantId;
        this.sku = sku;
        this.staged = staged;
        this.assetOrder = assetOrder;
        this.action = CHANGE_ASSET_ORDER;
    }

    public ProductChangeAssetOrderActionImpl() {
        this.action = CHANGE_ASSET_ORDER;
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
     *  <p>If <code>true</code>, only the staged <code>assets</code> is updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>All existing Asset <code>id</code>s of the ProductVariant in the desired new order.</p>
     */

    public java.util.List<String> getAssetOrder() {
        return this.assetOrder;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setStaged(final Boolean staged) {
        this.staged = staged;
    }

    public void setAssetOrder(final String... assetOrder) {
        this.assetOrder = new ArrayList<>(Arrays.asList(assetOrder));
    }

    public void setAssetOrder(final java.util.List<String> assetOrder) {
        this.assetOrder = assetOrder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductChangeAssetOrderActionImpl that = (ProductChangeAssetOrderActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(staged, that.staged)
                .append(assetOrder, that.assetOrder)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(variantId)
                .append(sku)
                .append(staged)
                .append(assetOrder)
                .toHashCode();
    }

}
