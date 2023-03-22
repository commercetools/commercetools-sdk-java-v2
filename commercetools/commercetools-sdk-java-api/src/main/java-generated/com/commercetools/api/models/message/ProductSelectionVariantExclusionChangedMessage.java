
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_selection.ProductVariantExclusion;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Variant Exclusion update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionVariantExclusionChangedMessage productSelectionVariantExclusionChangedMessage = ProductSelectionVariantExclusionChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .product(productBuilder -> productBuilder)
 *             .oldVariantExclusion(oldVariantExclusionBuilder -> oldVariantExclusionBuilder)
 *             .newVariantExclusion(newVariantExclusionBuilder -> newVariantExclusionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionVariantExclusionChangedMessageImpl.class)
public interface ProductSelectionVariantExclusionChangedMessage extends Message {

    String PRODUCT_SELECTION_VARIANT_EXCLUSION_CHANGED = "ProductSelectionVariantExclusionChanged";

    /**
     *  <p>Product for which the Product Variant Exclusion changed.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Product Variant Exclusion before the Set Variant Exclusion update action.</p>
     * @return oldVariantExclusion
     */
    @NotNull
    @Valid
    @JsonProperty("oldVariantExclusion")
    public ProductVariantExclusion getOldVariantExclusion();

    /**
     *  <p>Product Variant Exclusion after the Set Variant Exclusion update action.</p>
     * @return newVariantExclusion
     */
    @NotNull
    @Valid
    @JsonProperty("newVariantExclusion")
    public ProductVariantExclusion getNewVariantExclusion();

    public void setProduct(final ProductReference product);

    public void setOldVariantExclusion(final ProductVariantExclusion oldVariantExclusion);

    public void setNewVariantExclusion(final ProductVariantExclusion newVariantExclusion);

    public static ProductSelectionVariantExclusionChangedMessage of() {
        return new ProductSelectionVariantExclusionChangedMessageImpl();
    }

    public static ProductSelectionVariantExclusionChangedMessage of(
            final ProductSelectionVariantExclusionChangedMessage template) {
        ProductSelectionVariantExclusionChangedMessageImpl instance = new ProductSelectionVariantExclusionChangedMessageImpl();
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
        instance.setOldVariantExclusion(template.getOldVariantExclusion());
        instance.setNewVariantExclusion(template.getNewVariantExclusion());
        return instance;
    }

    public static ProductSelectionVariantExclusionChangedMessageBuilder builder() {
        return ProductSelectionVariantExclusionChangedMessageBuilder.of();
    }

    public static ProductSelectionVariantExclusionChangedMessageBuilder builder(
            final ProductSelectionVariantExclusionChangedMessage template) {
        return ProductSelectionVariantExclusionChangedMessageBuilder.of(template);
    }

    default <T> T withProductSelectionVariantExclusionChangedMessage(
            Function<ProductSelectionVariantExclusionChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionVariantExclusionChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionVariantExclusionChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionVariantExclusionChangedMessage>";
            }
        };
    }
}
