
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

/**
 *  <p>Only Product Variants with the explicitly listed SKUs are part of a Product Selection with <code>IndividualExclusion</code> ProductSelectionMode.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductVariantExclusionImpl implements ProductVariantExclusion, ModelBase {

    private java.util.List<String> skus;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantExclusionImpl(@JsonProperty("skus") final java.util.List<String> skus) {
        this.skus = skus;
    }

    /**
     * create empty instance
     */
    public ProductVariantExclusionImpl() {
    }

    /**
     *  <p>Non-empty array of SKUs representing Product Variants to be included in the Product Selection with <code>IndividualExclusion</code> ProductSelectionMode.</p>
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

        ProductVariantExclusionImpl that = (ProductVariantExclusionImpl) o;

        return new EqualsBuilder().append(skus, that.skus).append(skus, that.skus).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(skus).toHashCode();
    }

}
