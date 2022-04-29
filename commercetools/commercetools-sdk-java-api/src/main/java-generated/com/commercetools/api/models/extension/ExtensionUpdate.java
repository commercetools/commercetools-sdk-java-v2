
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ExtensionUpdateImpl.class)
public interface ExtensionUpdate extends
        com.commercetools.api.models.ResourceUpdate<ExtensionUpdate, ExtensionUpdateAction, ExtensionUpdateBuilder> {

    /**
    *  <p>Expected version of the Extension on which the changes should be applied. If the expected version does not match the actual version, a <a href="/../api/errors#409-conflict">409 Conflict</a> will be returned.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>Update actions to be performed on the Extension.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ExtensionUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final ExtensionUpdateAction... actions);

    public void setActions(final List<ExtensionUpdateAction> actions);

    public static ExtensionUpdate of() {
        return new ExtensionUpdateImpl();
    }

    public static ExtensionUpdate of(final ExtensionUpdate template) {
        ExtensionUpdateImpl instance = new ExtensionUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static ExtensionUpdateBuilder builder() {
        return ExtensionUpdateBuilder.of();
    }

    public static ExtensionUpdateBuilder builder(final ExtensionUpdate template) {
        return ExtensionUpdateBuilder.of(template);
    }

    default <T> T withExtensionUpdate(Function<ExtensionUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionUpdate>";
            }
        };
    }
}
