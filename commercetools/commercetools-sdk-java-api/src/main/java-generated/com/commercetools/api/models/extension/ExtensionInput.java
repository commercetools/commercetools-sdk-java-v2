
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ExtensionInputImpl.class)
public interface ExtensionInput {

    /**
    *  <p><code>Create</code> or <code>Update</code> request.</p>
    */
    @NotNull
    @JsonProperty("action")
    public ExtensionAction getAction();

    /**
    *  <p>Expanded reference to the resource that triggered the Extension.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("resource")
    public Reference getResource();

    public void setAction(final ExtensionAction action);

    public void setResource(final Reference resource);

    public static ExtensionInput of() {
        return new ExtensionInputImpl();
    }

    public static ExtensionInput of(final ExtensionInput template) {
        ExtensionInputImpl instance = new ExtensionInputImpl();
        instance.setAction(template.getAction());
        instance.setResource(template.getResource());
        return instance;
    }

    public static ExtensionInputBuilder builder() {
        return ExtensionInputBuilder.of();
    }

    public static ExtensionInputBuilder builder(final ExtensionInput template) {
        return ExtensionInputBuilder.of(template);
    }

    default <T> T withExtensionInput(Function<ExtensionInput, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionInput> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionInput>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionInput>";
            }
        };
    }
}
