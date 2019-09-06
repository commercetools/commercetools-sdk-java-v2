package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelUpdateAction;
import com.commercetools.models.Common.Address;
import java.lang.String;
import com.commercetools.models.Channel.ChannelSetAddressAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ChannelSetAddressActionBuilder {
   
   @Nullable
   private com.commercetools.models.Common.Address address;
   
   public ChannelSetAddressActionBuilder address(@Nullable final com.commercetools.models.Common.Address address) {
      this.address = address;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Common.Address getAddress(){
      return this.address;
   }

   public ChannelSetAddressAction build() {
       return new ChannelSetAddressActionImpl(address);
   }
   
   public static ChannelSetAddressActionBuilder of() {
      return new ChannelSetAddressActionBuilder();
   }
   
   public static ChannelSetAddressActionBuilder of(final ChannelSetAddressAction template) {
      ChannelSetAddressActionBuilder builder = new ChannelSetAddressActionBuilder();
      builder.address = template.getAddress();
      return builder;
   }
   
}