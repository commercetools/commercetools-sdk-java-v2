package com.commercetools.models.Channel;

import com.commercetools.models.Channel.ChannelRoleEnum;
import com.commercetools.models.Common.Address;
import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Channel.ChannelDraftImpl;

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
@JsonDeserialize(as = ChannelDraftImpl.class)
public interface ChannelDraft  {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
   
   @JsonProperty("roles")
   public List<ChannelRoleEnum> getRoles();
   
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   
   @Valid
   @JsonProperty("address")
   public Address getAddress();
   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   
   
   @JsonProperty("geoLocation")
   public Object getGeoLocation();

   public void setKey(final String key);
   
   public void setRoles(final List<ChannelRoleEnum> roles);
   
   public void setName(final LocalizedString name);
   
   public void setDescription(final LocalizedString description);
   
   public void setAddress(final Address address);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public void setGeoLocation(final Object geoLocation);
   
   public static ChannelDraftImpl of(){
      return new ChannelDraftImpl();
   }
   

   public static ChannelDraftImpl of(final ChannelDraft template) {
      ChannelDraftImpl instance = new ChannelDraftImpl();
      instance.setAddress(template.getAddress());
      instance.setGeoLocation(template.getGeoLocation());
      instance.setCustom(template.getCustom());
      instance.setRoles(template.getRoles());
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      instance.setKey(template.getKey());
      return instance;
   }

}