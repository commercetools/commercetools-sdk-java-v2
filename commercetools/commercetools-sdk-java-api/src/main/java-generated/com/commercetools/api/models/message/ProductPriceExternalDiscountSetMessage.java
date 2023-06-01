package com.commercetools.api.models.message;

import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Generated after a successful Set Discounted Embedded Price update action.</p>
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductPriceExternalDiscountSetMessageImpl.class)
public interface ProductPriceExternalDiscountSetMessage extends Message {

    /**
     * discriminator value for ProductPriceExternalDiscountSetMessage
     */
    String PRODUCT_PRICE_EXTERNAL_DISCOUNT_SET = "ProductPriceExternalDiscountSet";

    /**
     *  <p>Unique identifier of the Product Variant for which the Discount was set.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Integer getVariantId();
    /**
     *  <p>Key of the Product Variant for which the Discount was set.</p>
     * @return variantKey
     */
    
    @JsonProperty("variantKey")
    public String getVariantKey();
    /**
     *  <p>SKU of the Product Variant for which Discount was set.</p>
     * @return sku
     */
    
    @JsonProperty("sku")
    public String getSku();
    /**
     *  <p>Unique identifier of the Price.</p>
     * @return priceId
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();
    /**
     *  <p>Discounted Price for the Product Variant for which Discount was set.</p>
     * @return discounted
     */
    @Valid
    @JsonProperty("discounted")
    public DiscountedPrice getDiscounted();
    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Unique identifier of the Product Variant for which the Discount was set.</p>
     * @param variantId value to be set
     */
    
    public void setVariantId(final Integer variantId);
    
    
    /**
     *  <p>Key of the Product Variant for which the Discount was set.</p>
     * @param variantKey value to be set
     */
    
    public void setVariantKey(final String variantKey);
    
    
    /**
     *  <p>SKU of the Product Variant for which Discount was set.</p>
     * @param sku value to be set
     */
    
    public void setSku(final String sku);
    
    
    /**
     *  <p>Unique identifier of the Price.</p>
     * @param priceId value to be set
     */
    
    public void setPriceId(final String priceId);
    
    
    /**
     *  <p>Discounted Price for the Product Variant for which Discount was set.</p>
     * @param discounted value to be set
     */
    
    public void setDiscounted(final DiscountedPrice discounted);
    
    
    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     */
    
    public void setStaged(final Boolean staged);
    

    /**
     * factory method
     * @return instance of ProductPriceExternalDiscountSetMessage
     */
    public static ProductPriceExternalDiscountSetMessage of(){
        return new ProductPriceExternalDiscountSetMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductPriceExternalDiscountSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of ProductPriceExternalDiscountSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceExternalDiscountSetMessage deepCopy(@Nullable final ProductPriceExternalDiscountSetMessage template) {
        if (template == null) {
            return null;
        }
        ProductPriceExternalDiscountSetMessageImpl instance = new ProductPriceExternalDiscountSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers.deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setVariantId(template.getVariantId());
        instance.setVariantKey(template.getVariantKey());
        instance.setSku(template.getSku());
        instance.setPriceId(template.getPriceId());
        instance.setDiscounted(com.commercetools.api.models.common.DiscountedPrice.deepCopy(template.getDiscounted()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductPriceExternalDiscountSetMessage
     * @return builder
     */
    public static ProductPriceExternalDiscountSetMessageBuilder builder() {
        return ProductPriceExternalDiscountSetMessageBuilder.of();
    }
    
    /**
     * create builder for ProductPriceExternalDiscountSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceExternalDiscountSetMessageBuilder builder(final ProductPriceExternalDiscountSetMessage template) {
        return ProductPriceExternalDiscountSetMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceExternalDiscountSetMessage(Function<ProductPriceExternalDiscountSetMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceExternalDiscountSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceExternalDiscountSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceExternalDiscountSetMessage>";
            }
        };
    }
}
