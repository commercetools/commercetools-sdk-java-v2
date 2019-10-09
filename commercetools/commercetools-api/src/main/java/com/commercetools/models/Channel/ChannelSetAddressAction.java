package com.commercetools.models.channel;

import com.commercetools.models.channel.ChannelUpdateAction;
import com.commercetools.models.common.Address;
import com.commercetools.models.channel.ChannelSetAddressActionImpl;

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
@JsonDeserialize(as = ChannelSetAddressActionImpl.class)
public interface ChannelSetAddressAction extends ChannelUpdateAction {

   
   @Valid
   @JsonProperty("address")
   public Address getAddress();

   public void setAddress(final Address address);
   
   public static ChannelSetAddressActionImpl of(){
      return new ChannelSetAddressActionImpl();
   }
   

   public static ChannelSetAddressActionImpl of(final ChannelSetAddressAction template) {
      ChannelSetAddressActionImpl instance = new ChannelSetAddressActionImpl();
      instance.setAddress(template.getAddress());
      return instance;
   }

}