
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.common.GeoJson;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelDraftImpl.class)
public interface ChannelDraft extends com.commercetools.api.models.CustomizableDraft<ChannelDraft> {

    /**
    *  <p>User-defined unique identifier for the Channel.</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>Roles of the Channel.
    *  Each channel must have at least one role.
    *  If not specified, then <code>InventorySupply</code> is assigned by default.</p>
    */

    @JsonProperty("roles")
    public List<ChannelRoleEnum> getRoles();

    /**
    *  <p>Name of the Channel.</p>
    */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>Description of the Channel.</p>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
    *  <p>Address where the Channel is located.</p>
    */
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    /**
    *  <p>Custom fields defined for the Channel.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
    *  <p>GeoJSON geometry object encoding the geo location of the Channel.
    *  Currently, only the <a href="/../api/types#point">Point</a> type is supported.</p>
    */
    @Valid
    @JsonProperty("geoLocation")
    public GeoJson getGeoLocation();

    public void setKey(final String key);

    @JsonIgnore
    public void setRoles(final ChannelRoleEnum... roles);

    public void setRoles(final List<ChannelRoleEnum> roles);

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    public void setAddress(final BaseAddress address);

    public void setCustom(final CustomFieldsDraft custom);

    public void setGeoLocation(final GeoJson geoLocation);

    public static ChannelDraft of() {
        return new ChannelDraftImpl();
    }

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

    public static ChannelDraftBuilder builder() {
        return ChannelDraftBuilder.of();
    }

    public static ChannelDraftBuilder builder(final ChannelDraft template) {
        return ChannelDraftBuilder.of(template);
    }

    default <T> T withChannelDraft(Function<ChannelDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChannelDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChannelDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ChannelDraft>";
            }
        };
    }
}
