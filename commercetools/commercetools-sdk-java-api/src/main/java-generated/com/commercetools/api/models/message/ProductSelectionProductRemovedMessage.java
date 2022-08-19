
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful Remove Product update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionProductRemovedMessage productSelectionProductRemovedMessage = ProductSelectionProductRemovedMessage.builder()
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
@JsonDeserialize(as = ProductSelectionProductRemovedMessageImpl.class)
public interface ProductSelectionProductRemovedMessage extends Message {

    String PRODUCT_SELECTION_PRODUCT_REMOVED = "ProductSelectionProductRemoved";

    /**
     *  <p>Product that was removed from the Product Selection.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    public void setProduct(final ProductReference product);

    public static ProductSelectionProductRemovedMessage of() {
        return new ProductSelectionProductRemovedMessageImpl();
    }

    public static ProductSelectionProductRemovedMessage of(final ProductSelectionProductRemovedMessage template) {
        ProductSelectionProductRemovedMessageImpl instance = new ProductSelectionProductRemovedMessageImpl();
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
        return instance;
    }

    public static ProductSelectionProductRemovedMessageBuilder builder() {
        return ProductSelectionProductRemovedMessageBuilder.of();
    }

    public static ProductSelectionProductRemovedMessageBuilder builder(
            final ProductSelectionProductRemovedMessage template) {
        return ProductSelectionProductRemovedMessageBuilder.of(template);
    }

    default <T> T withProductSelectionProductRemovedMessage(Function<ProductSelectionProductRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionProductRemovedMessage>";
            }
        };
    }
}
