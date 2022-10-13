
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
 *  <p>Adding an address to a Business Unit generates a BusinessUnitAddressAdded Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitAddAddressAction myBusinessUnitAddAddressAction = MyBusinessUnitAddAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitAddAddressActionImpl.class)
public interface MyBusinessUnitAddAddressAction extends MyBusinessUnitUpdateAction {

    String ADD_ADDRESS = "addAddress";

    /**
     *  <p>The address to add to <code>addresses</code>.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static MyBusinessUnitAddAddressAction of() {
        return new MyBusinessUnitAddAddressActionImpl();
    }

    public static MyBusinessUnitAddAddressAction of(final MyBusinessUnitAddAddressAction template) {
        MyBusinessUnitAddAddressActionImpl instance = new MyBusinessUnitAddAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static MyBusinessUnitAddAddressActionBuilder builder() {
        return MyBusinessUnitAddAddressActionBuilder.of();
    }

    public static MyBusinessUnitAddAddressActionBuilder builder(final MyBusinessUnitAddAddressAction template) {
        return MyBusinessUnitAddAddressActionBuilder.of(template);
    }

    default <T> T withMyBusinessUnitAddAddressAction(Function<MyBusinessUnitAddAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitAddAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitAddAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitAddAddressAction>";
            }
        };
    }
}
