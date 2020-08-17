package com.commercetools.importer.models.common;

import com.commercetools.importer.models.common.AssetSource;
import com.commercetools.importer.models.common.LocalizedString;
import com.commercetools.importer.models.common.Asset;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AssetBuilder {

    
    private String key;
    
    
    private java.util.List<com.commercetools.importer.models.common.AssetSource> sources;
    
    
    private com.commercetools.importer.models.common.LocalizedString name;
    
    @Nullable
    private com.commercetools.importer.models.common.LocalizedString description;
    
    @Nullable
    private java.util.List<String> tags;

    public AssetBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    public AssetBuilder sources( final java.util.List<com.commercetools.importer.models.common.AssetSource> sources) {
        this.sources = sources;
        return this;
    }
    
    public AssetBuilder name( final com.commercetools.importer.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }
    
    public AssetBuilder description(@Nullable final com.commercetools.importer.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }
    
    public AssetBuilder tags(@Nullable final java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public String getKey(){
        return this.key;
    }
    
    
    public java.util.List<com.commercetools.importer.models.common.AssetSource> getSources(){
        return this.sources;
    }
    
    
    public com.commercetools.importer.models.common.LocalizedString getName(){
        return this.name;
    }
    
    @Nullable
    public com.commercetools.importer.models.common.LocalizedString getDescription(){
        return this.description;
    }
    
    @Nullable
    public java.util.List<String> getTags(){
        return this.tags;
    }

    public Asset build() {
        return new AssetImpl(key, sources, name, description, tags);
    }

    public static AssetBuilder of() {
        return new AssetBuilder();
    }

    public static AssetBuilder of(final Asset template) {
        AssetBuilder builder = new AssetBuilder();
        builder.key = template.getKey();
        builder.sources = template.getSources();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.tags = template.getTags();
        return builder;
    }

}
