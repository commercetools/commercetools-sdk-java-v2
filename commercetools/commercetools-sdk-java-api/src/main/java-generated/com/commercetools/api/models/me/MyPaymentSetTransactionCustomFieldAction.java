
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentSetTransactionCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentSetTransactionCustomFieldAction myPaymentSetTransactionCustomFieldAction = MyPaymentSetTransactionCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyPaymentSetTransactionCustomFieldActionImpl.class)
public interface MyPaymentSetTransactionCustomFieldAction extends MyPaymentUpdateAction {

    /**
     * discriminator value for MyPaymentSetTransactionCustomFieldAction
     */
    String SET_TRANSACTION_CUSTOM_FIELD = "setTransactionCustomField";

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of MyPaymentSetTransactionCustomFieldAction
     */
    public static MyPaymentSetTransactionCustomFieldAction of() {
        return new MyPaymentSetTransactionCustomFieldActionImpl();
    }

    /**
     * factory method to copy an instance of MyPaymentSetTransactionCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyPaymentSetTransactionCustomFieldAction of(final MyPaymentSetTransactionCustomFieldAction template) {
        MyPaymentSetTransactionCustomFieldActionImpl instance = new MyPaymentSetTransactionCustomFieldActionImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for MyPaymentSetTransactionCustomFieldAction
     * @return builder
     */
    public static MyPaymentSetTransactionCustomFieldActionBuilder builder() {
        return MyPaymentSetTransactionCustomFieldActionBuilder.of();
    }

    /**
     * create builder for MyPaymentSetTransactionCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyPaymentSetTransactionCustomFieldActionBuilder builder(
            final MyPaymentSetTransactionCustomFieldAction template) {
        return MyPaymentSetTransactionCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyPaymentSetTransactionCustomFieldAction(
            Function<MyPaymentSetTransactionCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyPaymentSetTransactionCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyPaymentSetTransactionCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyPaymentSetTransactionCustomFieldAction>";
            }
        };
    }
}
