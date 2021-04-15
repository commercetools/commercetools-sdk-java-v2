package com.commercetools.api.models.project;

import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.project.SearchIndexingConfigurationStatus;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SearchIndexingConfigurationValuesImpl implements SearchIndexingConfigurationValues {

    
    private com.commercetools.api.models.project.SearchIndexingConfigurationStatus status;
    
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @JsonCreator
    SearchIndexingConfigurationValuesImpl(@JsonProperty("status") final com.commercetools.api.models.project.SearchIndexingConfigurationStatus status, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.status = status;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
    }
    public SearchIndexingConfigurationValuesImpl() {
    }

    /**
    *  <p>Can be one of the following or absent. &quot;Activated&quot; or absent means that the search and suggest endpoints for the specified resource type are active. &quot;Deactivated&quot; means that the search and suggest endpoints for the specified resource type cannot be used. &quot;Indexing&quot; indicates that the search and suggest endpoints can <em>temporally</em> not be used because the search index is being re-built.</p>
    */
    public com.commercetools.api.models.project.SearchIndexingConfigurationStatus getStatus(){
        return this.status;
    }
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }

    
    public void setStatus(final com.commercetools.api.models.project.SearchIndexingConfigurationStatus status){
        this.status = status;
    }
    
    
    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
        this.lastModifiedAt = lastModifiedAt;
    }
    
    
    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
        this.lastModifiedBy = lastModifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SearchIndexingConfigurationValuesImpl that = (SearchIndexingConfigurationValuesImpl) o;
    
        return new EqualsBuilder()
                .append(status, that.status)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(status)
            .append(lastModifiedAt)
            .append(lastModifiedBy)
            .toHashCode();
    }

}
