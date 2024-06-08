
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .description(descriptionBuilder -> descriptionBuilder)
 *             .custom(customBuilder -> customBuilder)
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssetImpl.class)
public interface Asset {

    /**
     *
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *
     * @return description
     */
    @NotNull
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *
     * @return custom
     */
    @NotNull
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     * set id
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * set name
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * set description
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     * set custom
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * set key
     * @param key value to be set
     */

    public void setKey(final String key);

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
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setCustom(template.getCustom());
        instance.setKey(template.getKey());
        return instance;
    }

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
        instance.setId(template.getId());
        instance.setName(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setDescription(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setCustom(com.commercetools.history.models.common.CustomFields.deepCopy(template.getCustom()));
        instance.setKey(template.getKey());
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
