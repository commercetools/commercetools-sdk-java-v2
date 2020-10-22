package com.commercetools.api.models.message;

import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.message.OrderStoreSetMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderStoreSetMessageImpl.class)
public interface OrderStoreSetMessage extends Message {

    
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    public void setStore(final StoreKeyReference store);

    public static OrderStoreSetMessageImpl of(){
        return new OrderStoreSetMessageImpl();
    }
    

    public static OrderStoreSetMessageImpl of(final OrderStoreSetMessage template) {
        OrderStoreSetMessageImpl instance = new OrderStoreSetMessageImpl();
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

    default <T extends Accessor<OrderStoreSetMessage>> T withOrderStoreSetMessage(Function<OrderStoreSetMessage, T> helper) {
        return helper.apply(this);
    }
}
