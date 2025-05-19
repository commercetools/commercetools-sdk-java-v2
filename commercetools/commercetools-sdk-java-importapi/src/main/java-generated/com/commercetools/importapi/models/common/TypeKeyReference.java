
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>References a type by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeKeyReference typeKeyReference = TypeKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("type")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeKeyReferenceImpl.class)
public interface TypeKeyReference extends KeyReference {

    /**
     * discriminator value for TypeKeyReference
     */
    String TYPE = "type";

    /**
     * factory method
     * @return instance of TypeKeyReference
     */
    public static TypeKeyReference of() {
        return new TypeKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy TypeKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeKeyReference of(final TypeKeyReference template) {
        TypeKeyReferenceImpl instance = new TypeKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public TypeKeyReference copyDeep();

    /**
     * factory method to create a deep copy of TypeKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeKeyReference deepCopy(@Nullable final TypeKeyReference template) {
        if (template == null) {
            return null;
        }
        TypeKeyReferenceImpl instance = new TypeKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for TypeKeyReference
     * @return builder
     */
    public static TypeKeyReferenceBuilder builder() {
        return TypeKeyReferenceBuilder.of();
    }

    /**
     * create builder for TypeKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeKeyReferenceBuilder builder(final TypeKeyReference template) {
        return TypeKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeKeyReference(Function<TypeKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<TypeKeyReference>";
            }
        };
    }
}
