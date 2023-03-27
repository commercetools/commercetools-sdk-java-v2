
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetSalutationAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetSalutationAction myCustomerSetSalutationAction = MyCustomerSetSalutationAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerSetSalutationActionImpl.class)
public interface MyCustomerSetSalutationAction extends MyCustomerUpdateAction {

    /**
     * discriminator value for MyCustomerSetSalutationAction
     */
    String SET_SALUTATION = "setSalutation";

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return salutation
     */

    @JsonProperty("salutation")
    public String getSalutation();

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param salutation value to be set
     */

    public void setSalutation(final String salutation);

    /**
     * factory method
     * @return instance of MyCustomerSetSalutationAction
     */
    public static MyCustomerSetSalutationAction of() {
        return new MyCustomerSetSalutationActionImpl();
    }

    /**
     * factory method to copy an instance of MyCustomerSetSalutationAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerSetSalutationAction of(final MyCustomerSetSalutationAction template) {
        MyCustomerSetSalutationActionImpl instance = new MyCustomerSetSalutationActionImpl();
        instance.setSalutation(template.getSalutation());
        return instance;
    }

    /**
     * builder factory method for MyCustomerSetSalutationAction
     * @return builder
     */
    public static MyCustomerSetSalutationActionBuilder builder() {
        return MyCustomerSetSalutationActionBuilder.of();
    }

    /**
     * create builder for MyCustomerSetSalutationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetSalutationActionBuilder builder(final MyCustomerSetSalutationAction template) {
        return MyCustomerSetSalutationActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerSetSalutationAction(Function<MyCustomerSetSalutationAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetSalutationAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerSetSalutationAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerSetSalutationAction>";
            }
        };
    }
}
