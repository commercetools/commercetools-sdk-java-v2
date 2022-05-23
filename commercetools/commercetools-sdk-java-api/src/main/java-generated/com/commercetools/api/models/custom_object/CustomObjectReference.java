
package com.commercetools.api.models.custom_object;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 <p>Reference to a CustomObject.</p>

 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CustomObjectReference customObjectReference = CustomObjectReference.builder()
           .id("{id}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomObjectReferenceImpl.class)
public interface CustomObjectReference extends Reference, com.commercetools.api.models.Identifiable<CustomObject> {

    String KEY_VALUE_DOCUMENT = "key-value-document";

    /**
     *  <p>Contains the representation of the expanded CustomObject. Only present in responses to requests with Reference Expansion for CustomObjects.</p>
     */
    @Valid
    @JsonProperty("obj")
    public CustomObject getObj();

    /**
     *  <p>Platform-generated unique identifier of the referenced CustomObject.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final CustomObject obj);

    public void setId(final String id);

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
