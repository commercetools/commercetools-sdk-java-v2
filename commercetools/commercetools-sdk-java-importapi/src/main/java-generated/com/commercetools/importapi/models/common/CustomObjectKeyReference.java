
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>References a key value document by key.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomObjectKeyReferenceImpl.class)
public interface CustomObjectKeyReference extends KeyReference {

    String KEY_VALUE_DOCUMENT = "key-value-document";

    @NotNull
    @JsonProperty("container")
    public String getContainer();

    public void setContainer(final String container);

    public static CustomObjectKeyReference of() {
        return new CustomObjectKeyReferenceImpl();
    }

    public static CustomObjectKeyReference of(final CustomObjectKeyReference template) {
        CustomObjectKeyReferenceImpl instance = new CustomObjectKeyReferenceImpl();
        instance.setKey(template.getKey());
        instance.setContainer(template.getContainer());
        return instance;
    }

    public static CustomObjectKeyReferenceBuilder builder() {
        return CustomObjectKeyReferenceBuilder.of();
    }

    public static CustomObjectKeyReferenceBuilder builder(final CustomObjectKeyReference template) {
        return CustomObjectKeyReferenceBuilder.of(template);
    }

    default <T> T withCustomObjectKeyReference(Function<CustomObjectKeyReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomObjectKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomObjectKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<CustomObjectKeyReference>";
            }
        };
    }
}
