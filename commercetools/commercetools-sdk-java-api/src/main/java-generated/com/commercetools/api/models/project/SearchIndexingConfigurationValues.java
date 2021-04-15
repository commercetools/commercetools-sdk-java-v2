package com.commercetools.api.models.project;

import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.project.SearchIndexingConfigurationStatus;
import java.time.ZonedDateTime;
import com.commercetools.api.models.project.SearchIndexingConfigurationValuesImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = SearchIndexingConfigurationValuesImpl.class)
public interface SearchIndexingConfigurationValues  {


    /**
    *  <p>Can be one of the following or absent. &quot;Activated&quot; or absent means that the search and suggest endpoints for the specified resource type are active. &quot;Deactivated&quot; means that the search and suggest endpoints for the specified resource type cannot be used. &quot;Indexing&quot; indicates that the search and suggest endpoints can <em>temporally</em> not be used because the search index is being re-built.</p>
    */
    
    @JsonProperty("status")
    public SearchIndexingConfigurationStatus getStatus();
    
    
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();
    
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    
    public void setStatus(final SearchIndexingConfigurationStatus status);
    
    
    
    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
    
    
    
    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
    

    public static SearchIndexingConfigurationValues of(){
        return new SearchIndexingConfigurationValuesImpl();
    }
    

    public static SearchIndexingConfigurationValues of(final SearchIndexingConfigurationValues template) {
        SearchIndexingConfigurationValuesImpl instance = new SearchIndexingConfigurationValuesImpl();
        instance.setStatus(template.getStatus());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        return instance;
    }

    public static SearchIndexingConfigurationValuesBuilder builder(){
        return SearchIndexingConfigurationValuesBuilder.of();
    }
    
    public static SearchIndexingConfigurationValuesBuilder builder(final SearchIndexingConfigurationValues template){
        return SearchIndexingConfigurationValuesBuilder.of(template);
    }
    

    default <T> T withSearchIndexingConfigurationValues(Function<SearchIndexingConfigurationValues, T> helper) {
        return helper.apply(this);
    }
}
