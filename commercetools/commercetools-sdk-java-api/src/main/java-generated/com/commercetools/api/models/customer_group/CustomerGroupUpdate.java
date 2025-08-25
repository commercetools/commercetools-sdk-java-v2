
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * CustomerGroupUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupUpdate customerGroupUpdate = CustomerGroupUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupUpdateImpl.class)
public interface CustomerGroupUpdate extends
        com.commercetools.api.models.ResourceUpdate<CustomerGroupUpdate, CustomerGroupUpdateAction, CustomerGroupUpdateBuilder> {

    /**
     *  <p>Expected version of the CustomerGroup on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the CustomerGroup.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<CustomerGroupUpdateAction> getActions();

    /**
     *  <p>Expected version of the CustomerGroup on which the changes should be applied. If the expected version does not match the actual version, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the CustomerGroup.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final CustomerGroupUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the CustomerGroup.</p>
     * @param actions values to be set
     */

    public void setActions(final List<CustomerGroupUpdateAction> actions);

    /**
     * factory method
     * @return instance of CustomerGroupUpdate
     */
    public static CustomerGroupUpdate of() {
        return new CustomerGroupUpdateImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupUpdate of(final CustomerGroupUpdate template) {
        CustomerGroupUpdateImpl instance = new CustomerGroupUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public CustomerGroupUpdate copyDeep();

    /**
     * factory method to create a deep copy of CustomerGroupUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupUpdate deepCopy(@Nullable final CustomerGroupUpdate template) {
        if (template == null) {
            return null;
        }
        CustomerGroupUpdateImpl instance = new CustomerGroupUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.customer_group.CustomerGroupUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CustomerGroupUpdate
     * @return builder
     */
    public static CustomerGroupUpdateBuilder builder() {
        return CustomerGroupUpdateBuilder.of();
    }

    /**
     * create builder for CustomerGroupUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupUpdateBuilder builder(final CustomerGroupUpdate template) {
        return CustomerGroupUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupUpdate(Function<CustomerGroupUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupUpdate>";
            }
        };
    }
}
