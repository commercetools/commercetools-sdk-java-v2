
package com.commercetools.api.models.customer;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the title of the Customer produces the CustomerTitleSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetTitleAction customerSetTitleAction = CustomerSetTitleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerSetTitleActionImpl.class)
public interface CustomerSetTitleAction extends CustomerUpdateAction {

    /**
     * discriminator value for CustomerSetTitleAction
     */
    String SET_TITLE = "setTitle";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return title
     */

    @JsonProperty("title")
    public String getTitle();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param title value to be set
     */

    public void setTitle(final String title);

    /**
     * factory method
     * @return instance of CustomerSetTitleAction
     */
    public static CustomerSetTitleAction of() {
        return new CustomerSetTitleActionImpl();
    }

    /**
     * factory method to create a shallow copy CustomerSetTitleAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerSetTitleAction of(final CustomerSetTitleAction template) {
        CustomerSetTitleActionImpl instance = new CustomerSetTitleActionImpl();
        instance.setTitle(template.getTitle());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerSetTitleAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerSetTitleAction deepCopy(@Nullable final CustomerSetTitleAction template) {
        if (template == null) {
            return null;
        }
        CustomerSetTitleActionImpl instance = new CustomerSetTitleActionImpl();
        instance.setTitle(template.getTitle());
        return instance;
    }

    /**
     * builder factory method for CustomerSetTitleAction
     * @return builder
     */
    public static CustomerSetTitleActionBuilder builder() {
        return CustomerSetTitleActionBuilder.of();
    }

    /**
     * create builder for CustomerSetTitleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetTitleActionBuilder builder(final CustomerSetTitleAction template) {
        return CustomerSetTitleActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerSetTitleAction(Function<CustomerSetTitleAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerSetTitleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerSetTitleAction>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerSetTitleAction>";
            }
        };
    }
}
