
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.KeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreKeyReferenceImpl.class)
public interface StoreKeyReference extends KeyReference {

    String STORE = "store";

    public static StoreKeyReference of() {
        return new StoreKeyReferenceImpl();
    }

    public static StoreKeyReference of(final StoreKeyReference template) {
        StoreKeyReferenceImpl instance = new StoreKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static StoreKeyReferenceBuilder builder() {
        return StoreKeyReferenceBuilder.of();
    }

    public static StoreKeyReferenceBuilder builder(final StoreKeyReference template) {
        return StoreKeyReferenceBuilder.of(template);
    }

    default <T> T withStoreKeyReference(Function<StoreKeyReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StoreKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StoreKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<StoreKeyReference>";
            }
        };
    }
}
