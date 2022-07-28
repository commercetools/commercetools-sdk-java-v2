
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
public class ProductAddAssetActionImpl implements ProductAddAssetAction, ModelBase {

    private String action;

    private Long variantId;

    private String sku;

    private Boolean staged;

    private com.commercetools.api.models.common.AssetDraft asset;

    private Integer position;

    @JsonCreator
    ProductAddAssetActionImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku,
            @JsonProperty("staged") final Boolean staged,
            @JsonProperty("asset") final com.commercetools.api.models.common.AssetDraft asset,
            @JsonProperty("position") final Integer position) {
        this.variantId = variantId;
        this.sku = sku;
        this.staged = staged;
        this.asset = asset;
        this.position = position;
        this.action = ADD_ASSET;
    }

    public ProductAddAssetActionImpl() {
        this.action = ADD_ASSET;
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
     *  <p>If <code>true</code>, only the staged <code>assets</code> are updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Value to append.</p>
     */

    public com.commercetools.api.models.common.AssetDraft getAsset() {
        return this.asset;
    }

    /**
     *  <p>Position in <code>assets</code> where the Asset should be put. When specified, the value must be between <code>0</code> and the total number of Assets minus <code>1</code>.</p>
     */

    public Integer getPosition() {
        return this.position;
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

    public void setAsset(final com.commercetools.api.models.common.AssetDraft asset) {
        this.asset = asset;
    }

    public void setPosition(final Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductAddAssetActionImpl that = (ProductAddAssetActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(staged, that.staged)
                .append(asset, that.asset)
                .append(position, that.position)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(variantId)
                .append(sku)
                .append(staged)
                .append(asset)
                .append(position)
                .toHashCode();
    }

}
