
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
 *  <p><span>Product Projection Search</span> is <strong>deprecated</strong>. For Projects created after 31 August 2026, the <code>"ProductProjectionsSearch"</code> mode cannot be activated. Use <code>ProductsSearch</code> instead. For such Projects, setting <code>enabled</code> to <code>true</code> with <code>mode</code> <code>"ProductProjectionsSearch"</code> returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeProductSearchIndexingEnabledAction projectChangeProductSearchIndexingEnabledAction = ProjectChangeProductSearchIndexingEnabledAction.builder()
 *             .enabled(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeProductSearchIndexingEnabled")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectChangeProductSearchIndexingEnabledActionImpl.class)
public interface ProjectChangeProductSearchIndexingEnabledAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectChangeProductSearchIndexingEnabledAction
     */
    String CHANGE_PRODUCT_SEARCH_INDEXING_ENABLED = "changeProductSearchIndexingEnabled";

    /**
     *  <p>Whether to enable product indexing for the storefront search APIs selected by <code>mode</code>.</p>
     *  <ul>
     *   <li>If <code>true</code>, indexing starts for the selected API and the corresponding status changes to <code>"Indexing"</code>. After indexing finishes, the status changes to <code>"Activated"</code> and the selected API becomes available.</li>
     *   <li>If <code>false</code>, indexing stops and the selected API become unavailable. The corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:SearchIndexingConfiguration" rel="nofollow">SearchIndexingConfiguration</a> <code>status</code> changes to <code>"Deactivated"</code>.</li>
     *  </ul>
     * @return enabled
     */
    @NotNull
    @JsonProperty("enabled")
    public Boolean getEnabled();

    /**
     *  <p>Controls whether the action should apply to <span>Product Projection Search</span> or to <span>Product Search</span>.</p>
     * @return mode
     */

    @JsonProperty("mode")
    public ProductSearchIndexingMode getMode();

    /**
     *  <p>Whether to enable product indexing for the storefront search APIs selected by <code>mode</code>.</p>
     *  <ul>
     *   <li>If <code>true</code>, indexing starts for the selected API and the corresponding status changes to <code>"Indexing"</code>. After indexing finishes, the status changes to <code>"Activated"</code> and the selected API becomes available.</li>
     *   <li>If <code>false</code>, indexing stops and the selected API become unavailable. The corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:SearchIndexingConfiguration" rel="nofollow">SearchIndexingConfiguration</a> <code>status</code> changes to <code>"Deactivated"</code>.</li>
     *  </ul>
     * @param enabled value to be set
     */

    public void setEnabled(final Boolean enabled);

    /**
     *  <p>Controls whether the action should apply to <span>Product Projection Search</span> or to <span>Product Search</span>.</p>
     * @param mode value to be set
     */

    public void setMode(final ProductSearchIndexingMode mode);

    /**
     * factory method
     * @return instance of ProjectChangeProductSearchIndexingEnabledAction
     */
    public static ProjectChangeProductSearchIndexingEnabledAction of() {
        return new ProjectChangeProductSearchIndexingEnabledActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectChangeProductSearchIndexingEnabledAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectChangeProductSearchIndexingEnabledAction of(
            final ProjectChangeProductSearchIndexingEnabledAction template) {
        ProjectChangeProductSearchIndexingEnabledActionImpl instance = new ProjectChangeProductSearchIndexingEnabledActionImpl();
        instance.setEnabled(template.getEnabled());
        instance.setMode(template.getMode());
        return instance;
    }

    public ProjectChangeProductSearchIndexingEnabledAction copyDeep();

    /**
     * factory method to create a deep copy of ProjectChangeProductSearchIndexingEnabledAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectChangeProductSearchIndexingEnabledAction deepCopy(
            @Nullable final ProjectChangeProductSearchIndexingEnabledAction template) {
        if (template == null) {
            return null;
        }
        ProjectChangeProductSearchIndexingEnabledActionImpl instance = new ProjectChangeProductSearchIndexingEnabledActionImpl();
        instance.setEnabled(template.getEnabled());
        instance.setMode(template.getMode());
        return instance;
    }

    /**
     * builder factory method for ProjectChangeProductSearchIndexingEnabledAction
     * @return builder
     */
    public static ProjectChangeProductSearchIndexingEnabledActionBuilder builder() {
        return ProjectChangeProductSearchIndexingEnabledActionBuilder.of();
    }

    /**
     * create builder for ProjectChangeProductSearchIndexingEnabledAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeProductSearchIndexingEnabledActionBuilder builder(
            final ProjectChangeProductSearchIndexingEnabledAction template) {
        return ProjectChangeProductSearchIndexingEnabledActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectChangeProductSearchIndexingEnabledAction(
            Function<ProjectChangeProductSearchIndexingEnabledAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ProjectChangeProductSearchIndexingEnabledAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<ProjectChangeProductSearchIndexingEnabledAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeProductSearchIndexingEnabledAction>";
            }
        };
    }
}
