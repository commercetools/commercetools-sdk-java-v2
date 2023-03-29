
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentSetMethodInfoNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentSetMethodInfoNameAction myPaymentSetMethodInfoNameAction = MyPaymentSetMethodInfoNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyPaymentSetMethodInfoNameActionImpl.class)
public interface MyPaymentSetMethodInfoNameAction extends MyPaymentUpdateAction {

    /**
     * discriminator value for MyPaymentSetMethodInfoNameAction
     */
    String SET_METHOD_INFO_NAME = "setMethodInfoName";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of MyPaymentSetMethodInfoNameAction
     */
    public static MyPaymentSetMethodInfoNameAction of() {
        return new MyPaymentSetMethodInfoNameActionImpl();
    }

    /**
     * factory method to create a shallow copy MyPaymentSetMethodInfoNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyPaymentSetMethodInfoNameAction of(final MyPaymentSetMethodInfoNameAction template) {
        MyPaymentSetMethodInfoNameActionImpl instance = new MyPaymentSetMethodInfoNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyPaymentSetMethodInfoNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyPaymentSetMethodInfoNameAction deepCopy(@Nullable final MyPaymentSetMethodInfoNameAction template) {
        if (template == null) {
            return null;
        }
        MyPaymentSetMethodInfoNameActionImpl instance = new MyPaymentSetMethodInfoNameActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for MyPaymentSetMethodInfoNameAction
     * @return builder
     */
    public static MyPaymentSetMethodInfoNameActionBuilder builder() {
        return MyPaymentSetMethodInfoNameActionBuilder.of();
    }

    /**
     * create builder for MyPaymentSetMethodInfoNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentSetMethodInfoNameActionBuilder builder(final MyPaymentSetMethodInfoNameAction template) {
        return MyPaymentSetMethodInfoNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyPaymentSetMethodInfoNameAction(Function<MyPaymentSetMethodInfoNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyPaymentSetMethodInfoNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPaymentSetMethodInfoNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyPaymentSetMethodInfoNameAction>";
            }
        };
    }
}
