
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListLineItemValueImpl.class)
public interface ShoppingListLineItemValue {

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    public void setId(final String id);

    public void setName(final LocalizedString name);

    public void setVariantId(final Integer variantId);

    public static ShoppingListLineItemValue of() {
        return new ShoppingListLineItemValueImpl();
    }

    public static ShoppingListLineItemValue of(final ShoppingListLineItemValue template) {
        ShoppingListLineItemValueImpl instance = new ShoppingListLineItemValueImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setVariantId(template.getVariantId());
        return instance;
    }

    public static ShoppingListLineItemValueBuilder builder() {
        return ShoppingListLineItemValueBuilder.of();
    }

    public static ShoppingListLineItemValueBuilder builder(final ShoppingListLineItemValue template) {
        return ShoppingListLineItemValueBuilder.of(template);
    }

    default <T> T withShoppingListLineItemValue(Function<ShoppingListLineItemValue, T> helper) {
        return helper.apply(this);
    }
}
