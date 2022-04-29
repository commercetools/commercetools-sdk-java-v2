
package com.commercetools.api.models.custom_object;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomObjectReferenceImpl.class)
public interface CustomObjectReference extends Reference, com.commercetools.api.models.Identifiable<CustomObject> {

    String KEY_VALUE_DOCUMENT = "key-value-document";

    @Valid
    @JsonProperty("obj")
    public CustomObject getObj();

    public void setObj(final CustomObject obj);

    public static CustomObjectReference of() {
        return new CustomObjectReferenceImpl();
    }

    public static CustomObjectReference of(final CustomObjectReference template) {
        CustomObjectReferenceImpl instance = new CustomObjectReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static CustomObjectReferenceBuilder builder() {
        return CustomObjectReferenceBuilder.of();
    }

    public static CustomObjectReferenceBuilder builder(final CustomObjectReference template) {
        return CustomObjectReferenceBuilder.of(template);
    }

    default <T> T withCustomObjectReference(Function<CustomObjectReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomObjectReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomObjectReference>() {
            @Override
            public String toString() {
                return "TypeReference<CustomObjectReference>";
            }
        };
    }
}
