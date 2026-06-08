
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetLocaleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetLocaleAction myCustomerSetLocaleAction = MyCustomerSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setLocale")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetLocaleActionImpl.class)
public interface MyCustomerSetLocaleAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerSetLocaleAction
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
     * @return instance of MyCustomerSetLocaleAction
     */
    public static MyCustomerSetLocaleAction of() {
        return new MyCustomerSetLocaleActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerSetLocaleAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerSetLocaleAction of(final MyCustomerSetLocaleAction template) {
        MyCustomerSetLocaleActionImpl instance = new MyCustomerSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    public MyCustomerSetLocaleAction copyDeep();

    /**
     * factory method to create a deep copy of MyCustomerSetLocaleAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerSetLocaleAction deepCopy(@Nullable final MyCustomerSetLocaleAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerSetLocaleActionImpl instance = new MyCustomerSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    /**
     * builder factory method for MyCustomerSetLocaleAction
     * @return builder
     */
    public static MyCustomerSetLocaleActionBuilder builder() {
        return MyCustomerSetLocaleActionBuilder.of();
    }

    /**
     * create builder for MyCustomerSetLocaleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetLocaleActionBuilder builder(final MyCustomerSetLocaleAction template) {
        return MyCustomerSetLocaleActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerSetLocaleAction(Function<MyCustomerSetLocaleAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetLocaleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetLocaleAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetLocaleAction>";
            }
        };
    }
}
