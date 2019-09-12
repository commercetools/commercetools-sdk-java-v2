package com.commercetools.models.Product;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Product.ProductChangeSlugActionImpl;

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
@JsonDeserialize(as = ProductChangeSlugActionImpl.class)
public interface ProductChangeSlugAction extends ProductUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("slug")
   public LocalizedString getSlug();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();

   public void setSlug(final LocalizedString slug);
   
   public void setStaged(final Boolean staged);
   
   public static ProductChangeSlugActionImpl of(){
      return new ProductChangeSlugActionImpl();
   }
   

   public static ProductChangeSlugActionImpl of(final ProductChangeSlugAction template) {
      ProductChangeSlugActionImpl instance = new ProductChangeSlugActionImpl();
      instance.setStaged(template.getStaged());
      instance.setSlug(template.getSlug());
      return instance;
   }

}