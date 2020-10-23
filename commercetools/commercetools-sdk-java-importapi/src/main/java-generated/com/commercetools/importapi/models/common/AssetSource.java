package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.AssetDimensions;
import com.commercetools.importapi.models.common.AssetSourceImpl;

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
@JsonDeserialize(as = AssetSourceImpl.class)
public interface AssetSource  {

    
    @NotNull
    @JsonProperty("uri")
    public String getUri();
    
    
    @JsonProperty("key")
    public String getKey();
    
    @Valid
    @JsonProperty("dimensions")
    public AssetDimensions getDimensions();
    
    
    @JsonProperty("contentType")
    public String getContentType();

    public void setUri(final String uri);
    
    public void setKey(final String key);
    
    public void setDimensions(final AssetDimensions dimensions);
    
    public void setContentType(final String contentType);

    public static AssetSourceImpl of(){
        return new AssetSourceImpl();
    }
    

    public static AssetSourceImpl of(final AssetSource template) {
        AssetSourceImpl instance = new AssetSourceImpl();
        instance.setUri(template.getUri());
        instance.setKey(template.getKey());
        instance.setDimensions(template.getDimensions());
        instance.setContentType(template.getContentType());
        return instance;
    }

    default <T> T withAssetSource(Function<AssetSource, T> helper) {
        return helper.apply(this);
    }
}
