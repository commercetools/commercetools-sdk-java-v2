
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
public final class ProductSetProductVariantKeyActionImpl implements ProductSetProductVariantKeyAction {

    private String action;

    private Long variantId;

    private String sku;

    private String key;

    private Boolean staged;

    @JsonCreator
    ProductSetProductVariantKeyActionImpl(@JsonProperty("variantId") final Long variantId,
            @JsonProperty("sku") final String sku, @JsonProperty("key") final String key,
            @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.sku = sku;
        this.key = key;
        this.staged = staged;
        this.action = SET_PRODUCT_VARIANT_KEY;
    }

    public ProductSetProductVariantKeyActionImpl() {
        this.action = SET_PRODUCT_VARIANT_KEY;
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

    /**
    *  <p>If left blank or set to <code>null</code>, the key is unset/removed.</p>
    */
    public String getKey() {
        return this.key;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    public void setVariantId(final Long variantId) {
        this.variantId = variantId;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setKey(final String key) {
        this.key = key;
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

        ProductSetProductVariantKeyActionImpl that = (ProductSetProductVariantKeyActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(variantId, that.variantId)
                .append(sku, that.sku)
                .append(key, that.key)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(variantId)
                .append(sku)
                .append(key)
                .append(staged)
                .toHashCode();
    }

}
