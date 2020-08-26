package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.ExternalTaxAmountDraft;
import com.commercetools.api.models.cart.CartSetLineItemTaxAmountActionImpl;

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
@JsonDeserialize(as = CartSetLineItemTaxAmountActionImpl.class)
public interface CartSetLineItemTaxAmountAction extends CartUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @Valid
    @JsonProperty("externalTaxAmount")
    public ExternalTaxAmountDraft getExternalTaxAmount();

    public void setLineItemId(final String lineItemId);
    
    public void setExternalTaxAmount(final ExternalTaxAmountDraft externalTaxAmount);

    public static CartSetLineItemTaxAmountActionImpl of(){
        return new CartSetLineItemTaxAmountActionImpl();
    }
    

    public static CartSetLineItemTaxAmountActionImpl of(final CartSetLineItemTaxAmountAction template) {
        CartSetLineItemTaxAmountActionImpl instance = new CartSetLineItemTaxAmountActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setExternalTaxAmount(template.getExternalTaxAmount());
        return instance;
    }

}
