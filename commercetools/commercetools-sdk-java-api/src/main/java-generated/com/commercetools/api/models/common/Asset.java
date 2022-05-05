
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AssetImpl.class)
public interface Asset extends com.commercetools.api.models.Customizable<Asset> {

    /**
    *  <p>Platform-generated unique identifier of the Asset.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @Valid
    @JsonProperty("sources")
    public List<AssetSource> getSources();

    /**
    *  <p>Name of the Asset.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>Description of the Asset.</p>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
    *  <p>Keywords for categorizing and organizing Assets.</p>
    */

    @JsonProperty("tags")
    public List<String> getTags();

    /**
    *  <p>Custom Fields defined for the Asset.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
    *  <p>User-defined unique identifier of the Asset.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    @JsonIgnore
    public void setSources(final AssetSource... sources);

    public void setSources(final List<AssetSource> sources);

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    @JsonIgnore
    public void setTags(final String... tags);

    public void setTags(final List<String> tags);

    public void setCustom(final CustomFields custom);

    public void setKey(final String key);

    public static Asset of() {
        return new AssetImpl();
    }

    public static Asset of(final Asset template) {
        AssetImpl instance = new AssetImpl();
        instance.setId(template.getId());
        instance.setSources(template.getSources());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setTags(template.getTags());
        instance.setCustom(template.getCustom());
        instance.setKey(template.getKey());
        return instance;
    }

    public static AssetBuilder builder() {
        return AssetBuilder.of();
    }

    public static AssetBuilder builder(final Asset template) {
        return AssetBuilder.of(template);
    }

    default <T> T withAsset(Function<Asset, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Asset> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Asset>() {
            @Override
            public String toString() {
                return "TypeReference<Asset>";
            }
        };
    }
}
