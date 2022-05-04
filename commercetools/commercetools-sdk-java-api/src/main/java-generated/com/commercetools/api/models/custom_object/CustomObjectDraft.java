
package com.commercetools.api.models.custom_object;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomObjectDraftImpl.class)
public interface CustomObjectDraft {

    /**
    *  <p>A namespace to group custom objects.</p>
    */
    @NotNull
    @JsonProperty("container")
    public String getContainer();

    /**
    *  <p>User-defined unique identifier for the CustomObject.</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    @NotNull
    @JsonProperty("value")
    public Object getValue();

    @JsonProperty("version")
    public Long getVersion();

    public void setContainer(final String container);

    public void setKey(final String key);

    public void setValue(final Object value);

    public void setVersion(final Long version);

    public static CustomObjectDraft of() {
        return new CustomObjectDraftImpl();
    }

    public static CustomObjectDraft of(final CustomObjectDraft template) {
        CustomObjectDraftImpl instance = new CustomObjectDraftImpl();
        instance.setContainer(template.getContainer());
        instance.setKey(template.getKey());
        instance.setValue(template.getValue());
        instance.setVersion(template.getVersion());
        return instance;
    }

    public static CustomObjectDraftBuilder builder() {
        return CustomObjectDraftBuilder.of();
    }

    public static CustomObjectDraftBuilder builder(final CustomObjectDraft template) {
        return CustomObjectDraftBuilder.of(template);
    }

    default <T> T withCustomObjectDraft(Function<CustomObjectDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomObjectDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomObjectDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CustomObjectDraft>";
            }
        };
    }
}
