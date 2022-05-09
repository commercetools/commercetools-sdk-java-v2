
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AssetDraftImpl.class)
public interface AssetDraft extends com.commercetools.api.models.CustomizableDraft<AssetDraft> {

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
    public CustomFieldsDraft getCustom();

    /**
    *  <p>User-defined unique identifier for the Asset.</p>
    */

    @JsonProperty("key")
    public String getKey();

    @JsonIgnore
    public void setSources(final AssetSource... sources);

    public void setSources(final List<AssetSource> sources);

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    @JsonIgnore
    public void setTags(final String... tags);

    public void setTags(final List<String> tags);

    public void setCustom(final CustomFieldsDraft custom);

    public void setKey(final String key);

    public static AssetDraft of() {
        return new AssetDraftImpl();
    }

    public static AssetDraft of(final AssetDraft template) {
        AssetDraftImpl instance = new AssetDraftImpl();
        instance.setSources(template.getSources());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setTags(template.getTags());
        instance.setCustom(template.getCustom());
        instance.setKey(template.getKey());
        return instance;
    }

    public static AssetDraftBuilder builder() {
        return AssetDraftBuilder.of();
    }

    public static AssetDraftBuilder builder(final AssetDraft template) {
        return AssetDraftBuilder.of(template);
    }

    default <T> T withAssetDraft(Function<AssetDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AssetDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssetDraft>() {
            @Override
            public String toString() {
                return "TypeReference<AssetDraft>";
            }
        };
    }
}
