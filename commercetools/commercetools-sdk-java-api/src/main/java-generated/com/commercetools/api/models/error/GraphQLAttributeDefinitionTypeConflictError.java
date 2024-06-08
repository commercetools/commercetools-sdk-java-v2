
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
 *  <p>Returned when the <code>type</code> is different for an AttributeDefinition using the same <code>name</code> in multiple Product Types.</p>
 *  <p>The error is returned as a failed response to the Create ProductType request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAttributeDefinitionTypeConflictError graphQLAttributeDefinitionTypeConflictError = GraphQLAttributeDefinitionTypeConflictError.builder()
 *             .conflictingProductTypeId("{conflictingProductTypeId}")
 *             .conflictingProductTypeName("{conflictingProductTypeName}")
 *             .conflictingAttributeName("{conflictingAttributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAttributeDefinitionTypeConflictErrorImpl.class)
public interface GraphQLAttributeDefinitionTypeConflictError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAttributeDefinitionTypeConflictError
     */
    String ATTRIBUTE_DEFINITION_TYPE_CONFLICT = "AttributeDefinitionTypeConflict";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Unique identifier of the Product Type containing the conflicting name.</p>
     * @return conflictingProductTypeId
     */
    @NotNull
    @JsonProperty("conflictingProductTypeId")
    public String getConflictingProductTypeId();

    /**
     *  <p>Name of the Product Type containing the conflicting name.</p>
     * @return conflictingProductTypeName
     */
    @NotNull
    @JsonProperty("conflictingProductTypeName")
    public String getConflictingProductTypeName();

    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @return conflictingAttributeName
     */
    @NotNull
    @JsonProperty("conflictingAttributeName")
    public String getConflictingAttributeName();

    /**
     *  <p>Unique identifier of the Product Type containing the conflicting name.</p>
     * @param conflictingProductTypeId value to be set
     */

    public void setConflictingProductTypeId(final String conflictingProductTypeId);

    /**
     *  <p>Name of the Product Type containing the conflicting name.</p>
     * @param conflictingProductTypeName value to be set
     */

    public void setConflictingProductTypeName(final String conflictingProductTypeName);

    /**
     *  <p>Name of the conflicting Attribute.</p>
     * @param conflictingAttributeName value to be set
     */

    public void setConflictingAttributeName(final String conflictingAttributeName);

    /**
     * factory method
     * @return instance of GraphQLAttributeDefinitionTypeConflictError
     */
    public static GraphQLAttributeDefinitionTypeConflictError of() {
        return new GraphQLAttributeDefinitionTypeConflictErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAttributeDefinitionTypeConflictError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAttributeDefinitionTypeConflictError of(
            final GraphQLAttributeDefinitionTypeConflictError template) {
        GraphQLAttributeDefinitionTypeConflictErrorImpl instance = new GraphQLAttributeDefinitionTypeConflictErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingProductTypeId(template.getConflictingProductTypeId());
        instance.setConflictingProductTypeName(template.getConflictingProductTypeName());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLAttributeDefinitionTypeConflictError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAttributeDefinitionTypeConflictError deepCopy(
            @Nullable final GraphQLAttributeDefinitionTypeConflictError template) {
        if (template == null) {
            return null;
        }
        GraphQLAttributeDefinitionTypeConflictErrorImpl instance = new GraphQLAttributeDefinitionTypeConflictErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingProductTypeId(template.getConflictingProductTypeId());
        instance.setConflictingProductTypeName(template.getConflictingProductTypeName());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    /**
     * builder factory method for GraphQLAttributeDefinitionTypeConflictError
     * @return builder
     */
    public static GraphQLAttributeDefinitionTypeConflictErrorBuilder builder() {
        return GraphQLAttributeDefinitionTypeConflictErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAttributeDefinitionTypeConflictError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAttributeDefinitionTypeConflictErrorBuilder builder(
            final GraphQLAttributeDefinitionTypeConflictError template) {
        return GraphQLAttributeDefinitionTypeConflictErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAttributeDefinitionTypeConflictError(
            Function<GraphQLAttributeDefinitionTypeConflictError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLAttributeDefinitionTypeConflictError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLAttributeDefinitionTypeConflictError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAttributeDefinitionTypeConflictError>";
            }
        };
    }
}
