
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

    /**
     * discriminator value for CustomerSetExternalIdAction
     */
    String SET_EXTERNAL_ID = "setExternalId";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return externalId
     */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param externalId value to be set
     */

    public void setExternalId(final String externalId);

    /**
     * factory method
     * @return instance of CustomerSetExternalIdAction
     */
    public static CustomerSetExternalIdAction of() {
        return new CustomerSetExternalIdActionImpl();
    }

    /**
     * factory method to copy an instance of CustomerSetExternalIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetExternalIdAction of(final CustomerSetExternalIdAction template) {
        CustomerSetExternalIdActionImpl instance = new CustomerSetExternalIdActionImpl();
        instance.setExternalId(template.getExternalId());
        return instance;
    }

    /**
     * builder factory method for CustomerSetExternalIdAction
     * @return builder
     */
    public static CustomerSetExternalIdActionBuilder builder() {
        return CustomerSetExternalIdActionBuilder.of();
    }

    /**
     * create builder for CustomerSetExternalIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetExternalIdActionBuilder builder(final CustomerSetExternalIdAction template) {
        return CustomerSetExternalIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetExternalIdAction(Function<CustomerSetExternalIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetExternalIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetExternalIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetExternalIdAction>";
            }
        };
    }
}
