package com.commercetools.api.models.product;

import com.commercetools.api.models.common.Asset;
import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.common.ScopedPrice;
import com.commercetools.api.models.product.Attribute;
import com.commercetools.api.models.product.ProductVariantAvailability;
import com.commercetools.api.models.product.ProductVariantImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductVariantImpl.class)
public interface ProductVariant  {


   @NotNull
   @JsonProperty("id")
   public Long getId();


   @JsonProperty("sku")
   public String getSku();


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

   public void setPrices(final List<Price> prices);

   public void setAttributes(final List<Attribute> attributes);

   public void setPrice(final Price price);

   public void setImages(final List<Image> images);

   public void setAssets(final List<Asset> assets);

   public void setAvailability(final ProductVariantAvailability availability);

   public void setIsMatchingVariant(final Boolean isMatchingVariant);

   public void setScopedPrice(final ScopedPrice scopedPrice);

   public void setScopedPriceDiscounted(final Boolean scopedPriceDiscounted);

   public static ProductVariantImpl of(){
      return new ProductVariantImpl();
   }


   public static ProductVariantImpl of(final ProductVariant template) {
      ProductVariantImpl instance = new ProductVariantImpl();
      instance.setScopedPrice(template.getScopedPrice());
      instance.setImages(template.getImages());
      instance.setAssets(template.getAssets());
      instance.setIsMatchingVariant(template.getIsMatchingVariant());
      instance.setPrice(template.getPrice());
      instance.setScopedPriceDiscounted(template.getScopedPriceDiscounted());
      instance.setAttributes(template.getAttributes());
      instance.setAvailability(template.getAvailability());
      instance.setId(template.getId());
      instance.setPrices(template.getPrices());
      instance.setSku(template.getSku());
      instance.setKey(template.getKey());
      return instance;
   }

}
