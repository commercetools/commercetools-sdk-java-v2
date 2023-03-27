
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetLocaleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetLocaleAction orderSetLocaleAction = OrderSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetLocaleActionImpl.class)
public interface OrderSetLocaleAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetLocaleAction
     */
    String SET_LOCALE = "setLocale";

    /**
     *
     * @return locale
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     * set locale
     * @param locale value to be set
     */

    public void setLocale(final String locale);

    /**
     * factory method
     * @return instance of OrderSetLocaleAction
     */
    public static OrderSetLocaleAction of() {
        return new OrderSetLocaleActionImpl();
    }

    /**
     * factory method to copy an instance of OrderSetLocaleAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetLocaleAction of(final OrderSetLocaleAction template) {
        OrderSetLocaleActionImpl instance = new OrderSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    /**
     * builder factory method for OrderSetLocaleAction
     * @return builder
     */
    public static OrderSetLocaleActionBuilder builder() {
        return OrderSetLocaleActionBuilder.of();
    }

    /**
     * create builder for OrderSetLocaleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetLocaleActionBuilder builder(final OrderSetLocaleAction template) {
        return OrderSetLocaleActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetLocaleAction(Function<OrderSetLocaleAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetLocaleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetLocaleAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetLocaleAction>";
            }
        };
    }
}
