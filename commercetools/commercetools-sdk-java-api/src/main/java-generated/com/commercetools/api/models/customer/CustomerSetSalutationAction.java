
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetSalutationAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetSalutationAction customerSetSalutationAction = CustomerSetSalutationAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetSalutationActionImpl.class)
public interface CustomerSetSalutationAction extends CustomerUpdateAction {

    String SET_SALUTATION = "setSalutation";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return salutation
     */

    @JsonProperty("salutation")
    public String getSalutation();

    public void setSalutation(final String salutation);

    public static CustomerSetSalutationAction of() {
        return new CustomerSetSalutationActionImpl();
    }

    public static CustomerSetSalutationAction of(final CustomerSetSalutationAction template) {
        CustomerSetSalutationActionImpl instance = new CustomerSetSalutationActionImpl();
        instance.setSalutation(template.getSalutation());
        return instance;
    }

    public static CustomerSetSalutationActionBuilder builder() {
        return CustomerSetSalutationActionBuilder.of();
    }

    public static CustomerSetSalutationActionBuilder builder(final CustomerSetSalutationAction template) {
        return CustomerSetSalutationActionBuilder.of(template);
    }

    default <T> T withCustomerSetSalutationAction(Function<CustomerSetSalutationAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetSalutationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetSalutationAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetSalutationAction>";
            }
        };
    }
}
