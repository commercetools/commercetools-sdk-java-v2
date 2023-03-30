
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a resource cannot be deleted because it is being referenced by another resource.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLReferenceExistsError graphQLReferenceExistsError = GraphQLReferenceExistsError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLReferenceExistsErrorImpl.class)
public interface GraphQLReferenceExistsError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLReferenceExistsError
     */
    String REFERENCE_EXISTS = "ReferenceExists";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Type of referenced resource.</p>
     * @return referencedBy
     */

    @JsonProperty("referencedBy")
    public ReferenceTypeId getReferencedBy();

    /**
     *  <p>Type of referenced resource.</p>
     * @param referencedBy value to be set
     */

    public void setReferencedBy(final ReferenceTypeId referencedBy);

    /**
     * factory method
     * @return instance of GraphQLReferenceExistsError
     */
    public static GraphQLReferenceExistsError of() {
        return new GraphQLReferenceExistsErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLReferenceExistsError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLReferenceExistsError of(final GraphQLReferenceExistsError template) {
        GraphQLReferenceExistsErrorImpl instance = new GraphQLReferenceExistsErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setReferencedBy(template.getReferencedBy());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLReferenceExistsError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLReferenceExistsError deepCopy(@Nullable final GraphQLReferenceExistsError template) {
        if (template == null) {
            return null;
        }
        GraphQLReferenceExistsErrorImpl instance = new GraphQLReferenceExistsErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setReferencedBy(template.getReferencedBy());
        return instance;
    }

    /**
     * builder factory method for GraphQLReferenceExistsError
     * @return builder
     */
    public static GraphQLReferenceExistsErrorBuilder builder() {
        return GraphQLReferenceExistsErrorBuilder.of();
    }

    /**
     * create builder for GraphQLReferenceExistsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLReferenceExistsErrorBuilder builder(final GraphQLReferenceExistsError template) {
        return GraphQLReferenceExistsErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLReferenceExistsError(Function<GraphQLReferenceExistsError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLReferenceExistsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLReferenceExistsError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLReferenceExistsError>";
            }
        };
    }
}
