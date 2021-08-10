
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreDeletedMessagePayloadImpl.class)
public interface StoreDeletedMessagePayload extends MessagePayload {

    String STORE_DELETED = "StoreDeleted";

    public static StoreDeletedMessagePayload of() {
        return new StoreDeletedMessagePayloadImpl();
    }

    public static StoreDeletedMessagePayload of(final StoreDeletedMessagePayload template) {
        StoreDeletedMessagePayloadImpl instance = new StoreDeletedMessagePayloadImpl();
        return instance;
    }

    public static StoreDeletedMessagePayloadBuilder builder() {
        return StoreDeletedMessagePayloadBuilder.of();
    }

    public static StoreDeletedMessagePayloadBuilder builder(final StoreDeletedMessagePayload template) {
        return StoreDeletedMessagePayloadBuilder.of(template);
    }

    default <T> T withStoreDeletedMessagePayload(Function<StoreDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
