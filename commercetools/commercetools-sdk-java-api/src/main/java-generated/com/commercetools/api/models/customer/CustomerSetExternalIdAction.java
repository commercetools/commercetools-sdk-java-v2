
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetExternalIdAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetExternalIdAction customerSetExternalIdAction = CustomerSetExternalIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetExternalIdActionImpl.class)
public interface CustomerSetExternalIdAction extends CustomerUpdateAction {

    String SET_EXTERNAL_ID = "setExternalId";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    @JsonProperty("externalId")
    public String getExternalId();

    public void setExternalId(final String externalId);

    public static CustomerSetExternalIdAction of() {
        return new CustomerSetExternalIdActionImpl();
    }

    public static CustomerSetExternalIdAction of(final CustomerSetExternalIdAction template) {
        CustomerSetExternalIdActionImpl instance = new CustomerSetExternalIdActionImpl();
        instance.setExternalId(template.getExternalId());
        return instance;
    }

    public static CustomerSetExternalIdActionBuilder builder() {
        return CustomerSetExternalIdActionBuilder.of();
    }

    public static CustomerSetExternalIdActionBuilder builder(final CustomerSetExternalIdAction template) {
        return CustomerSetExternalIdActionBuilder.of(template);
    }

    default <T> T withCustomerSetExternalIdAction(Function<CustomerSetExternalIdAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetExternalIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetExternalIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetExternalIdAction>";
            }
        };
    }
}
