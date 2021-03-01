
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SearchIndexingConfigurationValuesImpl.class)
public interface SearchIndexingConfigurationValues {

    /**
    *  <p>Can be one of the following or absent. &quot;Activated&quot; or absent means that the search and suggest endpoints for the specified resource type are active. &quot;Deactivated&quot; means that the search and suggest endpoints for the specified resource type cannot be used. &quot;Indexing&quot; indicates that the search and suggest endpoints can <em>temporally</em> not be used because the search index is being re-built.</p>
    */

    @JsonProperty("status")
    public String getStatus();

    public void setStatus(final String status);

    public static SearchIndexingConfigurationValues of() {
        return new SearchIndexingConfigurationValuesImpl();
    }

    public static SearchIndexingConfigurationValues of(final SearchIndexingConfigurationValues template) {
        SearchIndexingConfigurationValuesImpl instance = new SearchIndexingConfigurationValuesImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    public static SearchIndexingConfigurationValuesBuilder builder() {
        return SearchIndexingConfigurationValuesBuilder.of();
    }

    public static SearchIndexingConfigurationValuesBuilder builder(final SearchIndexingConfigurationValues template) {
        return SearchIndexingConfigurationValuesBuilder.of(template);
    }

    default <T> T withSearchIndexingConfigurationValues(Function<SearchIndexingConfigurationValues, T> helper) {
        return helper.apply(this);
    }
}
