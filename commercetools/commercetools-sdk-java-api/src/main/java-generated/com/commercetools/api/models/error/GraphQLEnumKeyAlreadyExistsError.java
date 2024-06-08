
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when an AttributeEnumType or AttributeLocalizedEnumType contains a key that already exists.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLEnumKeyAlreadyExistsError graphQLEnumKeyAlreadyExistsError = GraphQLEnumKeyAlreadyExistsError.builder()
 *             .conflictingEnumKey("{conflictingEnumKey}")
 *             .conflictingAttributeName("{conflictingAttributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLEnumKeyAlreadyExistsErrorImpl.class)
public interface GraphQLEnumKeyAlreadyExistsError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLEnumKeyAlreadyExistsError
     */
    String ENUM_KEY_ALREADY_EXISTS = "EnumKeyAlreadyExists";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Conflicting enum key.</p>
     * @return conflictingEnumKey
     */
    @NotNull
    @JsonProperty("conflictingEnumKey")
    public String getConflictingEnumKey();

    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @return conflictingAttributeName
     */
    @NotNull
    @JsonProperty("conflictingAttributeName")
    public String getConflictingAttributeName();

    /**
     *  <p>Conflicting enum key.</p>
     * @param conflictingEnumKey value to be set
     */

    public void setConflictingEnumKey(final String conflictingEnumKey);

    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @param conflictingAttributeName value to be set
     */

    public void setConflictingAttributeName(final String conflictingAttributeName);

    /**
     * factory method
     * @return instance of GraphQLEnumKeyAlreadyExistsError
     */
    public static GraphQLEnumKeyAlreadyExistsError of() {
        return new GraphQLEnumKeyAlreadyExistsErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLEnumKeyAlreadyExistsError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLEnumKeyAlreadyExistsError of(final GraphQLEnumKeyAlreadyExistsError template) {
        GraphQLEnumKeyAlreadyExistsErrorImpl instance = new GraphQLEnumKeyAlreadyExistsErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingEnumKey(template.getConflictingEnumKey());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLEnumKeyAlreadyExistsError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLEnumKeyAlreadyExistsError deepCopy(@Nullable final GraphQLEnumKeyAlreadyExistsError template) {
        if (template == null) {
            return null;
        }
        GraphQLEnumKeyAlreadyExistsErrorImpl instance = new GraphQLEnumKeyAlreadyExistsErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingEnumKey(template.getConflictingEnumKey());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    /**
     * builder factory method for GraphQLEnumKeyAlreadyExistsError
     * @return builder
     */
    public static GraphQLEnumKeyAlreadyExistsErrorBuilder builder() {
        return GraphQLEnumKeyAlreadyExistsErrorBuilder.of();
    }

    /**
     * create builder for GraphQLEnumKeyAlreadyExistsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLEnumKeyAlreadyExistsErrorBuilder builder(final GraphQLEnumKeyAlreadyExistsError template) {
        return GraphQLEnumKeyAlreadyExistsErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLEnumKeyAlreadyExistsError(Function<GraphQLEnumKeyAlreadyExistsError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLEnumKeyAlreadyExistsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLEnumKeyAlreadyExistsError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLEnumKeyAlreadyExistsError>";
            }
        };
    }
}
