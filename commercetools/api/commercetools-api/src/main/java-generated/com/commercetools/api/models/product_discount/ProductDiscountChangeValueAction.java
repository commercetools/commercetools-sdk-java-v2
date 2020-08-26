package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.api.models.product_discount.ProductDiscountValueDraft;
import com.commercetools.api.models.product_discount.ProductDiscountChangeValueActionImpl;

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
@JsonDeserialize(as = ProductDiscountChangeValueActionImpl.class)
public interface ProductDiscountChangeValueAction extends ProductDiscountUpdateAction {

    
    @NotNull
    @Valid
    @JsonProperty("value")
    public ProductDiscountValueDraft getValue();

    public void setValue(final ProductDiscountValueDraft value);

    public static ProductDiscountChangeValueActionImpl of(){
        return new ProductDiscountChangeValueActionImpl();
    }
    

    public static ProductDiscountChangeValueActionImpl of(final ProductDiscountChangeValueAction template) {
        ProductDiscountChangeValueActionImpl instance = new ProductDiscountChangeValueActionImpl();
        instance.setValue(template.getValue());
        return instance;
    }

}
