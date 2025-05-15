
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the <code>companyName</code> field on the Customer produces the CustomerCompanyNameSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetCompanyNameAction myCustomerSetCompanyNameAction = MyCustomerSetCompanyNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCompanyName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetCompanyNameActionImpl.class)
public interface MyCustomerSetCompanyNameAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerSetCompanyNameAction
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
     * @return instance of MyCustomerSetCompanyNameAction
     */
    public static MyCustomerSetCompanyNameAction of() {
        return new MyCustomerSetCompanyNameActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerSetCompanyNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerSetCompanyNameAction of(final MyCustomerSetCompanyNameAction template) {
        MyCustomerSetCompanyNameActionImpl instance = new MyCustomerSetCompanyNameActionImpl();
        instance.setCompanyName(template.getCompanyName());
        return instance;
    }

    public MyCustomerSetCompanyNameAction copyDeep();

    /**
     * factory method to create a deep copy of MyCustomerSetCompanyNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerSetCompanyNameAction deepCopy(@Nullable final MyCustomerSetCompanyNameAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerSetCompanyNameActionImpl instance = new MyCustomerSetCompanyNameActionImpl();
        instance.setCompanyName(template.getCompanyName());
        return instance;
    }

    /**
     * builder factory method for MyCustomerSetCompanyNameAction
     * @return builder
     */
    public static MyCustomerSetCompanyNameActionBuilder builder() {
        return MyCustomerSetCompanyNameActionBuilder.of();
    }

    /**
     * create builder for MyCustomerSetCompanyNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetCompanyNameActionBuilder builder(final MyCustomerSetCompanyNameAction template) {
        return MyCustomerSetCompanyNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerSetCompanyNameAction(Function<MyCustomerSetCompanyNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetCompanyNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetCompanyNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetCompanyNameAction>";
            }
        };
    }
}
