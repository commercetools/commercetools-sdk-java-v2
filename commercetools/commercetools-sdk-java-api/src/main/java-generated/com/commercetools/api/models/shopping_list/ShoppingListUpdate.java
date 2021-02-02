
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListUpdateImpl.class)
public interface ShoppingListUpdate
        extends com.commercetools.api.models.ResourceUpdate<ShoppingListUpdate, ShoppingListUpdateAction> {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ShoppingListUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final ShoppingListUpdateAction... actions);

    public void setActions(final List<ShoppingListUpdateAction> actions);

    public static ShoppingListUpdate of() {
        return new ShoppingListUpdateImpl();
    }

    public static ShoppingListUpdate of(final ShoppingListUpdate template) {
        ShoppingListUpdateImpl instance = new ShoppingListUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static ShoppingListUpdateBuilder builder() {
        return ShoppingListUpdateBuilder.of();
    }

    public static ShoppingListUpdateBuilder builder(final ShoppingListUpdate template) {
        return ShoppingListUpdateBuilder.of(template);
    }

    default <T> T withShoppingListUpdate(Function<ShoppingListUpdate, T> helper) {
        return helper.apply(this);
    }
}
