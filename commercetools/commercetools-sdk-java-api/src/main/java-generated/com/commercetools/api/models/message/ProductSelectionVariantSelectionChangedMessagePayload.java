
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
 * ProductSelectionVariantSelectionChangedMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionVariantSelectionChangedMessagePayload productSelectionVariantSelectionChangedMessagePayload = ProductSelectionVariantSelectionChangedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionVariantSelectionChangedMessagePayloadImpl.class)
public interface ProductSelectionVariantSelectionChangedMessagePayload extends MessagePayload {

    String PRODUCT_SELECTION_VARIANT_SELECTION_CHANGED = "ProductSelectionVariantSelectionChanged";

    /**
     *  <p>Reference to a Product.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>The former Product Variant Selection if any.</p>
     */
    @Valid
    @JsonProperty("oldVariantSelection")
    public ProductVariantSelection getOldVariantSelection();

    /**
     *  <p>The updated Product Variant Selection if any.</p>
     */
    @Valid
    @JsonProperty("newVariantSelection")
    public ProductVariantSelection getNewVariantSelection();

    public void setProduct(final ProductReference product);

    public void setOldVariantSelection(final ProductVariantSelection oldVariantSelection);

    public void setNewVariantSelection(final ProductVariantSelection newVariantSelection);

    public static ProductSelectionVariantSelectionChangedMessagePayload of() {
        return new ProductSelectionVariantSelectionChangedMessagePayloadImpl();
    }

    public static ProductSelectionVariantSelectionChangedMessagePayload of(
            final ProductSelectionVariantSelectionChangedMessagePayload template) {
        ProductSelectionVariantSelectionChangedMessagePayloadImpl instance = new ProductSelectionVariantSelectionChangedMessagePayloadImpl();
        instance.setProduct(template.getProduct());
        instance.setOldVariantSelection(template.getOldVariantSelection());
        instance.setNewVariantSelection(template.getNewVariantSelection());
        return instance;
    }

    public static ProductSelectionVariantSelectionChangedMessagePayloadBuilder builder() {
        return ProductSelectionVariantSelectionChangedMessagePayloadBuilder.of();
    }

    public static ProductSelectionVariantSelectionChangedMessagePayloadBuilder builder(
            final ProductSelectionVariantSelectionChangedMessagePayload template) {
        return ProductSelectionVariantSelectionChangedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductSelectionVariantSelectionChangedMessagePayload(
            Function<ProductSelectionVariantSelectionChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionVariantSelectionChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionVariantSelectionChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionVariantSelectionChangedMessagePayload>";
            }
        };
    }
}
