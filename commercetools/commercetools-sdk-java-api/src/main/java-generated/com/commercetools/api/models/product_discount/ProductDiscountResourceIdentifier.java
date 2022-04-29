
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountResourceIdentifierImpl.class)
public interface ProductDiscountResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<ProductDiscount> {

    String PRODUCT_DISCOUNT = "product-discount";

    public static ProductDiscountResourceIdentifier of() {
        return new ProductDiscountResourceIdentifierImpl();
    }

    public static ProductDiscountResourceIdentifier of(final ProductDiscountResourceIdentifier template) {
        ProductDiscountResourceIdentifierImpl instance = new ProductDiscountResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static ProductDiscountResourceIdentifierBuilder builder() {
        return ProductDiscountResourceIdentifierBuilder.of();
    }

    public static ProductDiscountResourceIdentifierBuilder builder(final ProductDiscountResourceIdentifier template) {
        return ProductDiscountResourceIdentifierBuilder.of(template);
    }

    default <T> T withProductDiscountResourceIdentifier(Function<ProductDiscountResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountResourceIdentifier>";
            }
        };
    }
}
