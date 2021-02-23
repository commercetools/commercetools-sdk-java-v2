
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListStoreSetMessagePayloadImpl.class)
public interface ShoppingListStoreSetMessagePayload extends MessagePayload {

    String SHOPPING_LIST_STORE_SET = "ShoppingListStoreSet";

    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    public void setStore(final StoreKeyReference store);

    public static ShoppingListStoreSetMessagePayload of() {
        return new ShoppingListStoreSetMessagePayloadImpl();
    }

    public static ShoppingListStoreSetMessagePayload of(final ShoppingListStoreSetMessagePayload template) {
        ShoppingListStoreSetMessagePayloadImpl instance = new ShoppingListStoreSetMessagePayloadImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public static ShoppingListStoreSetMessagePayloadBuilder builder() {
        return ShoppingListStoreSetMessagePayloadBuilder.of();
    }

    public static ShoppingListStoreSetMessagePayloadBuilder builder(final ShoppingListStoreSetMessagePayload template) {
        return ShoppingListStoreSetMessagePayloadBuilder.of(template);
    }

    default <T> T withShoppingListStoreSetMessagePayload(Function<ShoppingListStoreSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
