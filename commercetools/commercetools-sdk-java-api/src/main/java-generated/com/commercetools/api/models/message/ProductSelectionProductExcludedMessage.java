
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
 *  <p>Generated after a successful Exclude Product update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionProductExcludedMessage productSelectionProductExcludedMessage = ProductSelectionProductExcludedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .product(productBuilder -> productBuilder)
 *             .variantExclusion(variantExclusionBuilder -> variantExclusionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionProductExcludedMessageImpl.class)
public interface ProductSelectionProductExcludedMessage extends Message {

    String PRODUCT_SELECTION_PRODUCT_EXCLUDED = "ProductSelectionProductExcluded";

    /**
     *  <p>Product that was excluded from the Product Selection.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Product Variant Exclusion after the Exclude Product update action.</p>
     * @return variantExclusion
     */
    @NotNull
    @Valid
    @JsonProperty("variantExclusion")
    public ProductVariantExclusion getVariantExclusion();

    public void setProduct(final ProductReference product);

    public void setVariantExclusion(final ProductVariantExclusion variantExclusion);

    public static ProductSelectionProductExcludedMessage of() {
        return new ProductSelectionProductExcludedMessageImpl();
    }

    public static ProductSelectionProductExcludedMessage of(final ProductSelectionProductExcludedMessage template) {
        ProductSelectionProductExcludedMessageImpl instance = new ProductSelectionProductExcludedMessageImpl();
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
        instance.setVariantExclusion(template.getVariantExclusion());
        return instance;
    }

    public static ProductSelectionProductExcludedMessageBuilder builder() {
        return ProductSelectionProductExcludedMessageBuilder.of();
    }

    public static ProductSelectionProductExcludedMessageBuilder builder(
            final ProductSelectionProductExcludedMessage template) {
        return ProductSelectionProductExcludedMessageBuilder.of(template);
    }

    default <T> T withProductSelectionProductExcludedMessage(
            Function<ProductSelectionProductExcludedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductExcludedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductExcludedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionProductExcludedMessage>";
            }
        };
    }
}
