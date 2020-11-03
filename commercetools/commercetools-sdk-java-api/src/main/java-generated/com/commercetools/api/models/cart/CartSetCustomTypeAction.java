package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.commercetools.api.models.cart.CartSetCustomTypeActionImpl;

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
@JsonDeserialize(as = CartSetCustomTypeActionImpl.class)
public interface CartSetCustomTypeAction extends CartUpdateAction {

    
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();
    
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);
    
    public void setFields(final FieldContainer fields);

    public static CartSetCustomTypeActionImpl of(){
        return new CartSetCustomTypeActionImpl();
    }
    

    public static CartSetCustomTypeActionImpl of(final CartSetCustomTypeAction template) {
        CartSetCustomTypeActionImpl instance = new CartSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    default <T> T withCartSetCustomTypeAction(Function<CartSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
