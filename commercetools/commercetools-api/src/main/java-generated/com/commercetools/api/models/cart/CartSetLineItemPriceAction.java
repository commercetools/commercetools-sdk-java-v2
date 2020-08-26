package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart.CartSetLineItemPriceActionImpl;

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
@JsonDeserialize(as = CartSetLineItemPriceActionImpl.class)
public interface CartSetLineItemPriceAction extends CartUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @Valid
    @JsonProperty("externalPrice")
    public Money getExternalPrice();

    public void setLineItemId(final String lineItemId);
    
    public void setExternalPrice(final Money externalPrice);

    public static CartSetLineItemPriceActionImpl of(){
        return new CartSetLineItemPriceActionImpl();
    }
    

    public static CartSetLineItemPriceActionImpl of(final CartSetLineItemPriceAction template) {
        CartSetLineItemPriceActionImpl instance = new CartSetLineItemPriceActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalPrice(template.getExternalPrice());
        return instance;
    }

}
