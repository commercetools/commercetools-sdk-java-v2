
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
 *  <p>Changing the address on a Business Unit generates the BusinessUnitAddressChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitChangeAddressAction myBusinessUnitChangeAddressAction = MyBusinessUnitChangeAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitChangeAddressActionImpl.class)
public interface MyBusinessUnitChangeAddressAction extends MyBusinessUnitUpdateAction {

    String CHANGE_ADDRESS = "changeAddress";

    /**
     *  <p>ID of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Key of the address to change. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    /**
     *  <p>New address to set.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public void setAddress(final BaseAddress address);

    public static MyBusinessUnitChangeAddressAction of() {
        return new MyBusinessUnitChangeAddressActionImpl();
    }

    public static MyBusinessUnitChangeAddressAction of(final MyBusinessUnitChangeAddressAction template) {
        MyBusinessUnitChangeAddressActionImpl instance = new MyBusinessUnitChangeAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static MyBusinessUnitChangeAddressActionBuilder builder() {
        return MyBusinessUnitChangeAddressActionBuilder.of();
    }

    public static MyBusinessUnitChangeAddressActionBuilder builder(final MyBusinessUnitChangeAddressAction template) {
        return MyBusinessUnitChangeAddressActionBuilder.of(template);
    }

    default <T> T withMyBusinessUnitChangeAddressAction(Function<MyBusinessUnitChangeAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitChangeAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitChangeAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitChangeAddressAction>";
            }
        };
    }
}
