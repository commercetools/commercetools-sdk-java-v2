
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductVariantImpl.class)
public interface ProductVariant {

    /**
    *  <p>Platform-generated sequential and unique identifier of the ProductVariant within the Product.</p>
    */
    @NotNull
    @JsonProperty("id")
    public Long getId();

    @JsonProperty("sku")
    public String getSku();

    /**
    *  <p>User-defined unique identifier of the ProductVariant.
    *  <em>ProductVariant keys are different from Product keys.</em></p>
    */

    @JsonProperty("key")
    public String getKey();

    @Valid
    @JsonProperty("prices")
    public List<Price> getPrices();

    @Valid
    @JsonProperty("attributes")
    public List<Attribute> getAttributes();

    @Valid
    @JsonProperty("price")
    public Price getPrice();

    @Valid
    @JsonProperty("images")
    public List<Image> getImages();

    @Valid
    @JsonProperty("assets")
    public List<Asset> getAssets();

    @Valid
    @JsonProperty("availability")
    public ProductVariantAvailability getAvailability();

    @JsonProperty("isMatchingVariant")
    public Boolean getIsMatchingVariant();

    @Valid
    @JsonProperty("scopedPrice")
    public ScopedPrice getScopedPrice();

    @JsonProperty("scopedPriceDiscounted")
    public Boolean getScopedPriceDiscounted();

    public void setId(final Long id);

    public void setSku(final String sku);

    public void setKey(final String key);

    @JsonIgnore
    public void setPrices(final Price... prices);

    public void setPrices(final List<Price> prices);

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
