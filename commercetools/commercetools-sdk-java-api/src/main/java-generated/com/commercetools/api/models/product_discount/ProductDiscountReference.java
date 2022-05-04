
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:ProductDiscount">ProductDiscount</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountReferenceImpl.class)
public interface ProductDiscountReference
        extends Reference, com.commercetools.api.models.Identifiable<ProductDiscount> {

    String PRODUCT_DISCOUNT = "product-discount";

    /**
    *  <p>Contains the representation of the expanded ProductDiscount. Only present in responses to requests with <a href="/../api/general-concepts#reference-expansion">Reference Expansion</a> for ProductDiscounts.</p>
    */
    @Valid
    @JsonProperty("obj")
    public ProductDiscount getObj();

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:ProductDiscount">ProductDiscount</a>.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final ProductDiscount obj);

    public void setId(final String id);

    public static ProductDiscountReference of() {
        return new ProductDiscountReferenceImpl();
    }

    public static ProductDiscountReference of(final ProductDiscountReference template) {
        ProductDiscountReferenceImpl instance = new ProductDiscountReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static ProductDiscountReferenceBuilder builder() {
        return ProductDiscountReferenceBuilder.of();
    }

    public static ProductDiscountReferenceBuilder builder(final ProductDiscountReference template) {
        return ProductDiscountReferenceBuilder.of(template);
    }

    default <T> T withProductDiscountReference(Function<ProductDiscountReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountReference>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountReference>";
            }
        };
    }
}
