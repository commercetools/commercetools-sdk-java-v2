package com.commercetools.ml.models.missing_data;


import com.commercetools.ml.models.missing_data.AttributeCoverageImpl;

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
@JsonDeserialize(as = AttributeCoverageImpl.class)
public interface AttributeCoverage  {

   /**
   *  <p>The percentage of attributes from the product type defined in the product variant. A value of <code>1.0</code> indicates a product variant contains all attributes defined in the product type.</p>
   */
   @NotNull
   @JsonProperty("names")
   public Integer getNames();
   /**
   *  <p>Represents the percentage of attributes in the product variant that contain values.</p>
   */
   @NotNull
   @JsonProperty("values")
   public Integer getValues();

   public void setNames(final Integer names);

   public void setValues(final Integer values);

   public static AttributeCoverageImpl of(){
      return new AttributeCoverageImpl();
   }


   public static AttributeCoverageImpl of(final AttributeCoverage template) {
      AttributeCoverageImpl instance = new AttributeCoverageImpl();
      instance.setNames(template.getNames());
      instance.setValues(template.getValues());
      return instance;
   }

}
