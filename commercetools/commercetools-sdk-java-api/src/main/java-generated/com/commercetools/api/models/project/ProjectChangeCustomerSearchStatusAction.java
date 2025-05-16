
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
 * ProjectChangeCustomerSearchStatusAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectChangeCustomerSearchStatusAction projectChangeCustomerSearchStatusAction = ProjectChangeCustomerSearchStatusAction.builder()
 *             .status(CustomerSearchStatus.ACTIVATED)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeCustomerSearchStatus")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectChangeCustomerSearchStatusActionImpl.class)
public interface ProjectChangeCustomerSearchStatusAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectChangeCustomerSearchStatusAction
     */
    String CHANGE_CUSTOMER_SEARCH_STATUS = "changeCustomerSearchStatus";

    /**
     *  <p>Activates or deactivates the Customer Search feature. Activation will trigger building a search index for the Customers in the Project.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public CustomerSearchStatus getStatus();

    /**
     *  <p>Activates or deactivates the Customer Search feature. Activation will trigger building a search index for the Customers in the Project.</p>
     * @param status value to be set
     */

    public void setStatus(final CustomerSearchStatus status);

    /**
     * factory method
     * @return instance of ProjectChangeCustomerSearchStatusAction
     */
    public static ProjectChangeCustomerSearchStatusAction of() {
        return new ProjectChangeCustomerSearchStatusActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectChangeCustomerSearchStatusAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectChangeCustomerSearchStatusAction of(final ProjectChangeCustomerSearchStatusAction template) {
        ProjectChangeCustomerSearchStatusActionImpl instance = new ProjectChangeCustomerSearchStatusActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    public ProjectChangeCustomerSearchStatusAction copyDeep();

    /**
     * factory method to create a deep copy of ProjectChangeCustomerSearchStatusAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectChangeCustomerSearchStatusAction deepCopy(
            @Nullable final ProjectChangeCustomerSearchStatusAction template) {
        if (template == null) {
            return null;
        }
        ProjectChangeCustomerSearchStatusActionImpl instance = new ProjectChangeCustomerSearchStatusActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    /**
     * builder factory method for ProjectChangeCustomerSearchStatusAction
     * @return builder
     */
    public static ProjectChangeCustomerSearchStatusActionBuilder builder() {
        return ProjectChangeCustomerSearchStatusActionBuilder.of();
    }

    /**
     * create builder for ProjectChangeCustomerSearchStatusAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectChangeCustomerSearchStatusActionBuilder builder(
            final ProjectChangeCustomerSearchStatusAction template) {
        return ProjectChangeCustomerSearchStatusActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectChangeCustomerSearchStatusAction(
            Function<ProjectChangeCustomerSearchStatusAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectChangeCustomerSearchStatusAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectChangeCustomerSearchStatusAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectChangeCustomerSearchStatusAction>";
            }
        };
    }
}
