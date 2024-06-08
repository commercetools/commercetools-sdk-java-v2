
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
 *  <p>Generated after a successful Create Product Selection request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionCreatedMessage productSelectionCreatedMessage = ProductSelectionCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .productSelection(productSelectionBuilder -> productSelectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionCreatedMessageImpl.class)
public interface ProductSelectionCreatedMessage extends Message {

    /**
     * discriminator value for ProductSelectionCreatedMessage
     */
    String PRODUCT_SELECTION_CREATED = "ProductSelectionCreated";

    /**
     *  <p>Product Selection that was created.</p>
     * @return productSelection
     */
    @NotNull
    @Valid
    @JsonProperty("productSelection")
    public ProductSelection getProductSelection();

    /**
     *  <p>Product Selection that was created.</p>
     * @param productSelection value to be set
     */

    public void setProductSelection(final ProductSelection productSelection);

    /**
     * factory method
     * @return instance of ProductSelectionCreatedMessage
     */
    public static ProductSelectionCreatedMessage of() {
        return new ProductSelectionCreatedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionCreatedMessage of(final ProductSelectionCreatedMessage template) {
        ProductSelectionCreatedMessageImpl instance = new ProductSelectionCreatedMessageImpl();
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
        instance.setProductSelection(template.getProductSelection());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSelectionCreatedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionCreatedMessage deepCopy(@Nullable final ProductSelectionCreatedMessage template) {
        if (template == null) {
            return null;
        }
        ProductSelectionCreatedMessageImpl instance = new ProductSelectionCreatedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setProductSelection(
            com.commercetools.api.models.product_selection.ProductSelection.deepCopy(template.getProductSelection()));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionCreatedMessage
     * @return builder
     */
    public static ProductSelectionCreatedMessageBuilder builder() {
        return ProductSelectionCreatedMessageBuilder.of();
    }

    /**
     * create builder for ProductSelectionCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionCreatedMessageBuilder builder(final ProductSelectionCreatedMessage template) {
        return ProductSelectionCreatedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionCreatedMessage(Function<ProductSelectionCreatedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionCreatedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionCreatedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionCreatedMessage>";
            }
        };
    }
}
