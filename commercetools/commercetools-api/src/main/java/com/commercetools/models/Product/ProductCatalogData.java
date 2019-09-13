package com.commercetools.models.product;

import com.commercetools.models.product.ProductData;
import java.lang.Boolean;
import com.commercetools.models.product.ProductCatalogDataImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = ProductCatalogDataImpl.class)
public interface ProductCatalogData  {

   
   @NotNull
   @JsonProperty("published")
   public Boolean getPublished();
   
   @NotNull
   @Valid
   @JsonProperty("current")
   public ProductData getCurrent();
   
   @NotNull
   @Valid
   @JsonProperty("staged")
   public ProductData getStaged();
   
   @NotNull
   @JsonProperty("hasStagedChanges")
   public Boolean getHasStagedChanges();

   public void setPublished(final Boolean published);
   
   public void setCurrent(final ProductData current);
   
   public void setStaged(final ProductData staged);
   
   public void setHasStagedChanges(final Boolean hasStagedChanges);
   
   public static ProductCatalogDataImpl of(){
      return new ProductCatalogDataImpl();
   }
   

   public static ProductCatalogDataImpl of(final ProductCatalogData template) {
      ProductCatalogDataImpl instance = new ProductCatalogDataImpl();
      instance.setCurrent(template.getCurrent());
      instance.setStaged(template.getStaged());
      instance.setPublished(template.getPublished());
      instance.setHasStagedChanges(template.getHasStagedChanges());
      return instance;
   }

}