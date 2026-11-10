
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p><span>Product Projection Search</span> is <strong>deprecated</strong>. For Projects created after 31 August 2026, the <code>"ProductProjectionsSearch"</code> mode cannot be activated. Use <code>ProductsSearch</code> instead. For such Projects, setting <code>enabled</code> to <code>true</code> with <code>mode</code> <code>"ProductProjectionsSearch"</code> returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
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
     *  <p>Whether to enable product indexing for the storefront search APIs selected by <code>mode</code>.</p>
     *  <ul>
     *   <li>If <code>true</code>, indexing starts for the selected API and the corresponding status changes to <code>"Indexing"</code>. After indexing finishes, the status changes to <code>"Activated"</code> and the selected API becomes available.</li>
     *   <li>If <code>false</code>, indexing stops and the selected API become unavailable. The corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:SearchIndexingConfiguration" rel="nofollow">SearchIndexingConfiguration</a> <code>status</code> changes to <code>"Deactivated"</code>.</li>
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
