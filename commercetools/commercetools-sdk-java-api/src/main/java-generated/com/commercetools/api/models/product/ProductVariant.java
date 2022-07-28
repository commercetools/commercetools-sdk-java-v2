
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Asset;
import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.common.ScopedPrice;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
public interface ProductVariant {

    /**
     *  <p>A unique, sequential identifier of the Product Variant within the Product.</p>
     */
    @NotNull
    @JsonProperty("id")
    public Long getId();

    /**
     *  <p>User-defined unique SKU of the Product Variant.</p>
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>User-defined unique identifier of the ProductVariant.</p>
     *  <p>This is different from Product <code>key</code>.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>The Embedded Prices of the Product Variant. Cannot contain two Prices of the same Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     */
    @Valid
    @JsonProperty("prices")
    public List<EmbeddedPrice> getPrices();

    /**
     *  <p>Attributes of the Product Variant.</p>
     */
    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    /**
     *  <p>Only available when Price selection is used. Cannot be used in a Query Predicate.</p>
     */
    @Valid
    @JsonProperty("price")
    public Price getPrice();

    /**
     *  <p>Images of the Product Variant.</p>
     */
    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    /**
     *  <p>Media assets of the Product Variant.</p>
     */
    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    /**
     *  <p>Set if the Product Variant is tracked by Inventory. Can be used as an optimization to reduce calls to the Inventory service. May not contain the latest Inventory State (it is eventually consistent).</p>
     */
    @Valid
    @JsonProperty("availability")
    public ProductVariantAvailability getAvailability();

    /**
     *  <p><code>true</code> if the Product Variant matches the search query. Only available in response to a Product Projection Search request.</p>
     */

    @JsonProperty("isMatchingVariant")
    public Boolean getIsMatchingVariant();

    /**
     *  <p>Only available in response to a Product Projection Search request with price selection. Can be used to sort, filter, and facet.</p>
     */
    @Valid
    @JsonProperty("scopedPrice")
    public ScopedPrice getScopedPrice();

    /**
     *  <p>Only available in response to a Product Projection Search request with price selection.</p>
     */

    @JsonProperty("scopedPriceDiscounted")
    public Boolean getScopedPriceDiscounted();

    public void setId(final Long id);

    public void setSku(final String sku);

    public void setKey(final String key);

    @JsonIgnore
    public void setPrices(final EmbeddedPrice... prices);

    public void setPrices(final List<EmbeddedPrice> prices);

    @JsonIgnore
    public void setAttributes(final Attribute... attributes);

    public void setAttributes(final List<Attribute> attributes);

    public void setPrice(final Price price);

    @JsonIgnore
    public void setImages(final Image... images);

    public void setImages(final List<Image> images);

    @JsonIgnore
    public void setAssets(final Asset... assets);

    public void setAssets(final List<Asset> assets);

    public void setAvailability(final ProductVariantAvailability availability);

    public void setIsMatchingVariant(final Boolean isMatchingVariant);

    public void setScopedPrice(final ScopedPrice scopedPrice);

    public void setScopedPriceDiscounted(final Boolean scopedPriceDiscounted);

    public static ProductVariant of() {
        return new ProductVariantImpl();
    }

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

    public static ProductVariantBuilder builder() {
        return ProductVariantBuilder.of();
    }

    public static ProductVariantBuilder builder(final ProductVariant template) {
        return ProductVariantBuilder.of(template);
    }

    default <T> T withProductVariant(Function<ProductVariant, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariant> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariant>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariant>";
            }
        };
    }
}
