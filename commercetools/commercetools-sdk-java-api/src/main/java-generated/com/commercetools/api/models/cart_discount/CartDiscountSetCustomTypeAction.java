
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetCustomTypeActionImpl.class)
public interface CartDiscountSetCustomTypeAction extends CartDiscountUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
    *  <p>If absent, the custom type and any existing CustomFields are removed.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>A valid JSON object, based on the FieldDefinitions of the Type.
    *  Sets the custom fields to this value.</p>
    */
    @Valid
    @JsonProperty("fields")
    public Object getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final Object fields);

    public static CartDiscountSetCustomTypeAction of() {
        return new CartDiscountSetCustomTypeActionImpl();
    }

    public static CartDiscountSetCustomTypeAction of(final CartDiscountSetCustomTypeAction template) {
        CartDiscountSetCustomTypeActionImpl instance = new CartDiscountSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CartDiscountSetCustomTypeActionBuilder builder() {
        return CartDiscountSetCustomTypeActionBuilder.of();
    }

    public static CartDiscountSetCustomTypeActionBuilder builder(final CartDiscountSetCustomTypeAction template) {
        return CartDiscountSetCustomTypeActionBuilder.of(template);
    }

    default <T> T withCartDiscountSetCustomTypeAction(Function<CartDiscountSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
