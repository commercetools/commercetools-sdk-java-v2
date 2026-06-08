
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Unassigns a Customer Group from a Business Unit.</p>
 *  <p>This action generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitCustomerGroupAssignmentRemovedMessage" rel="nofollow">BusinessUnitCustomerGroupAssignmentRemoved</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitRemoveCustomerGroupAssignmentAction businessUnitRemoveCustomerGroupAssignmentAction = BusinessUnitRemoveCustomerGroupAssignmentAction.builder()
 *             .customerGroup(customerGroupBuilder -> customerGroupBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeCustomerGroupAssignment")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitRemoveCustomerGroupAssignmentActionImpl.class)
public interface BusinessUnitRemoveCustomerGroupAssignmentAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitRemoveCustomerGroupAssignmentAction
     */
    String REMOVE_CUSTOMER_GROUP_ASSIGNMENT = "removeCustomerGroupAssignment";

    /**
     *  <p>Customer Group to unassign the Business Unit from.</p>
     * @return customerGroup
     */
    @NotNull
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p>Customer Group to unassign the Business Unit from.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    /**
     * factory method
     * @return instance of BusinessUnitRemoveCustomerGroupAssignmentAction
     */
    public static BusinessUnitRemoveCustomerGroupAssignmentAction of() {
        return new BusinessUnitRemoveCustomerGroupAssignmentActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitRemoveCustomerGroupAssignmentAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitRemoveCustomerGroupAssignmentAction of(
            final BusinessUnitRemoveCustomerGroupAssignmentAction template) {
        BusinessUnitRemoveCustomerGroupAssignmentActionImpl instance = new BusinessUnitRemoveCustomerGroupAssignmentActionImpl();
        instance.setCustomerGroup(template.getCustomerGroup());
        return instance;
    }

    public BusinessUnitRemoveCustomerGroupAssignmentAction copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitRemoveCustomerGroupAssignmentAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitRemoveCustomerGroupAssignmentAction deepCopy(
            @Nullable final BusinessUnitRemoveCustomerGroupAssignmentAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitRemoveCustomerGroupAssignmentActionImpl instance = new BusinessUnitRemoveCustomerGroupAssignmentActionImpl();
        instance.setCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier
                .deepCopy(template.getCustomerGroup()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitRemoveCustomerGroupAssignmentAction
     * @return builder
     */
    public static BusinessUnitRemoveCustomerGroupAssignmentActionBuilder builder() {
        return BusinessUnitRemoveCustomerGroupAssignmentActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitRemoveCustomerGroupAssignmentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitRemoveCustomerGroupAssignmentActionBuilder builder(
            final BusinessUnitRemoveCustomerGroupAssignmentAction template) {
        return BusinessUnitRemoveCustomerGroupAssignmentActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitRemoveCustomerGroupAssignmentAction(
            Function<BusinessUnitRemoveCustomerGroupAssignmentAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveCustomerGroupAssignmentAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveCustomerGroupAssignmentAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitRemoveCustomerGroupAssignmentAction>";
            }
        };
    }
}
