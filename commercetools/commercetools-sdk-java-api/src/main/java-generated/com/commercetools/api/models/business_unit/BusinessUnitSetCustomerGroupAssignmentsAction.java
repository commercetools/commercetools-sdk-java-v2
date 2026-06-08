
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.customer.CustomerGroupAssignmentDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Assigns multiple Customer Groups to a Business Unit.</p>
 *  <p>This action generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitCustomerGroupAssignmentsSetMessage" rel="nofollow">BusinessUnitCustomerGroupAssignmentsSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetCustomerGroupAssignmentsAction businessUnitSetCustomerGroupAssignmentsAction = BusinessUnitSetCustomerGroupAssignmentsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCustomerGroupAssignments")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitSetCustomerGroupAssignmentsActionImpl.class)
public interface BusinessUnitSetCustomerGroupAssignmentsAction extends BusinessUnitUpdateAction {

    /**
     * discriminator value for BusinessUnitSetCustomerGroupAssignmentsAction
     */
    String SET_CUSTOMER_GROUP_ASSIGNMENTS = "setCustomerGroupAssignments";

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     * @return customerGroupAssignments
     */
    @Valid
    @JsonProperty("customerGroupAssignments")
    public List<CustomerGroupAssignmentDraft> getCustomerGroupAssignments();

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     * @param customerGroupAssignments values to be set
     */

    @JsonIgnore
    public void setCustomerGroupAssignments(final CustomerGroupAssignmentDraft... customerGroupAssignments);

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     * @param customerGroupAssignments values to be set
     */

    public void setCustomerGroupAssignments(final List<CustomerGroupAssignmentDraft> customerGroupAssignments);

    /**
     * factory method
     * @return instance of BusinessUnitSetCustomerGroupAssignmentsAction
     */
    public static BusinessUnitSetCustomerGroupAssignmentsAction of() {
        return new BusinessUnitSetCustomerGroupAssignmentsActionImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitSetCustomerGroupAssignmentsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitSetCustomerGroupAssignmentsAction of(
            final BusinessUnitSetCustomerGroupAssignmentsAction template) {
        BusinessUnitSetCustomerGroupAssignmentsActionImpl instance = new BusinessUnitSetCustomerGroupAssignmentsActionImpl();
        instance.setCustomerGroupAssignments(template.getCustomerGroupAssignments());
        return instance;
    }

    public BusinessUnitSetCustomerGroupAssignmentsAction copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitSetCustomerGroupAssignmentsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitSetCustomerGroupAssignmentsAction deepCopy(
            @Nullable final BusinessUnitSetCustomerGroupAssignmentsAction template) {
        if (template == null) {
            return null;
        }
        BusinessUnitSetCustomerGroupAssignmentsActionImpl instance = new BusinessUnitSetCustomerGroupAssignmentsActionImpl();
        instance.setCustomerGroupAssignments(Optional.ofNullable(template.getCustomerGroupAssignments())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.customer.CustomerGroupAssignmentDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitSetCustomerGroupAssignmentsAction
     * @return builder
     */
    public static BusinessUnitSetCustomerGroupAssignmentsActionBuilder builder() {
        return BusinessUnitSetCustomerGroupAssignmentsActionBuilder.of();
    }

    /**
     * create builder for BusinessUnitSetCustomerGroupAssignmentsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitSetCustomerGroupAssignmentsActionBuilder builder(
            final BusinessUnitSetCustomerGroupAssignmentsAction template) {
        return BusinessUnitSetCustomerGroupAssignmentsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitSetCustomerGroupAssignmentsAction(
            Function<BusinessUnitSetCustomerGroupAssignmentsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetCustomerGroupAssignmentsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitSetCustomerGroupAssignmentsAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitSetCustomerGroupAssignmentsAction>";
            }
        };
    }
}
