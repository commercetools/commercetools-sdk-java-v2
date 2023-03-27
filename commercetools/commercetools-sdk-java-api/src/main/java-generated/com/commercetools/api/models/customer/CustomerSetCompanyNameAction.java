
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting a company name produces the CustomerCompanyNameSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetCompanyNameAction customerSetCompanyNameAction = CustomerSetCompanyNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetCompanyNameActionImpl.class)
public interface CustomerSetCompanyNameAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetCompanyNameAction
     */
    String SET_COMPANY_NAME = "setCompanyName";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return companyName
     */

    @JsonProperty("companyName")
    public String getCompanyName();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param companyName value to be set
     */

    public void setCompanyName(final String companyName);

    /**
     * factory method
     * @return instance of CustomerSetCompanyNameAction
     */
    public static CustomerSetCompanyNameAction of() {
        return new CustomerSetCompanyNameActionImpl();
    }

    /**
     * factory method to copy an instance of CustomerSetCompanyNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetCompanyNameAction of(final CustomerSetCompanyNameAction template) {
        CustomerSetCompanyNameActionImpl instance = new CustomerSetCompanyNameActionImpl();
        instance.setCompanyName(template.getCompanyName());
        return instance;
    }

    /**
     * builder factory method for CustomerSetCompanyNameAction
     * @return builder
     */
    public static CustomerSetCompanyNameActionBuilder builder() {
        return CustomerSetCompanyNameActionBuilder.of();
    }

    /**
     * create builder for CustomerSetCompanyNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetCompanyNameActionBuilder builder(final CustomerSetCompanyNameAction template) {
        return CustomerSetCompanyNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetCompanyNameAction(Function<CustomerSetCompanyNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetCompanyNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetCompanyNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetCompanyNameAction>";
            }
        };
    }
}
