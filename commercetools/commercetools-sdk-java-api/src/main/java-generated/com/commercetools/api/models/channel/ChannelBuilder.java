package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelRoleEnum;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.GeoJson;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.review.ReviewRatingStatistics;
import com.commercetools.api.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.models.channel.Channel;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelBuilder
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChannelBuilder implements Builder<Channel> {

    
    
    private String id;
    
    
    
    private Long version;
    
    
    
    private java.time.ZonedDateTime createdAt;
    
    
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    
    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    
    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    
    
    private String key;
    
    
    
    private java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles;
    
    
    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;
    
    
    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;
    
    
    @Nullable
    private com.commercetools.api.models.common.Address address;
    
    
    @Nullable
    private com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics;
    
    
    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;
    
    
    @Nullable
    private com.commercetools.api.models.common.GeoJson geoLocation;

    
    /**
     *  <p>Unique identifier of the Channel.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public ChannelBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>Current version of the Channel.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public ChannelBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time (UTC) the Channel was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */
    
    public ChannelBuilder createdAt( final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time (UTC) the Channel was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */
    
    public ChannelBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }
    
    
    
    
    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */
    
    public ChannelBuilder lastModifiedBy(Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */
    
    public ChannelBuilder withLastModifiedBy(Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */
    
    public ChannelBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }
    
    
    
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */
    
    public ChannelBuilder createdBy(Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */
    
    public ChannelBuilder withCreatedBy(Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */
    
    public ChannelBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-defined unique identifier of the Channel.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public ChannelBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    
    
    /**
     *  <p>Roles of the Channel.</p>
     * @param roles value to be set
     * @return Builder
     */
    
    public ChannelBuilder roles( final com.commercetools.api.models.channel.ChannelRoleEnum ...roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }
    
    /**
     *  <p>Roles of the Channel.</p>
     * @param roles value to be set
     * @return Builder
     */
    
    public ChannelBuilder roles( final java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles) {
        this.roles = roles;
        return this;
    }
    
    /**
     *  <p>Roles of the Channel.</p>
     * @param roles value to be set
     * @return Builder
     */
    
    public ChannelBuilder plusRoles( final com.commercetools.api.models.channel.ChannelRoleEnum ...roles) {
        if (this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.addAll(Arrays.asList(roles));
        return this;
    }
    
    
    
    
    
    /**
     *  <p>Name of the Channel.</p>
     * @param builder function to build the name value
     * @return Builder
     */
    
    public ChannelBuilder name(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Name of the Channel.</p>
     * @param builder function to build the name value
     * @return Builder
     */
    
    public ChannelBuilder withName(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Name of the Channel.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public ChannelBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>Description of the Channel.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public ChannelBuilder description(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Description of the Channel.</p>
     * @param builder function to build the description value
     * @return Builder
     */
    
    public ChannelBuilder withDescription(Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Description of the Channel.</p>
     * @param description value to be set
     * @return Builder
     */
    
    public ChannelBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }
    
    
    
    
    /**
     *  <p>Address where the Channel is located (for example, if the Channel is a physical store).</p>
     * @param builder function to build the address value
     * @return Builder
     */
    
    public ChannelBuilder address(Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Address where the Channel is located (for example, if the Channel is a physical store).</p>
     * @param builder function to build the address value
     * @return Builder
     */
    
    public ChannelBuilder withAddress(Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Address where the Channel is located (for example, if the Channel is a physical store).</p>
     * @param address value to be set
     * @return Builder
     */
    
    public ChannelBuilder address(@Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }
    
    
    
    
    /**
     *  <p>Statistics about the review ratings taken into account for the Channel.</p>
     * @param builder function to build the reviewRatingStatistics value
     * @return Builder
     */
    
    public ChannelBuilder reviewRatingStatistics(Function<com.commercetools.api.models.review.ReviewRatingStatisticsBuilder, com.commercetools.api.models.review.ReviewRatingStatisticsBuilder> builder) {
        this.reviewRatingStatistics = builder.apply(com.commercetools.api.models.review.ReviewRatingStatisticsBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Statistics about the review ratings taken into account for the Channel.</p>
     * @param builder function to build the reviewRatingStatistics value
     * @return Builder
     */
    
    public ChannelBuilder withReviewRatingStatistics(Function<com.commercetools.api.models.review.ReviewRatingStatisticsBuilder, com.commercetools.api.models.review.ReviewRatingStatistics> builder) {
        this.reviewRatingStatistics = builder.apply(com.commercetools.api.models.review.ReviewRatingStatisticsBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Statistics about the review ratings taken into account for the Channel.</p>
     * @param reviewRatingStatistics value to be set
     * @return Builder
     */
    
    public ChannelBuilder reviewRatingStatistics(@Nullable final com.commercetools.api.models.review.ReviewRatingStatistics reviewRatingStatistics) {
        this.reviewRatingStatistics = reviewRatingStatistics;
        return this;
    }
    
    
    
    
    /**
     *  <p>Custom Fields defined for the Channel.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public ChannelBuilder custom(Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Custom Fields defined for the Channel.</p>
     * @param builder function to build the custom value
     * @return Builder
     */
    
    public ChannelBuilder withCustom(Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Custom Fields defined for the Channel.</p>
     * @param custom value to be set
     * @return Builder
     */
    
    public ChannelBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }
    
    
    
    
    /**
     *  <p>GeoJSON geometry object encoding the geo location of the Channel.</p>
     * @param geoLocation value to be set
     * @return Builder
     */
    
    public ChannelBuilder geoLocation(@Nullable final com.commercetools.api.models.common.GeoJson geoLocation) {
        this.geoLocation = geoLocation;
        return this;
    }
    
    
    /**
     *  <p>GeoJSON geometry object encoding the geo location of the Channel.</p>
     * @param builder function to build the geoLocation value
     * @return Builder
     */
    
    public ChannelBuilder geoLocation(Function<com.commercetools.api.models.common.GeoJsonBuilder, Builder<? extends com.commercetools.api.models.common.GeoJson>> builder) {
        this.geoLocation = builder.apply(com.commercetools.api.models.common.GeoJsonBuilder.of()).build();
        return this;
    }
                    

    /**
     *  <p>Unique identifier of the Channel.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Current version of the Channel.</p>
     * @return version
     */
    
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Date and time (UTC) the Channel was initially created.</p>
     * @return createdAt
     */
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    /**
     *  <p>Date and time (UTC) the Channel was last updated.</p>
     * @return lastModifiedAt
     */
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     * @return lastModifiedBy
     */
    
    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    
    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    /**
     *  <p>User-defined unique identifier of the Channel.</p>
     * @return key
     */
    
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>Roles of the Channel.</p>
     * @return roles
     */
    
    
    public java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> getRoles(){
        return this.roles;
    }
    
    /**
     *  <p>Name of the Channel.</p>
     * @return name
     */
    
    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }
    
    /**
     *  <p>Description of the Channel.</p>
     * @return description
     */
    
    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    /**
     *  <p>Address where the Channel is located (for example, if the Channel is a physical store).</p>
     * @return address
     */
    
    @Nullable
    public com.commercetools.api.models.common.Address getAddress(){
        return this.address;
    }
    
    /**
     *  <p>Statistics about the review ratings taken into account for the Channel.</p>
     * @return reviewRatingStatistics
     */
    
    @Nullable
    public com.commercetools.api.models.review.ReviewRatingStatistics getReviewRatingStatistics(){
        return this.reviewRatingStatistics;
    }
    
    /**
     *  <p>Custom Fields defined for the Channel.</p>
     * @return custom
     */
    
    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom(){
        return this.custom;
    }
    
    /**
     *  <p>GeoJSON geometry object encoding the geo location of the Channel.</p>
     * @return geoLocation
     */
    
    @Nullable
    public com.commercetools.api.models.common.GeoJson getGeoLocation(){
        return this.geoLocation;
    }

    /**
     * builds Channel with checking for non-null required values
     * @return Channel
     */
    public Channel build() {
        Objects.requireNonNull(id, Channel.class + ": id is missing");
        Objects.requireNonNull(version, Channel.class + ": version is missing");
        Objects.requireNonNull(createdAt, Channel.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Channel.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(key, Channel.class + ": key is missing");
        Objects.requireNonNull(roles, Channel.class + ": roles is missing");
        return new ChannelImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, roles, name, description, address, reviewRatingStatistics, custom, geoLocation);
    }
    
    /**
     * builds Channel without checking for non-null required values
     * @return Channel
     */
    public Channel buildUnchecked() {
        return new ChannelImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, roles, name, description, address, reviewRatingStatistics, custom, geoLocation);
    }

    /**
     * factory method for an instance of ChannelBuilder
     * @return builder 
     */
    public static ChannelBuilder of() {
        return new ChannelBuilder();
    }

    /**
     * create builder for Channel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelBuilder of(final Channel template) {
        ChannelBuilder builder = new ChannelBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.roles = template.getRoles();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.address = template.getAddress();
        builder.reviewRatingStatistics = template.getReviewRatingStatistics();
        builder.custom = template.getCustom();
        builder.geoLocation = template.getGeoLocation();
        return builder;
    }

}
