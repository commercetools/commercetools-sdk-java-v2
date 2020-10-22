package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.cart.CartSetLineItemCustomTypeActionImpl;

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
@JsonDeserialize(as = CartSetLineItemCustomTypeActionImpl.class)
public interface CartSetLineItemCustomTypeAction extends CartUpdateAction {

    
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();
    
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();
    
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setLineItemId(final String lineItemId);
    
    public void setType(final TypeResourceIdentifier type);
    
    public void setFields(final FieldContainer fields);

    public static CartSetLineItemCustomTypeActionImpl of(){
        return new CartSetLineItemCustomTypeActionImpl();
    }
    

    public static CartSetLineItemCustomTypeActionImpl of(final CartSetLineItemCustomTypeAction template) {
        CartSetLineItemCustomTypeActionImpl instance = new CartSetLineItemCustomTypeActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    default <T extends Accessor<CartSetLineItemCustomTypeAction>> T withCartSetLineItemCustomTypeAction(Function<CartSetLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
