package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartAddDiscountCodeActionImpl;

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
@JsonDeserialize(as = CartAddDiscountCodeActionImpl.class)
public interface CartAddDiscountCodeAction extends CartUpdateAction {

    
    @NotNull
    @JsonProperty("code")
    public String getCode();

    public void setCode(final String code);

    public static CartAddDiscountCodeActionImpl of(){
        return new CartAddDiscountCodeActionImpl();
    }
    

    public static CartAddDiscountCodeActionImpl of(final CartAddDiscountCodeAction template) {
        CartAddDiscountCodeActionImpl instance = new CartAddDiscountCodeActionImpl();
        instance.setCode(template.getCode());
        return instance;
    }

    default <T extends Accessor<CartAddDiscountCodeAction>> T withCartAddDiscountCodeAction(Function<CartAddDiscountCodeAction, T> helper) {
        return helper.apply(this);
    }
}
