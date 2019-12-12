package com.commercetools.api.generated.models.channel;

import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.common.ResourceIdentifier;
import com.commercetools.api.generated.models.channel.ChannelResourceIdentifierImpl;

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
@JsonDeserialize(as = ChannelResourceIdentifierImpl.class)
public interface ChannelResourceIdentifier extends ResourceIdentifier {


   
   public static ChannelResourceIdentifierImpl of(){
      return new ChannelResourceIdentifierImpl();
   }
   

   public static ChannelResourceIdentifierImpl of(final ChannelResourceIdentifier template) {
      ChannelResourceIdentifierImpl instance = new ChannelResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}