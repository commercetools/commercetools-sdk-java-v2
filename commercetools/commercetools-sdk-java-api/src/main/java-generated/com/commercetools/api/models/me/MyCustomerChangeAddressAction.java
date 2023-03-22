
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
 *  <p>Changing an address of the Customer produces the CustomerAddressChanged Message.</p>
 *  <p>Either <code>addressId</code> or <code>addressKey</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerChangeAddressAction myCustomerChangeAddressAction = MyCustomerChangeAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerChangeAddressActionImpl.class)
public interface MyCustomerChangeAddressAction extends MyCustomerUpdateAction {

    String CHANGE_ADDRESS = "changeAddress";

    /**
     *  <p><code>id</code> of the Address to change.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p><code>key</code> of the Address to change.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p>Value to set.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public void setAddress(final BaseAddress address);

    public static MyCustomerChangeAddressAction of() {
        return new MyCustomerChangeAddressActionImpl();
    }

    public static MyCustomerChangeAddressAction of(final MyCustomerChangeAddressAction template) {
        MyCustomerChangeAddressActionImpl instance = new MyCustomerChangeAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static MyCustomerChangeAddressActionBuilder builder() {
        return MyCustomerChangeAddressActionBuilder.of();
    }

    public static MyCustomerChangeAddressActionBuilder builder(final MyCustomerChangeAddressAction template) {
        return MyCustomerChangeAddressActionBuilder.of(template);
    }

    default <T> T withMyCustomerChangeAddressAction(Function<MyCustomerChangeAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerChangeAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerChangeAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerChangeAddressAction>";
            }
        };
    }
}
