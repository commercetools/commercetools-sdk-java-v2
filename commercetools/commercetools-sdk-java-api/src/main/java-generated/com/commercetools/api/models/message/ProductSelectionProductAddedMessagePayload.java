
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_selection.ProductVariantSelection;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Add Product update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionProductAddedMessagePayload productSelectionProductAddedMessagePayload = ProductSelectionProductAddedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .variantSelection(variantSelectionBuilder -> variantSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionProductAddedMessagePayloadImpl.class)
public interface ProductSelectionProductAddedMessagePayload extends MessagePayload {

    String PRODUCT_SELECTION_PRODUCT_ADDED = "ProductSelectionProductAdded";

    /**
     *  <p>Product that was added to the Product Selection.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Product Variant Selection after the Add Product update action.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("variantSelection")
    public ProductVariantSelection getVariantSelection();

    public void setProduct(final ProductReference product);

    public void setVariantSelection(final ProductVariantSelection variantSelection);

    public static ProductSelectionProductAddedMessagePayload of() {
        return new ProductSelectionProductAddedMessagePayloadImpl();
    }

    public static ProductSelectionProductAddedMessagePayload of(
            final ProductSelectionProductAddedMessagePayload template) {
        ProductSelectionProductAddedMessagePayloadImpl instance = new ProductSelectionProductAddedMessagePayloadImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantSelection(template.getVariantSelection());
        return instance;
    }

    public static ProductSelectionProductAddedMessagePayloadBuilder builder() {
        return ProductSelectionProductAddedMessagePayloadBuilder.of();
    }

    public static ProductSelectionProductAddedMessagePayloadBuilder builder(
            final ProductSelectionProductAddedMessagePayload template) {
        return ProductSelectionProductAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductSelectionProductAddedMessagePayload(
            Function<ProductSelectionProductAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionProductAddedMessagePayload>";
            }
        };
    }
}
