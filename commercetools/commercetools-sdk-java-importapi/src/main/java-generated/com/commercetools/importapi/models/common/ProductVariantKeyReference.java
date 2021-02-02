
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>References a product variant by its key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductVariantKeyReferenceImpl.class)
public interface ProductVariantKeyReference extends KeyReference {

    String PRODUCT_VARIANT = "product-variant";

    public static ProductVariantKeyReference of() {
        return new ProductVariantKeyReferenceImpl();
    }

    public static ProductVariantKeyReference of(final ProductVariantKeyReference template) {
        ProductVariantKeyReferenceImpl instance = new ProductVariantKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductVariantKeyReferenceBuilder builder() {
        return ProductVariantKeyReferenceBuilder.of();
    }

    public static ProductVariantKeyReferenceBuilder builder(final ProductVariantKeyReference template) {
        return ProductVariantKeyReferenceBuilder.of(template);
    }

    default <T> T withProductVariantKeyReference(Function<ProductVariantKeyReference, T> helper) {
        return helper.apply(this);
    }
}
