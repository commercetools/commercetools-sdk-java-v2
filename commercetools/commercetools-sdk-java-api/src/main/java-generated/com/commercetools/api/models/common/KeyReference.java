
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A KeyReference represents a loose reference to another resource in the same commercetools Project identified by the resource's <code>key</code> field. If available, the <code>key</code> is immutable and mandatory. KeyReferences do not support <a href="/general-concepts#reference-expansion">Reference Expansion</a>.</p>
*/
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.store.StoreKeyReferenceImpl.class, name = StoreKeyReference.STORE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "typeId", defaultImpl = KeyReferenceImpl.class, visible = true)
@JsonDeserialize(as = KeyReferenceImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface KeyReference {

    /**
    *  <p>Type of referenced resource.</p>
    */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    /**
    *  <p>User-defined unique and immutable key of the referenced resource.</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static com.commercetools.api.models.store.StoreKeyReferenceBuilder storeBuilder() {
        return com.commercetools.api.models.store.StoreKeyReferenceBuilder.of();
    }

    default <T> T withKeyReference(Function<KeyReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<KeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<KeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<KeyReference>";
            }
        };
    }
}
