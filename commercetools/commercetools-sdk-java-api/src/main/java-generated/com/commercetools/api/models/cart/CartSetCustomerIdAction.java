
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Setting the Cart's <code>customerId</code> can lead to updates on all its LineItem <code>prices</code>.</p>
 *  <p>If the Customer with the specified <code>id</code> cannot be found, this update action returns a MissingTaxRateForCountry error.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomerIdAction cartSetCustomerIdAction = CartSetCustomerIdAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetCustomerIdActionImpl.class)
public interface CartSetCustomerIdAction extends CartUpdateAction {

    String SET_CUSTOMER_ID = "setCustomerId";

    /**
     *  <p><code>id</code> of an existing Customer. If empty, any value is removed.</p>
     * @return customerId
     */

    @JsonProperty("customerId")
    public String getCustomerId();

    public void setCustomerId(final String customerId);

    public static CartSetCustomerIdAction of() {
        return new CartSetCustomerIdActionImpl();
    }

    public static CartSetCustomerIdAction of(final CartSetCustomerIdAction template) {
        CartSetCustomerIdActionImpl instance = new CartSetCustomerIdActionImpl();
        instance.setCustomerId(template.getCustomerId());
        return instance;
    }

    public static CartSetCustomerIdActionBuilder builder() {
        return CartSetCustomerIdActionBuilder.of();
    }

    public static CartSetCustomerIdActionBuilder builder(final CartSetCustomerIdAction template) {
        return CartSetCustomerIdActionBuilder.of(template);
    }

    default <T> T withCartSetCustomerIdAction(Function<CartSetCustomerIdAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCustomerIdAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCustomerIdAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCustomerIdAction>";
            }
        };
    }
}
