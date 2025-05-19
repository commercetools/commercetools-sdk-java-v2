
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetMaxApplicationsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetMaxApplicationsAction discountCodeSetMaxApplicationsAction = DiscountCodeSetMaxApplicationsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setMaxApplications")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetMaxApplicationsActionImpl.class)
public interface DiscountCodeSetMaxApplicationsAction extends DiscountCodeUpdateAction {

    /**
     * discriminator value for DiscountCodeSetMaxApplicationsAction
     */
    String SET_MAX_APPLICATIONS = "setMaxApplications";

    /**
     *  <p>Value to set.</p>
     *  <p>If empty, any existing value will be removed and the DiscountCode can be applied any number of times.</p>
     * @return maxApplications
     */

    @JsonProperty("maxApplications")
    public Long getMaxApplications();

    /**
     *  <p>Value to set.</p>
     *  <p>If empty, any existing value will be removed and the DiscountCode can be applied any number of times.</p>
     * @param maxApplications value to be set
     */

    public void setMaxApplications(final Long maxApplications);

    /**
     * factory method
     * @return instance of DiscountCodeSetMaxApplicationsAction
     */
    public static DiscountCodeSetMaxApplicationsAction of() {
        return new DiscountCodeSetMaxApplicationsActionImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeSetMaxApplicationsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeSetMaxApplicationsAction of(final DiscountCodeSetMaxApplicationsAction template) {
        DiscountCodeSetMaxApplicationsActionImpl instance = new DiscountCodeSetMaxApplicationsActionImpl();
        instance.setMaxApplications(template.getMaxApplications());
        return instance;
    }

    public DiscountCodeSetMaxApplicationsAction copyDeep();

    /**
     * factory method to create a deep copy of DiscountCodeSetMaxApplicationsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeSetMaxApplicationsAction deepCopy(
            @Nullable final DiscountCodeSetMaxApplicationsAction template) {
        if (template == null) {
            return null;
        }
        DiscountCodeSetMaxApplicationsActionImpl instance = new DiscountCodeSetMaxApplicationsActionImpl();
        instance.setMaxApplications(template.getMaxApplications());
        return instance;
    }

    /**
     * builder factory method for DiscountCodeSetMaxApplicationsAction
     * @return builder
     */
    public static DiscountCodeSetMaxApplicationsActionBuilder builder() {
        return DiscountCodeSetMaxApplicationsActionBuilder.of();
    }

    /**
     * create builder for DiscountCodeSetMaxApplicationsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeSetMaxApplicationsActionBuilder builder(
            final DiscountCodeSetMaxApplicationsAction template) {
        return DiscountCodeSetMaxApplicationsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeSetMaxApplicationsAction(Function<DiscountCodeSetMaxApplicationsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetMaxApplicationsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetMaxApplicationsAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeSetMaxApplicationsAction>";
            }
        };
    }
}
