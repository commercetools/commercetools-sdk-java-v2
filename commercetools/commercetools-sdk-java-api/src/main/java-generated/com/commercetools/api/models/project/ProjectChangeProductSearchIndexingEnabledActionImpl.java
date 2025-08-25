
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * ProjectChangeProductSearchIndexingEnabledAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeProductSearchIndexingEnabledActionImpl
        implements ProjectChangeProductSearchIndexingEnabledAction, ModelBase {

    private String action;

    private Boolean enabled;

    private com.commercetools.api.models.project.ProductSearchIndexingMode mode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectChangeProductSearchIndexingEnabledActionImpl(@JsonProperty("enabled") final Boolean enabled,
            @JsonProperty("mode") final com.commercetools.api.models.project.ProductSearchIndexingMode mode) {
        this.enabled = enabled;
        this.mode = mode;
        this.action = CHANGE_PRODUCT_SEARCH_INDEXING_ENABLED;
    }

    /**
     * create empty instance
     */
    public ProjectChangeProductSearchIndexingEnabledActionImpl() {
        this.action = CHANGE_PRODUCT_SEARCH_INDEXING_ENABLED;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <ul>
     *   <li>If <code>false</code>, the indexing of <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> information will stop and the <span>Product Projection Search</span> as well as the <span>Search Term Suggestions</span> API will no longer be available for this Project. The Project's <a href="https://docs.commercetools.com/apis/ctp:api:type:SearchIndexingConfiguration" rel="nofollow">SearchIndexingConfiguration</a> <code>status</code> for <code>products</code> will be changed to <code>"Deactivated"</code>.</li>
     *   <li>If <code>true</code>, the indexing of <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> information will start and the <span>Product Projection Search</span> as well as the <span>Search Term Suggestions</span> API will become available soon after for this Project. Proportional to the amount of information being indexed, the Project's <a href="https://docs.commercetools.com/apis/ctp:api:type:SearchIndexingConfiguration" rel="nofollow">SearchIndexingConfiguration</a> <code>status</code> for <code>products</code> will be shown as <code>"Indexing"</code> during this time. As soon as the indexing has finished, the configuration status will be changed to <code>"Activated"</code> making the aforementioned APIs fully available for this Project.</li>
     *  </ul>
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     *  <p>Controls whether the action should apply to <span>Product Projection Search</span> or to <span>Product Search</span>.</p>
     */

    public com.commercetools.api.models.project.ProductSearchIndexingMode getMode() {
        return this.mode;
    }

    public void setEnabled(final Boolean enabled) {
        this.enabled = enabled;
    }

    public void setMode(final com.commercetools.api.models.project.ProductSearchIndexingMode mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectChangeProductSearchIndexingEnabledActionImpl that = (ProjectChangeProductSearchIndexingEnabledActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(enabled, that.enabled)
                .append(mode, that.mode)
                .append(action, that.action)
                .append(enabled, that.enabled)
                .append(mode, that.mode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(enabled).append(mode).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("enabled", enabled)
                .append("mode", mode)
                .build();
    }

    @Override
    public ProjectChangeProductSearchIndexingEnabledAction copyDeep() {
        return ProjectChangeProductSearchIndexingEnabledAction.deepCopy(this);
    }
}
