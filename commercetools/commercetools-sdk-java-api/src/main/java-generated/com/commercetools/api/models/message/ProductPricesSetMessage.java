package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.ProductPricesSetMessageImpl;

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
 *  <p>Generated after a successful Set Embedded Prices update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPricesSetMessage productPricesSetMessage = ProductPricesSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .variantId(0.3)
 *             .plusPrices(pricesBuilder -> pricesBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductPricesSetMessageImpl.class)
public interface ProductPricesSetMessage extends Message {

    /**
     * discriminator value for ProductPricesSetMessage
     */
    String PRODUCT_PRICES_SET = "ProductPricesSet";

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was set.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();
    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     * @return prices
     */
    @NotNull
    @Valid
    @JsonProperty("prices")
    public List<Price> getPrices();
    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was set.</p>
     * @param variantId value to be set
     */
    
    public void setVariantId(final Long variantId);
    
    
    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     * @param prices values to be set
     */
    
    @JsonIgnore
    public void setPrices(final Price ...prices);
    /**
     *  <p>The Embedded Prices that were set on the ProductVariant.</p>
     * @param prices values to be set
     */
    
    public void setPrices(final List<Price> prices);
    
    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     */
    
    public void setStaged(final Boolean staged);
    

    /**
     * factory method
     * @return instance of ProductPricesSetMessage
     */
    public static ProductPricesSetMessage of(){
        return new ProductPricesSetMessageImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductPricesSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPricesSetMessage of(final ProductPricesSetMessage template) {
        ProductPricesSetMessageImpl instance = new ProductPricesSetMessageImpl();
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
        instance.setPrices(template.getPrices());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductPricesSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPricesSetMessage deepCopy(@Nullable final ProductPricesSetMessage template) {
        if (template == null) {
            return null;
        }
        ProductPricesSetMessageImpl instance = new ProductPricesSetMessageImpl();
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
        instance.setPrices(Optional.ofNullable(template.getPrices())
                .map(t -> t.stream().map(com.commercetools.api.models.common.Price::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductPricesSetMessage
     * @return builder
     */
    public static ProductPricesSetMessageBuilder builder() {
        return ProductPricesSetMessageBuilder.of();
    }
    
    /**
     * create builder for ProductPricesSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPricesSetMessageBuilder builder(final ProductPricesSetMessage template) {
        return ProductPricesSetMessageBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPricesSetMessage(Function<ProductPricesSetMessage, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPricesSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPricesSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPricesSetMessage>";
            }
        };
    }
}
