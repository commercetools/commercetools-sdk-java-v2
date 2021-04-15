
package com.commercetools.api.models.channel;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.GeoJson;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChannelDraftImpl.class)
public interface ChannelDraft {

    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>If not specified, then channel will get InventorySupply role by default</p>
    */

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

    /**
    *  <p>The custom fields.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    @Valid
    @JsonProperty("geoLocation")
    public GeoJson getGeoLocation();

    public void setKey(final String key);

    @JsonIgnore
    public void setRoles(final ChannelRoleEnum... roles);

    public void setRoles(final List<ChannelRoleEnum> roles);

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    public void setAddress(final Address address);

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
}
