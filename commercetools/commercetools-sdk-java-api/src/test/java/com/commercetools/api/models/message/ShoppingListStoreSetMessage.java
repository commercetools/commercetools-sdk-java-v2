package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.message.ShoppingListStoreSetMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShoppingListStoreSetMessageImpl.class)
public interface ShoppingListStoreSetMessage extends Message {

    String SHOPPING_LIST_STORE_SET = "ShoppingListStoreSet";

    
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    
    public void setStore(final StoreKeyReference store);
    

    public static ShoppingListStoreSetMessage of(){
        return new ShoppingListStoreSetMessageImpl();
    }
    

    public static ShoppingListStoreSetMessage of(final ShoppingListStoreSetMessage template) {
        ShoppingListStoreSetMessageImpl instance = new ShoppingListStoreSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setStore(template.getStore());
        return instance;
    }

    public static ShoppingListStoreSetMessageBuilder builder(){
        return ShoppingListStoreSetMessageBuilder.of();
    }
    
    public static ShoppingListStoreSetMessageBuilder builder(final ShoppingListStoreSetMessage template){
        return ShoppingListStoreSetMessageBuilder.of(template);
    }
    

    default <T> T withShoppingListStoreSetMessage(Function<ShoppingListStoreSetMessage, T> helper) {
        return helper.apply(this);
    }
}
