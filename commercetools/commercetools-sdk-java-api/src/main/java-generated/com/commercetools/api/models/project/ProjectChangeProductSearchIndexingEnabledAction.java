
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectChangeProductSearchIndexingEnabledActionImpl.class)
public interface ProjectChangeProductSearchIndexingEnabledAction extends ProjectUpdateAction {

    String CHANGE_PRODUCT_SEARCH_INDEXING_ENABLED = "changeProductSearchIndexingEnabled";

    /**
     <*  <p>If <code>false</code>, the indexing of Product information will stop and the Product Projection Search as well as the Product Suggestions endpoint will not be available anymore for this Project. The Project's SearchIndexingConfiguration <code>status</code> for <code>products</code> will be changed to <code>"Deactivated"</code>.</p>
    *  <p>If <code>true</code>, the indexing of Product information will start and the Product Projection Search as well as the Product Suggestions endpoint will become available soon after for this Project. Proportional to the amount of information being indexed, the Project's SearchIndexingConfiguration <code>status</code> for <code>products</code> will be shown as <code>"Indexing"</code> during this time. As soon as the indexing has finished, the configuration status will be changed to <code>"Activated"</code> making the aforementioned endpoints fully available for this Project.</p>>
     */
    @NotNull
    @JsonProperty("enabled")
    public Boolean getEnabled();

    public void setEnabled(final Boolean enabled);

    public static ProjectChangeProductSearchIndexingEnabledAction of() {
        return new ProjectChangeProductSearchIndexingEnabledActionImpl();
    }

    public static ProjectChangeProductSearchIndexingEnabledAction of(
            final ProjectChangeProductSearchIndexingEnabledAction template) {
        ProjectChangeProductSearchIndexingEnabledActionImpl instance = new ProjectChangeProductSearchIndexingEnabledActionImpl();
        instance.setEnabled(template.getEnabled());
        return instance;
    }

    public static ProjectChangeProductSearchIndexingEnabledActionBuilder builder() {
        return ProjectChangeProductSearchIndexingEnabledActionBuilder.of();
    }

    public static ProjectChangeProductSearchIndexingEnabledActionBuilder builder(
            final ProjectChangeProductSearchIndexingEnabledAction template) {
        return ProjectChangeProductSearchIndexingEnabledActionBuilder.of(template);
    }

    default <T> T withProjectChangeProductSearchIndexingEnabledAction(
            Function<ProjectChangeProductSearchIndexingEnabledAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeProductSearchIndexingEnabledAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeProductSearchIndexingEnabledAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeProductSearchIndexingEnabledAction>";
            }
        };
    }
}
