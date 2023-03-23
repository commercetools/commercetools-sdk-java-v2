
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removing the address from a Business Unit generates the BusinessUnitAddressRemoved Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitRemoveAddressAction businessUnitRemoveAddressAction = BusinessUnitRemoveAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitRemoveAddressActionImpl.class)
public interface BusinessUnitRemoveAddressAction extends BusinessUnitUpdateAction {

    String REMOVE_ADDRESS = "removeAddress";

    /**
     *  <p>ID of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Key of the address to be removed. Either <code>addressId</code> or <code>addressKey</code> is required.</p>
     * @return addressKey
     */

    @JsonProperty("addressKey")
    public String getAddressKey();

    public void setAddressId(final String addressId);

    public void setAddressKey(final String addressKey);

    public static BusinessUnitRemoveAddressAction of() {
        return new BusinessUnitRemoveAddressActionImpl();
    }

    public static BusinessUnitRemoveAddressAction of(final BusinessUnitRemoveAddressAction template) {
        BusinessUnitRemoveAddressActionImpl instance = new BusinessUnitRemoveAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static BusinessUnitRemoveAddressActionBuilder builder() {
        return BusinessUnitRemoveAddressActionBuilder.of();
    }

    public static BusinessUnitRemoveAddressActionBuilder builder(final BusinessUnitRemoveAddressAction template) {
        return BusinessUnitRemoveAddressActionBuilder.of(template);
    }

    default <T> T withBusinessUnitRemoveAddressAction(Function<BusinessUnitRemoveAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitRemoveAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitRemoveAddressAction>";
            }
        };
    }
}
