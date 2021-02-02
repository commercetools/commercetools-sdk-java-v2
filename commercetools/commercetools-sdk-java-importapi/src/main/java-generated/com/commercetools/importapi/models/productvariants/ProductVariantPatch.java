
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
*  <p>Import representation for an update to a product variant. Use this type for importing updates to existing
*  product variants into a commercetools project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductVariantPatchImpl.class)
public interface ProductVariantPatch {

    /**
    *  <p>The product variant to which this patch is applied.</p>
    *  <p>The product variant referenced
    *  must already exist in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("productVariant")
    public ProductVariantKeyReference getProductVariant();

    /**
    *  <p>Maps to <code>ProductVariant.attributes</code>.</p>
    *  <p>Each attribute referenced must be defined
    *  in an already existing product type in the commercetools project, or the import
    *  operation state is set to <code>ValidationFailed</code>.</p>
    */
    @Valid
    @JsonProperty("attributes")
    public Attributes getAttributes();

    public void setProductVariant(final ProductVariantKeyReference productVariant);

    public void setAttributes(final Attributes attributes);

    public static ProductVariantPatch of() {
        return new ProductVariantPatchImpl();
    }

    public static ProductVariantPatch of(final ProductVariantPatch template) {
        ProductVariantPatchImpl instance = new ProductVariantPatchImpl();
        instance.setProductVariant(template.getProductVariant());
        instance.setAttributes(template.getAttributes());
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
}
