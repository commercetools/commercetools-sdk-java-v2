
package com.commercetools.api.models.error;

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
 *  <p>Returned when a field value conflicts with an existing value stored in a particular resource causing a duplicate.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDuplicateFieldWithConflictingResourceError graphQLDuplicateFieldWithConflictingResourceError = GraphQLDuplicateFieldWithConflictingResourceError.builder()
 *             .field("{field}")
 *             .conflictingResource(conflictingResourceBuilder -> conflictingResourceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DuplicateFieldWithConflictingResource")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLDuplicateFieldWithConflictingResourceErrorImpl.class)
public interface GraphQLDuplicateFieldWithConflictingResourceError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLDuplicateFieldWithConflictingResourceError
     */
    String DUPLICATE_FIELD_WITH_CONFLICTING_RESOURCE = "DuplicateFieldWithConflictingResource";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Name of the conflicting field.</p>
     * @return field
     */
    @NotNull
    @JsonProperty("field")
    public String getField();

    /**
     *  <p>Conflicting duplicate value.</p>
     * @return duplicateValue
     */
    @NotNull
    @JsonProperty("duplicateValue")
    public Object getDuplicateValue();

    /**
     *  <p>Reference to the resource that has the conflicting value.</p>
     * @return conflictingResource
     */
    @NotNull
    @Valid
    @JsonProperty("conflictingResource")
    public Reference getConflictingResource();

    /**
     *  <p>Name of the conflicting field.</p>
     * @param field value to be set
     */

    public void setField(final String field);

    /**
     *  <p>Conflicting duplicate value.</p>
     * @param duplicateValue value to be set
     */

    public void setDuplicateValue(final Object duplicateValue);

    /**
     *  <p>Reference to the resource that has the conflicting value.</p>
     * @param conflictingResource value to be set
     */

    public void setConflictingResource(final Reference conflictingResource);

    /**
     * factory method
     * @return instance of GraphQLDuplicateFieldWithConflictingResourceError
     */
    public static GraphQLDuplicateFieldWithConflictingResourceError of() {
        return new GraphQLDuplicateFieldWithConflictingResourceErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLDuplicateFieldWithConflictingResourceError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLDuplicateFieldWithConflictingResourceError of(
            final GraphQLDuplicateFieldWithConflictingResourceError template) {
        GraphQLDuplicateFieldWithConflictingResourceErrorImpl instance = new GraphQLDuplicateFieldWithConflictingResourceErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setField(template.getField());
        instance.setDuplicateValue(template.getDuplicateValue());
        instance.setConflictingResource(template.getConflictingResource());
        return instance;
    }

    public GraphQLDuplicateFieldWithConflictingResourceError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLDuplicateFieldWithConflictingResourceError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLDuplicateFieldWithConflictingResourceError deepCopy(
            @Nullable final GraphQLDuplicateFieldWithConflictingResourceError template) {
        if (template == null) {
            return null;
        }
        GraphQLDuplicateFieldWithConflictingResourceErrorImpl instance = new GraphQLDuplicateFieldWithConflictingResourceErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setField(template.getField());
        instance.setDuplicateValue(template.getDuplicateValue());
        instance.setConflictingResource(
            com.commercetools.api.models.common.Reference.deepCopy(template.getConflictingResource()));
        return instance;
    }

    /**
     * builder factory method for GraphQLDuplicateFieldWithConflictingResourceError
     * @return builder
     */
    public static GraphQLDuplicateFieldWithConflictingResourceErrorBuilder builder() {
        return GraphQLDuplicateFieldWithConflictingResourceErrorBuilder.of();
    }

    /**
     * create builder for GraphQLDuplicateFieldWithConflictingResourceError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDuplicateFieldWithConflictingResourceErrorBuilder builder(
            final GraphQLDuplicateFieldWithConflictingResourceError template) {
        return GraphQLDuplicateFieldWithConflictingResourceErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLDuplicateFieldWithConflictingResourceError(
            Function<GraphQLDuplicateFieldWithConflictingResourceError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLDuplicateFieldWithConflictingResourceError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLDuplicateFieldWithConflictingResourceError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLDuplicateFieldWithConflictingResourceError>";
            }
        };
    }
}
