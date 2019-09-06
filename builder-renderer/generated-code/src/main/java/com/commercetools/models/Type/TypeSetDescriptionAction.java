package com.commercetools.models.Type;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.TypeUpdateAction;
import java.lang.String;
import com.commercetools.models.Type.TypeSetDescriptionActionImpl;

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
@JsonDeserialize(as = TypeSetDescriptionActionImpl.class)
public interface TypeSetDescriptionAction extends TypeUpdateAction {

   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();

   public void setDescription(final LocalizedString description);
   
   public static TypeSetDescriptionActionImpl of(){
      return new TypeSetDescriptionActionImpl();
   }
   

   public static TypeSetDescriptionActionImpl of(final TypeSetDescriptionAction template) {
      TypeSetDescriptionActionImpl instance = new TypeSetDescriptionActionImpl();
      instance.setDescription(template.getDescription());
      return instance;
   }

}