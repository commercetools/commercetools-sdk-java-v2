
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>References a product discount by its key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountKeyReferenceImpl.class)
public interface ProductDiscountKeyReference extends KeyReference {

    String PRODUCT_DISCOUNT = "product-discount";

    public static ProductDiscountKeyReference of() {
        return new ProductDiscountKeyReferenceImpl();
    }

    public static ProductDiscountKeyReference of(final ProductDiscountKeyReference template) {
        ProductDiscountKeyReferenceImpl instance = new ProductDiscountKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductDiscountKeyReferenceBuilder builder() {
        return ProductDiscountKeyReferenceBuilder.of();
    }

    public static ProductDiscountKeyReferenceBuilder builder(final ProductDiscountKeyReference template) {
        return ProductDiscountKeyReferenceBuilder.of(template);
    }

    default <T> T withProductDiscountKeyReference(Function<ProductDiscountKeyReference, T> helper) {
        return helper.apply(this);
    }
}
