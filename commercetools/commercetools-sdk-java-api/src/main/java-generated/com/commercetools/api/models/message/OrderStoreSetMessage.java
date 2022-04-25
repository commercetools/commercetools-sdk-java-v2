
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
@JsonDeserialize(as = OrderStoreSetMessageImpl.class)
public interface OrderStoreSetMessage extends OrderMessage {

    String ORDER_STORE_SET = "OrderStoreSet";

    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    public void setStore(final StoreKeyReference store);

    public static OrderStoreSetMessage of() {
        return new OrderStoreSetMessageImpl();
    }

    public static OrderStoreSetMessage of(final OrderStoreSetMessage template) {
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

    public static OrderStoreSetMessageBuilder builder() {
        return OrderStoreSetMessageBuilder.of();
    }

    public static OrderStoreSetMessageBuilder builder(final OrderStoreSetMessage template) {
        return OrderStoreSetMessageBuilder.of(template);
    }

    default <T> T withOrderStoreSetMessage(Function<OrderStoreSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderStoreSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderStoreSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<OrderStoreSetMessage>";
            }
        };
    }
}
