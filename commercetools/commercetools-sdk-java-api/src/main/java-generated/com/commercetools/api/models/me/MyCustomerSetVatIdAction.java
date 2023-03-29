
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetVatIdAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetVatIdAction myCustomerSetVatIdAction = MyCustomerSetVatIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetVatIdActionImpl.class)
public interface MyCustomerSetVatIdAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerSetVatIdAction
     */
    String SET_VAT_ID = "setVatId";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return vatId
     */

    @JsonProperty("vatId")
    public String getVatId();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param vatId value to be set
     */

    public void setVatId(final String vatId);

    /**
     * factory method
     * @return instance of MyCustomerSetVatIdAction
     */
    public static MyCustomerSetVatIdAction of() {
        return new MyCustomerSetVatIdActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerSetVatIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerSetVatIdAction of(final MyCustomerSetVatIdAction template) {
        MyCustomerSetVatIdActionImpl instance = new MyCustomerSetVatIdActionImpl();
        instance.setVatId(template.getVatId());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCustomerSetVatIdAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerSetVatIdAction deepCopy(@Nullable final MyCustomerSetVatIdAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerSetVatIdActionImpl instance = new MyCustomerSetVatIdActionImpl();
        instance.setVatId(template.getVatId());
        return instance;
    }

    /**
     * builder factory method for MyCustomerSetVatIdAction
     * @return builder
     */
    public static MyCustomerSetVatIdActionBuilder builder() {
        return MyCustomerSetVatIdActionBuilder.of();
    }

    /**
     * create builder for MyCustomerSetVatIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetVatIdActionBuilder builder(final MyCustomerSetVatIdAction template) {
        return MyCustomerSetVatIdActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerSetVatIdAction(Function<MyCustomerSetVatIdAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetVatIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetVatIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetVatIdAction>";
            }
        };
    }
}
