
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
 * ProjectChangeOrderSearchStatusAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeOrderSearchStatusAction projectChangeOrderSearchStatusAction = ProjectChangeOrderSearchStatusAction.builder()
 *             .status(OrderSearchStatus.ACTIVATED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectChangeOrderSearchStatusActionImpl.class)
public interface ProjectChangeOrderSearchStatusAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectChangeOrderSearchStatusAction
     */
    String CHANGE_ORDER_SEARCH_STATUS = "changeOrderSearchStatus";

    /**
     *  <p>Activates or deactivates the Order Search feature. Activation will trigger building a search index for the Orders in the Project.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public OrderSearchStatus getStatus();

    /**
     *  <p>Activates or deactivates the Order Search feature. Activation will trigger building a search index for the Orders in the Project.</p>
     * @param status value to be set
     */

    public void setStatus(final OrderSearchStatus status);

    /**
     * factory method
     * @return instance of ProjectChangeOrderSearchStatusAction
     */
    public static ProjectChangeOrderSearchStatusAction of() {
        return new ProjectChangeOrderSearchStatusActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectChangeOrderSearchStatusAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectChangeOrderSearchStatusAction of(final ProjectChangeOrderSearchStatusAction template) {
        ProjectChangeOrderSearchStatusActionImpl instance = new ProjectChangeOrderSearchStatusActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProjectChangeOrderSearchStatusAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectChangeOrderSearchStatusAction deepCopy(
            @Nullable final ProjectChangeOrderSearchStatusAction template) {
        if (template == null) {
            return null;
        }
        ProjectChangeOrderSearchStatusActionImpl instance = new ProjectChangeOrderSearchStatusActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    /**
     * builder factory method for ProjectChangeOrderSearchStatusAction
     * @return builder
     */
    public static ProjectChangeOrderSearchStatusActionBuilder builder() {
        return ProjectChangeOrderSearchStatusActionBuilder.of();
    }

    /**
     * create builder for ProjectChangeOrderSearchStatusAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeOrderSearchStatusActionBuilder builder(
            final ProjectChangeOrderSearchStatusAction template) {
        return ProjectChangeOrderSearchStatusActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectChangeOrderSearchStatusAction(Function<ProjectChangeOrderSearchStatusAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeOrderSearchStatusAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeOrderSearchStatusAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeOrderSearchStatusAction>";
            }
        };
    }
}
