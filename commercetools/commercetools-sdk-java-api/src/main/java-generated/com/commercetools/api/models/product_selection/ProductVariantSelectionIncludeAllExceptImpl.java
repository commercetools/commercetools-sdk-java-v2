
package com.commercetools.api.models.product_selection;

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
 *  <p>All Product Variants except the explicitly stated SKUs are part of the Product Selection.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantSelectionIncludeAllExceptImpl implements ProductVariantSelectionIncludeAllExcept, ModelBase {

    private com.commercetools.api.models.product_selection.ProductVariantSelectionTypeEnum type;

    private java.util.List<String> skus;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantSelectionIncludeAllExceptImpl(@JsonProperty("skus") final java.util.List<String> skus) {
        this.skus = skus;
        this.type = ProductVariantSelectionTypeEnum.findEnum("includeAllExcept");
    }

    /**
     * create empty instance
     */
    public ProductVariantSelectionIncludeAllExceptImpl() {
        this.type = ProductVariantSelectionTypeEnum.findEnum("includeAllExcept");
    }

    /**
     *
     */

    public com.commercetools.api.models.product_selection.ProductVariantSelectionTypeEnum getType() {
        return this.type;
    }

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be excluded from the Product Selection.</p>
     */

    public java.util.List<String> getSkus() {
        return this.skus;
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

        ProductVariantSelectionIncludeAllExceptImpl that = (ProductVariantSelectionIncludeAllExceptImpl) o;

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
    public ProductVariantSelectionIncludeAllExcept copyDeep() {
        return ProductVariantSelectionIncludeAllExcept.deepCopy(this);
    }
}
