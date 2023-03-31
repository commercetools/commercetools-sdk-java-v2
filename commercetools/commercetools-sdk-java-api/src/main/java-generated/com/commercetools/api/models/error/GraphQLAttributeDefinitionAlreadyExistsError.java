
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when the <code>name</code> of the AttributeDefinition conflicts with an existing Attribute.</p>
 *  <p>The error is returned as a failed response to the Create ProductType request or Change AttributeDefinition Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAttributeDefinitionAlreadyExistsError graphQLAttributeDefinitionAlreadyExistsError = GraphQLAttributeDefinitionAlreadyExistsError.builder()
 *             .conflictingProductTypeId("{conflictingProductTypeId}")
 *             .conflictingProductTypeName("{conflictingProductTypeName}")
 *             .conflictingAttributeName("{conflictingAttributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAttributeDefinitionAlreadyExistsErrorImpl.class)
public interface GraphQLAttributeDefinitionAlreadyExistsError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAttributeDefinitionAlreadyExistsError
     */
    String ATTRIBUTE_DEFINITION_ALREADY_EXISTS = "AttributeDefinitionAlreadyExists";

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
     * @return instance of GraphQLAttributeDefinitionAlreadyExistsError
     */
    public static GraphQLAttributeDefinitionAlreadyExistsError of() {
        return new GraphQLAttributeDefinitionAlreadyExistsErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAttributeDefinitionAlreadyExistsError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAttributeDefinitionAlreadyExistsError of(
            final GraphQLAttributeDefinitionAlreadyExistsError template) {
        GraphQLAttributeDefinitionAlreadyExistsErrorImpl instance = new GraphQLAttributeDefinitionAlreadyExistsErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingProductTypeId(template.getConflictingProductTypeId());
        instance.setConflictingProductTypeName(template.getConflictingProductTypeName());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    /**
     * factory method to create a deep copy of GraphQLAttributeDefinitionAlreadyExistsError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAttributeDefinitionAlreadyExistsError deepCopy(
            @Nullable final GraphQLAttributeDefinitionAlreadyExistsError template) {
        if (template == null) {
            return null;
        }
        GraphQLAttributeDefinitionAlreadyExistsErrorImpl instance = new GraphQLAttributeDefinitionAlreadyExistsErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setConflictingProductTypeId(template.getConflictingProductTypeId());
        instance.setConflictingProductTypeName(template.getConflictingProductTypeName());
        instance.setConflictingAttributeName(template.getConflictingAttributeName());
        return instance;
    }

    /**
     * builder factory method for GraphQLAttributeDefinitionAlreadyExistsError
     * @return builder
     */
    public static GraphQLAttributeDefinitionAlreadyExistsErrorBuilder builder() {
        return GraphQLAttributeDefinitionAlreadyExistsErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAttributeDefinitionAlreadyExistsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAttributeDefinitionAlreadyExistsErrorBuilder builder(
            final GraphQLAttributeDefinitionAlreadyExistsError template) {
        return GraphQLAttributeDefinitionAlreadyExistsErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAttributeDefinitionAlreadyExistsError(
            Function<GraphQLAttributeDefinitionAlreadyExistsError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLAttributeDefinitionAlreadyExistsError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLAttributeDefinitionAlreadyExistsError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAttributeDefinitionAlreadyExistsError>";
            }
        };
    }
}
