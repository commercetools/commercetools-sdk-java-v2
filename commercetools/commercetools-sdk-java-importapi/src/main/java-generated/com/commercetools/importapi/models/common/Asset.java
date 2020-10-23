package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.AssetSource;
import com.commercetools.importapi.models.common.LocalizedString;
import com.commercetools.importapi.models.customfields.Custom;
import com.commercetools.importapi.models.common.AssetImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AssetImpl.class)
public interface Asset  {

    /**
    *  <p>User-defined identifier for the asset.
    *  Asset keys are unique inside their container (a product variant or a category).</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();
    
    @NotNull
    @Valid
    @JsonProperty("sources")
    public List<AssetSource> getSources();
    
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();
    
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();
    
    
    @JsonProperty("tags")
    public List<String> getTags();
    /**
    *  <p>The representation to be sent to the server when creating a resource with custom fields.</p>
    */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    public void setKey(final String key);
    
    public void setSources(final List<AssetSource> sources);
    
    public void setName(final LocalizedString name);
    
    public void setDescription(final LocalizedString description);
    
    public void setTags(final List<String> tags);
    
    public void setCustom(final Custom custom);

    public static AssetImpl of(){
        return new AssetImpl();
    }
    

    public static AssetImpl of(final Asset template) {
        AssetImpl instance = new AssetImpl();
        instance.setKey(template.getKey());
        instance.setSources(template.getSources());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setTags(template.getTags());
        instance.setCustom(template.getCustom());
        return instance;
    }

    default <T> T withAsset(Function<Asset, T> helper) {
        return helper.apply(this);
    }
}
