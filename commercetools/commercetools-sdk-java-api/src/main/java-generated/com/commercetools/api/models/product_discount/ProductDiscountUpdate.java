package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.api.models.product_discount.ProductDiscountUpdateImpl;

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
@JsonDeserialize(as = ProductDiscountUpdateImpl.class)
public interface ProductDiscountUpdate  {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ProductDiscountUpdateAction> getActions();

    public void setVersion(final Long version);
    
    public void setActions(final List<ProductDiscountUpdateAction> actions);

    public static ProductDiscountUpdateImpl of(){
        return new ProductDiscountUpdateImpl();
    }
    

    public static ProductDiscountUpdateImpl of(final ProductDiscountUpdate template) {
        ProductDiscountUpdateImpl instance = new ProductDiscountUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    default <T> T withProductDiscountUpdate(Function<ProductDiscountUpdate, T> helper) {
        return helper.apply(this);
    }
}
