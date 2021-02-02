
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetLineItemCustomFieldActionImpl.class)
public interface CartSetLineItemCustomFieldAction extends CartUpdateAction {

    String SET_LINE_ITEM_CUSTOM_FIELD = "setLineItemCustomField";

    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setLineItemId(final String lineItemId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static CartSetLineItemCustomFieldAction of() {
        return new CartSetLineItemCustomFieldActionImpl();
    }

    public static CartSetLineItemCustomFieldAction of(final CartSetLineItemCustomFieldAction template) {
        CartSetLineItemCustomFieldActionImpl instance = new CartSetLineItemCustomFieldActionImpl();
        instance.setLineItemId(template.getLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CartSetLineItemCustomFieldActionBuilder builder() {
        return CartSetLineItemCustomFieldActionBuilder.of();
    }

    public static CartSetLineItemCustomFieldActionBuilder builder(final CartSetLineItemCustomFieldAction template) {
        return CartSetLineItemCustomFieldActionBuilder.of(template);
    }

    default <T> T withCartSetLineItemCustomFieldAction(Function<CartSetLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
