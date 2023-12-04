
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerUpdate customerUpdate = CustomerUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerUpdateImpl.class)
public interface CustomerUpdate extends
        com.commercetools.api.models.ResourceUpdate<CustomerUpdate, CustomerUpdateAction, CustomerUpdateBuilder> {

    /**
     *  <p>Expected version of the Customer on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Customer.</p>
     * @return actions
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<CustomerUpdateAction> getActions();

    /**
     *  <p>Expected version of the Customer on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error will be returned.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Update actions to be performed on the Customer.</p>
     * @param actions values to be set
     */

    @JsonIgnore
    public void setActions(final CustomerUpdateAction... actions);

    /**
     *  <p>Update actions to be performed on the Customer.</p>
     * @param actions values to be set
     */

    public void setActions(final List<CustomerUpdateAction> actions);

    /**
     * factory method
     * @return instance of CustomerUpdate
     */
    public static CustomerUpdate of() {
        return new CustomerUpdateImpl();
    }

    /**
     * factory method to create a shallow copy CustomerUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerUpdate of(final CustomerUpdate template) {
        CustomerUpdateImpl instance = new CustomerUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerUpdate
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerUpdate deepCopy(@Nullable final CustomerUpdate template) {
        if (template == null) {
            return null;
        }
        CustomerUpdateImpl instance = new CustomerUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(Optional.ofNullable(template.getActions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.customer.CustomerUpdateAction::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CustomerUpdate
     * @return builder
     */
    public static CustomerUpdateBuilder builder() {
        return CustomerUpdateBuilder.of();
    }

    /**
     * create builder for CustomerUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerUpdateBuilder builder(final CustomerUpdate template) {
        return CustomerUpdateBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerUpdate(Function<CustomerUpdate, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerUpdate>";
            }
        };
    }
}
