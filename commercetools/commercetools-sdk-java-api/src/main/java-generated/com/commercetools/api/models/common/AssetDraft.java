package com.commercetools.api.models.common;

import com.commercetools.api.models.common.AssetSource;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.commercetools.api.models.common.AssetDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * AssetDraft
 *
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = AssetDraftImpl.class)
public interface AssetDraft extends com.commercetools.api.models.CustomizableDraft<AssetDraft>, com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<AssetDraft> {


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
    public CustomFieldsDraft getCustom();
    /**
     *  <p>User-defined unique identifier for the Asset.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();

    /**
     * set sources
     * @param sources values to be set
     */
    
    @JsonIgnore
    public void setSources(final AssetSource ...sources);
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
    public void setTags(final String ...tags);
    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags values to be set
     */
    
    public void setTags(final List<String> tags);
    
    /**
     *  <p>Custom Fields defined for the Asset.</p>
     * @param custom value to be set
     */
    
    public void setCustom(final CustomFieldsDraft custom);
    
    
    /**
     *  <p>User-defined unique identifier for the Asset.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    

    /**
     * factory method
     * @return instance of AssetDraft
     */
    public static AssetDraft of(){
        return new AssetDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy AssetDraft
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of AssetDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssetDraft deepCopy(@Nullable final AssetDraft template) {
        if (template == null) {
            return null;
        }
        AssetDraftImpl instance = new AssetDraftImpl();
        instance.setSources(Optional.ofNullable(template.getSources())
                .map(t -> t.stream().map(com.commercetools.api.models.common.AssetSource::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setDescription(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setTags(Optional.ofNullable(template.getTags())
                .map(ArrayList::new)
                .orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for AssetDraft
     * @return builder
     */
    public static AssetDraftBuilder builder() {
        return AssetDraftBuilder.of();
    }
    
    /**
     * create builder for AssetDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssetDraftBuilder builder(final AssetDraft template) {
        return AssetDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssetDraft(Function<AssetDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssetDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssetDraft>() {
            @Override
            public String toString() {
                return "TypeReference<AssetDraft>";
            }
        };
    }
}
