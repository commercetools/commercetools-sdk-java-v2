
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectChangeProductSearchStatusAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeProductSearchStatusAction projectChangeProductSearchStatusAction = ProjectChangeProductSearchStatusAction.builder()
 *             .status(ProductSearchStatus.ACTIVATED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectChangeProductSearchStatusActionImpl.class)
public interface ProjectChangeProductSearchStatusAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectChangeProductSearchStatusAction
     */
    String CHANGE_PRODUCT_SEARCH_STATUS = "changeProductSearchStatus";

    /**
     *  <p>Activates or deactivates the Product Search feature. Activation will trigger building a search index for the Products in the Project.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public ProductSearchStatus getStatus();

    /**
     *  <p>Activates or deactivates the Product Search feature. Activation will trigger building a search index for the Products in the Project.</p>
     * @param status value to be set
     */

    public void setStatus(final ProductSearchStatus status);

    /**
     * factory method
     * @return instance of ProjectChangeProductSearchStatusAction
     */
    public static ProjectChangeProductSearchStatusAction of() {
        return new ProjectChangeProductSearchStatusActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectChangeProductSearchStatusAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectChangeProductSearchStatusAction of(final ProjectChangeProductSearchStatusAction template) {
        ProjectChangeProductSearchStatusActionImpl instance = new ProjectChangeProductSearchStatusActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProjectChangeProductSearchStatusAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectChangeProductSearchStatusAction deepCopy(
            @Nullable final ProjectChangeProductSearchStatusAction template) {
        if (template == null) {
            return null;
        }
        ProjectChangeProductSearchStatusActionImpl instance = new ProjectChangeProductSearchStatusActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    /**
     * builder factory method for ProjectChangeProductSearchStatusAction
     * @return builder
     */
    public static ProjectChangeProductSearchStatusActionBuilder builder() {
        return ProjectChangeProductSearchStatusActionBuilder.of();
    }

    /**
     * create builder for ProjectChangeProductSearchStatusAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeProductSearchStatusActionBuilder builder(
            final ProjectChangeProductSearchStatusAction template) {
        return ProjectChangeProductSearchStatusActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectChangeProductSearchStatusAction(
            Function<ProjectChangeProductSearchStatusAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeProductSearchStatusAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeProductSearchStatusAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeProductSearchStatusAction>";
            }
        };
    }
}
