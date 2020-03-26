package com.commercetools.api.ml.generated.models.missing_data;


import com.commercetools.api.ml.generated.models.missing_data.MissingAttributesDetailsImpl;

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
@JsonDeserialize(as = MissingAttributesDetailsImpl.class)
public interface MissingAttributesDetails  {

   /**
   *  <p>Number of products scanned.</p>
   */
   @NotNull
   @JsonProperty("total")
   public Integer getTotal();
   /**
   *  <p>Number of products missing attribute names.</p>
   */
   @NotNull
   @JsonProperty("missingAttributeNames")
   public Integer getMissingAttributeNames();
   /**
   *  <p>Number of products missing attribute values.</p>
   */
   @NotNull
   @JsonProperty("missingAttributeValues")
   public Integer getMissingAttributeValues();

   public void setTotal(final Integer total);
   
   public void setMissingAttributeNames(final Integer missingAttributeNames);
   
   public void setMissingAttributeValues(final Integer missingAttributeValues);
   
   public static MissingAttributesDetailsImpl of(){
      return new MissingAttributesDetailsImpl();
   }
   

   public static MissingAttributesDetailsImpl of(final MissingAttributesDetails template) {
      MissingAttributesDetailsImpl instance = new MissingAttributesDetailsImpl();
      instance.setTotal(template.getTotal());
      instance.setMissingAttributeNames(template.getMissingAttributeNames());
      instance.setMissingAttributeValues(template.getMissingAttributeValues());
      return instance;
   }

}
