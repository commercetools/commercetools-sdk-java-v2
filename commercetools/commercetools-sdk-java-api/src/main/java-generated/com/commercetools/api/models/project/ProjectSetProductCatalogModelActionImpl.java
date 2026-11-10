
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
 *  <p>Use this action to set the Product Catalog Model of a Project to <code>Classic</code>, <code>InMigration</code>, or <code>Modular</code> during a catalog migration, as described in the <span>Modular catalog migration guide</span>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectSetProductCatalogModelActionImpl implements ProjectSetProductCatalogModelAction, ModelBase {

    private String action;

    private com.commercetools.api.models.project.ProductCatalogModel productCatalogModel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectSetProductCatalogModelActionImpl(
            @JsonProperty("productCatalogModel") final com.commercetools.api.models.project.ProductCatalogModel productCatalogModel) {
        this.productCatalogModel = productCatalogModel;
        this.action = SET_PRODUCT_CATALOG_MODEL;
    }

    /**
     * create empty instance
     */
    public ProjectSetProductCatalogModelActionImpl() {
        this.action = SET_PRODUCT_CATALOG_MODEL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>For each migration step, see:</p>
     *  <ul>
     *   <li><span>Change Product Catalog Model to InMigration</span></li>
     *   <li><span>Change Product Catalog Model to Modular</span></li>
     *   <li><span>Rollback to Classic</span></li>
     *  </ul>
     */

    public com.commercetools.api.models.project.ProductCatalogModel getProductCatalogModel() {
        return this.productCatalogModel;
    }

    public void setProductCatalogModel(
            final com.commercetools.api.models.project.ProductCatalogModel productCatalogModel) {
        this.productCatalogModel = productCatalogModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectSetProductCatalogModelActionImpl that = (ProjectSetProductCatalogModelActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(productCatalogModel, that.productCatalogModel)
                .append(action, that.action)
                .append(productCatalogModel, that.productCatalogModel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(productCatalogModel).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("productCatalogModel", productCatalogModel)
                .build();
    }

    @Override
    public ProjectSetProductCatalogModelAction copyDeep() {
        return ProjectSetProductCatalogModelAction.deepCopy(this);
    }
}
