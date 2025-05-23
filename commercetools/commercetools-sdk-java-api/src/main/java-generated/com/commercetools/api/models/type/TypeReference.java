
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Reference to a Type.</p>
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
public interface TypeReference extends Reference, com.commercetools.api.models.Identifiable<Type>,
        com.commercetools.api.models.IdentifiableObjHolder<Type> {

    /**
     * discriminator value for TypeReference
     */
    String TYPE = "type";

    /**
     *  <p>Unique identifier of the referenced Type.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded Type. Only present in responses to requests with Reference Expansion for Types.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public Type getObj();

    /**
     *  <p>Unique identifier of the referenced Type.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Contains the representation of the expanded Type. Only present in responses to requests with Reference Expansion for Types.</p>
     * @param obj value to be set
     */

    public void setObj(final Type obj);

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
        instance.setObj(template.getObj());
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
        instance.setObj(com.commercetools.api.models.type.Type.deepCopy(template.getObj()));
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

    @Override
    public default TypeResourceIdentifier toResourceIdentifier() {
        return TypeResourceIdentifier.builder().id(this.getId()).build();
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
