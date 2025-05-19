
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Asset;
import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.common.ScopedPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>A concrete sellable good for which inventory can be tracked. Product Variants are generally mapped to specific SKUs.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariant productVariant = ProductVariant.builder()
 *             .id(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantImpl.class)
public interface ProductVariant extends AttributeContainer, com.commercetools.api.models.WithKey {

    /**
     *  <p>A unique, sequential identifier of the Product Variant within the Product.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public Long getId();

    /**
     *  <p>User-defined unique SKU of the Product Variant.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>User-defined unique identifier of the ProductVariant.</p>
     *  <p>This is different from Product <code>key</code>.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The Embedded Prices of the Product Variant. Cannot contain two Prices of the same Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @return prices
     */
    @Valid
    @JsonProperty("prices")
    public List<Price> getPrices();

    /**
     *  <p>Attributes of the Product Variant.</p>
     * @return attributes
     */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>Only available when price selection is used. Cannot be used in a Query Predicate.</p>
     * @return price
     */
    @Valid
    @JsonProperty("price")
    public Price getPrice();

    /**
     *  <p>Images of the Product Variant.</p>
     * @return images
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>Media assets of the Product Variant.</p>
     * @return assets
     */
    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    /**
     *  <p>Set if the Product Variant is tracked by Inventory. Can be used as an optimization to reduce calls to the Inventory service. May not contain the latest Inventory State (it is eventually consistent).</p>
     * @return availability
     */
    @Valid
    @JsonProperty("availability")
    public ProductVariantAvailability getAvailability();

    /**
     *  <p><code>true</code> if the Product Variant matches the search query. Only available in response to a Product Projection Search request.</p>
     * @return isMatchingVariant
     */

    @JsonProperty("isMatchingVariant")
    public Boolean getIsMatchingVariant();

    /**
     *  <p>Only available in response to a Product Projection Search request with Product price selection. Can be used to sort, filter, and facet.</p>
     * @return scopedPrice
     */
    @Valid
    @JsonProperty("scopedPrice")
    public ScopedPrice getScopedPrice();

    /**
     *  <p>Only available in response to a Product Projection Search request with Product price selection.</p>
     * @return scopedPriceDiscounted
     */

    @JsonProperty("scopedPriceDiscounted")
    public Boolean getScopedPriceDiscounted();

    /**
     *  <p>A unique, sequential identifier of the Product Variant within the Product.</p>
     * @param id value to be set
     */

    public void setId(final Long id);

    /**
     *  <p>User-defined unique SKU of the Product Variant.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>User-defined unique identifier of the ProductVariant.</p>
     *  <p>This is different from Product <code>key</code>.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>The Embedded Prices of the Product Variant. Cannot contain two Prices of the same Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices values to be set
     */

    @JsonIgnore
    public void setPrices(final Price... prices);

    /**
     *  <p>The Embedded Prices of the Product Variant. Cannot contain two Prices of the same Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices values to be set
     */

    public void setPrices(final List<Price> prices);

    /**
     *  <p>Attributes of the Product Variant.</p>
     * @param attributes values to be set
     */

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    /**
     *  <p>Attributes of the Product Variant.</p>
     * @param attributes values to be set
     */

    public void setAttributes(final List<Attribute> attributes);

    /**
     *  <p>Only available when price selection is used. Cannot be used in a Query Predicate.</p>
     * @param price value to be set
     */

    public void setPrice(final Price price);

    /**
     *  <p>Images of the Product Variant.</p>
     * @param images values to be set
     */

    @JsonIgnore
    public void setImages(final Image... images);

    /**
     *  <p>Images of the Product Variant.</p>
     * @param images values to be set
     */

    public void setImages(final List<Image> images);

    /**
     *  <p>Media assets of the Product Variant.</p>
     * @param assets values to be set
     */

    @JsonIgnore
    public void setAssets(final Asset... assets);

    /**
     *  <p>Media assets of the Product Variant.</p>
     * @param assets values to be set
     */

    public void setAssets(final List<Asset> assets);

    /**
     *  <p>Set if the Product Variant is tracked by Inventory. Can be used as an optimization to reduce calls to the Inventory service. May not contain the latest Inventory State (it is eventually consistent).</p>
     * @param availability value to be set
     */

    public void setAvailability(final ProductVariantAvailability availability);

    /**
     *  <p><code>true</code> if the Product Variant matches the search query. Only available in response to a Product Projection Search request.</p>
     * @param isMatchingVariant value to be set
     */

    public void setIsMatchingVariant(final Boolean isMatchingVariant);

    /**
     *  <p>Only available in response to a Product Projection Search request with Product price selection. Can be used to sort, filter, and facet.</p>
     * @param scopedPrice value to be set
     */

    public void setScopedPrice(final ScopedPrice scopedPrice);

    /**
     *  <p>Only available in response to a Product Projection Search request with Product price selection.</p>
     * @param scopedPriceDiscounted value to be set
     */

    public void setScopedPriceDiscounted(final Boolean scopedPriceDiscounted);

    /**
     * factory method
     * @return instance of ProductVariant
     */
    public static ProductVariant of() {
        return new ProductVariantImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariant
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariant of(final ProductVariant template) {
        ProductVariantImpl instance = new ProductVariantImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setPrices(template.getPrices());
        instance.setAttributes(template.getAttributes());
        instance.setPrice(template.getPrice());
        instance.setImages(template.getImages());
        instance.setAssets(template.getAssets());
        instance.setAvailability(template.getAvailability());
        instance.setIsMatchingVariant(template.getIsMatchingVariant());
        instance.setScopedPrice(template.getScopedPrice());
        instance.setScopedPriceDiscounted(template.getScopedPriceDiscounted());
        return instance;
    }

    public ProductVariant copyDeep();

    /**
     * factory method to create a deep copy of ProductVariant
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariant deepCopy(@Nullable final ProductVariant template) {
        if (template == null) {
            return null;
        }
        ProductVariantImpl instance = new ProductVariantImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        instance.setPrices(Optional.ofNullable(template.getPrices())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Price::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAttributes(Optional.ofNullable(template.getAttributes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.product.Attribute::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setPrice(com.commercetools.api.models.common.Price.deepCopy(template.getPrice()));
        instance.setImages(Optional.ofNullable(template.getImages())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Image::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAssets(Optional.ofNullable(template.getAssets())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Asset::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAvailability(
            com.commercetools.api.models.product.ProductVariantAvailability.deepCopy(template.getAvailability()));
        instance.setIsMatchingVariant(template.getIsMatchingVariant());
        instance.setScopedPrice(com.commercetools.api.models.common.ScopedPrice.deepCopy(template.getScopedPrice()));
        instance.setScopedPriceDiscounted(template.getScopedPriceDiscounted());
        return instance;
    }

    /**
     * builder factory method for ProductVariant
     * @return builder
     */
    public static ProductVariantBuilder builder() {
        return ProductVariantBuilder.of();
    }

    /**
     * create builder for ProductVariant instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantBuilder builder(final ProductVariant template) {
        return ProductVariantBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariant(Function<ProductVariant, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariant> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariant>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariant>";
            }
        };
    }
}
