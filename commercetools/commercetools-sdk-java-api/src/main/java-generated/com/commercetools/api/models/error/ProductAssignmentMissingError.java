
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    public void setMessage(final String message);

    public void setProduct(final ProductReference product);

    public static ProductAssignmentMissingError of() {
        return new ProductAssignmentMissingErrorImpl();
    }

    public static ProductAssignmentMissingError of(final ProductAssignmentMissingError template) {
        ProductAssignmentMissingErrorImpl instance = new ProductAssignmentMissingErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setProduct(template.getProduct());
        return instance;
    }

    public static ProductAssignmentMissingErrorBuilder builder() {
        return ProductAssignmentMissingErrorBuilder.of();
    }

    public static ProductAssignmentMissingErrorBuilder builder(final ProductAssignmentMissingError template) {
        return ProductAssignmentMissingErrorBuilder.of(template);
    }

    default <T> T withProductAssignmentMissingError(Function<ProductAssignmentMissingError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductAssignmentMissingError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductAssignmentMissingError>() {
            @Override
            public String toString() {
                return "TypeReference<ProductAssignmentMissingError>";
            }
        };
    }
}
