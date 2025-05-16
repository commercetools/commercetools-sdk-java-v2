
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_selection.ProductVariantSelection;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when a Product is already assigned to a Product Selection, but the Product Selection has either a different Product Variant Selection or a different Product Variant Exclusion.</p>
 *  <p>The error is returned as a failed response either to the Add Product or to the Exclude Product update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLProductPresentWithDifferentVariantSelectionError graphQLProductPresentWithDifferentVariantSelectionError = GraphQLProductPresentWithDifferentVariantSelectionError.builder()
 *             .product(productBuilder -> productBuilder)
 *             .existingVariantSelection(existingVariantSelectionBuilder -> existingVariantSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductPresentWithDifferentVariantSelection")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLProductPresentWithDifferentVariantSelectionErrorImpl.class)
public interface GraphQLProductPresentWithDifferentVariantSelectionError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLProductPresentWithDifferentVariantSelectionError
     */
    String PRODUCT_PRESENT_WITH_DIFFERENT_VARIANT_SELECTION = "ProductPresentWithDifferentVariantSelection";

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
     *  <p>Existing Product Variant Selection or Exclusion for the Product in the Product Selection.</p>
     * @return existingVariantSelection
     */
    @NotNull
    @Valid
    @JsonProperty("existingVariantSelection")
    public ProductVariantSelection getExistingVariantSelection();

    /**
     *  <p>Reference to the Product for which the error was returned.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p>Existing Product Variant Selection or Exclusion for the Product in the Product Selection.</p>
     * @param existingVariantSelection value to be set
     */

    public void setExistingVariantSelection(final ProductVariantSelection existingVariantSelection);

    /**
     * factory method
     * @return instance of GraphQLProductPresentWithDifferentVariantSelectionError
     */
    public static GraphQLProductPresentWithDifferentVariantSelectionError of() {
        return new GraphQLProductPresentWithDifferentVariantSelectionErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLProductPresentWithDifferentVariantSelectionError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLProductPresentWithDifferentVariantSelectionError of(
            final GraphQLProductPresentWithDifferentVariantSelectionError template) {
        GraphQLProductPresentWithDifferentVariantSelectionErrorImpl instance = new GraphQLProductPresentWithDifferentVariantSelectionErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setProduct(template.getProduct());
        instance.setExistingVariantSelection(template.getExistingVariantSelection());
        return instance;
    }

    public GraphQLProductPresentWithDifferentVariantSelectionError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLProductPresentWithDifferentVariantSelectionError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLProductPresentWithDifferentVariantSelectionError deepCopy(
            @Nullable final GraphQLProductPresentWithDifferentVariantSelectionError template) {
        if (template == null) {
            return null;
        }
        GraphQLProductPresentWithDifferentVariantSelectionErrorImpl instance = new GraphQLProductPresentWithDifferentVariantSelectionErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setExistingVariantSelection(com.commercetools.api.models.product_selection.ProductVariantSelection
                .deepCopy(template.getExistingVariantSelection()));
        return instance;
    }

    /**
     * builder factory method for GraphQLProductPresentWithDifferentVariantSelectionError
     * @return builder
     */
    public static GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder builder() {
        return GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder.of();
    }

    /**
     * create builder for GraphQLProductPresentWithDifferentVariantSelectionError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder builder(
            final GraphQLProductPresentWithDifferentVariantSelectionError template) {
        return GraphQLProductPresentWithDifferentVariantSelectionErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLProductPresentWithDifferentVariantSelectionError(
            Function<GraphQLProductPresentWithDifferentVariantSelectionError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLProductPresentWithDifferentVariantSelectionError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLProductPresentWithDifferentVariantSelectionError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLProductPresentWithDifferentVariantSelectionError>";
            }
        };
    }
}
