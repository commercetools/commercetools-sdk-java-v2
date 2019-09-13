package com.commercetools.models.common;

import com.commercetools.models.common.AssetDimensions;
import java.lang.String;
import com.commercetools.models.common.AssetSourceImpl;

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
@JsonDeserialize(as = AssetSourceImpl.class)
public interface AssetSource  {

   
   @NotNull
   @JsonProperty("uri")
   public String getUri();
   
   
   @JsonProperty("key")
   public String getKey();
   
   @Valid
   @JsonProperty("dimensions")
   public AssetDimensions getDimensions();
   
   
   @JsonProperty("contentType")
   public String getContentType();

   public void setUri(final String uri);
   
   public void setKey(final String key);
   
   public void setDimensions(final AssetDimensions dimensions);
   
   public void setContentType(final String contentType);
   
   public static AssetSourceImpl of(){
      return new AssetSourceImpl();
   }
   

   public static AssetSourceImpl of(final AssetSource template) {
      AssetSourceImpl instance = new AssetSourceImpl();
      instance.setContentType(template.getContentType());
      instance.setUri(template.getUri());
      instance.setKey(template.getKey());
      instance.setDimensions(template.getDimensions());
      return instance;
   }

}