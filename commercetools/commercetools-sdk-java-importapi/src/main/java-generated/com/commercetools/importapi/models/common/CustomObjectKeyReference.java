
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Used by the Import API to identify a CustomObject.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomObjectKeyReference customObjectKeyReference = CustomObjectKeyReference.builder()
 *             .key("{key}")
 *             .container("{container}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("key-value-document")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomObjectKeyReferenceImpl.class)
public interface CustomObjectKeyReference extends KeyReference {

    /**
     * discriminator value for CustomObjectKeyReference
     */
    String KEY_VALUE_DOCUMENT = "key-value-document";

    /**
     *  <p>User-defined unique identifier of the referenced CustomObject.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The <code>container</code> of the referenced CustomObject.</p>
     * @return container
     */
    @NotNull
    @JsonProperty("container")
    public String getContainer();

    /**
     *  <p>User-defined unique identifier of the referenced CustomObject.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The <code>container</code> of the referenced CustomObject.</p>
     * @param container value to be set
     */

    public void setContainer(final String container);

    /**
     * factory method
     * @return instance of CustomObjectKeyReference
     */
    public static CustomObjectKeyReference of() {
        return new CustomObjectKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy CustomObjectKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomObjectKeyReference of(final CustomObjectKeyReference template) {
        CustomObjectKeyReferenceImpl instance = new CustomObjectKeyReferenceImpl();
        instance.setKey(template.getKey());
        instance.setContainer(template.getContainer());
        return instance;
    }

    public CustomObjectKeyReference copyDeep();

    /**
     * factory method to create a deep copy of CustomObjectKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomObjectKeyReference deepCopy(@Nullable final CustomObjectKeyReference template) {
        if (template == null) {
            return null;
        }
        CustomObjectKeyReferenceImpl instance = new CustomObjectKeyReferenceImpl();
        instance.setKey(template.getKey());
        instance.setContainer(template.getContainer());
        return instance;
    }

    /**
     * builder factory method for CustomObjectKeyReference
     * @return builder
     */
    public static CustomObjectKeyReferenceBuilder builder() {
        return CustomObjectKeyReferenceBuilder.of();
    }

    /**
     * create builder for CustomObjectKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomObjectKeyReferenceBuilder builder(final CustomObjectKeyReference template) {
        return CustomObjectKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomObjectKeyReference(Function<CustomObjectKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomObjectKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomObjectKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<CustomObjectKeyReference>";
            }
        };
    }
}
