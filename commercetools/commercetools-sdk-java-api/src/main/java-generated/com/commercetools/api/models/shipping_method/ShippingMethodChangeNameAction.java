
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodChangeNameAction shippingMethodChangeNameAction = ShippingMethodChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodChangeNameActionImpl.class)
public interface ShippingMethodChangeNameAction extends ShippingMethodUpdateAction {

    String CHANGE_NAME = "changeName";

    /**
     *  <p>Value to set. Must not be empty.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setName(final String name);

    public static ShippingMethodChangeNameAction of() {
        return new ShippingMethodChangeNameActionImpl();
    }

    public static ShippingMethodChangeNameAction of(final ShippingMethodChangeNameAction template) {
        ShippingMethodChangeNameActionImpl instance = new ShippingMethodChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static ShippingMethodChangeNameActionBuilder builder() {
        return ShippingMethodChangeNameActionBuilder.of();
    }

    public static ShippingMethodChangeNameActionBuilder builder(final ShippingMethodChangeNameAction template) {
        return ShippingMethodChangeNameActionBuilder.of(template);
    }

    default <T> T withShippingMethodChangeNameAction(Function<ShippingMethodChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodChangeNameAction>";
            }
        };
    }
}
