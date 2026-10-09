
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
 *  <p>Use this action to set the Product Catalog Model of a Project to <code>Classic</code>, <code>InMigration</code>, or <code>Modular</code> during a catalog migration, as described in the <span>Modular catalog migration guide</span>.</p>
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
     *  <p>For each migration step, see:</p>
     *  <ul>
     *   <li><span>Change Product Catalog Model to InMigration</span></li>
     *   <li><span>Change Product Catalog Model to Modular</span></li>
     *   <li><span>Rollback to Classic</span></li>
     *  </ul>
     * @return productCatalogModel
     */
    @NotNull
    @JsonProperty("productCatalogModel")
    public ProductCatalogModel getProductCatalogModel();

    /**
     *  <p>For each migration step, see:</p>
     *  <ul>
     *   <li><span>Change Product Catalog Model to InMigration</span></li>
     *   <li><span>Change Product Catalog Model to Modular</span></li>
     *   <li><span>Rollback to Classic</span></li>
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
