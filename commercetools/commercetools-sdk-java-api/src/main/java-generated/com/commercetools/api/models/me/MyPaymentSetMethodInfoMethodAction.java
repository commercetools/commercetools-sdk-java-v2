
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentSetMethodInfoMethodAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentSetMethodInfoMethodAction myPaymentSetMethodInfoMethodAction = MyPaymentSetMethodInfoMethodAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyPaymentSetMethodInfoMethodActionImpl.class)
public interface MyPaymentSetMethodInfoMethodAction extends MyPaymentUpdateAction {

    /**
     * discriminator value for MyPaymentSetMethodInfoMethodAction
     */
    String SET_METHOD_INFO_METHOD = "setMethodInfoMethod";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return method
     */

    @JsonProperty("method")
    public String getMethod();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param method value to be set
     */

    public void setMethod(final String method);

    /**
     * factory method
     * @return instance of MyPaymentSetMethodInfoMethodAction
     */
    public static MyPaymentSetMethodInfoMethodAction of() {
        return new MyPaymentSetMethodInfoMethodActionImpl();
    }

    /**
     * factory method to create a shallow copy MyPaymentSetMethodInfoMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyPaymentSetMethodInfoMethodAction of(final MyPaymentSetMethodInfoMethodAction template) {
        MyPaymentSetMethodInfoMethodActionImpl instance = new MyPaymentSetMethodInfoMethodActionImpl();
        instance.setMethod(template.getMethod());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyPaymentSetMethodInfoMethodAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyPaymentSetMethodInfoMethodAction deepCopy(
            @Nullable final MyPaymentSetMethodInfoMethodAction template) {
        if (template == null) {
            return null;
        }
        MyPaymentSetMethodInfoMethodActionImpl instance = new MyPaymentSetMethodInfoMethodActionImpl();
        instance.setMethod(template.getMethod());
        return instance;
    }

    /**
     * builder factory method for MyPaymentSetMethodInfoMethodAction
     * @return builder
     */
    public static MyPaymentSetMethodInfoMethodActionBuilder builder() {
        return MyPaymentSetMethodInfoMethodActionBuilder.of();
    }

    /**
     * create builder for MyPaymentSetMethodInfoMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentSetMethodInfoMethodActionBuilder builder(final MyPaymentSetMethodInfoMethodAction template) {
        return MyPaymentSetMethodInfoMethodActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyPaymentSetMethodInfoMethodAction(Function<MyPaymentSetMethodInfoMethodAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyPaymentSetMethodInfoMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPaymentSetMethodInfoMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyPaymentSetMethodInfoMethodAction>";
            }
        };
    }
}
