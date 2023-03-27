
package com.commercetools.api.models.channel;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChannelDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChannelDraft channelDraft = ChannelDraft.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChannelDraftBuilder implements Builder<ChannelDraft> {

    private String key;

    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.common.GeoJson geoLocation;

    /**
     *  <p>User-defined unique identifier for the Channel.</p>
     * @param key value to be set
     * @return Builder
     */

    public ChannelDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Roles of the Channel. Each channel must have at least one role. If not specified, then <code>InventorySupply</code> is assigned by default.</p>
     * @param roles value to be set
     * @return Builder
     */

    public ChannelDraftBuilder roles(@Nullable final com.commercetools.api.models.channel.ChannelRoleEnum... roles) {
        this.roles = new ArrayList<>(Arrays.asList(roles));
        return this;
    }

    /**
     *  <p>Roles of the Channel. Each channel must have at least one role. If not specified, then <code>InventorySupply</code> is assigned by default.</p>
     * @param roles value to be set
     * @return Builder
     */

    public ChannelDraftBuilder roles(
            @Nullable final java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> roles) {
        this.roles = roles;
        return this;
    }

    /**
     *  <p>Roles of the Channel. Each channel must have at least one role. If not specified, then <code>InventorySupply</code> is assigned by default.</p>
     * @param roles value to be set
     * @return Builder
     */

    public ChannelDraftBuilder plusRoles(
            @Nullable final com.commercetools.api.models.channel.ChannelRoleEnum... roles) {
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

    public ChannelDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Channel.</p>
     * @param name value to be set
     * @return Builder
     */

    public ChannelDraftBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the Channel.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public ChannelDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Channel.</p>
     * @param description value to be set
     * @return Builder
     */

    public ChannelDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Address where the Channel is located.</p>
     * @param builder function to build the address value
     * @return Builder
     */

    public ChannelDraftBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Address where the Channel is located.</p>
     * @param address value to be set
     * @return Builder
     */

    public ChannelDraftBuilder address(@Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    /**
     *  <p>Custom fields defined for the Channel.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public ChannelDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom fields defined for the Channel.</p>
     * @param custom value to be set
     * @return Builder
     */

    public ChannelDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>GeoJSON geometry object encoding the geo location of the Channel. Currently, only the Point type is supported.</p>
     * @param geoLocation value to be set
     * @return Builder
     */

    public ChannelDraftBuilder geoLocation(@Nullable final com.commercetools.api.models.common.GeoJson geoLocation) {
        this.geoLocation = geoLocation;
        return this;
    }

    /**
     *  <p>GeoJSON geometry object encoding the geo location of the Channel. Currently, only the Point type is supported.</p>
     * @param builder function to build the geoLocation value
     * @return Builder
     */

    public ChannelDraftBuilder geoLocation(
            Function<com.commercetools.api.models.common.GeoJsonBuilder, Builder<? extends com.commercetools.api.models.common.GeoJson>> builder) {
        this.geoLocation = builder.apply(com.commercetools.api.models.common.GeoJsonBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the Channel.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Roles of the Channel. Each channel must have at least one role. If not specified, then <code>InventorySupply</code> is assigned by default.</p>
     * @return roles
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelRoleEnum> getRoles() {
        return this.roles;
    }

    /**
     *  <p>Name of the Channel.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Description of the Channel.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Address where the Channel is located.</p>
     * @return address
     */

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    /**
     *  <p>Custom fields defined for the Channel.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>GeoJSON geometry object encoding the geo location of the Channel. Currently, only the Point type is supported.</p>
     * @return geoLocation
     */

    @Nullable
    public com.commercetools.api.models.common.GeoJson getGeoLocation() {
        return this.geoLocation;
    }

    /**
     * builds ChannelDraft with checking for non-null required values
     * @return ChannelDraft
     */
    public ChannelDraft build() {
        Objects.requireNonNull(key, ChannelDraft.class + ": key is missing");
        return new ChannelDraftImpl(key, roles, name, description, address, custom, geoLocation);
    }

    /**
     * builds ChannelDraft without checking for non-null required values
     * @return ChannelDraft
     */
    public ChannelDraft buildUnchecked() {
        return new ChannelDraftImpl(key, roles, name, description, address, custom, geoLocation);
    }

    /**
     * factory method for an instance of ChannelDraftBuilder
     * @return builder
     */
    public static ChannelDraftBuilder of() {
        return new ChannelDraftBuilder();
    }

    /**
     * create builder for ChannelDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelDraftBuilder of(final ChannelDraft template) {
        ChannelDraftBuilder builder = new ChannelDraftBuilder();
        builder.key = template.getKey();
        builder.roles = template.getRoles();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.address = template.getAddress();
        builder.custom = template.getCustom();
        builder.geoLocation = template.getGeoLocation();
        return builder;
    }

}
