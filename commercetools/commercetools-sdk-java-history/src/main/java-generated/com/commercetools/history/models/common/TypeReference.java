
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeReference typeReference = TypeReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("type")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeReferenceImpl.class)
public interface TypeReference extends Reference {

    /**
     * discriminator value for TypeReference
     */
    String TYPE = "type";

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of TypeReference
     */
    public static TypeReference of() {
        return new TypeReferenceImpl();
    }

    /**
     * factory method to create a shallow copy TypeReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeReference of(final TypeReference template) {
        TypeReferenceImpl instance = new TypeReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public TypeReference copyDeep();

    /**
     * factory method to create a deep copy of TypeReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeReference deepCopy(@Nullable final TypeReference template) {
        if (template == null) {
            return null;
        }
        TypeReferenceImpl instance = new TypeReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for TypeReference
     * @return builder
     */
    public static TypeReferenceBuilder builder() {
        return TypeReferenceBuilder.of();
    }

    /**
     * create builder for TypeReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeReferenceBuilder builder(final TypeReference template) {
        return TypeReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeReference(Function<TypeReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeReference>() {
            @Override
            public String toString() {
                return "TypeReference<TypeReference>";
            }
        };
    }
}
