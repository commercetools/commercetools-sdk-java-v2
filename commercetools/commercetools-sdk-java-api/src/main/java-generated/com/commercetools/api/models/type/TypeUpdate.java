
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeUpdateImpl.class)
public interface TypeUpdate
        extends com.commercetools.api.models.ResourceUpdate<TypeUpdate, TypeUpdateAction, TypeUpdateBuilder> {

    /**
    *  <p>Expected version of the type on which the changes should be applied.
    *  If the expected version does not match the actual version, a 409 Conflict will be returned.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>Update actions to be performed on the Type.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<TypeUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final TypeUpdateAction... actions);

    public void setActions(final List<TypeUpdateAction> actions);

    public static TypeUpdate of() {
        return new TypeUpdateImpl();
    }

    public static TypeUpdate of(final TypeUpdate template) {
        TypeUpdateImpl instance = new TypeUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static TypeUpdateBuilder builder() {
        return TypeUpdateBuilder.of();
    }

    public static TypeUpdateBuilder builder(final TypeUpdate template) {
        return TypeUpdateBuilder.of(template);
    }

    default <T> T withTypeUpdate(Function<TypeUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TypeUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<TypeUpdate>";
            }
        };
    }
}
