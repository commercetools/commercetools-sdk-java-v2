package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountValue;
import com.commercetools.api.models.product_discount.ProductDiscountValueExternalImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductDiscountValueExternalImpl.class)
public interface ProductDiscountValueExternal extends ProductDiscountValue {



    public static ProductDiscountValueExternalImpl of(){
        return new ProductDiscountValueExternalImpl();
    }
    

    public static ProductDiscountValueExternalImpl of(final ProductDiscountValueExternal template) {
        ProductDiscountValueExternalImpl instance = new ProductDiscountValueExternalImpl();
        return instance;
    }

}
