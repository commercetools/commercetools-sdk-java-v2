
package com.commercetools.importapi.models.productvariants;

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
*  <p>Representation for an update of a <a href="/../api/projects/products#productvariant">ProductVariant</a>. Use this type to import updates for existing
*  <a href="/../api/projects/products#productvariant">ProductVariants</a> in a commercetools Project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductVariantPatchImpl implements ProductVariantPatch, ModelBase {

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
    *  <p>The <a href="/../api/projects/products#productvariant">ProductVariant</a> to which this patch is applied.
    *  The Reference to the <a href="/../api/projects/products#productvariant">ProductVariant</a> with which the ProductVariantPatch is associated.
    *  If referenced ProductVariant does not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>unresolved</code> until the necessary ProductVariant is created.</p>
    */
    public com.commercetools.importapi.models.common.ProductVariantKeyReference getProductVariant() {
        return this.productVariant;
    }

    /**
    *  <p>Maps to <code>ProductVariant.attributes</code>.
    *  The referenced attribute must be defined in an already existing <a href="/../api/projects/productTypes#producttype">ProductType</a> in the commercetools Project, or the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be <code>unresolved</code>.</p>
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
