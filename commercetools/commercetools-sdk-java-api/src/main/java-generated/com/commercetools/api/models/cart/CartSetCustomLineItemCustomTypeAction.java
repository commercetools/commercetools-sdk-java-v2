
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
@JsonDeserialize(as = CartSetCustomLineItemCustomTypeActionImpl.class)
public interface CartSetCustomLineItemCustomTypeAction extends CartUpdateAction {

    String SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE = "setCustomLineItemCustomType";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the CustomLineItem with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the CustomLineItem.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the CustomLineItem.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setCustomLineItemId(final String customLineItemId);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

    public static CartSetCustomLineItemCustomTypeAction of() {
        return new CartSetCustomLineItemCustomTypeActionImpl();
    }

    public static CartSetCustomLineItemCustomTypeAction of(final CartSetCustomLineItemCustomTypeAction template) {
        CartSetCustomLineItemCustomTypeActionImpl instance = new CartSetCustomLineItemCustomTypeActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CartSetCustomLineItemCustomTypeActionBuilder builder() {
        return CartSetCustomLineItemCustomTypeActionBuilder.of();
    }

    public static CartSetCustomLineItemCustomTypeActionBuilder builder(
            final CartSetCustomLineItemCustomTypeAction template) {
        return CartSetCustomLineItemCustomTypeActionBuilder.of(template);
    }

    default <T> T withCartSetCustomLineItemCustomTypeAction(Function<CartSetCustomLineItemCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCustomLineItemCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCustomLineItemCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCustomLineItemCustomTypeAction>";
            }
        };
    }
}
