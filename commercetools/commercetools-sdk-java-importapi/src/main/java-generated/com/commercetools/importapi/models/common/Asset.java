
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * Asset
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Asset asset = Asset.builder()
 *             .key("{key}")
 *             .plusSources(sourcesBuilder -> sourcesBuilder)
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssetImpl.class)
public interface Asset {

    /**
     *  <p>User-defined identifier for the asset. Asset keys are unique inside their container (a product variant or a category).</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *
     * @return sources
     */
    @NotNull
    @Valid
    @JsonProperty("sources")
    public List<AssetSource> getSources();

    /**
     *  <p>Name of the Asset.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Description of the Asset.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @return tags
     */

    @JsonProperty("tags")
    public List<String> getTags();

    /**
     *  <p>Custom Fields defined for the Asset.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    /**
     *  <p>User-defined identifier for the asset. Asset keys are unique inside their container (a product variant or a category).</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * set sources
     * @param sources values to be set
     */

    @JsonIgnore
    public void setSources(final AssetSource... sources);

    /**
     * set sources
     * @param sources values to be set
     */

    public void setSources(final List<AssetSource> sources);

    /**
     *  <p>Name of the Asset.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Description of the Asset.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags values to be set
     */

    @JsonIgnore
    public void setTags(final String... tags);

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags values to be set
     */

    public void setTags(final List<String> tags);

    /**
     *  <p>Custom Fields defined for the Asset.</p>
     * @param custom value to be set
     */

    public void setCustom(final Custom custom);

    /**
     * factory method
     * @return instance of Asset
     */
    public static Asset of() {
        return new AssetImpl();
    }

    /**
     * factory method to create a shallow copy Asset
     * @param template instance to be copied
     * @return copy instance
     */
    public static Asset of(final Asset template) {
        AssetImpl instance = new AssetImpl();
        instance.setKey(template.getKey());
        instance.setSources(template.getSources());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setTags(template.getTags());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public Asset copyDeep();

    /**
     * factory method to create a deep copy of Asset
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Asset deepCopy(@Nullable final Asset template) {
        if (template == null) {
            return null;
        }
        AssetImpl instance = new AssetImpl();
        instance.setKey(template.getKey());
        instance.setSources(Optional.ofNullable(template.getSources())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.common.AssetSource::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setName(com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setDescription(
            com.commercetools.importapi.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setTags(Optional.ofNullable(template.getTags()).map(ArrayList::new).orElse(null));
        instance.setCustom(com.commercetools.importapi.models.customfields.Custom.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for Asset
     * @return builder
     */
    public static AssetBuilder builder() {
        return AssetBuilder.of();
    }

    /**
     * create builder for Asset instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssetBuilder builder(final Asset template) {
        return AssetBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAsset(Function<Asset, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Asset> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Asset>() {
            @Override
            public String toString() {
                return "TypeReference<Asset>";
            }
        };
    }
}
