
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetLineItemCustomTypeActionImpl.class)
public interface CartSetLineItemCustomTypeAction extends CartUpdateAction {

    String SET_LINE_ITEM_CUSTOM_TYPE = "setLineItemCustomType";

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

    public static CartSetLineItemCustomTypeAction of() {
        return new CartSetLineItemCustomTypeActionImpl();
    }

    public static CartSetLineItemCustomTypeAction of(final CartSetLineItemCustomTypeAction template) {
        CartSetLineItemCustomTypeActionImpl instance = new CartSetLineItemCustomTypeActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CartSetLineItemCustomTypeActionBuilder builder() {
        return CartSetLineItemCustomTypeActionBuilder.of();
    }

    public static CartSetLineItemCustomTypeActionBuilder builder(final CartSetLineItemCustomTypeAction template) {
        return CartSetLineItemCustomTypeActionBuilder.of(template);
    }

    default <T> T withCartSetLineItemCustomTypeAction(Function<CartSetLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
