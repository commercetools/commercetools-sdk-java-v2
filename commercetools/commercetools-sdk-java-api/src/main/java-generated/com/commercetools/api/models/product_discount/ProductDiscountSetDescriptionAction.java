package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.api.models.product_discount.ProductDiscountSetDescriptionActionImpl;

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
@JsonDeserialize(as = ProductDiscountSetDescriptionActionImpl.class)
public interface ProductDiscountSetDescriptionAction extends ProductDiscountUpdateAction {

    String SET_DESCRIPTION = "setDescription";

    
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    
    public void setDescription(final LocalizedString description);
    

    public static ProductDiscountSetDescriptionAction of(){
        return new ProductDiscountSetDescriptionActionImpl();
    }
    

    public static ProductDiscountSetDescriptionAction of(final ProductDiscountSetDescriptionAction template) {
        ProductDiscountSetDescriptionActionImpl instance = new ProductDiscountSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static ProductDiscountSetDescriptionActionBuilder builder(){
        return ProductDiscountSetDescriptionActionBuilder.of();
    }
    
    public static ProductDiscountSetDescriptionActionBuilder builder(final ProductDiscountSetDescriptionAction template){
        return ProductDiscountSetDescriptionActionBuilder.of(template);
    }
    

    default <T> T withProductDiscountSetDescriptionAction(Function<ProductDiscountSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
}
