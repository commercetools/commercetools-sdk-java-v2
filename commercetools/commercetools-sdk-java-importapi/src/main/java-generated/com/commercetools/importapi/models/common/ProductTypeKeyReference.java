
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>References a product type by key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeKeyReferenceImpl.class)
public interface ProductTypeKeyReference extends KeyReference {

    String PRODUCT_TYPE = "product-type";

    public static ProductTypeKeyReference of() {
        return new ProductTypeKeyReferenceImpl();
    }

    public static ProductTypeKeyReference of(final ProductTypeKeyReference template) {
        ProductTypeKeyReferenceImpl instance = new ProductTypeKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductTypeKeyReferenceBuilder builder() {
        return ProductTypeKeyReferenceBuilder.of();
    }

    public static ProductTypeKeyReferenceBuilder builder(final ProductTypeKeyReference template) {
        return ProductTypeKeyReferenceBuilder.of(template);
    }

    default <T> T withProductTypeKeyReference(Function<ProductTypeKeyReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeKeyReference>";
            }
        };
    }
}
