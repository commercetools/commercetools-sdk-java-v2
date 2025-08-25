
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetLocaleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetLocaleAction customerSetLocaleAction = CustomerSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLocale")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetLocaleActionImpl.class)
public interface CustomerSetLocaleAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetLocaleAction
     */
    String SET_LOCALE = "setLocale";

    /**
     *  <p>Value to set. Must be one of the languages supported by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     * @return locale
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Value to set. Must be one of the languages supported by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     * @param locale value to be set
     */

    public void setLocale(final String locale);

    /**
     * factory method
     * @return instance of CustomerSetLocaleAction
     */
    public static CustomerSetLocaleAction of() {
        return new CustomerSetLocaleActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerSetLocaleAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetLocaleAction of(final CustomerSetLocaleAction template) {
        CustomerSetLocaleActionImpl instance = new CustomerSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    public CustomerSetLocaleAction copyDeep();

    /**
     * factory method to create a deep copy of CustomerSetLocaleAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetLocaleAction deepCopy(@Nullable final CustomerSetLocaleAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetLocaleActionImpl instance = new CustomerSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    /**
     * builder factory method for CustomerSetLocaleAction
     * @return builder
     */
    public static CustomerSetLocaleActionBuilder builder() {
        return CustomerSetLocaleActionBuilder.of();
    }

    /**
     * create builder for CustomerSetLocaleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetLocaleActionBuilder builder(final CustomerSetLocaleAction template) {
        return CustomerSetLocaleActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetLocaleAction(Function<CustomerSetLocaleAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetLocaleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetLocaleAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetLocaleAction>";
            }
        };
    }
}
