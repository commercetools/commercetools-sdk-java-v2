package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.AssetSource;
import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.type.CustomFields;
import com.commercetools.api.generated.models.common.AssetImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AssetImpl.class)
public interface Asset  {

   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
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
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   
   
   @JsonProperty("key")
   public String getKey();

   public void setId(final String id);
   
   public void setSources(final List<AssetSource> sources);
   
   public void setName(final LocalizedString name);
   
   public void setDescription(final LocalizedString description);
   
   public void setTags(final List<String> tags);
   
   public void setCustom(final CustomFields custom);
   
   public void setKey(final String key);
   
   public static AssetImpl of(){
      return new AssetImpl();
   }
   

   public static AssetImpl of(final Asset template) {
      AssetImpl instance = new AssetImpl();
      instance.setSources(template.getSources());
      instance.setCustom(template.getCustom());
      instance.setName(template.getName());
      instance.setDescription(template.getDescription());
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      instance.setTags(template.getTags());
      return instance;
   }

}