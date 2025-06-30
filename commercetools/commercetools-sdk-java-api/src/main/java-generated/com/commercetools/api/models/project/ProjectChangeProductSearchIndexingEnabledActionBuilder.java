
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
     *  <ul>
     *   <li>If <code>false</code>, the indexing of Product information will stop and the Product Projection Search as well as the Search Term Suggestions API will no longer be available for this Project. The Project's SearchIndexingConfiguration <code>status</code> for <code>products</code> will be changed to <code>"Deactivated"</code>.</li>
     *   <li>If <code>true</code>, the indexing of Product information will start and the Product Projection Search as well as the Search Term Suggestions API will become available soon after for this Project. Proportional to the amount of information being indexed, the Project's SearchIndexingConfiguration <code>status</code> for <code>products</code> will be shown as <code>"Indexing"</code> during this time. As soon as the indexing has finished, the configuration status will be changed to <code>"Activated"</code> making the aforementioned APIs fully available for this Project.</li>
     *  </ul>
     * @param enabled value to be set
     * @return Builder
     */

    public ProjectChangeProductSearchIndexingEnabledActionBuilder enabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     *  <p>Controls whether the action should apply to Product Projection Search or to Product Search.</p>
     * @param mode value to be set
     * @return Builder
     */

    public ProjectChangeProductSearchIndexingEnabledActionBuilder mode(
            @Nullable final com.commercetools.api.models.project.ProductSearchIndexingMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     *  <ul>
     *   <li>If <code>false</code>, the indexing of Product information will stop and the Product Projection Search as well as the Search Term Suggestions API will no longer be available for this Project. The Project's SearchIndexingConfiguration <code>status</code> for <code>products</code> will be changed to <code>"Deactivated"</code>.</li>
     *   <li>If <code>true</code>, the indexing of Product information will start and the Product Projection Search as well as the Search Term Suggestions API will become available soon after for this Project. Proportional to the amount of information being indexed, the Project's SearchIndexingConfiguration <code>status</code> for <code>products</code> will be shown as <code>"Indexing"</code> during this time. As soon as the indexing has finished, the configuration status will be changed to <code>"Activated"</code> making the aforementioned APIs fully available for this Project.</li>
     *  </ul>
     * @return enabled
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     *  <p>Controls whether the action should apply to Product Projection Search or to Product Search.</p>
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
