
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AssetDraftBuilder implements Builder<AssetDraft> {

    private java.util.List<com.commercetools.api.models.common.AssetSource> sources;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    @Nullable
    private java.util.List<String> tags;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private String key;

    public AssetDraftBuilder sources(final com.commercetools.api.models.common.AssetSource... sources) {
        this.sources = new ArrayList<>(Arrays.asList(sources));
        return this;
    }

    public AssetDraftBuilder sources(final java.util.List<com.commercetools.api.models.common.AssetSource> sources) {
        this.sources = sources;
        return this;
    }

    public AssetDraftBuilder plusSources(final com.commercetools.api.models.common.AssetSource... sources) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.addAll(Arrays.asList(sources));
        return this;
    }

    public AssetDraftBuilder plusSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSourceBuilder> builder) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    public AssetDraftBuilder withSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSourceBuilder> builder) {
        this.sources = new ArrayList<>();
        this.sources.add(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    public AssetDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public AssetDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public AssetDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public AssetDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public AssetDraftBuilder tags(@Nullable final String... tags) {
        this.tags = new ArrayList<>(Arrays.asList(tags));
        return this;
    }

    public AssetDraftBuilder tags(@Nullable final java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }

    public AssetDraftBuilder plusTags(@Nullable final String... tags) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.addAll(Arrays.asList(tags));
        return this;
    }

    public AssetDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public AssetDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public AssetDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
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
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public AssetDraft build() {
        Objects.requireNonNull(sources, AssetDraft.class + ": sources is missing");
        Objects.requireNonNull(name, AssetDraft.class + ": name is missing");
        return new AssetDraftImpl(sources, name, description, tags, custom, key);
    }

    /**
     * builds AssetDraft without checking for non null required values
     */
    public AssetDraft buildUnchecked() {
        return new AssetDraftImpl(sources, name, description, tags, custom, key);
    }

    public static AssetDraftBuilder of() {
        return new AssetDraftBuilder();
    }

    public static AssetDraftBuilder of(final AssetDraft template) {
        AssetDraftBuilder builder = new AssetDraftBuilder();
        builder.sources = template.getSources();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.tags = template.getTags();
        builder.custom = template.getCustom();
        builder.key = template.getKey();
        return builder;
    }

}
