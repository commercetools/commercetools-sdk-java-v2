
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
 *  <p>Changing the address on a Business Unit generates the BusinessUnitAddressChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeAddressAction businessUnitChangeAddressAction = BusinessUnitChangeAddressAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitChangeAddressActionImpl.class)
public interface BusinessUnitChangeAddressAction extends BusinessUnitUpdateAction {

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

    public static BusinessUnitChangeAddressAction of() {
        return new BusinessUnitChangeAddressActionImpl();
    }

    public static BusinessUnitChangeAddressAction of(final BusinessUnitChangeAddressAction template) {
        BusinessUnitChangeAddressActionImpl instance = new BusinessUnitChangeAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static BusinessUnitChangeAddressActionBuilder builder() {
        return BusinessUnitChangeAddressActionBuilder.of();
    }

    public static BusinessUnitChangeAddressActionBuilder builder(final BusinessUnitChangeAddressAction template) {
        return BusinessUnitChangeAddressActionBuilder.of(template);
    }

    default <T> T withBusinessUnitChangeAddressAction(Function<BusinessUnitChangeAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitChangeAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitChangeAddressAction>";
            }
        };
    }
}
