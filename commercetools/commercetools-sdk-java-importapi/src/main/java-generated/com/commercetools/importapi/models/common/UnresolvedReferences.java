
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = UnresolvedReferencesImpl.class)
public interface UnresolvedReferences {

    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>The type of the referenced resource.</p>
    */
    @NotNull
    @JsonProperty("typeId")
    public ReferenceType getTypeId();

    public void setKey(final String key);

    public void setTypeId(final ReferenceType typeId);

    public static UnresolvedReferences of() {
        return new UnresolvedReferencesImpl();
    }

    public static UnresolvedReferences of(final UnresolvedReferences template) {
        UnresolvedReferencesImpl instance = new UnresolvedReferencesImpl();
        instance.setKey(template.getKey());
        instance.setTypeId(template.getTypeId());
        return instance;
    }

    public static UnresolvedReferencesBuilder builder() {
        return UnresolvedReferencesBuilder.of();
    }

    public static UnresolvedReferencesBuilder builder(final UnresolvedReferences template) {
        return UnresolvedReferencesBuilder.of(template);
    }

    default <T> T withUnresolvedReferences(Function<UnresolvedReferences, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<UnresolvedReferences> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<UnresolvedReferences>() {
            @Override
            public String toString() {
                return "TypeReference<UnresolvedReferences>";
            }
        };
    }
}
