
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AssetBuilder implements Builder<Asset> {

    private String id;

    private java.util.List<com.commercetools.api.models.common.AssetSource> sources;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private java.util.List<String> tags;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private String key;

    public AssetBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public AssetBuilder sources(final com.commercetools.api.models.common.AssetSource... sources) {
        this.sources = new ArrayList<>(Arrays.asList(sources));
        return this;
    }

    public AssetBuilder sources(final java.util.List<com.commercetools.api.models.common.AssetSource> sources) {
        this.sources = sources;
        return this;
    }

    public AssetBuilder plusSources(final com.commercetools.api.models.common.AssetSource... sources) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.addAll(Arrays.asList(sources));
        return this;
    }

    public AssetBuilder plusSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSourceBuilder> builder) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    public AssetBuilder withSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSourceBuilder> builder) {
        this.sources = new ArrayList<>();
        this.sources.add(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    public AssetBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public AssetBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public AssetBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public AssetBuilder description(@Nullable final com.commercetools.api.models.common.LocalizedString description) {
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
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    public AssetBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public AssetBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public java.util.List<com.commercetools.api.models.common.AssetSource> getSources() {
        return this.sources;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    @Nullable
    public java.util.List<String> getTags() {
        return this.tags;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public Asset build() {
        Objects.requireNonNull(id, Asset.class + ": id is missing");
        Objects.requireNonNull(sources, Asset.class + ": sources is missing");
        Objects.requireNonNull(name, Asset.class + ": name is missing");
        return new AssetImpl(id, sources, name, description, tags, custom, key);
    }

    /**
     * builds Asset without checking for non null required values
     */
    public Asset buildUnchecked() {
        return new AssetImpl(id, sources, name, description, tags, custom, key);
    }

    public static AssetBuilder of() {
        return new AssetBuilder();
    }

    public static AssetBuilder of(final Asset template) {
        AssetBuilder builder = new AssetBuilder();
        builder.id = template.getId();
        builder.sources = template.getSources();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.tags = template.getTags();
        builder.custom = template.getCustom();
        builder.key = template.getKey();
        return builder;
    }

}
