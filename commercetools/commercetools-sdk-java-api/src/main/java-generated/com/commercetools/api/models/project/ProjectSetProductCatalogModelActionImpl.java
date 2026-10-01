
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
 * ProjectSetProductCatalogModelAction
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
     *  <p>Configuration for the Product catalog model in the Project.</p>
     *  <p>The <code>x-catalog-model</code> request header can override the effective Catalog model for a single request to resources that resolve Variant data, such as Carts, Orders, and Shopping Lists, independent of the Project's configured Catalog model. Use it during migration to test Modular Catalog behavior on selected requests before changing the Project's configured Catalog model. It is intended as a migration aid, not as a permanent substitute for the Project configuration. It has no effect on Product update actions.</p>
     *  <p>When set to <code>Classic</code>, Product Variants are embedded in the Product.</p>
     *  <p>When set to <code>InMigration</code>, Product Variants remain embedded in the Product, but the Project's default resolution switches to the Modular Catalog model. Use this transitional state to complete your read migration to Modular while embedded Variant writes continue. In this mode:</p>
     *  <ul>
     *   <li>Variants are resolved from standalone Variants by default, with no <code>x-catalog-model</code> header needed. This affects any resource that references a Variant, including Cart and Order line items, discount matching, and Product Selections.</li>
     *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Products</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductProjection" rel="nofollow">Product Projections</a> continue to return embedded Variant data.</li>
     *   <li>Product Search continues to index embedded Variants.</li>
     *   <li>Variant update actions on the Product API are still accepted, so continue dual-writing changes to embedded and standalone Variants during the migration. This keeps embedded Variant data up to date for Product Search, which continues to index embedded Variants.</li>
     *  </ul>
     *  <p>When set to <code>Modular</code>, Product Variants are managed as standalone entities. In this mode:</p>
     *  <ul>
     *   <li>Variant-related update actions on Products return a <code>400</code> error.</li>
     *   <li>Products must be created without <code>masterVariant</code> and <code>variants</code>.</li>
     *   <li>Products cannot be deleted while Variants reference them.</li>
     *   <li>Products cannot be unpublished while they have published Variants.</li>
     *   <li><span>Carts</span> read variant data from the Variant API instead of embedded Product Variants.</li>
     *   <li><code>priceMode</code> on Products is set to <code>Standalone</code>.</li>
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
