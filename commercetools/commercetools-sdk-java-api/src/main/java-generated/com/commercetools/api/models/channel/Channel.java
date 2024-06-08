
package com.commercetools.api.models.channel;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Channel
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Channel channel = Channel.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .key("{key}")
 *             .plusRoles(rolesBuilder -> rolesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChannelImpl.class)
public interface Channel extends BaseResource, ChannelMixin, com.commercetools.api.models.DomainResource<Channel>,
        com.commercetools.api.models.Referencable<Channel>, com.commercetools.api.models.ResourceIdentifiable<Channel>,
        com.commercetools.api.models.Customizable<Channel>, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the Channel.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Channel.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Channel was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Channel was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the Channel.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the Channel.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the Channel.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Roles of the Channel.</p>
     * @return roles
     */
    @NotNull
    @JsonProperty("roles")
    public List<ChannelRoleEnum> getRoles();

    /**
     *  <p>Name of the Channel.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Description of the Channel.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Address where the Channel is located (for example, if the Channel is a physical store).</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>Statistics about the review ratings taken into account for the Channel.</p>
     * @return reviewRatingStatistics
     */
    @Valid
    @JsonProperty("reviewRatingStatistics")
    public ReviewRatingStatistics getReviewRatingStatistics();

    /**
     *  <p>Custom Fields defined for the Channel.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>GeoJSON geometry object encoding the geo location of the Channel.</p>
     * @return geoLocation
     */
    @Valid
    @JsonProperty("geoLocation")
    public GeoJson getGeoLocation();

    /**
     *  <p>Unique identifier of the Channel.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Channel.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the Channel was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Channel was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the Channel.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the Channel.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>User-defined unique identifier of the Channel.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Roles of the Channel.</p>
     * @param roles values to be set
     */

    @JsonIgnore
    public void setRoles(final ChannelRoleEnum... roles);

    /**
     *  <p>Roles of the Channel.</p>
     * @param roles values to be set
     */

    public void setRoles(final List<ChannelRoleEnum> roles);

    /**
     *  <p>Name of the Channel.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Description of the Channel.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Address where the Channel is located (for example, if the Channel is a physical store).</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     *  <p>Statistics about the review ratings taken into account for the Channel.</p>
     * @param reviewRatingStatistics value to be set
     */

    public void setReviewRatingStatistics(final ReviewRatingStatistics reviewRatingStatistics);

    /**
     *  <p>Custom Fields defined for the Channel.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>GeoJSON geometry object encoding the geo location of the Channel.</p>
     * @param geoLocation value to be set
     */

    public void setGeoLocation(final GeoJson geoLocation);

    /**
     * factory method
     * @return instance of Channel
     */
    public static Channel of() {
        return new ChannelImpl();
    }

    /**
     * factory method to create a shallow copy Channel
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of Channel
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Channel deepCopy(@Nullable final Channel template) {
        if (template == null) {
            return null;
        }
        ChannelImpl instance = new ChannelImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setKey(template.getKey());
        instance.setRoles(Optional.ofNullable(template.getRoles()).map(ArrayList::new).orElse(null));
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        instance.setReviewRatingStatistics(
            com.commercetools.api.models.review.ReviewRatingStatistics.deepCopy(template.getReviewRatingStatistics()));
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setGeoLocation(com.commercetools.api.models.common.GeoJson.deepCopy(template.getGeoLocation()));
        return instance;
    }

    /**
     * builder factory method for Channel
     * @return builder
     */
    public static ChannelBuilder builder() {
        return ChannelBuilder.of();
    }

    /**
     * create builder for Channel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelBuilder builder(final Channel template) {
        return ChannelBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChannel(Function<Channel, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.CHANNEL;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Channel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Channel>() {
            @Override
            public String toString() {
                return "TypeReference<Channel>";
            }
        };
    }
}
