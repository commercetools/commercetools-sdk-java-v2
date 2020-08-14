package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.message.OrderStoreSetMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderStoreSetMessagePayloadImpl.class)
public interface OrderStoreSetMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    public void setStore(final StoreKeyReference store);

    public static OrderStoreSetMessagePayloadImpl of(){
        return new OrderStoreSetMessagePayloadImpl();
    }
    

    public static OrderStoreSetMessagePayloadImpl of(final OrderStoreSetMessagePayload template) {
        OrderStoreSetMessagePayloadImpl instance = new OrderStoreSetMessagePayloadImpl();
        instance.setStore(template.getStore());
        return instance;
    }

}
