
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Reference to a CustomerGroup.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupReference customerGroupReference = CustomerGroupReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("customer-group")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupReferenceImpl.class)
public interface CustomerGroupReference extends Reference, com.commercetools.api.models.Identifiable<CustomerGroup>,
        com.commercetools.api.models.IdentifiableObjHolder<CustomerGroup> {

    /**
     * discriminator value for CustomerGroupReference
     */
    String CUSTOMER_GROUP = "customer-group";

    /**
     *  <p>Contains the representation of the expanded CustomerGroup. Only present in responses to requests with Reference Expansion for CustomerGroups.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public CustomerGroup getObj();

    /**
     *  <p>Unique identifier of the referenced CustomerGroup.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded CustomerGroup. Only present in responses to requests with Reference Expansion for CustomerGroups.</p>
     * @param obj value to be set
     */

    public void setObj(final CustomerGroup obj);

    /**
     *  <p>Unique identifier of the referenced CustomerGroup.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of CustomerGroupReference
     */
    public static CustomerGroupReference of() {
        return new CustomerGroupReferenceImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupReference of(final CustomerGroupReference template) {
        CustomerGroupReferenceImpl instance = new CustomerGroupReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public CustomerGroupReference copyDeep();

    /**
     * factory method to create a deep copy of CustomerGroupReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupReference deepCopy(@Nullable final CustomerGroupReference template) {
        if (template == null) {
            return null;
        }
        CustomerGroupReferenceImpl instance = new CustomerGroupReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.customer_group.CustomerGroup.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for CustomerGroupReference
     * @return builder
     */
    public static CustomerGroupReferenceBuilder builder() {
        return CustomerGroupReferenceBuilder.of();
    }

    /**
     * create builder for CustomerGroupReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupReferenceBuilder builder(final CustomerGroupReference template) {
        return CustomerGroupReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupReference(Function<CustomerGroupReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupReference>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupReference>";
            }
        };
    }
}
