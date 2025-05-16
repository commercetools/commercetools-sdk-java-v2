
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
 *  <p>Generated after removing a Custom Field from a Price using the Set Price CustomField update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceCustomFieldRemovedMessage productPriceCustomFieldRemovedMessage = ProductPriceCustomFieldRemovedMessage.builder()
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
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductPriceCustomFieldRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceCustomFieldRemovedMessageImpl.class)
public interface ProductPriceCustomFieldRemovedMessage extends Message {

    /**
     * discriminator value for ProductPriceCustomFieldRemovedMessage
     */
    String PRODUCT_PRICE_CUSTOM_FIELD_REMOVED = "ProductPriceCustomFieldRemoved";

    /**
     *  <p>Unique identifier of the Price from which the Custom Field was removed.</p>
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
     *  <p>Name of the Custom Field that was removed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Unique identifier of the Price from which the Custom Field was removed.</p>
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
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of ProductPriceCustomFieldRemovedMessage
     */
    public static ProductPriceCustomFieldRemovedMessage of() {
        return new ProductPriceCustomFieldRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductPriceCustomFieldRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceCustomFieldRemovedMessage of(final ProductPriceCustomFieldRemovedMessage template) {
        ProductPriceCustomFieldRemovedMessageImpl instance = new ProductPriceCustomFieldRemovedMessageImpl();
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
        instance.setName(template.getName());
        return instance;
    }

    public ProductPriceCustomFieldRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of ProductPriceCustomFieldRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceCustomFieldRemovedMessage deepCopy(
            @Nullable final ProductPriceCustomFieldRemovedMessage template) {
        if (template == null) {
            return null;
        }
        ProductPriceCustomFieldRemovedMessageImpl instance = new ProductPriceCustomFieldRemovedMessageImpl();
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
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for ProductPriceCustomFieldRemovedMessage
     * @return builder
     */
    public static ProductPriceCustomFieldRemovedMessageBuilder builder() {
        return ProductPriceCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * create builder for ProductPriceCustomFieldRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceCustomFieldRemovedMessageBuilder builder(
            final ProductPriceCustomFieldRemovedMessage template) {
        return ProductPriceCustomFieldRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceCustomFieldRemovedMessage(Function<ProductPriceCustomFieldRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceCustomFieldRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceCustomFieldRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceCustomFieldRemovedMessage>";
            }
        };
    }
}
