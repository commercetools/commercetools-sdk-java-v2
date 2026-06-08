
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ProjectChangeProductSearchIndexingEnabledAction
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
     *  <ul>
     *   <li>If <code>false</code>, the indexing of <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> information will stop and the <span>Product Projection Search</span> as well as the <span>Search Term Suggestions</span> API will no longer be available for this Project. The Project's <a href="https://docs.commercetools.com/apis/ctp:api:type:SearchIndexingConfiguration" rel="nofollow">SearchIndexingConfiguration</a> <code>status</code> for <code>products</code> will be changed to <code>"Deactivated"</code>.</li>
     *   <li>If <code>true</code>, the indexing of <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> information will start and the <span>Product Projection Search</span> as well as the <span>Search Term Suggestions</span> API will become available soon after for this Project. Proportional to the amount of information being indexed, the Project's <a href="https://docs.commercetools.com/apis/ctp:api:type:SearchIndexingConfiguration" rel="nofollow">SearchIndexingConfiguration</a> <code>status</code> for <code>products</code> will be shown as <code>"Indexing"</code> during this time. As soon as the indexing has finished, the configuration status will be changed to <code>"Activated"</code> making the aforementioned APIs fully available for this Project.</li>
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
     *  <ul>
     *   <li>If <code>false</code>, the indexing of <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> information will stop and the <span>Product Projection Search</span> as well as the <span>Search Term Suggestions</span> API will no longer be available for this Project. The Project's <a href="https://docs.commercetools.com/apis/ctp:api:type:SearchIndexingConfiguration" rel="nofollow">SearchIndexingConfiguration</a> <code>status</code> for <code>products</code> will be changed to <code>"Deactivated"</code>.</li>
     *   <li>If <code>true</code>, the indexing of <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> information will start and the <span>Product Projection Search</span> as well as the <span>Search Term Suggestions</span> API will become available soon after for this Project. Proportional to the amount of information being indexed, the Project's <a href="https://docs.commercetools.com/apis/ctp:api:type:SearchIndexingConfiguration" rel="nofollow">SearchIndexingConfiguration</a> <code>status</code> for <code>products</code> will be shown as <code>"Indexing"</code> during this time. As soon as the indexing has finished, the configuration status will be changed to <code>"Activated"</code> making the aforementioned APIs fully available for this Project.</li>
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
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeProductSearchIndexingEnabledAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeProductSearchIndexingEnabledAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeProductSearchIndexingEnabledAction>";
            }
        };
    }
}
