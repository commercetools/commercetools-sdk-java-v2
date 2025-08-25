
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product_selection.ProductSelection;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/product-selections:POST" rel="nofollow">Create Product Selection</a> request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionCreatedMessagePayload productSelectionCreatedMessagePayload = ProductSelectionCreatedMessagePayload.builder()
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductSelectionCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionCreatedMessagePayloadImpl.class)
public interface ProductSelectionCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductSelectionCreatedMessagePayload
     */
    String PRODUCT_SELECTION_CREATED = "ProductSelectionCreated";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">Product Selection</a> that was created.</p>
     * @return productSelection
     */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelection getProductSelection();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">Product Selection</a> that was created.</p>
     * @param productSelection value to be set
     */

    public void setProductSelection(final ProductSelection productSelection);

    /**
     * factory method
     * @return instance of ProductSelectionCreatedMessagePayload
     */
    public static ProductSelectionCreatedMessagePayload of() {
        return new ProductSelectionCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionCreatedMessagePayload of(final ProductSelectionCreatedMessagePayload template) {
        ProductSelectionCreatedMessagePayloadImpl instance = new ProductSelectionCreatedMessagePayloadImpl();
        instance.setProductSelection(template.getProductSelection());
        return instance;
    }

    public ProductSelectionCreatedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ProductSelectionCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionCreatedMessagePayload deepCopy(
            @Nullable final ProductSelectionCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductSelectionCreatedMessagePayloadImpl instance = new ProductSelectionCreatedMessagePayloadImpl();
        instance.setProductSelection(
            com.commercetools.api.models.product_selection.ProductSelection.deepCopy(template.getProductSelection()));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionCreatedMessagePayload
     * @return builder
     */
    public static ProductSelectionCreatedMessagePayloadBuilder builder() {
        return ProductSelectionCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductSelectionCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionCreatedMessagePayloadBuilder builder(
            final ProductSelectionCreatedMessagePayload template) {
        return ProductSelectionCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionCreatedMessagePayload(Function<ProductSelectionCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionCreatedMessagePayload>";
            }
        };
    }
}
