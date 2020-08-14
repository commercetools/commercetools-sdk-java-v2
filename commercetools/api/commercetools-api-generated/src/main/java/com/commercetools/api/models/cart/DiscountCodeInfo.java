package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.DiscountCodeState;
import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.cart.DiscountCodeInfoImpl;

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
@JsonDeserialize(as = DiscountCodeInfoImpl.class)
public interface DiscountCodeInfo  {

    
    @NotNull
    @Valid
    @JsonProperty("discountCode")
    public DiscountCodeReference getDiscountCode();
    
    @NotNull
    @JsonProperty("state")
    public DiscountCodeState getState();

    public void setDiscountCode(final DiscountCodeReference discountCode);
    
    public void setState(final DiscountCodeState state);

    public static DiscountCodeInfoImpl of(){
        return new DiscountCodeInfoImpl();
    }
    

    public static DiscountCodeInfoImpl of(final DiscountCodeInfo template) {
        DiscountCodeInfoImpl instance = new DiscountCodeInfoImpl();
        instance.setDiscountCode(template.getDiscountCode());
        instance.setState(template.getState());
        return instance;
    }

}
