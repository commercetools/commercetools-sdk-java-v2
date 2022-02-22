
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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
    *  <p>If <code>false</code>, the indexing of <a href="ctp:api:type:Product">Product</a> information will stop and the <a href="/../api/projects/products-search">Product Projection Search</a> as well as the <a href="/../api/projects/products-suggestions">Product Suggestions</a> endpoint will not be available anymore for this Project. The Project's <a href="ctp:api:type:SearchIndexingConfiguration">SearchIndexingConfiguration</a> <code>status</code> for <code>products</code> will be changed to <code>&quot;Deactivated&quot;</code>.</p>
    *  <p>If <code>true</code>, the indexing of <a href="ctp:api:type:Product">Product</a> information will start and the <a href="/../api/projects/products-search">Product Projection Search</a> as well as the <a href="/../api/projects/products-suggestions">Product Suggestions</a> endpoint will become available soon after for this Project. Proportional to the amount of information being indexed, the Project's <a href="ctp:api:type:SearchIndexingConfiguration">SearchIndexingConfiguration</a> <code>status</code> for <code>products</code> will be shown as <code>&quot;Indexing&quot;</code> during this time. As soon as the indexing has finished, the configuration status will be changed to <code>&quot;Activated&quot;</code> making the aforementioned endpoints fully available for this Project.</p>
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
