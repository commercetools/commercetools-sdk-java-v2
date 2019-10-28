package com.commercetools.api.generated.models.type;


import com.commercetools.api.generated.models.type.FieldContainerImpl;

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
@JsonDeserialize(as = FieldContainerImpl.class)
public interface FieldContainer  {

   
   @NotNull
   @JsonAnyGetter
   public Map<String, Object> values();

   @JsonAnySetter
   public void setValue(String key, Object value);
   
   public static FieldContainerImpl of(){
      return new FieldContainerImpl();
   }
   

   public static FieldContainerImpl of(final FieldContainer template) {
      FieldContainerImpl instance = new FieldContainerImpl();
      return instance;
   }

}