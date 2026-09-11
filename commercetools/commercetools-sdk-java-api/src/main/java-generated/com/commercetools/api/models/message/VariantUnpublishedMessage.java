
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <span>Unpublish</span> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantUnpublishedMessage variantUnpublishedMessage = VariantUnpublishedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("VariantUnpublished")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantUnpublishedMessageImpl.class)
public interface VariantUnpublishedMessage extends Message {

    /**
     * discriminator value for VariantUnpublishedMessage
     */
    String VARIANT_UNPUBLISHED = "VariantUnpublished";

    /**
     *  <p>Reference to the Product containing the Variant that was unpublished.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Reference to the Product containing the Variant that was unpublished.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     * factory method
     * @return instance of VariantUnpublishedMessage
     */
    public static VariantUnpublishedMessage of() {
        return new VariantUnpublishedMessageImpl();
    }

    /**
     * factory method to create a shallow copy VariantUnpublishedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantUnpublishedMessage of(final VariantUnpublishedMessage template) {
        VariantUnpublishedMessageImpl instance = new VariantUnpublishedMessageImpl();
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

    public VariantUnpublishedMessage copyDeep();

    /**
     * factory method to create a deep copy of VariantUnpublishedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantUnpublishedMessage deepCopy(@Nullable final VariantUnpublishedMessage template) {
        if (template == null) {
            return null;
        }
        VariantUnpublishedMessageImpl instance = new VariantUnpublishedMessageImpl();
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
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        return instance;
    }

    /**
     * builder factory method for VariantUnpublishedMessage
     * @return builder
     */
    public static VariantUnpublishedMessageBuilder builder() {
        return VariantUnpublishedMessageBuilder.of();
    }

    /**
     * create builder for VariantUnpublishedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantUnpublishedMessageBuilder builder(final VariantUnpublishedMessage template) {
        return VariantUnpublishedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantUnpublishedMessage(Function<VariantUnpublishedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantUnpublishedMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantUnpublishedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<VariantUnpublishedMessage>";
            }
        };
    }
}
