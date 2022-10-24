
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Adding an address to the Customer produces the CustomerAddressAdded Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerAddAddressAction myCustomerAddAddressAction = MyCustomerAddAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerAddAddressActionImpl.class)
public interface MyCustomerAddAddressAction extends MyCustomerUpdateAction {

    String ADD_ADDRESS = "addAddress";

    /**
     *  <p>Value to append to the <code>addresses</code> array.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static MyCustomerAddAddressAction of() {
        return new MyCustomerAddAddressActionImpl();
    }

    public static MyCustomerAddAddressAction of(final MyCustomerAddAddressAction template) {
        MyCustomerAddAddressActionImpl instance = new MyCustomerAddAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static MyCustomerAddAddressActionBuilder builder() {
        return MyCustomerAddAddressActionBuilder.of();
    }

    public static MyCustomerAddAddressActionBuilder builder(final MyCustomerAddAddressAction template) {
        return MyCustomerAddAddressActionBuilder.of(template);
    }

    default <T> T withMyCustomerAddAddressAction(Function<MyCustomerAddAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerAddAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerAddAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerAddAddressAction>";
            }
        };
    }
}
