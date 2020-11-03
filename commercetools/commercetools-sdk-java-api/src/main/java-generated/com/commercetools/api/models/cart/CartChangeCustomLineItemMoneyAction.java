package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart.CartChangeCustomLineItemMoneyActionImpl;

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
@JsonDeserialize(as = CartChangeCustomLineItemMoneyActionImpl.class)
public interface CartChangeCustomLineItemMoneyAction extends CartUpdateAction {

    
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();
    
    @NotNull
    @Valid
    @JsonProperty("money")
    public Money getMoney();

    public void setCustomLineItemId(final String customLineItemId);
    
    public void setMoney(final Money money);

    public static CartChangeCustomLineItemMoneyActionImpl of(){
        return new CartChangeCustomLineItemMoneyActionImpl();
    }
    

    public static CartChangeCustomLineItemMoneyActionImpl of(final CartChangeCustomLineItemMoneyAction template) {
        CartChangeCustomLineItemMoneyActionImpl instance = new CartChangeCustomLineItemMoneyActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setMoney(template.getMoney());
        return instance;
    }

    default <T> T withCartChangeCustomLineItemMoneyAction(Function<CartChangeCustomLineItemMoneyAction, T> helper) {
        return helper.apply(this);
    }
}
