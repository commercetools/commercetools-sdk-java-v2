
package com.commercetools.api.models.product_discount;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.product_discount.ProductDiscount;
import com.commercetools.api.models.product_discount.ProductDiscountReferenceImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountReferenceImpl.class)
public interface ProductDiscountReference extends Reference {

    String PRODUCT_DISCOUNT = "product-discount";

    @Valid
    @JsonProperty("obj")
    public ProductDiscount getObj();

    public void setObj(final ProductDiscount obj);

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
}
