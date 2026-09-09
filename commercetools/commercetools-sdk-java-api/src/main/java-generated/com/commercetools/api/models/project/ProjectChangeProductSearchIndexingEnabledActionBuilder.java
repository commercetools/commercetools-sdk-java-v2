
package com.commercetools.api.models.project;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeProductSearchIndexingEnabledActionBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeProductSearchIndexingEnabledActionBuilder
        implements Builder<ProjectChangeProductSearchIndexingEnabledAction> {

    private Boolean enabled;

    @Nullable
    private com.commercetools.api.models.project.ProductSearchIndexingMode mode;

    /**
     *  <p>Whether to enable product indexing for the storefront search APIs selected by <code>mode</code>.</p>
     *  <ul>
     *   <li>If <code>true</code>, indexing starts for the selected API and the corresponding status changes to <code>"Indexing"</code>. After indexing finishes, the status changes to <code>"Activated"</code> and the selected API becomes available.</li>
     *   <li>If <code>false</code>, indexing stops and the selected API become unavailable. The corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:SearchIndexingConfiguration" rel="nofollow">SearchIndexingConfiguration</a> <code>status</code> changes to <code>"Deactivated"</code>.</li>
     *  </ul>
     * @param enabled value to be set
     * @return Builder
     */

    public ProjectChangeProductSearchIndexingEnabledActionBuilder enabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     *  <p>Controls whether the action should apply to <span>Product Projection Search</span> or to <span>Product Search</span>.</p>
     * @param mode value to be set
     * @return Builder
     */

    public ProjectChangeProductSearchIndexingEnabledActionBuilder mode(
            @Nullable final com.commercetools.api.models.project.ProductSearchIndexingMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     *  <p>Whether to enable product indexing for the storefront search APIs selected by <code>mode</code>.</p>
     *  <ul>
     *   <li>If <code>true</code>, indexing starts for the selected API and the corresponding status changes to <code>"Indexing"</code>. After indexing finishes, the status changes to <code>"Activated"</code> and the selected API becomes available.</li>
     *   <li>If <code>false</code>, indexing stops and the selected API become unavailable. The corresponding <a href="https://docs.commercetools.com/apis/ctp:api:type:SearchIndexingConfiguration" rel="nofollow">SearchIndexingConfiguration</a> <code>status</code> changes to <code>"Deactivated"</code>.</li>
     *  </ul>
     * @return enabled
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     *  <p>Controls whether the action should apply to <span>Product Projection Search</span> or to <span>Product Search</span>.</p>
     * @return mode
     */

    @Nullable
    public com.commercetools.api.models.project.ProductSearchIndexingMode getMode() {
        return this.mode;
    }

    /**
     * builds ProjectChangeProductSearchIndexingEnabledAction with checking for non-null required values
     * @return ProjectChangeProductSearchIndexingEnabledAction
     */
    public ProjectChangeProductSearchIndexingEnabledAction build() {
        Objects.requireNonNull(enabled, ProjectChangeProductSearchIndexingEnabledAction.class + ": enabled is missing");
        return new ProjectChangeProductSearchIndexingEnabledActionImpl(enabled, mode);
    }

    /**
     * builds ProjectChangeProductSearchIndexingEnabledAction without checking for non-null required values
     * @return ProjectChangeProductSearchIndexingEnabledAction
     */
    public ProjectChangeProductSearchIndexingEnabledAction buildUnchecked() {
        return new ProjectChangeProductSearchIndexingEnabledActionImpl(enabled, mode);
    }

    /**
     * factory method for an instance of ProjectChangeProductSearchIndexingEnabledActionBuilder
     * @return builder
     */
    public static ProjectChangeProductSearchIndexingEnabledActionBuilder of() {
        return new ProjectChangeProductSearchIndexingEnabledActionBuilder();
    }

    /**
     * create builder for ProjectChangeProductSearchIndexingEnabledAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeProductSearchIndexingEnabledActionBuilder of(
            final ProjectChangeProductSearchIndexingEnabledAction template) {
        ProjectChangeProductSearchIndexingEnabledActionBuilder builder = new ProjectChangeProductSearchIndexingEnabledActionBuilder();
        builder.enabled = template.getEnabled();
        builder.mode = template.getMode();
        return builder;
    }

}
