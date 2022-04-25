
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.ProductVariantKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Representation for an update of a <a href="/../api/projects/products#productvariant">ProductVariant</a>. Use this type to import updates for existing
*  <a href="/../api/projects/products#productvariant">ProductVariants</a> in a commercetools Project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductVariantPatchImpl.class)
public interface ProductVariantPatch {

    /**
    *  <p>The <a href="/../api/projects/products#productvariant">ProductVariant</a> to which this patch is applied.
    *  The Reference to the <a href="/../api/projects/products#productvariant">ProductVariant</a> with which the ProductVariantPatch is associated.
    *  If referenced ProductVariant does not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>unresolved</code> until the necessary ProductVariant is created.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("productVariant")
    public ProductVariantKeyReference getProductVariant();

    /**
    *  <p>Maps to <code>ProductVariant.attributes</code>.
    *  The referenced attribute must be defined in an already existing <a href="/../api/projects/productTypes#producttype">ProductType</a> in the commercetools Project, or the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be <code>unresolved</code>.</p>
    */
    @Valid
    @JsonProperty("attributes")
    public Attributes getAttributes();

    /**
    *  <p>If <code>false</code>, the attribute changes are applied to both <a href="/../api/projects/productProjections#current--staged">current and staged projected representations</a> of the <a href="/../api/projects/products#product">Product</a>.</p>
    */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setProductVariant(final ProductVariantKeyReference productVariant);

    public void setAttributes(final Attributes attributes);

    public void setStaged(final Boolean staged);

    public static ProductVariantPatch of() {
        return new ProductVariantPatchImpl();
    }

    public static ProductVariantPatch of(final ProductVariantPatch template) {
        ProductVariantPatchImpl instance = new ProductVariantPatchImpl();
        instance.setProductVariant(template.getProductVariant());
        instance.setAttributes(template.getAttributes());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductVariantPatchBuilder builder() {
        return ProductVariantPatchBuilder.of();
    }

    public static ProductVariantPatchBuilder builder(final ProductVariantPatch template) {
        return ProductVariantPatchBuilder.of(template);
    }

    default <T> T withProductVariantPatch(Function<ProductVariantPatch, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantPatch> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantPatch>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantPatch>";
            }
        };
    }
}
