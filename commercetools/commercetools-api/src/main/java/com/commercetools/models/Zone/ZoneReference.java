package com.commercetools.models.Zone;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Zone.Zone;
import com.commercetools.models.Zone.ZoneReferenceImpl;

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
@JsonDeserialize(as = ZoneReferenceImpl.class)
public interface ZoneReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public Zone getObj();

   public void setObj(final Zone obj);
   
   public static ZoneReferenceImpl of(){
      return new ZoneReferenceImpl();
   }
   

   public static ZoneReferenceImpl of(final ZoneReference template) {
      ZoneReferenceImpl instance = new ZoneReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}