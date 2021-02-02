
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetAssetSourcesActionImpl implements ProductSetAssetSourcesAction {

    private String action;

    private Long variantId;

    private String sku;

    private Boolean staged;

    private String assetId;

    private String assetKey;

    private java.util.List<com.commercetools.api.models.common.AssetSource> sources;

    @JsonCreator
    ProductSetAssetSourcesActionImpl(@JsonProperty("variantId") final Long variantId,
            @JsonProperty("sku") final String sku, @JsonProperty("staged") final Boolean staged,
            @JsonProperty("assetId") final String assetId, @JsonProperty("assetKey") final String assetKey,
            @JsonProperty("sources") final java.util.List<com.commercetools.api.models.common.AssetSource> sources) {
        this.variantId = variantId;
        this.sku = sku;
        this.staged = staged;
        this.assetId = assetId;
        this.assetKey = assetKey;
        this.sources = sources;
        this.action = SET_ASSET_SOURCES;
    }

    public ProductSetAssetSourcesActionImpl() {
        this.action = SET_ASSET_SOURCES;
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

    public String getAssetId() {
        return this.assetId;
    }

    public String getAssetKey() {
        return this.assetKey;
    }

    public java.util.List<com.commercetools.api.models.common.AssetSource> getSources() {
        return this.sources;
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

    public void setAssetId(final String assetId) {
        this.assetId = assetId;
    }

    public void setAssetKey(final String assetKey) {
        this.assetKey = assetKey;
    }

    public void setSources(final com.commercetools.api.models.common.AssetSource... sources) {
        this.sources = new ArrayList<>(Arrays.asList(sources));
    }

    public void setSources(final java.util.List<com.commercetools.api.models.common.AssetSource> sources) {
        this.sources = sources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSetAssetSourcesActionImpl that = (ProductSetAssetSourcesActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(variantId, that.variantId).append(sku,
            that.sku).append(staged, that.staged).append(assetId, that.assetId).append(assetKey, that.assetKey).append(
                sources, that.sources).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(variantId).append(sku).append(staged).append(
            assetId).append(assetKey).append(sources).toHashCode();
    }

}
