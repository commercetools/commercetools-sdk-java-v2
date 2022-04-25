
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeChangeNameActionImpl.class)
public interface TypeChangeNameAction extends TypeUpdateAction {

    String CHANGE_NAME = "changeName";

    /**
    *  <p>New value to set.
    *  Must not be empty.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setName(final LocalizedString name);

    public static TypeChangeNameAction of() {
        return new TypeChangeNameActionImpl();
    }

    public static TypeChangeNameAction of(final TypeChangeNameAction template) {
        TypeChangeNameActionImpl instance = new TypeChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static TypeChangeNameActionBuilder builder() {
        return TypeChangeNameActionBuilder.of();
    }

    public static TypeChangeNameActionBuilder builder(final TypeChangeNameAction template) {
        return TypeChangeNameActionBuilder.of(template);
    }

    default <T> T withTypeChangeNameAction(Function<TypeChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<TypeChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeChangeNameAction>";
            }
        };
    }
}
