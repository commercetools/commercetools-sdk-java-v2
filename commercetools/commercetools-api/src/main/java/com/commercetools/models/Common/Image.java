package com.commercetools.models.common;

import com.commercetools.models.common.ImageDimensions;
import com.commercetools.models.common.ImageImpl;

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
@JsonDeserialize(as = ImageImpl.class)
public interface Image  {

   
   @NotNull
   @JsonProperty("url")
   public String getUrl();
   
   @NotNull
   @Valid
   @JsonProperty("dimensions")
   public ImageDimensions getDimensions();
   
   
   @JsonProperty("label")
   public String getLabel();

   public void setUrl(final String url);
   
   public void setDimensions(final ImageDimensions dimensions);
   
   public void setLabel(final String label);
   
   public static ImageImpl of(){
      return new ImageImpl();
   }
   

   public static ImageImpl of(final Image template) {
      ImageImpl instance = new ImageImpl();
      instance.setLabel(template.getLabel());
      instance.setUrl(template.getUrl());
      instance.setDimensions(template.getDimensions());
      return instance;
   }

}