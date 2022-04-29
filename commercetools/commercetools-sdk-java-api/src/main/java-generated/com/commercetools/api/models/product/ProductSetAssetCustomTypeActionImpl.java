
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
public class ProductSetAssetCustomTypeActionImpl implements ProductSetAssetCustomTypeAction, ModelBase {

    private String action;

    private Long variantId;

    private String sku;

    private Boolean staged;

    private String assetId;

    private String assetKey;

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    private com.commercetools.api.models.type.FieldContainer fields;

    @JsonCreator
    ProductSetAssetCustomTypeActionImpl(@JsonProperty("variantId") final Long variantId,
            @JsonProperty("sku") final String sku, @JsonProperty("staged") final Boolean staged,
            @JsonProperty("assetId") final String assetId, @JsonProperty("assetKey") final String assetKey,
            @JsonProperty("type") final com.commercetools.api.models.type.TypeResourceIdentifier type,
            @JsonProperty("fields") final com.commercetools.api.models.type.FieldContainer fields) {
        this.variantId = variantId;
        this.sku = sku;
        this.staged = staged;
        this.assetId = assetId;
        this.assetKey = assetKey;
        this.type = type;
        this.fields = fields;
        this.action = SET_ASSET_CUSTOM_TYPE;
    }

    public ProductSetAssetCustomTypeActionImpl() {
        this.action = SET_ASSET_CUSTOM_TYPE;
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

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the Asset with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the Asset.</p>
    */
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the Asset.</p>
    */
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
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

    public void setType(final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
    }

    public void setFields(final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductSetAssetCustomTypeActionImpl that = (ProductSetAssetCustomTypeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(staged, that.staged)
                .append(assetId, that.assetId)
                .append(assetKey, that.assetKey)
                .append(type, that.type)
                .append(fields, that.fields)
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
                .append(type)
                .append(fields)
                .toHashCode();
    }

}
