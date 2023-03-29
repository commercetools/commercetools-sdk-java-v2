
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a Product is not assigned to the Product Selection.</p>
 *  <p>The error is returned as a failed response either to the Set Variant Selection or to the Set Variant Exclusion update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAssignmentMissingError productAssignmentMissingError = ProductAssignmentMissingError.builder()
 *             .message("{message}")
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductAssignmentMissingErrorImpl.class)
public interface ProductAssignmentMissingError extends ErrorObject {

    /**
     * discriminator value for ProductAssignmentMissingError
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
     *  <p>For Product Selection of type Individual, the message is:</p>
     *  <p><code>"A Product Variant Selection can only be set for a Product that has previously been added to the Product Selection."</code></p>
     *  <p>For Product Selection of type Individual Exclusion, the message is:</p>
     *  <p><code>"A Variant Exclusion can only be set for a Product that has previously been added to the Product Selection of type Individual Exclusion."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Reference to the Product for which the error was returned.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>For Product Selection of type Individual, the message is:</p>
     *  <p><code>"A Product Variant Selection can only be set for a Product that has previously been added to the Product Selection."</code></p>
     *  <p>For Product Selection of type Individual Exclusion, the message is:</p>
     *  <p><code>"A Variant Exclusion can only be set for a Product that has previously been added to the Product Selection of type Individual Exclusion."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>Reference to the Product for which the error was returned.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     * factory method
     * @return instance of ProductAssignmentMissingError
     */
    public static ProductAssignmentMissingError of() {
        return new ProductAssignmentMissingErrorImpl();
    }

    /**
     * factory method to create a shallow copy ProductAssignmentMissingError
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductAssignmentMissingError of(final ProductAssignmentMissingError template) {
        ProductAssignmentMissingErrorImpl instance = new ProductAssignmentMissingErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setProduct(template.getProduct());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductAssignmentMissingError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductAssignmentMissingError deepCopy(@Nullable final ProductAssignmentMissingError template) {
        if (template == null) {
            return null;
        }
        ProductAssignmentMissingErrorImpl instance = new ProductAssignmentMissingErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        return instance;
    }

    /**
     * builder factory method for ProductAssignmentMissingError
     * @return builder
     */
    public static ProductAssignmentMissingErrorBuilder builder() {
        return ProductAssignmentMissingErrorBuilder.of();
    }

    /**
     * create builder for ProductAssignmentMissingError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductAssignmentMissingErrorBuilder builder(final ProductAssignmentMissingError template) {
        return ProductAssignmentMissingErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductAssignmentMissingError(Function<ProductAssignmentMissingError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductAssignmentMissingError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductAssignmentMissingError>() {
            @Override
            public String toString() {
                return "TypeReference<ProductAssignmentMissingError>";
            }
        };
    }
}
