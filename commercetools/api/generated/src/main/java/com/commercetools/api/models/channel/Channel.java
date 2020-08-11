package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelRoleEnum;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.GeoJson;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.common.LoggedResource;
import com.commercetools.api.models.review.ReviewRatingStatistics;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.channel.ChannelImpl;

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
@JsonDeserialize(as = ChannelImpl.class)
public interface Channel extends LoggedResource {

   /**
   *  <p>The unique ID of the channel.</p>
   */
   @NotNull
   @JsonProperty("id")
   public String getId();

   @NotNull
   @JsonProperty("version")
   public Long getVersion();

   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();

   @NotNull
   @JsonProperty("lastModifiedAt")
   public ZonedDateTime getLastModifiedAt();
   /**
   *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("lastModifiedBy")
   public LastModifiedBy getLastModifiedBy();
   /**
   *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
   */
   @Valid
   @JsonProperty("createdBy")
   public CreatedBy getCreatedBy();
   /**
   *  <p>Any arbitrary string key that uniquely identifies this channel within the project.</p>
   */
   @NotNull
   @JsonProperty("key")
   public String getKey();
   /**
   *  <p>The roles of this channel.
   *  Each channel must have at least one role.</p>
   */
   @NotNull
   @JsonProperty("roles")
   public List<ChannelRoleEnum> getRoles();
   /**
   *  <p>A human-readable name of the channel.</p>
   */
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();
   /**
   *  <p>A human-readable description of the channel.</p>
   */
   @Valid
   @JsonProperty("description")
   public LocalizedString getDescription();
   /**
   *  <p>The address where this channel is located (e.g.
   *  if the channel is a physical store).</p>
   */
   @Valid
   @JsonProperty("address")
   public Address getAddress();
   /**
   *  <p>Statistics about the review ratings taken into account for this channel.</p>
   */
   @Valid
   @JsonProperty("reviewRatingStatistics")
   public ReviewRatingStatistics getReviewRatingStatistics();

   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   /**
   *  <p>A GeoJSON geometry object encoding the geo location of the channel.</p>
   */
   @Valid
   @JsonProperty("geoLocation")
   public GeoJson getGeoLocation();

   public void setId(final String id);

   public void setVersion(final Long version);

   public void setCreatedAt(final ZonedDateTime createdAt);

   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

   public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

   public void setCreatedBy(final CreatedBy createdBy);

   public void setKey(final String key);

   public void setRoles(final List<ChannelRoleEnum> roles);

   public void setName(final LocalizedString name);

   public void setDescription(final LocalizedString description);

   public void setAddress(final Address address);

   public void setReviewRatingStatistics(final ReviewRatingStatistics reviewRatingStatistics);

   public void setCustom(final CustomFields custom);

   public void setGeoLocation(final GeoJson geoLocation);

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
      instance.setCustom(template.getCustom());
      instance.setRoles(template.getRoles());
      instance.setDescription(template.getDescription());
      instance.setGeoLocation(template.getGeoLocation());
      instance.setName(template.getName());
      instance.setReviewRatingStatistics(template.getReviewRatingStatistics());
      instance.setKey(template.getKey());
      return instance;
   }

}
