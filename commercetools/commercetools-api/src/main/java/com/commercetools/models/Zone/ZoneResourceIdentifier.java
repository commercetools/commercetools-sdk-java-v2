package com.commercetools.models.zone;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.common.ResourceIdentifier;
import com.commercetools.models.zone.ZoneResourceIdentifierImpl;

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
@JsonDeserialize(as = ZoneResourceIdentifierImpl.class)
public interface ZoneResourceIdentifier extends ResourceIdentifier {


   
   public static ZoneResourceIdentifierImpl of(){
      return new ZoneResourceIdentifierImpl();
   }
   

   public static ZoneResourceIdentifierImpl of(final ZoneResourceIdentifier template) {
      ZoneResourceIdentifierImpl instance = new ZoneResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}