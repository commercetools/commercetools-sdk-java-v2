package com.commercetools.api.generated.models.channel;

import com.commercetools.api.generated.models.channel.ChannelRoleEnum;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.review.ReviewRatingStatistics;
import com.commercetools.api.generated.models.type.CustomFields;
import com.commercetools.api.generated.models.channel.ChannelImpl;

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
@JsonDeserialize(as = ChannelImpl.class)
public interface Channel extends LoggedResource {

   
   @NotNull
   @JsonProperty("key")
   public String getKey();
   
   @NotNull
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
   @JsonProperty("reviewRatingStatistics")
   public ReviewRatingStatistics getReviewRatingStatistics();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   
   
   @JsonProperty("geoLocation")
   public Object getGeoLocation();

   public void setKey(final String key);
   
   public void setRoles(final List<ChannelRoleEnum> roles);
   
   public void setName(final LocalizedString name);
   
   public void setDescription(final LocalizedString description);
   
   public void setAddress(final Address address);
   
   public void setReviewRatingStatistics(final ReviewRatingStatistics reviewRatingStatistics);
   
   public void setCustom(final CustomFields custom);
   
   public void setGeoLocation(final Object geoLocation);
   
   public static ChannelImpl of(){
      return new ChannelImpl();
   }
   

   public static ChannelImpl of(final Channel template) {
      ChannelImpl instance = new ChannelImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setAddress(template.getAddress());
      instance.setGeoLocation(template.getGeoLocation());
      instance.setCustom(template.getCustom());
      instance.setRoles(template.getRoles());
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      instance.setReviewRatingStatistics(template.getReviewRatingStatistics());
      instance.setKey(template.getKey());
      return instance;
   }

}