
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectSetProductCatalogModelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectSetProductCatalogModelAction projectSetProductCatalogModelAction = ProjectSetProductCatalogModelAction.builder()
 *             .productCatalogModel(ProductCatalogModel.CLASSIC)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectSetProductCatalogModelActionBuilder implements Builder<ProjectSetProductCatalogModelAction> {

    private com.commercetools.api.models.project.ProductCatalogModel productCatalogModel;

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
     * @param productCatalogModel value to be set
     * @return Builder
     */

    public ProjectSetProductCatalogModelActionBuilder productCatalogModel(
            final com.commercetools.api.models.project.ProductCatalogModel productCatalogModel) {
        this.productCatalogModel = productCatalogModel;
        return this;
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
     * @return productCatalogModel
     */

    public com.commercetools.api.models.project.ProductCatalogModel getProductCatalogModel() {
        return this.productCatalogModel;
    }

    /**
     * builds ProjectSetProductCatalogModelAction with checking for non-null required values
     * @return ProjectSetProductCatalogModelAction
     */
    public ProjectSetProductCatalogModelAction build() {
        Objects.requireNonNull(productCatalogModel,
            ProjectSetProductCatalogModelAction.class + ": productCatalogModel is missing");
        return new ProjectSetProductCatalogModelActionImpl(productCatalogModel);
    }

    /**
     * builds ProjectSetProductCatalogModelAction without checking for non-null required values
     * @return ProjectSetProductCatalogModelAction
     */
    public ProjectSetProductCatalogModelAction buildUnchecked() {
        return new ProjectSetProductCatalogModelActionImpl(productCatalogModel);
    }

    /**
     * factory method for an instance of ProjectSetProductCatalogModelActionBuilder
     * @return builder
     */
    public static ProjectSetProductCatalogModelActionBuilder of() {
        return new ProjectSetProductCatalogModelActionBuilder();
    }

    /**
     * create builder for ProjectSetProductCatalogModelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectSetProductCatalogModelActionBuilder of(final ProjectSetProductCatalogModelAction template) {
        ProjectSetProductCatalogModelActionBuilder builder = new ProjectSetProductCatalogModelActionBuilder();
        builder.productCatalogModel = template.getProductCatalogModel();
        return builder;
    }

}
