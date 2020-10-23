package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.product_discount.ProductDiscount;
import com.commercetools.api.models.product_discount.ProductDiscountReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductDiscountReferenceImpl.class)
public interface ProductDiscountReference extends Reference {

    
    @Valid
    @JsonProperty("obj")
    public ProductDiscount getObj();

    public void setObj(final ProductDiscount obj);

    public static ProductDiscountReferenceImpl of(){
        return new ProductDiscountReferenceImpl();
    }
    

    public static ProductDiscountReferenceImpl of(final ProductDiscountReference template) {
        ProductDiscountReferenceImpl instance = new ProductDiscountReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    default <T> T withProductDiscountReference(Function<ProductDiscountReference, T> helper) {
        return helper.apply(this);
    }
}
