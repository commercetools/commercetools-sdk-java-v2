
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a Product is not assigned to the Product Selection. The error is returned as a failed response either to the Set Variant Selection or to the Set Variant Exclusion update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLProductAssignmentMissingError graphQLProductAssignmentMissingError = GraphQLProductAssignmentMissingError.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductAssignmentMissing")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLProductAssignmentMissingErrorImpl.class)
public interface GraphQLProductAssignmentMissingError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLProductAssignmentMissingError
     */
    String PRODUCT_ASSIGNMENT_MISSING = "ProductAssignmentMissing";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Reference to the Product for which the error was returned.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Reference to the Product for which the error was returned.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     * factory method
     * @return instance of GraphQLProductAssignmentMissingError
     */
    public static GraphQLProductAssignmentMissingError of() {
        return new GraphQLProductAssignmentMissingErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLProductAssignmentMissingError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLProductAssignmentMissingError of(final GraphQLProductAssignmentMissingError template) {
        GraphQLProductAssignmentMissingErrorImpl instance = new GraphQLProductAssignmentMissingErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setProduct(template.getProduct());
        return instance;
    }

    public GraphQLProductAssignmentMissingError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLProductAssignmentMissingError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLProductAssignmentMissingError deepCopy(
            @Nullable final GraphQLProductAssignmentMissingError template) {
        if (template == null) {
            return null;
        }
        GraphQLProductAssignmentMissingErrorImpl instance = new GraphQLProductAssignmentMissingErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        return instance;
    }

    /**
     * builder factory method for GraphQLProductAssignmentMissingError
     * @return builder
     */
    public static GraphQLProductAssignmentMissingErrorBuilder builder() {
        return GraphQLProductAssignmentMissingErrorBuilder.of();
    }

    /**
     * create builder for GraphQLProductAssignmentMissingError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLProductAssignmentMissingErrorBuilder builder(
            final GraphQLProductAssignmentMissingError template) {
        return GraphQLProductAssignmentMissingErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLProductAssignmentMissingError(Function<GraphQLProductAssignmentMissingError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLProductAssignmentMissingError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLProductAssignmentMissingError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLProductAssignmentMissingError>";
            }
        };
    }
}
