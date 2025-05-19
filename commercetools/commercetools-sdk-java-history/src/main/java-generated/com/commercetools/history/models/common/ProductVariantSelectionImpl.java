
package com.commercetools.history.models.common;

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
 * ProductVariantSelection
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantSelectionImpl implements ProductVariantSelection, ModelBase {

    private com.commercetools.history.models.common.ProductVariantSelectionTypeEnum type;

    private java.util.List<String> skus;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantSelectionImpl(
            @JsonProperty("type") final com.commercetools.history.models.common.ProductVariantSelectionTypeEnum type,
            @JsonProperty("skus") final java.util.List<String> skus) {
        this.type = type;
        this.skus = skus;
    }

    /**
     * create empty instance
     */
    public ProductVariantSelectionImpl() {
    }

    /**
     *
     */

    public com.commercetools.history.models.common.ProductVariantSelectionTypeEnum getType() {
        return this.type;
    }

    /**
     *
     */

    public java.util.List<String> getSkus() {
        return this.skus;
    }

    public void setType(final com.commercetools.history.models.common.ProductVariantSelectionTypeEnum type) {
        this.type = type;
    }

    public void setSkus(final String... skus) {
        this.skus = new ArrayList<>(Arrays.asList(skus));
    }

    public void setSkus(final java.util.List<String> skus) {
        this.skus = skus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProductVariantSelectionImpl that = (ProductVariantSelectionImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(skus, that.skus)
                .append(type, that.type)
                .append(skus, that.skus)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(skus).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("skus", skus)
                .build();
    }

    @Override
    public ProductVariantSelection copyDeep() {
        return ProductVariantSelection.deepCopy(this);
    }
}
