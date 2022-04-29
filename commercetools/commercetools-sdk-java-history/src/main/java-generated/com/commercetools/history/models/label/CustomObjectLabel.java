
package com.commercetools.history.models.label;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomObjectLabelImpl.class)
public interface CustomObjectLabel extends Label {

    String CUSTOM_OBJECT_LABEL = "CustomObjectLabel";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("key")
    public String getKey();

    @NotNull
    @JsonProperty("container")
    public String getContainer();

    public void setKey(final String key);

    public void setContainer(final String container);

    public static CustomObjectLabel of() {
        return new CustomObjectLabelImpl();
    }

    public static CustomObjectLabel of(final CustomObjectLabel template) {
        CustomObjectLabelImpl instance = new CustomObjectLabelImpl();
        instance.setKey(template.getKey());
        instance.setContainer(template.getContainer());
        return instance;
    }

    public static CustomObjectLabelBuilder builder() {
        return CustomObjectLabelBuilder.of();
    }

    public static CustomObjectLabelBuilder builder(final CustomObjectLabel template) {
        return CustomObjectLabelBuilder.of(template);
    }

    default <T> T withCustomObjectLabel(Function<CustomObjectLabel, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomObjectLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomObjectLabel>() {
            @Override
            public String toString() {
                return "TypeReference<CustomObjectLabel>";
            }
        };
    }
}
