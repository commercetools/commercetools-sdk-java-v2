
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreDeletedMessageImpl.class)
public interface StoreDeletedMessage extends Message {

    String STORE_DELETED = "StoreDeleted";

    public static StoreDeletedMessage of() {
        return new StoreDeletedMessageImpl();
    }

    public static StoreDeletedMessage of(final StoreDeletedMessage template) {
        StoreDeletedMessageImpl instance = new StoreDeletedMessageImpl();
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
        return instance;
    }

    public static StoreDeletedMessageBuilder builder() {
        return StoreDeletedMessageBuilder.of();
    }

    public static StoreDeletedMessageBuilder builder(final StoreDeletedMessage template) {
        return StoreDeletedMessageBuilder.of(template);
    }

    default <T> T withStoreDeletedMessage(Function<StoreDeletedMessage, T> helper) {
        return helper.apply(this);
    }
}
