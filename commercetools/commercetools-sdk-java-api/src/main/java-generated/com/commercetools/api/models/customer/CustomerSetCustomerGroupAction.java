
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the Customer Group of the Customer produces the CustomerGroupSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetCustomerGroupAction customerSetCustomerGroupAction = CustomerSetCustomerGroupAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetCustomerGroupActionImpl.class)
public interface CustomerSetCustomerGroupAction extends CustomerUpdateAction {

    String SET_CUSTOMER_GROUP = "setCustomerGroup";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    public static CustomerSetCustomerGroupAction of() {
        return new CustomerSetCustomerGroupActionImpl();
    }

    public static CustomerSetCustomerGroupAction of(final CustomerSetCustomerGroupAction template) {
        CustomerSetCustomerGroupActionImpl instance = new CustomerSetCustomerGroupActionImpl();
        instance.setCustomerGroup(template.getCustomerGroup());
        return instance;
    }

    public static CustomerSetCustomerGroupActionBuilder builder() {
        return CustomerSetCustomerGroupActionBuilder.of();
    }

    public static CustomerSetCustomerGroupActionBuilder builder(final CustomerSetCustomerGroupAction template) {
        return CustomerSetCustomerGroupActionBuilder.of(template);
    }

    default <T> T withCustomerSetCustomerGroupAction(Function<CustomerSetCustomerGroupAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetCustomerGroupAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetCustomerGroupAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetCustomerGroupAction>";
            }
        };
    }
}
