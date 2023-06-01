package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.ProductPriceChangedMessagePayloadImpl;

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
 *  <p>Generated after a successful Change Embedded Price update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceChangedMessagePayload productPriceChangedMessagePayload = ProductPriceChangedMessagePayload.builder()
 *             .variantId(0.3)
 *             .oldPrice(oldPriceBuilder -> oldPriceBuilder)
 *             .newPrice(newPriceBuilder -> newPriceBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = ProductPriceChangedMessagePayloadImpl.class)
public interface ProductPriceChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductPriceChangedMessagePayload
     */
    String PRODUCT_PRICE_CHANGED = "ProductPriceChanged";

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was changed.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();
    /**
     *  <p>The current Embedded Price before the Change Embedded Price update action.</p>
     * @return oldPrice
     */
    @NotNull
    @Valid
    @JsonProperty("oldPrice")
    public Price getOldPrice();
    /**
     *  <p>The Embedded Price after the Change Embedded Price update action.</p>
     * @return newPrice
     */
    @NotNull
    @Valid
    @JsonProperty("newPrice")
    public Price getNewPrice();
    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();
    /**
     *  <p>The staged Embedded Price before the Change Embedded Price update action.</p>
     * @return oldStagedPrice
     */
    @Valid
    @JsonProperty("oldStagedPrice")
    public Price getOldStagedPrice();

    /**
     *  <p>Unique identifier of the ProductVariant for which the Price was changed.</p>
     * @param variantId value to be set
     */
    
    public void setVariantId(final Long variantId);
    
    
    /**
     *  <p>The current Embedded Price before the Change Embedded Price update action.</p>
     * @param oldPrice value to be set
     */
    
    public void setOldPrice(final Price oldPrice);
    
    
    /**
     *  <p>The Embedded Price after the Change Embedded Price update action.</p>
     * @param newPrice value to be set
     */
    
    public void setNewPrice(final Price newPrice);
    
    
    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     */
    
    public void setStaged(final Boolean staged);
    
    
    /**
     *  <p>The staged Embedded Price before the Change Embedded Price update action.</p>
     * @param oldStagedPrice value to be set
     */
    
    public void setOldStagedPrice(final Price oldStagedPrice);
    

    /**
     * factory method
     * @return instance of ProductPriceChangedMessagePayload
     */
    public static ProductPriceChangedMessagePayload of(){
        return new ProductPriceChangedMessagePayloadImpl();
    }
    

    /**
     * factory method to create a shallow copy ProductPriceChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductPriceChangedMessagePayload of(final ProductPriceChangedMessagePayload template) {
        ProductPriceChangedMessagePayloadImpl instance = new ProductPriceChangedMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setOldPrice(template.getOldPrice());
        instance.setNewPrice(template.getNewPrice());
        instance.setStaged(template.getStaged());
        instance.setOldStagedPrice(template.getOldStagedPrice());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductPriceChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductPriceChangedMessagePayload deepCopy(@Nullable final ProductPriceChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductPriceChangedMessagePayloadImpl instance = new ProductPriceChangedMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setOldPrice(com.commercetools.api.models.common.Price.deepCopy(template.getOldPrice()));
        instance.setNewPrice(com.commercetools.api.models.common.Price.deepCopy(template.getNewPrice()));
        instance.setStaged(template.getStaged());
        instance.setOldStagedPrice(com.commercetools.api.models.common.Price.deepCopy(template.getOldStagedPrice()));
        return instance;
    }

    /**
     * builder factory method for ProductPriceChangedMessagePayload
     * @return builder
     */
    public static ProductPriceChangedMessagePayloadBuilder builder() {
        return ProductPriceChangedMessagePayloadBuilder.of();
    }
    
    /**
     * create builder for ProductPriceChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceChangedMessagePayloadBuilder builder(final ProductPriceChangedMessagePayload template) {
        return ProductPriceChangedMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductPriceChangedMessagePayload(Function<ProductPriceChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductPriceChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductPriceChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductPriceChangedMessagePayload>";
            }
        };
    }
}
