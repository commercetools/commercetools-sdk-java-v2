
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.common.GeoJson;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ChannelDraft
 *
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
@JsonDeserialize(as = ChannelDraftImpl.class)
public interface ChannelDraft extends com.commercetools.api.models.CustomizableDraft<ChannelDraft>,
        com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<ChannelDraft> {

    /**
     *  <p>User-defined unique identifier for the Channel.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Roles of the Channel. Each channel must have at least one role. If not specified, then <code>InventorySupply</code> is assigned by default.</p>
     * @return roles
     */

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
     *  <p>Address where the Channel is located.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
     *  <p>Custom fields defined for the Channel.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>GeoJSON geometry object encoding the geo location of the Channel. Currently, only the <a href="https://docs.commercetools.com/apis/ctp:api:type:GeoJsonPoint" rel="nofollow">Point</a> type is supported.</p>
     * @return geoLocation
     */
    @Valid
    @JsonProperty("geoLocation")
    public GeoJson getGeoLocation();

    /**
     *  <p>User-defined unique identifier for the Channel.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Roles of the Channel. Each channel must have at least one role. If not specified, then <code>InventorySupply</code> is assigned by default.</p>
     * @param roles values to be set
     */

    @JsonIgnore
    public void setRoles(final ChannelRoleEnum... roles);

    /**
     *  <p>Roles of the Channel. Each channel must have at least one role. If not specified, then <code>InventorySupply</code> is assigned by default.</p>
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
     *  <p>Address where the Channel is located.</p>
     * @param address value to be set
     */

    public void setAddress(final BaseAddress address);

    /**
     *  <p>Custom fields defined for the Channel.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>GeoJSON geometry object encoding the geo location of the Channel. Currently, only the <a href="https://docs.commercetools.com/apis/ctp:api:type:GeoJsonPoint" rel="nofollow">Point</a> type is supported.</p>
     * @param geoLocation value to be set
     */

    public void setGeoLocation(final GeoJson geoLocation);

    /**
     * factory method
     * @return instance of ChannelDraft
     */
    public static ChannelDraft of() {
        return new ChannelDraftImpl();
    }

    /**
     * factory method to create a shallow copy ChannelDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChannelDraft of(final ChannelDraft template) {
        ChannelDraftImpl instance = new ChannelDraftImpl();
        instance.setKey(template.getKey());
        instance.setRoles(template.getRoles());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setAddress(template.getAddress());
        instance.setCustom(template.getCustom());
        instance.setGeoLocation(template.getGeoLocation());
        return instance;
    }

    public ChannelDraft copyDeep();

    /**
     * factory method to create a deep copy of ChannelDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChannelDraft deepCopy(@Nullable final ChannelDraft template) {
        if (template == null) {
            return null;
        }
        ChannelDraftImpl instance = new ChannelDraftImpl();
        instance.setKey(template.getKey());
        instance.setRoles(Optional.ofNullable(template.getRoles()).map(ArrayList::new).orElse(null));
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setAddress(com.commercetools.api.models.common.BaseAddress.deepCopy(template.getAddress()));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        instance.setGeoLocation(com.commercetools.api.models.common.GeoJson.deepCopy(template.getGeoLocation()));
        return instance;
    }

    /**
     * builder factory method for ChannelDraft
     * @return builder
     */
    public static ChannelDraftBuilder builder() {
        return ChannelDraftBuilder.of();
    }

    /**
     * create builder for ChannelDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChannelDraftBuilder builder(final ChannelDraft template) {
        return ChannelDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChannelDraft(Function<ChannelDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChannelDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelDraft>";
            }
        };
    }
}
