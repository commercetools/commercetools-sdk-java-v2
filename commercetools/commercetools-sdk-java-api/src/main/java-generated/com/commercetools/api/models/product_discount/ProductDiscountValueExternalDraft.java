package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountValueDraft;
import com.commercetools.api.models.product_discount.ProductDiscountValueExternalDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductDiscountValueExternalDraftImpl.class)
public interface ProductDiscountValueExternalDraft extends ProductDiscountValueDraft {



    public static ProductDiscountValueExternalDraft of(){
        return new ProductDiscountValueExternalDraftImpl();
    }
    

    public static ProductDiscountValueExternalDraft of(final ProductDiscountValueExternalDraft template) {
        ProductDiscountValueExternalDraftImpl instance = new ProductDiscountValueExternalDraftImpl();
        return instance;
    }

    public static ProductDiscountValueExternalDraftBuilder builder(){
        return ProductDiscountValueExternalDraftBuilder.of();
    }
    
    public static ProductDiscountValueExternalDraftBuilder builder(final ProductDiscountValueExternalDraft template){
        return ProductDiscountValueExternalDraftBuilder.of(template);
    }
    

    default <T> T withProductDiscountValueExternalDraft(Function<ProductDiscountValueExternalDraft, T> helper) {
        return helper.apply(this);
    }
}
