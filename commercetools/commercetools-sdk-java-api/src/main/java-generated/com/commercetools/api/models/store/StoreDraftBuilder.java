
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreDraftBuilder implements Builder<StoreDraft> {

    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private java.util.List<String> languages;

    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels;

    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    public StoreDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public StoreDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public StoreDraftBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public StoreDraftBuilder languages(@Nullable final String... languages) {
        this.languages = new ArrayList<>(Arrays.asList(languages));
        return this;
    }

    public StoreDraftBuilder languages(@Nullable final java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }

    public StoreDraftBuilder distributionChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier... distributionChannels) {
        this.distributionChannels = new ArrayList<>(Arrays.asList(distributionChannels));
        return this;
    }

    public StoreDraftBuilder withDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.distributionChannels = new ArrayList<>();
        this.distributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build());
        return this;
    }

    public StoreDraftBuilder plusDistributionChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        if (this.distributionChannels == null) {
            this.distributionChannels = new ArrayList<>();
        }
        this.distributionChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build());
        return this;
    }

    public StoreDraftBuilder distributionChannels(
            @Nullable final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> distributionChannels) {
        this.distributionChannels = distributionChannels;
        return this;
    }

    public StoreDraftBuilder supplyChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelResourceIdentifier... supplyChannels) {
        this.supplyChannels = new ArrayList<>(Arrays.asList(supplyChannels));
        return this;
    }

    public StoreDraftBuilder withSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        this.supplyChannels = new ArrayList<>();
        this.supplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build());
        return this;
    }

    public StoreDraftBuilder plusSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder, com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder> builder) {
        if (this.supplyChannels == null) {
            this.supplyChannels = new ArrayList<>();
        }
        this.supplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelResourceIdentifierBuilder.of()).build());
        return this;
    }

    public StoreDraftBuilder supplyChannels(
            @Nullable final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels) {
        this.supplyChannels = supplyChannels;
        return this;
    }

    public StoreDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public StoreDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getDistributionChannels() {
        return this.distributionChannels;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getSupplyChannels() {
        return this.supplyChannels;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public StoreDraft build() {
        Objects.requireNonNull(key, StoreDraft.class + ": key is missing");
        return new StoreDraftImpl(key, name, languages, distributionChannels, supplyChannels, custom);
    }

    /**
     * builds StoreDraft without checking for non null required values
     */
    public StoreDraft buildUnchecked() {
        return new StoreDraftImpl(key, name, languages, distributionChannels, supplyChannels, custom);
    }

    public static StoreDraftBuilder of() {
        return new StoreDraftBuilder();
    }

    public static StoreDraftBuilder of(final StoreDraft template) {
        StoreDraftBuilder builder = new StoreDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.languages = template.getLanguages();
        builder.distributionChannels = template.getDistributionChannels();
        builder.supplyChannels = template.getSupplyChannels();
        builder.custom = template.getCustom();
        return builder;
    }

}
