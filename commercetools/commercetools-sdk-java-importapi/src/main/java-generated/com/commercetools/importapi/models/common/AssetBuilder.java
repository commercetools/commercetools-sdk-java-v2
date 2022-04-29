
package com.commercetools.importapi.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AssetBuilder implements Builder<Asset> {

    private String key;

    private java.util.List<com.commercetools.importapi.models.common.AssetSource> sources;

    private com.commercetools.importapi.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.importapi.models.common.LocalizedString description;

    @Nullable
    private java.util.List<String> tags;

    @Nullable
    private com.commercetools.importapi.models.customfields.Custom custom;

    public AssetBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public AssetBuilder sources(final com.commercetools.importapi.models.common.AssetSource... sources) {
        this.sources = new ArrayList<>(Arrays.asList(sources));
        return this;
    }

    public AssetBuilder sources(final java.util.List<com.commercetools.importapi.models.common.AssetSource> sources) {
        this.sources = sources;
        return this;
    }

    public AssetBuilder plusSources(final com.commercetools.importapi.models.common.AssetSource... sources) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.addAll(Arrays.asList(sources));
        return this;
    }

    public AssetBuilder plusSources(
            Function<com.commercetools.importapi.models.common.AssetSourceBuilder, com.commercetools.importapi.models.common.AssetSourceBuilder> builder) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(builder.apply(com.commercetools.importapi.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    public AssetBuilder withSources(
            Function<com.commercetools.importapi.models.common.AssetSourceBuilder, com.commercetools.importapi.models.common.AssetSourceBuilder> builder) {
        this.sources = new ArrayList<>();
        this.sources.add(builder.apply(com.commercetools.importapi.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    public AssetBuilder name(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public AssetBuilder name(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public AssetBuilder description(
            Function<com.commercetools.importapi.models.common.LocalizedStringBuilder, com.commercetools.importapi.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.importapi.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public AssetBuilder description(
            @Nullable final com.commercetools.importapi.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public AssetBuilder tags(@Nullable final String... tags) {
        this.tags = new ArrayList<>(Arrays.asList(tags));
        return this;
    }

    public AssetBuilder tags(@Nullable final java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }

    public AssetBuilder plusTags(@Nullable final String... tags) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.addAll(Arrays.asList(tags));
        return this;
    }

    public AssetBuilder custom(
            Function<com.commercetools.importapi.models.customfields.CustomBuilder, com.commercetools.importapi.models.customfields.CustomBuilder> builder) {
        this.custom = builder.apply(com.commercetools.importapi.models.customfields.CustomBuilder.of()).build();
        return this;
    }

    public AssetBuilder custom(@Nullable final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public java.util.List<com.commercetools.importapi.models.common.AssetSource> getSources() {
        return this.sources;
    }

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.importapi.models.common.LocalizedString getDescription() {
        return this.description;
    }

    @Nullable
    public java.util.List<String> getTags() {
        return this.tags;
    }

    @Nullable
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    public Asset build() {
        Objects.requireNonNull(key, Asset.class + ": key is missing");
        Objects.requireNonNull(sources, Asset.class + ": sources is missing");
        Objects.requireNonNull(name, Asset.class + ": name is missing");
        return new AssetImpl(key, sources, name, description, tags, custom);
    }

    /**
     * builds Asset without checking for non null required values
     */
    public Asset buildUnchecked() {
        return new AssetImpl(key, sources, name, description, tags, custom);
    }

    public static AssetBuilder of() {
        return new AssetBuilder();
    }

    public static AssetBuilder of(final Asset template) {
        AssetBuilder builder = new AssetBuilder();
        builder.key = template.getKey();
        builder.sources = template.getSources();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.tags = template.getTags();
        builder.custom = template.getCustom();
        return builder;
    }

}
