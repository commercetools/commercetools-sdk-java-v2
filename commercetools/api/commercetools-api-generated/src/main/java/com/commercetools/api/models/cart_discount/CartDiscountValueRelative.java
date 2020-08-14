package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountValue;
import com.commercetools.api.models.cart_discount.CartDiscountValueRelativeImpl;

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
@JsonDeserialize(as = CartDiscountValueRelativeImpl.class)
public interface CartDiscountValueRelative extends CartDiscountValue {

    
    @NotNull
    @JsonProperty("permyriad")
    public Long getPermyriad();

    public void setPermyriad(final Long permyriad);

    public static CartDiscountValueRelativeImpl of(){
        return new CartDiscountValueRelativeImpl();
    }
    

    public static CartDiscountValueRelativeImpl of(final CartDiscountValueRelative template) {
        CartDiscountValueRelativeImpl instance = new CartDiscountValueRelativeImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

}
