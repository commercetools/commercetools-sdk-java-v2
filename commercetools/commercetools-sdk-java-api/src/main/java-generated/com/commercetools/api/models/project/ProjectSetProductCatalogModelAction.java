
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 * ProjectSetProductCatalogModelAction
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("setProductCatalogModel")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectSetProductCatalogModelActionImpl.class)
public interface ProjectSetProductCatalogModelAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectSetProductCatalogModelAction
     */
    String SET_PRODUCT_CATALOG_MODEL = "setProductCatalogModel";

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
    @NotNull
    @JsonProperty("productCatalogModel")
    public ProductCatalogModel getProductCatalogModel();

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
     */

    public void setProductCatalogModel(final ProductCatalogModel productCatalogModel);

    /**
     * factory method
     * @return instance of ProjectSetProductCatalogModelAction
     */
    public static ProjectSetProductCatalogModelAction of() {
        return new ProjectSetProductCatalogModelActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectSetProductCatalogModelAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectSetProductCatalogModelAction of(final ProjectSetProductCatalogModelAction template) {
        ProjectSetProductCatalogModelActionImpl instance = new ProjectSetProductCatalogModelActionImpl();
        instance.setProductCatalogModel(template.getProductCatalogModel());
        return instance;
    }

    public ProjectSetProductCatalogModelAction copyDeep();

    /**
     * factory method to create a deep copy of ProjectSetProductCatalogModelAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectSetProductCatalogModelAction deepCopy(
            @Nullable final ProjectSetProductCatalogModelAction template) {
        if (template == null) {
            return null;
        }
        ProjectSetProductCatalogModelActionImpl instance = new ProjectSetProductCatalogModelActionImpl();
        instance.setProductCatalogModel(template.getProductCatalogModel());
        return instance;
    }

    /**
     * builder factory method for ProjectSetProductCatalogModelAction
     * @return builder
     */
    public static ProjectSetProductCatalogModelActionBuilder builder() {
        return ProjectSetProductCatalogModelActionBuilder.of();
    }

    /**
     * create builder for ProjectSetProductCatalogModelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectSetProductCatalogModelActionBuilder builder(
            final ProjectSetProductCatalogModelAction template) {
        return ProjectSetProductCatalogModelActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectSetProductCatalogModelAction(Function<ProjectSetProductCatalogModelAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ProjectSetProductCatalogModelAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<ProjectSetProductCatalogModelAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectSetProductCatalogModelAction>";
            }
        };
    }
}
