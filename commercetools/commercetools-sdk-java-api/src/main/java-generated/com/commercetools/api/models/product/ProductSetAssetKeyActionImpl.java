
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
public class ProductSetAssetKeyActionImpl implements ProductSetAssetKeyAction, ModelBase {

    private String action;

    private Long variantId;

    private String sku;

    private Boolean staged;

    private String assetId;

    private String assetKey;

    @JsonCreator
    ProductSetAssetKeyActionImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku,
            @JsonProperty("staged") final Boolean staged, @JsonProperty("assetId") final String assetId,
            @JsonProperty("assetKey") final String assetKey) {
        this.variantId = variantId;
        this.sku = sku;
        this.staged = staged;
        this.assetId = assetId;
        this.assetKey = assetKey;
        this.action = SET_ASSET_KEY;
    }

    public ProductSetAssetKeyActionImpl() {
        this.action = SET_ASSET_KEY;
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
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     */

    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public String getAssetKey() {
        return this.assetKey;
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSetAssetKeyActionImpl that = (ProductSetAssetKeyActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(staged, that.staged)
                .append(assetId, that.assetId)
                .append(assetKey, that.assetKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(variantId)
                .append(sku)
                .append(staged)
                .append(assetId)
                .append(assetKey)
                .toHashCode();
    }

}
