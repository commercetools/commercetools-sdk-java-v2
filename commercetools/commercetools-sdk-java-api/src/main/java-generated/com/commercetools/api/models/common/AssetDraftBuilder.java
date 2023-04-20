
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssetDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssetDraft assetDraft = AssetDraft.builder()
 *             .plusSources(sourcesBuilder -> sourcesBuilder)
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    /**
     * set values to the sources
     * @param sources value to be set
     * @return Builder
     */

    public AssetDraftBuilder sources(final com.commercetools.api.models.common.AssetSource... sources) {
        this.sources = new ArrayList<>(Arrays.asList(sources));
        return this;
    }

    /**
     * set value to the sources
     * @param sources value to be set
     * @return Builder
     */

    public AssetDraftBuilder sources(final java.util.List<com.commercetools.api.models.common.AssetSource> sources) {
        this.sources = sources;
        return this;
    }

    /**
     * add values to the sources
     * @param sources value to be set
     * @return Builder
     */

    public AssetDraftBuilder plusSources(final com.commercetools.api.models.common.AssetSource... sources) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.addAll(Arrays.asList(sources));
        return this;
    }

    /**
     * add the value to the sources using the builder function
     * @param builder function to build the sources value
     * @return Builder
     */

    public AssetDraftBuilder plusSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSourceBuilder> builder) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    /**
     * set the value to the sources using the builder function
     * @param builder function to build the sources value
     * @return Builder
     */

    public AssetDraftBuilder withSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSourceBuilder> builder) {
        this.sources = new ArrayList<>();
        this.sources.add(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    /**
     * add the value to the sources using the builder function
     * @param builder function to build the sources value
     * @return Builder
     */

    public AssetDraftBuilder addSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSource> builder) {
        return plusSources(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()));
    }

    /**
     * set the value to the sources using the builder function
     * @param builder function to build the sources value
     * @return Builder
     */

    public AssetDraftBuilder setSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSource> builder) {
        return sources(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()));
    }

    /**
     *  <p>Name of the Asset.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public AssetDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the Asset.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public AssetDraftBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the Asset.</p>
     * @param name value to be set
     * @return Builder
     */

    public AssetDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the Asset.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public AssetDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the Asset.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public AssetDraftBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the Asset.</p>
     * @param description value to be set
     * @return Builder
     */

    public AssetDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags value to be set
     * @return Builder
     */

    public AssetDraftBuilder tags(@Nullable final String... tags) {
        this.tags = new ArrayList<>(Arrays.asList(tags));
        return this;
    }

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags value to be set
     * @return Builder
     */

    public AssetDraftBuilder tags(@Nullable final java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags value to be set
     * @return Builder
     */

    public AssetDraftBuilder plusTags(@Nullable final String... tags) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.addAll(Arrays.asList(tags));
        return this;
    }

    /**
     *  <p>Custom Fields defined for the Asset.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public AssetDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields defined for the Asset.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public AssetDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields defined for the Asset.</p>
     * @param custom value to be set
     * @return Builder
     */

    public AssetDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the Asset.</p>
     * @param key value to be set
     * @return Builder
     */

    public AssetDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     * value of sources}
     * @return sources
     */

    public java.util.List<com.commercetools.api.models.common.AssetSource> getSources() {
        return this.sources;
    }

    /**
     *  <p>Name of the Asset.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Description of the Asset.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @return tags
     */

    @Nullable
    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     *  <p>Custom Fields defined for the Asset.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>User-defined unique identifier for the Asset.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds AssetDraft with checking for non-null required values
     * @return AssetDraft
     */
    public AssetDraft build() {
        Objects.requireNonNull(sources, AssetDraft.class + ": sources is missing");
        Objects.requireNonNull(name, AssetDraft.class + ": name is missing");
        return new AssetDraftImpl(sources, name, description, tags, custom, key);
    }

    /**
     * builds AssetDraft without checking for non-null required values
     * @return AssetDraft
     */
    public AssetDraft buildUnchecked() {
        return new AssetDraftImpl(sources, name, description, tags, custom, key);
    }

    /**
     * factory method for an instance of AssetDraftBuilder
     * @return builder
     */
    public static AssetDraftBuilder of() {
        return new AssetDraftBuilder();
    }

    /**
     * create builder for AssetDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
