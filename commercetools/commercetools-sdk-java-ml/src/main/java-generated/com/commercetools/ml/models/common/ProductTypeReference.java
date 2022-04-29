
package com.commercetools.ml.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTypeReferenceImpl.class)
public interface ProductTypeReference extends Reference {

    String PRODUCT_TYPE = "product-type";

    public static ProductTypeReference of() {
        return new ProductTypeReferenceImpl();
    }

    public static ProductTypeReference of(final ProductTypeReference template) {
        ProductTypeReferenceImpl instance = new ProductTypeReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public static ProductTypeReferenceBuilder builder() {
        return ProductTypeReferenceBuilder.of();
    }

    public static ProductTypeReferenceBuilder builder(final ProductTypeReference template) {
        return ProductTypeReferenceBuilder.of(template);
    }

    default <T> T withProductTypeReference(Function<ProductTypeReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeReference>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeReference>";
            }
        };
    }
}
