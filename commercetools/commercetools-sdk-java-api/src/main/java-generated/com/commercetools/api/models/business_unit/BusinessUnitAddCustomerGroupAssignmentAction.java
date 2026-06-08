
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.customer.CustomerGroupAssignmentDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Assigns a Customer Group to a Business Unit.</p>
 *  <p>This action generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitCustomerGroupAssignmentAddedMessage" rel="nofollow">BusinessUnitCustomerGroupAssignmentAdded</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddCustomerGroupAssignmentAction businessUnitAddCustomerGroupAssignmentAction = BusinessUnitAddCustomerGroupAssignmentAction.builder()
 *             .customerGroupAssignment(customerGroupAssignmentBuilder -> customerGroupAssignmentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addCustomerGroupAssignment")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddCustomerGroupAssignmentActionImpl.class)
public interface BusinessUnitAddCustomerGroupAssignmentAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitAddCustomerGroupAssignmentAction
     */
    String ADD_CUSTOMER_GROUP_ASSIGNMENT = "addCustomerGroupAssignment";

    /**
     *  <p>Customer Group to assign the Business Unit to.</p>
     * @return customerGroupAssignment
     */
    @NotNull
    @Valid
    @JsonProperty("customerGroupAssignment")
    public CustomerGroupAssignmentDraft getCustomerGroupAssignment();

    /**
     *  <p>Customer Group to assign the Business Unit to.</p>
     * @param customerGroupAssignment value to be set
     */

    public void setCustomerGroupAssignment(final CustomerGroupAssignmentDraft customerGroupAssignment);

    /**
     * factory method
     * @return instance of BusinessUnitAddCustomerGroupAssignmentAction
     */
    public static BusinessUnitAddCustomerGroupAssignmentAction of() {
        return new BusinessUnitAddCustomerGroupAssignmentActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAddCustomerGroupAssignmentAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAddCustomerGroupAssignmentAction of(
            final BusinessUnitAddCustomerGroupAssignmentAction template) {
        BusinessUnitAddCustomerGroupAssignmentActionImpl instance = new BusinessUnitAddCustomerGroupAssignmentActionImpl();
        instance.setCustomerGroupAssignment(template.getCustomerGroupAssignment());
        return instance;
    }

    public BusinessUnitAddCustomerGroupAssignmentAction copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitAddCustomerGroupAssignmentAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAddCustomerGroupAssignmentAction deepCopy(
            @Nullable final BusinessUnitAddCustomerGroupAssignmentAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAddCustomerGroupAssignmentActionImpl instance = new BusinessUnitAddCustomerGroupAssignmentActionImpl();
        instance.setCustomerGroupAssignment(com.commercetools.api.models.customer.CustomerGroupAssignmentDraft
                .deepCopy(template.getCustomerGroupAssignment()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAddCustomerGroupAssignmentAction
     * @return builder
     */
    public static BusinessUnitAddCustomerGroupAssignmentActionBuilder builder() {
        return BusinessUnitAddCustomerGroupAssignmentActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitAddCustomerGroupAssignmentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddCustomerGroupAssignmentActionBuilder builder(
            final BusinessUnitAddCustomerGroupAssignmentAction template) {
        return BusinessUnitAddCustomerGroupAssignmentActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAddCustomerGroupAssignmentAction(
            Function<BusinessUnitAddCustomerGroupAssignmentAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddCustomerGroupAssignmentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddCustomerGroupAssignmentAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddCustomerGroupAssignmentAction>";
            }
        };
    }
}
