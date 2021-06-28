
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Import representation for an update to a product variant. Use this type for importing updates to existing
*  product variants into a commercetools project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductVariantPatchImpl implements ProductVariantPatch {

    private com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant;

    private com.commercetools.importapi.models.productvariants.Attributes attributes;

    private Boolean staged;

    @JsonCreator
    ProductVariantPatchImpl(
            @JsonProperty("productVariant") final com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant,
            @JsonProperty("attributes") final com.commercetools.importapi.models.productvariants.Attributes attributes,
            @JsonProperty("staged") final Boolean staged) {
        this.productVariant = productVariant;
        this.attributes = attributes;
        this.staged = staged;
    }

    public ProductVariantPatchImpl() {
    }

    /**
    *  <p>The product variant to which this patch is applied.</p>
    *  <p>The product variant referenced
    *  must already exist in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    public com.commercetools.importapi.models.common.ProductVariantKeyReference getProductVariant() {
        return this.productVariant;
    }

    /**
    *  <p>Maps to <code>ProductVariant.attributes</code>.</p>
    *  <p>Each attribute referenced must be defined
    *  in an already existing product type in the commercetools project, or the import
    *  operation state is set to <code>ValidationFailed</code>.</p>
    */
    public com.commercetools.importapi.models.productvariants.Attributes getAttributes() {
        return this.attributes;
    }

    /**
    *  <p>If <code>false</code>, the attribute changes are applied to both <a href="/../api/projects/productProjections#current--staged">current and staged projected representations</a> of the <a href="/../api/projects/products#product">Product</a>.</p>
    */
    public Boolean getStaged() {
        return this.staged;
    }

    public void setProductVariant(
            final com.commercetools.importapi.models.common.ProductVariantKeyReference productVariant) {
        this.productVariant = productVariant;
    }

    public void setAttributes(final com.commercetools.importapi.models.productvariants.Attributes attributes) {
        this.attributes = attributes;
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

        ProductVariantPatchImpl that = (ProductVariantPatchImpl) o;

        return new EqualsBuilder().append(productVariant, that.productVariant)
                .append(attributes, that.attributes)
                .append(staged, that.staged)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(productVariant).append(attributes).append(staged).toHashCode();
    }

}
