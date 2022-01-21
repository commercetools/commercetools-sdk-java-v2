
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

    public String getAction() {
        return this.action;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    public String getSku() {
        return this.sku;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public com.commercetools.api.models.common.AssetDraft getAsset() {
        return this.asset;
    }

    /**
    *  <p>Position of the new asset inside the existing list (from <code>0</code> to the size of the list)</p>
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
