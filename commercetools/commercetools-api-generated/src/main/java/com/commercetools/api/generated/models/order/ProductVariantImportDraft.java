package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.common.Image;
import com.commercetools.api.generated.models.common.PriceDraft;
import com.commercetools.api.generated.models.product.Attribute;
import com.commercetools.api.generated.models.order.ProductVariantImportDraftImpl;

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
@JsonDeserialize(as = ProductVariantImportDraftImpl.class)
public interface ProductVariantImportDraft  {

   /**
   	<p>The sequential ID of the variant within the product.
   	The variant with provided ID should exist in some existing product, so you also need to specify the productId if this property is set,
   	or alternatively you can just specify SKU of the product variant.</p>
   */
   
   @JsonProperty("id")
   public Long getId();
   /**
   	<p>The SKU of the existing variant.</p>
   */
   
   @JsonProperty("sku")
   public String getSku();
   /**
   	<p>The prices of the variant.
   	The prices should not contain two prices for the same price scope (same currency, country and customer group).
   	If this property is defined, then it will override the <code>prices</code> property from the original product variant, otherwise <code>prices</code> property from the original product variant would be copied in the resulting order.</p>
   */
   @Valid
   @JsonProperty("prices")
   public List<PriceDraft> getPrices();
   /**
   	<p>If this property is defined, then it will override the <code>attributes</code> property from the original
   	product variant, otherwise <code>attributes</code> property from the original product variant would be copied in the resulting order.</p>
   */
   @Valid
   @JsonProperty("attributes")
   public List<Attribute> getAttributes();
   /**
   	<p>If this property is defined, then it will override the <code>images</code> property from the original
   	product variant, otherwise <code>images</code> property from the original product variant would be copied in the resulting order.</p>
   */
   @Valid
   @JsonProperty("images")
   public List<Image> getImages();

   public void setId(final Long id);
   
   public void setSku(final String sku);
   
   public void setPrices(final List<PriceDraft> prices);
   
   public void setAttributes(final List<Attribute> attributes);
   
   public void setImages(final List<Image> images);
   
   public static ProductVariantImportDraftImpl of(){
      return new ProductVariantImportDraftImpl();
   }
   

   public static ProductVariantImportDraftImpl of(final ProductVariantImportDraft template) {
      ProductVariantImportDraftImpl instance = new ProductVariantImportDraftImpl();
      instance.setImages(template.getImages());
      instance.setAttributes(template.getAttributes());
      instance.setId(template.getId());
      instance.setPrices(template.getPrices());
      instance.setSku(template.getSku());
      return instance;
   }

}