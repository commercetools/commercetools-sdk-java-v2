
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetKeyAction customerSetKeyAction = CustomerSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetKeyActionImpl.class)
public interface CustomerSetKeyAction extends CustomerUpdateAction {

    String SET_KEY = "setKey";

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static CustomerSetKeyAction of() {
        return new CustomerSetKeyActionImpl();
    }

    public static CustomerSetKeyAction of(final CustomerSetKeyAction template) {
        CustomerSetKeyActionImpl instance = new CustomerSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static CustomerSetKeyActionBuilder builder() {
        return CustomerSetKeyActionBuilder.of();
    }

    public static CustomerSetKeyActionBuilder builder(final CustomerSetKeyAction template) {
        return CustomerSetKeyActionBuilder.of(template);
    }

    default <T> T withCustomerSetKeyAction(Function<CustomerSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static CustomerSetKeyAction ofUnset() {
        return CustomerSetKeyAction.of();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetKeyAction>";
            }
        };
    }
}
