package com.commercetools.api.ml.generated.models.missing_data;


import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AttributeCoverageImpl implements AttributeCoverage {

   private Integer names;
   
   private Integer values;

   @JsonCreator
   AttributeCoverageImpl(@JsonProperty("names") final Integer names, @JsonProperty("values") final Integer values) {
      this.names = names;
      this.values = values;
   }
   public AttributeCoverageImpl() {
      
   }
   
   /**
   *  <p>The percentage of attributes from the product type defined in the product variant. A value of <code>1.0</code> indicates a product variant contains all attributes defined in the product type.</p>
   */
   public Integer getNames(){
      return this.names;
   }
   
   /**
   *  <p>Represents the percentage of attributes in the product variant that contain values.</p>
   */
   public Integer getValues(){
      return this.values;
   }

   public void setNames(final Integer names){
      this.names = names;
   }
   
   public void setValues(final Integer values){
      this.values = values;
   }

}
