
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Price Key update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceKeySetMessage productPriceKeySetMessage = ProductPriceKeySetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .variantId(0.3)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceKeySetMessageImpl.class)
public interface ProductPriceKeySetMessage extends Message {

    /**
     * discriminator value for ProductPriceKeySetMessage
     */
    String PRODUCT_PRICE_KEY_SET = "ProductPriceKeySet";

    /**
     *
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>Unique identifier of the Price.</p>
     * @return priceId
     */

    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *  <p><code>key</code> value of the Price before the Set Price Key update action.</p>
     * @return oldKey
     */

    @JsonProperty("oldKey")
    public String getOldKey();

    /**
     *  <p><code>key</code> value of the Price after the Set Price Key update action.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     * set variantId
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>Unique identifier of the Price.</p>
     * @param priceId value to be set
     */

    public void setPriceId(final String priceId);

    /**
     *  <p><code>key</code> value of the Price before the Set Price Key update action.</p>
     * @param oldKey value to be set
     */

    public void setOldKey(final String oldKey);

    /**
     *  <p><code>key</code> value of the Price after the Set Price Key update action.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductPriceKeySetMessage
     */
    public static ProductPriceKeySetMessage of() {
        return new ProductPriceKeySetMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductPriceKeySetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceKeySetMessage of(final ProductPriceKeySetMessage template) {
        ProductPriceKeySetMessageImpl instance = new ProductPriceKeySetMessageImpl();
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
        instance.setVariantId(template.getVariantId());
        instance.setPriceId(template.getPriceId());
        instance.setOldKey(template.getOldKey());
        instance.setKey(template.getKey());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductPriceKeySetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceKeySetMessage deepCopy(@Nullable final ProductPriceKeySetMessage template) {
        if (template == null) {
            return null;
        }
        ProductPriceKeySetMessageImpl instance = new ProductPriceKeySetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(Optional.ofNullable(template.getResource())
                .map(com.commercetools.api.models.common.Reference::deepCopy)
                .orElse(null));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(Optional.ofNullable(template.getResourceUserProvidedIdentifiers())
                .map(com.commercetools.api.models.message.UserProvidedIdentifiers::deepCopy)
                .orElse(null));
        instance.setVariantId(template.getVariantId());
        instance.setPriceId(template.getPriceId());
        instance.setOldKey(template.getOldKey());
        instance.setKey(template.getKey());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductPriceKeySetMessage
     * @return builder
     */
    public static ProductPriceKeySetMessageBuilder builder() {
        return ProductPriceKeySetMessageBuilder.of();
    }

    /**
     * create builder for ProductPriceKeySetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceKeySetMessageBuilder builder(final ProductPriceKeySetMessage template) {
        return ProductPriceKeySetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceKeySetMessage(Function<ProductPriceKeySetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceKeySetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceKeySetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceKeySetMessage>";
            }
        };
    }
}
