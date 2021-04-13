package com.commercetools.api.models.project;


import com.commercetools.api.models.project.SearchIndexingConfigurationValues;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SearchIndexingConfigurationValuesBuilder {

    
    @Nullable
    private String status;

    
    public SearchIndexingConfigurationValuesBuilder status(@Nullable final String status) {
        this.status = status;
        return this;
    }

    
    @Nullable
    public String getStatus(){
        return this.status;
    }

    public SearchIndexingConfigurationValues build() {
        return new SearchIndexingConfigurationValuesImpl(status);
    }

    public static SearchIndexingConfigurationValuesBuilder of() {
        return new SearchIndexingConfigurationValuesBuilder();
    }

    public static SearchIndexingConfigurationValuesBuilder of(final SearchIndexingConfigurationValues template) {
        SearchIndexingConfigurationValuesBuilder builder = new SearchIndexingConfigurationValuesBuilder();
        builder.status = template.getStatus();
        return builder;
    }

}
