
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeProductSearchIndexingEnabledActionImpl
        implements ProjectChangeProductSearchIndexingEnabledAction, ModelBase {

    private String action;

    private Boolean enabled;

    @JsonCreator
    ProjectChangeProductSearchIndexingEnabledActionImpl(@JsonProperty("enabled") final Boolean enabled) {
        this.enabled = enabled;
        this.action = CHANGE_PRODUCT_SEARCH_INDEXING_ENABLED;
    }

    public ProjectChangeProductSearchIndexingEnabledActionImpl() {
        this.action = CHANGE_PRODUCT_SEARCH_INDEXING_ENABLED;
    }

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>If <code>false</code>, the indexing of Product information will stop and the Product Projection Search as well as the Product Suggestions endpoint will not be available anymore for this Project. The Project's SearchIndexingConfiguration <code>status</code> for <code>products</code> will be changed to <code>"Deactivated"</code>.</p>
     *  <p>If <code>true</code>, the indexing of Product information will start and the Product Projection Search as well as the Product Suggestions endpoint will become available soon after for this Project. Proportional to the amount of information being indexed, the Project's SearchIndexingConfiguration <code>status</code> for <code>products</code> will be shown as <code>"Indexing"</code> during this time. As soon as the indexing has finished, the configuration status will be changed to <code>"Activated"</code> making the aforementioned endpoints fully available for this Project.</p>
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectChangeProductSearchIndexingEnabledActionImpl that = (ProjectChangeProductSearchIndexingEnabledActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(enabled, that.enabled).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(enabled).toHashCode();
    }

}
