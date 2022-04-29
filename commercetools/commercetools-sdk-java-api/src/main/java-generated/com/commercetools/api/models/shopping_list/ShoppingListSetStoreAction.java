
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetStoreActionImpl.class)
public interface ShoppingListSetStoreAction extends ShoppingListUpdateAction {

    String SET_STORE = "setStore";

    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    public void setStore(final StoreResourceIdentifier store);

    public static ShoppingListSetStoreAction of() {
        return new ShoppingListSetStoreActionImpl();
    }

    public static ShoppingListSetStoreAction of(final ShoppingListSetStoreAction template) {
        ShoppingListSetStoreActionImpl instance = new ShoppingListSetStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public static ShoppingListSetStoreActionBuilder builder() {
        return ShoppingListSetStoreActionBuilder.of();
    }

    public static ShoppingListSetStoreActionBuilder builder(final ShoppingListSetStoreAction template) {
        return ShoppingListSetStoreActionBuilder.of(template);
    }

    default <T> T withShoppingListSetStoreAction(Function<ShoppingListSetStoreAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetStoreAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetStoreAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetStoreAction>";
            }
        };
    }
}
