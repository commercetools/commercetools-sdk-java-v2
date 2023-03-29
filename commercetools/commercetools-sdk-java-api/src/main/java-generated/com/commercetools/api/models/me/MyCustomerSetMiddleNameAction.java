
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetMiddleNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetMiddleNameAction myCustomerSetMiddleNameAction = MyCustomerSetMiddleNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetMiddleNameActionImpl.class)
public interface MyCustomerSetMiddleNameAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerSetMiddleNameAction
     */
    String SET_MIDDLE_NAME = "setMiddleName";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return middleName
     */

    @JsonProperty("middleName")
    public String getMiddleName();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param middleName value to be set
     */

    public void setMiddleName(final String middleName);

    /**
     * factory method
     * @return instance of MyCustomerSetMiddleNameAction
     */
    public static MyCustomerSetMiddleNameAction of() {
        return new MyCustomerSetMiddleNameActionImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerSetMiddleNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerSetMiddleNameAction of(final MyCustomerSetMiddleNameAction template) {
        MyCustomerSetMiddleNameActionImpl instance = new MyCustomerSetMiddleNameActionImpl();
        instance.setMiddleName(template.getMiddleName());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCustomerSetMiddleNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerSetMiddleNameAction deepCopy(@Nullable final MyCustomerSetMiddleNameAction template) {
        if (template == null) {
            return null;
        }
        MyCustomerSetMiddleNameActionImpl instance = new MyCustomerSetMiddleNameActionImpl();
        instance.setMiddleName(template.getMiddleName());
        return instance;
    }

    /**
     * builder factory method for MyCustomerSetMiddleNameAction
     * @return builder
     */
    public static MyCustomerSetMiddleNameActionBuilder builder() {
        return MyCustomerSetMiddleNameActionBuilder.of();
    }

    /**
     * create builder for MyCustomerSetMiddleNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetMiddleNameActionBuilder builder(final MyCustomerSetMiddleNameAction template) {
        return MyCustomerSetMiddleNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerSetMiddleNameAction(Function<MyCustomerSetMiddleNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetMiddleNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetMiddleNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetMiddleNameAction>";
            }
        };
    }
}
