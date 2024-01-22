
package com.commercetools.api.models.custom_object;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a CustomObject.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomObjectReference customObjectReference = CustomObjectReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomObjectReferenceImpl.class)
public interface CustomObjectReference extends Reference, com.commercetools.api.models.Identifiable<CustomObject>,
        com.commercetools.api.models.IdentifiableObjHolder<CustomObject> {

    /**
     * discriminator value for CustomObjectReference
     */
    String KEY_VALUE_DOCUMENT = "key-value-document";

    /**
     *  <p>Contains the representation of the expanded CustomObject. Only present in responses to requests with Reference Expansion for CustomObjects.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public CustomObject getObj();

    /**
     *  <p>Unique identifier of the referenced CustomObject.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded CustomObject. Only present in responses to requests with Reference Expansion for CustomObjects.</p>
     * @param obj value to be set
     */

    public void setObj(final CustomObject obj);

    /**
     *  <p>Unique identifier of the referenced CustomObject.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of CustomObjectReference
     */
    public static CustomObjectReference of() {
        return new CustomObjectReferenceImpl();
    }

    /**
     * factory method to create a shallow copy CustomObjectReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomObjectReference of(final CustomObjectReference template) {
        CustomObjectReferenceImpl instance = new CustomObjectReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomObjectReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomObjectReference deepCopy(@Nullable final CustomObjectReference template) {
        if (template == null) {
            return null;
        }
        CustomObjectReferenceImpl instance = new CustomObjectReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.custom_object.CustomObject.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for CustomObjectReference
     * @return builder
     */
    public static CustomObjectReferenceBuilder builder() {
        return CustomObjectReferenceBuilder.of();
    }

    /**
     * create builder for CustomObjectReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomObjectReferenceBuilder builder(final CustomObjectReference template) {
        return CustomObjectReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomObjectReference(Function<CustomObjectReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomObjectReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomObjectReference>() {
            @Override
            public String toString() {
                return "TypeReference<CustomObjectReference>";
            }
        };
    }
}
