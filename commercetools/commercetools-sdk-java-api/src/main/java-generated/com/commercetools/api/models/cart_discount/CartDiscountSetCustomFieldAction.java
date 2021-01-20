
package com.commercetools.api.models.cart_discount;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart_discount.CartDiscountSetCustomFieldActionImpl;
import com.commercetools.api.models.cart_discount.CartDiscountUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetCustomFieldActionImpl.class)
public interface CartDiscountSetCustomFieldAction extends CartDiscountUpdateAction {

    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists.
    *  Trying to remove a field that does not exist will fail with an <code>InvalidOperation</code> error.
    *  If <code>value</code> is provided, set the <code>value</code> of the field defined by the <code>name</code>.
    *  The FieldDefinition determines the format for the <code>value</code> to be provided.</p>
    */

    @JsonProperty("value")
    public JsonNode getValue();

    public void setName(final String name);

    public void setValue(final JsonNode value);

    public static CartDiscountSetCustomFieldAction of() {
        return new CartDiscountSetCustomFieldActionImpl();
    }

    public static CartDiscountSetCustomFieldAction of(final CartDiscountSetCustomFieldAction template) {
        CartDiscountSetCustomFieldActionImpl instance = new CartDiscountSetCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CartDiscountSetCustomFieldActionBuilder builder() {
        return CartDiscountSetCustomFieldActionBuilder.of();
    }

    public static CartDiscountSetCustomFieldActionBuilder builder(final CartDiscountSetCustomFieldAction template) {
        return CartDiscountSetCustomFieldActionBuilder.of(template);
    }

    default <T> T withCartDiscountSetCustomFieldAction(Function<CartDiscountSetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
