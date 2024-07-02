
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after removing a Custom Type from a Price using the Set Price Custom Type update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceCustomFieldsRemovedMessage productPriceCustomFieldsRemovedMessage = ProductPriceCustomFieldsRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .priceId("{priceId}")
 *             .variantId(0.3)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceCustomFieldsRemovedMessageImpl.class)
public interface ProductPriceCustomFieldsRemovedMessage extends Message {

    /**
     * discriminator value for ProductPriceCustomFieldsRemovedMessage
     */
    String PRODUCT_PRICE_CUSTOM_FIELDS_REMOVED = "ProductPriceCustomFieldsRemoved";

    /**
     *  <p>Unique identifier of the Price from which the Custom Type was removed.</p>
     * @return priceId
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *  <p>Unique identifier of the ProductVariant to which the Price belongs.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Unique identifier of the Price from which the Custom Type was removed.</p>
     * @param priceId value to be set
     */

    public void setPriceId(final String priceId);

    /**
     *  <p>Unique identifier of the ProductVariant to which the Price belongs.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductPriceCustomFieldsRemovedMessage
     */
    public static ProductPriceCustomFieldsRemovedMessage of() {
        return new ProductPriceCustomFieldsRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductPriceCustomFieldsRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceCustomFieldsRemovedMessage of(final ProductPriceCustomFieldsRemovedMessage template) {
        ProductPriceCustomFieldsRemovedMessageImpl instance = new ProductPriceCustomFieldsRemovedMessageImpl();
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
        instance.setPriceId(template.getPriceId());
        instance.setVariantId(template.getVariantId());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductPriceCustomFieldsRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceCustomFieldsRemovedMessage deepCopy(
            @Nullable final ProductPriceCustomFieldsRemovedMessage template) {
        if (template == null) {
            return null;
        }
        ProductPriceCustomFieldsRemovedMessageImpl instance = new ProductPriceCustomFieldsRemovedMessageImpl();
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
        instance.setPriceId(template.getPriceId());
        instance.setVariantId(template.getVariantId());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductPriceCustomFieldsRemovedMessage
     * @return builder
     */
    public static ProductPriceCustomFieldsRemovedMessageBuilder builder() {
        return ProductPriceCustomFieldsRemovedMessageBuilder.of();
    }

    /**
     * create builder for ProductPriceCustomFieldsRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceCustomFieldsRemovedMessageBuilder builder(
            final ProductPriceCustomFieldsRemovedMessage template) {
        return ProductPriceCustomFieldsRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceCustomFieldsRemovedMessage(
            Function<ProductPriceCustomFieldsRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceCustomFieldsRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceCustomFieldsRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceCustomFieldsRemovedMessage>";
            }
        };
    }
}
