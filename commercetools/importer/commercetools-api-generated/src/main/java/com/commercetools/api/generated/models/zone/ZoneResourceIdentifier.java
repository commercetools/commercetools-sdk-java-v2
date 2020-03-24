package com.commercetools.api.generated.models.zone;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.common.ResourceIdentifier;
import com.commercetools.api.generated.models.zone.ZoneResourceIdentifierImpl;

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