
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ProjectChangeProductSearchIndexingEnabledAction projectChangeProductSearchIndexingEnabledAction = ProjectChangeProductSearchIndexingEnabledAction.builder()
           .enabled(true)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectChangeProductSearchIndexingEnabledActionBuilder
        implements Builder<ProjectChangeProductSearchIndexingEnabledAction> {

    private Boolean enabled;

    /**
     *  <p>If <code>false</code>, the indexing of Product information will stop and the Product Projection Search as well as the Product Suggestions endpoint will not be available anymore for this Project. The Project's SearchIndexingConfiguration <code>status</code> for <code>products</code> will be changed to <code>"Deactivated"</code>.</p>
     *  <p>If <code>true</code>, the indexing of Product information will start and the Product Projection Search as well as the Product Suggestions endpoint will become available soon after for this Project. Proportional to the amount of information being indexed, the Project's SearchIndexingConfiguration <code>status</code> for <code>products</code> will be shown as <code>"Indexing"</code> during this time. As soon as the indexing has finished, the configuration status will be changed to <code>"Activated"</code> making the aforementioned endpoints fully available for this Project.</p>
     */

    public ProjectChangeProductSearchIndexingEnabledActionBuilder enabled(final Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public ProjectChangeProductSearchIndexingEnabledAction build() {
        Objects.requireNonNull(enabled, ProjectChangeProductSearchIndexingEnabledAction.class + ": enabled is missing");
        return new ProjectChangeProductSearchIndexingEnabledActionImpl(enabled);
    }

    /**
     * builds ProjectChangeProductSearchIndexingEnabledAction without checking for non null required values
     */
    public ProjectChangeProductSearchIndexingEnabledAction buildUnchecked() {
        return new ProjectChangeProductSearchIndexingEnabledActionImpl(enabled);
    }

    public static ProjectChangeProductSearchIndexingEnabledActionBuilder of() {
        return new ProjectChangeProductSearchIndexingEnabledActionBuilder();
    }

    public static ProjectChangeProductSearchIndexingEnabledActionBuilder of(
            final ProjectChangeProductSearchIndexingEnabledAction template) {
        ProjectChangeProductSearchIndexingEnabledActionBuilder builder = new ProjectChangeProductSearchIndexingEnabledActionBuilder();
        builder.enabled = template.getEnabled();
        return builder;
    }

}
