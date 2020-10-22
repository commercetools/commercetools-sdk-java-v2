package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountValue;
import com.commercetools.api.models.product_discount.ProductDiscountValueRelativeImpl;

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
@JsonDeserialize(as = ProductDiscountValueRelativeImpl.class)
public interface ProductDiscountValueRelative extends ProductDiscountValue {

    
    @NotNull
    @JsonProperty("permyriad")
    public Long getPermyriad();

    public void setPermyriad(final Long permyriad);

    public static ProductDiscountValueRelativeImpl of(){
        return new ProductDiscountValueRelativeImpl();
    }
    

    public static ProductDiscountValueRelativeImpl of(final ProductDiscountValueRelative template) {
        ProductDiscountValueRelativeImpl instance = new ProductDiscountValueRelativeImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

    default <T extends Accessor<ProductDiscountValueRelative>> T withProductDiscountValueRelative(Function<ProductDiscountValueRelative, T> helper) {
        return helper.apply(this);
    }
}
