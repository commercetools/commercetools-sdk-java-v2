package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.Image;
import com.commercetools.importapi.models.common.ProductVariantKeyReference;
import com.commercetools.importapi.models.orders.LineItemPrice;
import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.orders.LineItemProductVariantImportDraftImpl;

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
 * LineItemProductVariantImportDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemProductVariantImportDraft lineItemProductVariantImportDraft = LineItemProductVariantImportDraft.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = LineItemProductVariantImportDraftImpl.class)
public interface LineItemProductVariantImportDraft extends io.vrap.rmf.base.client.Draft<LineItemProductVariantImportDraft> {


    /**
     *  <p>Maps to <code>ProductVariant.product</code>.</p>
     * @return productVariant
     */
    @Valid
    @JsonProperty("productVariant")
    public ProductVariantKeyReference getProductVariant();
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.sku</code>.</p>
     * @return sku
     */
    
    @JsonProperty("sku")
    public String getSku();
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.prices</code></p>
     * @return prices
     */
    @Valid
    @JsonProperty("prices")
    public List<LineItemPrice> getPrices();
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.attributes</code></p>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.images</code>.</p>
     * @return images
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>Maps to <code>ProductVariant.product</code>.</p>
     * @param productVariant value to be set
     */
    
    public void setProductVariant(final ProductVariantKeyReference productVariant);
    
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.sku</code>.</p>
     * @param sku value to be set
     */
    
    public void setSku(final String sku);
    
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.prices</code></p>
     * @param prices values to be set
     */
    
    @JsonIgnore
    public void setPrices(final LineItemPrice ...prices);
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.prices</code></p>
     * @param prices values to be set
     */
    
    public void setPrices(final List<LineItemPrice> prices);
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.attributes</code></p>
     * @param attributes values to be set
     */
    
    @JsonIgnore
    public void setAttributes(final Attribute ...attributes);
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.attributes</code></p>
     * @param attributes values to be set
     */
    
    public void setAttributes(final List<Attribute> attributes);
    
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.images</code>.</p>
     * @param images values to be set
     */
    
    @JsonIgnore
    public void setImages(final Image ...images);
    /**
     *  <p>Maps to <code>ProductVariantImportDraft.images</code>.</p>
     * @param images values to be set
     */
    
    public void setImages(final List<Image> images);

    /**
     * factory method
     * @return instance of LineItemProductVariantImportDraft
     */
    public static LineItemProductVariantImportDraft of(){
        return new LineItemProductVariantImportDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy LineItemProductVariantImportDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static LineItemProductVariantImportDraft of(final LineItemProductVariantImportDraft template) {
        LineItemProductVariantImportDraftImpl instance = new LineItemProductVariantImportDraftImpl();
        instance.setProductVariant(template.getProductVariant());
        instance.setSku(template.getSku());
        instance.setPrices(template.getPrices());
        instance.setAttributes(template.getAttributes());
        instance.setImages(template.getImages());
        return instance;
    }

    /**
     * factory method to create a deep copy of LineItemProductVariantImportDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LineItemProductVariantImportDraft deepCopy(@Nullable final LineItemProductVariantImportDraft template) {
        if (template == null) {
            return null;
        }
        LineItemProductVariantImportDraftImpl instance = new LineItemProductVariantImportDraftImpl();
        instance.setProductVariant(com.commercetools.importapi.models.common.ProductVariantKeyReference.deepCopy(template.getProductVariant()));
        instance.setSku(template.getSku());
        instance.setPrices(Optional.ofNullable(template.getPrices())
                .map(t -> t.stream().map(com.commercetools.importapi.models.orders.LineItemPrice::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream().map(com.commercetools.importapi.models.productvariants.Attribute::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setImages(Optional.ofNullable(template.getImages())
                .map(t -> t.stream().map(com.commercetools.importapi.models.common.Image::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for LineItemProductVariantImportDraft
     * @return builder
     */
    public static LineItemProductVariantImportDraftBuilder builder() {
        return LineItemProductVariantImportDraftBuilder.of();
    }
    
    /**
     * create builder for LineItemProductVariantImportDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemProductVariantImportDraftBuilder builder(final LineItemProductVariantImportDraft template) {
        return LineItemProductVariantImportDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLineItemProductVariantImportDraft(Function<LineItemProductVariantImportDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LineItemProductVariantImportDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItemProductVariantImportDraft>() {
            @Override
            public String toString() {
                return "TypeReference<LineItemProductVariantImportDraft>";
            }
        };
    }
}
