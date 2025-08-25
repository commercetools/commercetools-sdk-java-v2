
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Changing the status of a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> generates a <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitStatusChangedMessage" rel="nofollow">BusinessUnitStatusChanged</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeStatusAction businessUnitChangeStatusAction = BusinessUnitChangeStatusAction.builder()
 *             .status("{status}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeStatus")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitChangeStatusActionImpl.class)
public interface BusinessUnitChangeStatusAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitChangeStatusAction
     */
    String CHANGE_STATUS = "changeStatus";

    /**
     *  <p>New status to set.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public String getStatus();

    /**
     *  <p>New status to set.</p>
     * @param status value to be set
     */

    public void setStatus(final String status);

    /**
     * factory method
     * @return instance of BusinessUnitChangeStatusAction
     */
    public static BusinessUnitChangeStatusAction of() {
        return new BusinessUnitChangeStatusActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitChangeStatusAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitChangeStatusAction of(final BusinessUnitChangeStatusAction template) {
        BusinessUnitChangeStatusActionImpl instance = new BusinessUnitChangeStatusActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    public BusinessUnitChangeStatusAction copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitChangeStatusAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitChangeStatusAction deepCopy(@Nullable final BusinessUnitChangeStatusAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitChangeStatusActionImpl instance = new BusinessUnitChangeStatusActionImpl();
        instance.setStatus(template.getStatus());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitChangeStatusAction
     * @return builder
     */
    public static BusinessUnitChangeStatusActionBuilder builder() {
        return BusinessUnitChangeStatusActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitChangeStatusAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitChangeStatusActionBuilder builder(final BusinessUnitChangeStatusAction template) {
        return BusinessUnitChangeStatusActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitChangeStatusAction(Function<BusinessUnitChangeStatusAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeStatusAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeStatusAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitChangeStatusAction>";
            }
        };
    }
}
