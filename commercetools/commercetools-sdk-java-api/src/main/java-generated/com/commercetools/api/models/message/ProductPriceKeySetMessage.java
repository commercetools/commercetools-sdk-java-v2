
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    public void setVariantId(final Long variantId);

    public void setPriceId(final String priceId);

    public void setOldKey(final String oldKey);

    public void setKey(final String key);

    public void setStaged(final Boolean staged);

    public static ProductPriceKeySetMessage of() {
        return new ProductPriceKeySetMessageImpl();
    }

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

    public static ProductPriceKeySetMessageBuilder builder() {
        return ProductPriceKeySetMessageBuilder.of();
    }

    public static ProductPriceKeySetMessageBuilder builder(final ProductPriceKeySetMessage template) {
        return ProductPriceKeySetMessageBuilder.of(template);
    }

    default <T> T withProductPriceKeySetMessage(Function<ProductPriceKeySetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceKeySetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceKeySetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceKeySetMessage>";
            }
        };
    }
}
