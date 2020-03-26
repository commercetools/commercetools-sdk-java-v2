package com.commercetools.api.ml.generated.models.similar_products;

import com.commercetools.api.ml.generated.models.common.ProductReference;
import com.commercetools.api.ml.generated.models.similar_products.SimilarProductMeta;
import com.commercetools.api.ml.generated.models.similar_products.SimilarProductImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

/**
*  <p>One part of a SimilarProductPair. Refers to a specific ProductVariant.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = SimilarProductImpl.class)
public interface SimilarProduct  {

   /**
   *  <p>Reference to Product</p>
   */
   @Valid
   @JsonProperty("product")
   public ProductReference getProduct();
   /**
   *  <p>ID of the ProductVariant that was compared.</p>
   */
   
   @JsonProperty("variantId")
   public Long getVariantId();
   /**
   *  <p>Supplementary information about the data used for similarity estimation. This information helps you understand the estimated confidence score, but it should not be used to identify a product.</p>
   */
   @Valid
   @JsonProperty("meta")
   public SimilarProductMeta getMeta();

   public void setProduct(final ProductReference product);
   
   public void setVariantId(final Long variantId);
   
   public void setMeta(final SimilarProductMeta meta);
   
   public static SimilarProductImpl of(){
      return new SimilarProductImpl();
   }
   

   public static SimilarProductImpl of(final SimilarProduct template) {
      SimilarProductImpl instance = new SimilarProductImpl();
      instance.setProduct(template.getProduct());
      instance.setVariantId(template.getVariantId());
      instance.setMeta(template.getMeta());
      return instance;
   }

}
