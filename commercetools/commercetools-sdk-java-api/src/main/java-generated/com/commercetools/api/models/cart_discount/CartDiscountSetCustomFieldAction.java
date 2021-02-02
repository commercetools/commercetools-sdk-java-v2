
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetCustomFieldActionImpl.class)
public interface CartDiscountSetCustomFieldAction extends CartDiscountUpdateAction {

    String SET_CUSTOM_FIELD = "setCustomField";

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
    public Object getValue();

    public void setName(final String name);

    public void setValue(final Object value);

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
