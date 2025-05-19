
package com.commercetools.api.models.customer;

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
 * CustomerGroupAssignmentDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupAssignmentDraft customerGroupAssignmentDraft = CustomerGroupAssignmentDraft.builder()
 *             .customerGroup(customerGroupBuilder -> customerGroupBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupAssignmentDraftImpl.class)
public interface CustomerGroupAssignmentDraft extends io.vrap.rmf.base.client.Draft<CustomerGroupAssignmentDraft> {

    /**
     *  <p>ResourceIdentifier of a Customer Group.</p>
     * @return customerGroup
     */
    @NotNull
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p>ResourceIdentifier of a Customer Group.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    /**
     * factory method
     * @return instance of CustomerGroupAssignmentDraft
     */
    public static CustomerGroupAssignmentDraft of() {
        return new CustomerGroupAssignmentDraftImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupAssignmentDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupAssignmentDraft of(final CustomerGroupAssignmentDraft template) {
        CustomerGroupAssignmentDraftImpl instance = new CustomerGroupAssignmentDraftImpl();
        instance.setCustomerGroup(template.getCustomerGroup());
        return instance;
    }

    public CustomerGroupAssignmentDraft copyDeep();

    /**
     * factory method to create a deep copy of CustomerGroupAssignmentDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupAssignmentDraft deepCopy(@Nullable final CustomerGroupAssignmentDraft template) {
        if (template == null) {
            return null;
        }
        CustomerGroupAssignmentDraftImpl instance = new CustomerGroupAssignmentDraftImpl();
        instance.setCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier
                .deepCopy(template.getCustomerGroup()));
        return instance;
    }

    /**
     * builder factory method for CustomerGroupAssignmentDraft
     * @return builder
     */
    public static CustomerGroupAssignmentDraftBuilder builder() {
        return CustomerGroupAssignmentDraftBuilder.of();
    }

    /**
     * create builder for CustomerGroupAssignmentDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupAssignmentDraftBuilder builder(final CustomerGroupAssignmentDraft template) {
        return CustomerGroupAssignmentDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupAssignmentDraft(Function<CustomerGroupAssignmentDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupAssignmentDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupAssignmentDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupAssignmentDraft>";
            }
        };
    }
}
