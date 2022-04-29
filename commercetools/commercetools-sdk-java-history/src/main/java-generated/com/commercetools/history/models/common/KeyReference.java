
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = KeyReferenceImpl.class)
public interface KeyReference {

    @NotNull
    @JsonProperty("key")
    public String getKey();

    @NotNull
    @JsonProperty("typeId")
    public ReferenceTypeId getTypeId();

    public void setKey(final String key);

    public void setTypeId(final ReferenceTypeId typeId);

    public static KeyReference of() {
        return new KeyReferenceImpl();
    }

    public static KeyReference of(final KeyReference template) {
        KeyReferenceImpl instance = new KeyReferenceImpl();
        instance.setKey(template.getKey());
        instance.setTypeId(template.getTypeId());
        return instance;
    }

    public static KeyReferenceBuilder builder() {
        return KeyReferenceBuilder.of();
    }

    public static KeyReferenceBuilder builder(final KeyReference template) {
        return KeyReferenceBuilder.of(template);
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
