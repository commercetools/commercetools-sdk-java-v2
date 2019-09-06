package com.commercetools.models.Common;

import com.commercetools.models.Common.GeoJson;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Common.GeoJsonPointImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = GeoJsonPointImpl.class)
public interface GeoJsonPoint extends GeoJson {

   
   @NotNull
   @JsonProperty("coordinates")
   public List<Integer> getCoordinates();

   public void setCoordinates(final List<Integer> coordinates);
   
   public static GeoJsonPointImpl of(){
      return new GeoJsonPointImpl();
   }
   

   public static GeoJsonPointImpl of(final GeoJsonPoint template) {
      GeoJsonPointImpl instance = new GeoJsonPointImpl();
      instance.setCoordinates(template.getCoordinates());
      return instance;
   }

}