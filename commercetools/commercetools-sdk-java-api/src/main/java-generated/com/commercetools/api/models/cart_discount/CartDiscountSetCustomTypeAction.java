package com.commercetools.api.models.cart_discount;

import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.cart_discount.CartDiscountSetCustomTypeActionImpl;

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
@JsonDeserialize(as = CartDiscountSetCustomTypeActionImpl.class)
public interface CartDiscountSetCustomTypeAction extends CartDiscountUpdateAction {

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
    public JsonNode getFields();

    public void setType(final TypeResourceIdentifier type);
    
    public void setFields(final JsonNode fields);

    public static CartDiscountSetCustomTypeActionImpl of(){
        return new CartDiscountSetCustomTypeActionImpl();
    }
    

    public static CartDiscountSetCustomTypeActionImpl of(final CartDiscountSetCustomTypeAction template) {
        CartDiscountSetCustomTypeActionImpl instance = new CartDiscountSetCustomTypeActionImpl();
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    default <T extends Accessor<CartDiscountSetCustomTypeAction>> T withCartDiscountSetCustomTypeAction(Function<CartDiscountSetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
