
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.DiscountedPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceExternalDiscountSetMessage
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceExternalDiscountSetMessage productPriceExternalDiscountSetMessage = ProductPriceExternalDiscountSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .variantId(1)
 *             .priceId("{priceId}")
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductPriceExternalDiscountSetMessageImpl.class)
public interface ProductPriceExternalDiscountSetMessage extends Message {

    String PRODUCT_PRICE_EXTERNAL_DISCOUNT_SET = "ProductPriceExternalDiscountSet";

    /**
     *
     */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();

    /**
     *
     */

    @JsonProperty("variantKey")
    public String getVariantKey();

    /**
     *
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();

    /**
     *
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    public void setVariantId(final Integer variantId);

    public void setVariantKey(final String variantKey);

    public void setSku(final String sku);

    public void setPriceId(final String priceId);

    public void setDiscounted(final DiscountedPrice discounted);

    public void setStaged(final Boolean staged);

    public static ProductPriceExternalDiscountSetMessage of() {
        return new ProductPriceExternalDiscountSetMessageImpl();
    }

    public static ProductPriceExternalDiscountSetMessage of(final ProductPriceExternalDiscountSetMessage template) {
        ProductPriceExternalDiscountSetMessageImpl instance = new ProductPriceExternalDiscountSetMessageImpl();
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
        instance.setVariantKey(template.getVariantKey());
        instance.setSku(template.getSku());
        instance.setPriceId(template.getPriceId());
        instance.setDiscounted(template.getDiscounted());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductPriceExternalDiscountSetMessageBuilder builder() {
        return ProductPriceExternalDiscountSetMessageBuilder.of();
    }

    public static ProductPriceExternalDiscountSetMessageBuilder builder(
            final ProductPriceExternalDiscountSetMessage template) {
        return ProductPriceExternalDiscountSetMessageBuilder.of(template);
    }

    default <T> T withProductPriceExternalDiscountSetMessage(
            Function<ProductPriceExternalDiscountSetMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceExternalDiscountSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceExternalDiscountSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceExternalDiscountSetMessage>";
            }
        };
    }
}
