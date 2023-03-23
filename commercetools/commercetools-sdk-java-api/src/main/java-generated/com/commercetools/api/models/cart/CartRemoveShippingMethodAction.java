
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removes a Shipping Method from a Cart that has the <code>Multiple</code> ShippingMode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartRemoveShippingMethodAction cartRemoveShippingMethodAction = CartRemoveShippingMethodAction.builder()
 *             .shippingKey("{shippingKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartRemoveShippingMethodActionImpl.class)
public interface CartRemoveShippingMethodAction extends CartUpdateAction {

    String REMOVE_SHIPPING_METHOD = "removeShippingMethod";

    /**
     *  <p>User-defined unique identifier of the Shipping Method to remove from the Cart.</p>
     * @return shippingKey
     */
    @NotNull
    @JsonProperty("shippingKey")
    public String getShippingKey();

    public void setShippingKey(final String shippingKey);

    public static CartRemoveShippingMethodAction of() {
        return new CartRemoveShippingMethodActionImpl();
    }

    public static CartRemoveShippingMethodAction of(final CartRemoveShippingMethodAction template) {
        CartRemoveShippingMethodActionImpl instance = new CartRemoveShippingMethodActionImpl();
        instance.setShippingKey(template.getShippingKey());
        return instance;
    }

    public static CartRemoveShippingMethodActionBuilder builder() {
        return CartRemoveShippingMethodActionBuilder.of();
    }

    public static CartRemoveShippingMethodActionBuilder builder(final CartRemoveShippingMethodAction template) {
        return CartRemoveShippingMethodActionBuilder.of(template);
    }

    default <T> T withCartRemoveShippingMethodAction(Function<CartRemoveShippingMethodAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartRemoveShippingMethodAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartRemoveShippingMethodAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartRemoveShippingMethodAction>";
            }
        };
    }
}
