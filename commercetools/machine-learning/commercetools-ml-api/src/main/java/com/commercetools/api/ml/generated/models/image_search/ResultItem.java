package com.commercetools.api.ml.generated.models.image_search;

import com.commercetools.api.ml.generated.models.common.ProductVariant;
import com.commercetools.api.ml.generated.models.image_search.ResultItemImpl;

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
*  <p>An image URL and the product variants it is contained in. If no matching images are found, ResultItem is not present.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ResultItemImpl.class)
public interface ResultItem  {

   /**
   *  <p>The URL of the image.</p>
   */
   @NotNull
   @JsonProperty("imageUrl")
   public String getImageUrl();
   /**
   *  <p>An array of product variants containing the image URL.</p>
   */
   @NotNull
   @Valid
   @JsonProperty("productVariants")
   public List<ProductVariant> getProductVariants();

   public void setImageUrl(final String imageUrl);
   
   public void setProductVariants(final List<ProductVariant> productVariants);
   
   public static ResultItemImpl of(){
      return new ResultItemImpl();
   }
   

   public static ResultItemImpl of(final ResultItem template) {
      ResultItemImpl instance = new ResultItemImpl();
      instance.setImageUrl(template.getImageUrl());
      instance.setProductVariants(template.getProductVariants());
      return instance;
   }

}
