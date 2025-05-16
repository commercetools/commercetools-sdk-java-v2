
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CustomerGroupUpdateAction
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupUpdateAction customerGroupUpdateAction = CustomerGroupUpdateAction.changeNameBuilder()
 *             name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "action", defaultImpl = CustomerGroupUpdateActionImpl.class, visible = true)
@JsonDeserialize(as = CustomerGroupUpdateActionImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CustomerGroupUpdateAction
        extends com.commercetools.api.models.ResourceUpdateAction<CustomerGroupUpdateAction> {

    /**
     *
     * @return action
     */
    @NotNull
    @JsonProperty("action")
    public String getAction();

    public CustomerGroupUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of CustomerGroupUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupUpdateAction deepCopy(@Nullable final CustomerGroupUpdateAction template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof CustomerGroupUpdateActionImpl)) {
            return template.copyDeep();
        }
        CustomerGroupUpdateActionImpl instance = new CustomerGroupUpdateActionImpl();
        return instance;
    }

    /**
     * builder for changeName subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer_group.CustomerGroupChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.customer_group.CustomerGroupChangeNameActionBuilder.of();
    }

    /**
     * builder for setCustomField subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer_group.CustomerGroupSetCustomFieldActionBuilder setCustomFieldBuilder() {
        return com.commercetools.api.models.customer_group.CustomerGroupSetCustomFieldActionBuilder.of();
    }

    /**
     * builder for setCustomType subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer_group.CustomerGroupSetCustomTypeActionBuilder setCustomTypeBuilder() {
        return com.commercetools.api.models.customer_group.CustomerGroupSetCustomTypeActionBuilder.of();
    }

    /**
     * builder for setKey subtype
     * @return builder
     */
    public static com.commercetools.api.models.customer_group.CustomerGroupSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.customer_group.CustomerGroupSetKeyActionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupUpdateAction(Function<CustomerGroupUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupUpdateAction>";
            }
        };
    }
}
