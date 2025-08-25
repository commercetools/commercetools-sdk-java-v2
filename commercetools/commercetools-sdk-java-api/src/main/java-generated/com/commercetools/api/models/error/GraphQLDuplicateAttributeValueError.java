
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.Attribute;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the <code>Unique</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeConstraintEnum" rel="nofollow">AttributeConstraint</a> criteria are not met during an <span>Update Product</span> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLDuplicateAttributeValueError graphQLDuplicateAttributeValueError = GraphQLDuplicateAttributeValueError.builder()
 *             .attribute(attributeBuilder -> attributeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("DuplicateAttributeValue")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLDuplicateAttributeValueErrorImpl.class)
public interface GraphQLDuplicateAttributeValueError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLDuplicateAttributeValueError
     */
    String DUPLICATE_ATTRIBUTE_VALUE = "DuplicateAttributeValue";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Conflicting Attributes.</p>
     * @return attribute
     */
    @NotNull
    @Valid
    @JsonProperty("attribute")
    public Attribute getAttribute();

    /**
     *  <p>Conflicting Attributes.</p>
     * @param attribute value to be set
     */

    public void setAttribute(final Attribute attribute);

    /**
     * factory method
     * @return instance of GraphQLDuplicateAttributeValueError
     */
    public static GraphQLDuplicateAttributeValueError of() {
        return new GraphQLDuplicateAttributeValueErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLDuplicateAttributeValueError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLDuplicateAttributeValueError of(final GraphQLDuplicateAttributeValueError template) {
        GraphQLDuplicateAttributeValueErrorImpl instance = new GraphQLDuplicateAttributeValueErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setAttribute(template.getAttribute());
        return instance;
    }

    public GraphQLDuplicateAttributeValueError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLDuplicateAttributeValueError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLDuplicateAttributeValueError deepCopy(
            @Nullable final GraphQLDuplicateAttributeValueError template) {
        if (template == null) {
            return null;
        }
        GraphQLDuplicateAttributeValueErrorImpl instance = new GraphQLDuplicateAttributeValueErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setAttribute(com.commercetools.api.models.product.Attribute.deepCopy(template.getAttribute()));
        return instance;
    }

    /**
     * builder factory method for GraphQLDuplicateAttributeValueError
     * @return builder
     */
    public static GraphQLDuplicateAttributeValueErrorBuilder builder() {
        return GraphQLDuplicateAttributeValueErrorBuilder.of();
    }

    /**
     * create builder for GraphQLDuplicateAttributeValueError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLDuplicateAttributeValueErrorBuilder builder(
            final GraphQLDuplicateAttributeValueError template) {
        return GraphQLDuplicateAttributeValueErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLDuplicateAttributeValueError(Function<GraphQLDuplicateAttributeValueError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLDuplicateAttributeValueError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLDuplicateAttributeValueError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLDuplicateAttributeValueError>";
            }
        };
    }
}
