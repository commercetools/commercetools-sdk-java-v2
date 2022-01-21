
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
public class ProductLegacySetSkuActionImpl implements ProductLegacySetSkuAction, ModelBase {

    private String action;

    private String sku;

    private Integer variantId;

    @JsonCreator
    ProductLegacySetSkuActionImpl(@JsonProperty("sku") final String sku,
            @JsonProperty("variantId") final Integer variantId) {
        this.sku = sku;
        this.variantId = variantId;
        this.action = LEGACY_SET_SKU;
    }

    public ProductLegacySetSkuActionImpl() {
        this.action = LEGACY_SET_SKU;
    }

    public String getAction() {
        return this.action;
    }

    public String getSku() {
        return this.sku;
    }

    public Integer getVariantId() {
        return this.variantId;
    }

    public void setSku(final String sku) {
        this.sku = sku;
    }

    public void setVariantId(final Integer variantId) {
        this.variantId = variantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductLegacySetSkuActionImpl that = (ProductLegacySetSkuActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(sku, that.sku)
                .append(variantId, that.variantId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(sku).append(variantId).toHashCode();
    }

}
