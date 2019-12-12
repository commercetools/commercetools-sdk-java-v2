package com.commercetools.api.generated.models.zone;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.zone.Zone;
import com.commercetools.api.generated.models.zone.ZoneReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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