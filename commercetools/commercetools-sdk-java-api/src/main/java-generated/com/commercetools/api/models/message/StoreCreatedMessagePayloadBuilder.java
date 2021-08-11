
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreCreatedMessagePayloadBuilder implements Builder<StoreCreatedMessagePayload> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    private java.util.List<String> languages;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> distributionChannels;

    private java.util.List<com.commercetools.api.models.channel.ChannelReference> supplyChannels;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    public StoreCreatedMessagePayloadBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public StoreCreatedMessagePayloadBuilder languages(final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
        return this;
    }

    public StoreCreatedMessagePayloadBuilder languages(final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    public StoreCreatedMessagePayloadBuilder distributionChannels(
            final com.commercetools.api.models.channel.ChannelReference... distributionChannels) {
        this.distributionChannels = new ArrayList<>(Arrays.asList(distributionChannels));
        return this;
    }

    public StoreCreatedMessagePayloadBuilder distributionChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> distributionChannels) {
        this.distributionChannels = distributionChannels;
        return this;
    }

    public StoreCreatedMessagePayloadBuilder supplyChannels(
            final com.commercetools.api.models.channel.ChannelReference... supplyChannels) {
        this.supplyChannels = new ArrayList<>(Arrays.asList(supplyChannels));
        return this;
    }

    public StoreCreatedMessagePayloadBuilder supplyChannels(
            final java.util.List<com.commercetools.api.models.channel.ChannelReference> supplyChannels) {
        this.supplyChannels = supplyChannels;
        return this;
    }

    public StoreCreatedMessagePayloadBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getDistributionChannels() {
        return this.distributionChannels;
    }

    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getSupplyChannels() {
        return this.supplyChannels;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public StoreCreatedMessagePayload build() {
        Objects.requireNonNull(languages, StoreCreatedMessagePayload.class + ": languages is missing");
        Objects.requireNonNull(distributionChannels,
            StoreCreatedMessagePayload.class + ": distributionChannels is missing");
        Objects.requireNonNull(supplyChannels, StoreCreatedMessagePayload.class + ": supplyChannels is missing");
        return new StoreCreatedMessagePayloadImpl(name, languages, distributionChannels, supplyChannels, custom);
    }

    /**
     * builds StoreCreatedMessagePayload without checking for non null required values
     */
    public StoreCreatedMessagePayload buildUnchecked() {
        return new StoreCreatedMessagePayloadImpl(name, languages, distributionChannels, supplyChannels, custom);
    }

    public static StoreCreatedMessagePayloadBuilder of() {
        return new StoreCreatedMessagePayloadBuilder();
    }

    public static StoreCreatedMessagePayloadBuilder of(final StoreCreatedMessagePayload template) {
        StoreCreatedMessagePayloadBuilder builder = new StoreCreatedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.languages = template.getLanguages();
        builder.distributionChannels = template.getDistributionChannels();
        builder.supplyChannels = template.getSupplyChannels();
        builder.custom = template.getCustom();
        return builder;
    }

}
