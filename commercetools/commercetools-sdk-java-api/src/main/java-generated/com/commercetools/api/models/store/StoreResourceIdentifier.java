
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreResourceIdentifierImpl.class)
public interface StoreResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Store> {

    String STORE = "store";

    public static StoreResourceIdentifier of() {
        return new StoreResourceIdentifierImpl();
    }

    public static StoreResourceIdentifier of(final StoreResourceIdentifier template) {
        StoreResourceIdentifierImpl instance = new StoreResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static StoreResourceIdentifierBuilder builder() {
        return StoreResourceIdentifierBuilder.of();
    }

    public static StoreResourceIdentifierBuilder builder(final StoreResourceIdentifier template) {
        return StoreResourceIdentifierBuilder.of(template);
    }

    default <T> T withStoreResourceIdentifier(Function<StoreResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<StoreResourceIdentifier>";
            }
        };
    }
}
