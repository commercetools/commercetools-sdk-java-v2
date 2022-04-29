
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetCustomTypeActionImpl.class)
public interface CartDiscountSetCustomTypeAction extends CartDiscountUpdateAction {

    String SET_CUSTOM_TYPE = "setCustomType";

    /**
    *  <p>Defines the <a href="ctp:api:type:Type">Type</a> that extends the CartDiscount with <a href="/../api/projects/custom-fields">Custom Fields</a>.
    *  If absent, any existing Type and Custom Fields are removed from the CartDiscount.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>Sets the <a href="/../api/projects/custom-fields">Custom Fields</a> fields for the CartDiscount.</p>
    */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

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

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountSetCustomTypeAction>";
            }
        };
    }
}
