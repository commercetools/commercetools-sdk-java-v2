
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Discounts the Product Price by allowing the client to explicitly <a href="/../api/projects/products#set-discounted-embedded-price">set a discounted value</a>.
*  Use this when setting discounts using an external service.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountValueExternalDraftImpl.class)
public interface ProductDiscountValueExternalDraft extends ProductDiscountValueDraft {

    String EXTERNAL = "external";

    public static ProductDiscountValueExternalDraft of() {
        return new ProductDiscountValueExternalDraftImpl();
    }

    public static ProductDiscountValueExternalDraft of(final ProductDiscountValueExternalDraft template) {
        ProductDiscountValueExternalDraftImpl instance = new ProductDiscountValueExternalDraftImpl();
        return instance;
    }

    public static ProductDiscountValueExternalDraftBuilder builder() {
        return ProductDiscountValueExternalDraftBuilder.of();
    }

    public static ProductDiscountValueExternalDraftBuilder builder(final ProductDiscountValueExternalDraft template) {
        return ProductDiscountValueExternalDraftBuilder.of(template);
    }

    default <T> T withProductDiscountValueExternalDraft(Function<ProductDiscountValueExternalDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueExternalDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueExternalDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountValueExternalDraft>";
            }
        };
    }
}
