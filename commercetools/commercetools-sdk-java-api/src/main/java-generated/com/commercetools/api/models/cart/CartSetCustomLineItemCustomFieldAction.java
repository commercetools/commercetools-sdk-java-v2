
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartSetCustomLineItemCustomFieldActionImpl.class)
public interface CartSetCustomLineItemCustomFieldAction extends CartUpdateAction {

    String SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD = "setCustomLineItemCustomField";

    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setCustomLineItemId(final String customLineItemId);

    public void setName(final String name);

    public void setValue(final Object value);

    public static CartSetCustomLineItemCustomFieldAction of() {
        return new CartSetCustomLineItemCustomFieldActionImpl();
    }

    public static CartSetCustomLineItemCustomFieldAction of(final CartSetCustomLineItemCustomFieldAction template) {
        CartSetCustomLineItemCustomFieldActionImpl instance = new CartSetCustomLineItemCustomFieldActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CartSetCustomLineItemCustomFieldActionBuilder builder() {
        return CartSetCustomLineItemCustomFieldActionBuilder.of();
    }

    public static CartSetCustomLineItemCustomFieldActionBuilder builder(
            final CartSetCustomLineItemCustomFieldAction template) {
        return CartSetCustomLineItemCustomFieldActionBuilder.of(template);
    }

    default <T> T withCartSetCustomLineItemCustomFieldAction(
            Function<CartSetCustomLineItemCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
