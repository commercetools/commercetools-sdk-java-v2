
package com.commercetools.api.models.business_unit;

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
 *     BusinessUnitAddAddressAction businessUnitAddAddressAction = BusinessUnitAddAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddAddressActionImpl.class)
public interface BusinessUnitAddAddressAction extends BusinessUnitUpdateAction {

    String ADD_ADDRESS = "addAddress";

    /**
     *  <p>Address to add to the addresses of the Business Unit.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    public void setAddress(final BaseAddress address);

    public static BusinessUnitAddAddressAction of() {
        return new BusinessUnitAddAddressActionImpl();
    }

    public static BusinessUnitAddAddressAction of(final BusinessUnitAddAddressAction template) {
        BusinessUnitAddAddressActionImpl instance = new BusinessUnitAddAddressActionImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static BusinessUnitAddAddressActionBuilder builder() {
        return BusinessUnitAddAddressActionBuilder.of();
    }

    public static BusinessUnitAddAddressActionBuilder builder(final BusinessUnitAddAddressAction template) {
        return BusinessUnitAddAddressActionBuilder.of(template);
    }

    default <T> T withBusinessUnitAddAddressAction(Function<BusinessUnitAddAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddAddressAction>";
            }
        };
    }
}
