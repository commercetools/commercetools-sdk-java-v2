
package com.commercetools.api.models.store;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StoreImpl.class)
public interface Store extends BaseResource, com.commercetools.api.models.DomainResource<Store> {

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

    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
    *  <p>User-specific unique identifier for the store.
    *  The <code>key</code> is mandatory and immutable.
    *  It is used to reference the store.</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>The name of the store</p>
    */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    @JsonProperty("languages")
    public List<String> getLanguages();

    /**
    *  <p>Set of References to a Channel with <code>ProductDistribution</code> role</p>
    */
    @NotNull
    @Valid
    @JsonProperty("distributionChannels")
    public List<ChannelReference> getDistributionChannels();

    /**
    *  <p>Set of ResourceIdentifiers of Channels with <code>InventorySupply</code> role</p>
    */
    @Valid
    @JsonProperty("supplyChannels")
    public List<ChannelReference> getSupplyChannels();

    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setKey(final String key);

    public void setName(final LocalizedString name);

    @JsonIgnore
    public void setLanguages(final String... languages);

    public void setLanguages(final List<String> languages);

    @JsonIgnore
    public void setDistributionChannels(final ChannelReference... distributionChannels);

    public void setDistributionChannels(final List<ChannelReference> distributionChannels);

    @JsonIgnore
    public void setSupplyChannels(final ChannelReference... supplyChannels);

    public void setSupplyChannels(final List<ChannelReference> supplyChannels);

    public void setCustom(final CustomFields custom);

    public static Store of() {
        return new StoreImpl();
    }

    public static Store of(final Store template) {
        StoreImpl instance = new StoreImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setLanguages(template.getLanguages());
        instance.setDistributionChannels(template.getDistributionChannels());
        instance.setSupplyChannels(template.getSupplyChannels());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static StoreBuilder builder() {
        return StoreBuilder.of();
    }

    public static StoreBuilder builder(final Store template) {
        return StoreBuilder.of(template);
    }

    default <T> T withStore(Function<Store, T> helper) {
        return helper.apply(this);
    }
}
