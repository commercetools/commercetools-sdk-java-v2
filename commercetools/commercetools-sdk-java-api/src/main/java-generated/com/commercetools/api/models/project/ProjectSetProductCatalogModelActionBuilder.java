
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
     *  <p>For each migration step, see:</p>
     *  <ul>
     *   <li><span>Change Product Catalog Model to InMigration</span></li>
     *   <li><span>Change Product Catalog Model to Modular</span></li>
     *   <li><span>Rollback to Classic</span></li>
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
     *  <p>For each migration step, see:</p>
     *  <ul>
     *   <li><span>Change Product Catalog Model to InMigration</span></li>
     *   <li><span>Change Product Catalog Model to Modular</span></li>
     *   <li><span>Rollback to Classic</span></li>
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
