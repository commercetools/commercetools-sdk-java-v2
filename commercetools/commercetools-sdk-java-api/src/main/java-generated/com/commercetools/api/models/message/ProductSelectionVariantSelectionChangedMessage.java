
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
 * ProductSelectionVariantSelectionChangedMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionVariantSelectionChangedMessage productSelectionVariantSelectionChangedMessage = ProductSelectionVariantSelectionChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionVariantSelectionChangedMessageImpl.class)
public interface ProductSelectionVariantSelectionChangedMessage extends Message {

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

    public static ProductSelectionVariantSelectionChangedMessage of() {
        return new ProductSelectionVariantSelectionChangedMessageImpl();
    }

    public static ProductSelectionVariantSelectionChangedMessage of(
            final ProductSelectionVariantSelectionChangedMessage template) {
        ProductSelectionVariantSelectionChangedMessageImpl instance = new ProductSelectionVariantSelectionChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setProduct(template.getProduct());
        instance.setOldVariantSelection(template.getOldVariantSelection());
        instance.setNewVariantSelection(template.getNewVariantSelection());
        return instance;
    }

    public static ProductSelectionVariantSelectionChangedMessageBuilder builder() {
        return ProductSelectionVariantSelectionChangedMessageBuilder.of();
    }

    public static ProductSelectionVariantSelectionChangedMessageBuilder builder(
            final ProductSelectionVariantSelectionChangedMessage template) {
        return ProductSelectionVariantSelectionChangedMessageBuilder.of(template);
    }

    default <T> T withProductSelectionVariantSelectionChangedMessage(
            Function<ProductSelectionVariantSelectionChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionVariantSelectionChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionVariantSelectionChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionVariantSelectionChangedMessage>";
            }
        };
    }
}
