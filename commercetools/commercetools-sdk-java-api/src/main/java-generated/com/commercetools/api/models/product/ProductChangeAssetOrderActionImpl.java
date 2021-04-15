
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
public final class ProductChangeAssetOrderActionImpl implements ProductChangeAssetOrderAction {

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
