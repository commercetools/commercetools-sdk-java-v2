
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the <code>CombinationUnique</code> AttributeConstraint criteria are not met during an Update Product request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDuplicateAttributeValuesError graphQLDuplicateAttributeValuesError = GraphQLDuplicateAttributeValuesError.builder()
 *             .plusAttributes(attributesBuilder -> attributesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DuplicateAttributeValues")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLDuplicateAttributeValuesErrorImpl.class)
public interface GraphQLDuplicateAttributeValuesError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLDuplicateAttributeValuesError
     */
    String DUPLICATE_ATTRIBUTE_VALUES = "DuplicateAttributeValues";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Conflicting Attributes.</p>
     * @return attributes
     */
    @NotNull
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>Conflicting Attributes.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     *  <p>Conflicting Attributes.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<Attribute> attributes);

    /**
     * factory method
     * @return instance of GraphQLDuplicateAttributeValuesError
     */
    public static GraphQLDuplicateAttributeValuesError of() {
        return new GraphQLDuplicateAttributeValuesErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLDuplicateAttributeValuesError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLDuplicateAttributeValuesError of(final GraphQLDuplicateAttributeValuesError template) {
        GraphQLDuplicateAttributeValuesErrorImpl instance = new GraphQLDuplicateAttributeValuesErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setAttributes(template.getAttributes());
        return instance;
    }

    public GraphQLDuplicateAttributeValuesError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLDuplicateAttributeValuesError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLDuplicateAttributeValuesError deepCopy(
            @Nullable final GraphQLDuplicateAttributeValuesError template) {
        if (template == null) {
            return null;
        }
        GraphQLDuplicateAttributeValuesErrorImpl instance = new GraphQLDuplicateAttributeValuesErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.Attribute::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for GraphQLDuplicateAttributeValuesError
     * @return builder
     */
    public static GraphQLDuplicateAttributeValuesErrorBuilder builder() {
        return GraphQLDuplicateAttributeValuesErrorBuilder.of();
    }

    /**
     * create builder for GraphQLDuplicateAttributeValuesError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDuplicateAttributeValuesErrorBuilder builder(
            final GraphQLDuplicateAttributeValuesError template) {
        return GraphQLDuplicateAttributeValuesErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLDuplicateAttributeValuesError(Function<GraphQLDuplicateAttributeValuesError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLDuplicateAttributeValuesError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLDuplicateAttributeValuesError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLDuplicateAttributeValuesError>";
            }
        };
    }
}
