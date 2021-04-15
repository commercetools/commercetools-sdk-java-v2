
package com.commercetools.api.models.channel;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.GeoJson;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.review.ReviewRatingStatistics;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelImpl.class)
public interface Channel extends BaseResource, com.commercetools.api.models.DomainResource<Channel> {

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

    @JsonIgnore
    public void setRoles(final ChannelRoleEnum... roles);

    public void setRoles(final List<ChannelRoleEnum> roles);

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    public void setAddress(final Address address);

    public void setReviewRatingStatistics(final ReviewRatingStatistics reviewRatingStatistics);

    public void setCustom(final CustomFields custom);

    public void setGeoLocation(final GeoJson geoLocation);

    public static Channel of() {
        return new ChannelImpl();
    }

    public static Channel of(final Channel template) {
        ChannelImpl instance = new ChannelImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setRoles(template.getRoles());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setAddress(template.getAddress());
        instance.setReviewRatingStatistics(template.getReviewRatingStatistics());
        instance.setCustom(template.getCustom());
        instance.setGeoLocation(template.getGeoLocation());
        return instance;
    }

    public static ChannelBuilder builder() {
        return ChannelBuilder.of();
    }

    public static ChannelBuilder builder(final Channel template) {
        return ChannelBuilder.of(template);
    }

    default <T> T withChannel(Function<Channel, T> helper) {
        return helper.apply(this);
    }
}
