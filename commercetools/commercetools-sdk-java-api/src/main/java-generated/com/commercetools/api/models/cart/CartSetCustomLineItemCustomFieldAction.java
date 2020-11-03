package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.cart.CartSetCustomLineItemCustomFieldActionImpl;

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
@JsonDeserialize(as = CartSetCustomLineItemCustomFieldActionImpl.class)
public interface CartSetCustomLineItemCustomFieldAction extends CartUpdateAction {

    
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();
    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("value")
    public JsonNode getValue();

    public void setCustomLineItemId(final String customLineItemId);
    
    public void setName(final String name);
    
    public void setValue(final JsonNode value);

    public static CartSetCustomLineItemCustomFieldActionImpl of(){
        return new CartSetCustomLineItemCustomFieldActionImpl();
    }
    

    public static CartSetCustomLineItemCustomFieldActionImpl of(final CartSetCustomLineItemCustomFieldAction template) {
        CartSetCustomLineItemCustomFieldActionImpl instance = new CartSetCustomLineItemCustomFieldActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    default <T> T withCartSetCustomLineItemCustomFieldAction(Function<CartSetCustomLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
