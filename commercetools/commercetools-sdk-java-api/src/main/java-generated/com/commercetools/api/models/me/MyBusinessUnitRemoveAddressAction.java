
package com.commercetools.api.models.me;

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
 *     MyBusinessUnitRemoveAddressAction myBusinessUnitRemoveAddressAction = MyBusinessUnitRemoveAddressAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyBusinessUnitRemoveAddressActionImpl.class)
public interface MyBusinessUnitRemoveAddressAction extends MyBusinessUnitUpdateAction {

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

    public static MyBusinessUnitRemoveAddressAction of() {
        return new MyBusinessUnitRemoveAddressActionImpl();
    }

    public static MyBusinessUnitRemoveAddressAction of(final MyBusinessUnitRemoveAddressAction template) {
        MyBusinessUnitRemoveAddressActionImpl instance = new MyBusinessUnitRemoveAddressActionImpl();
        instance.setAddressId(template.getAddressId());
        instance.setAddressKey(template.getAddressKey());
        return instance;
    }

    public static MyBusinessUnitRemoveAddressActionBuilder builder() {
        return MyBusinessUnitRemoveAddressActionBuilder.of();
    }

    public static MyBusinessUnitRemoveAddressActionBuilder builder(final MyBusinessUnitRemoveAddressAction template) {
        return MyBusinessUnitRemoveAddressActionBuilder.of(template);
    }

    default <T> T withMyBusinessUnitRemoveAddressAction(Function<MyBusinessUnitRemoveAddressAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitRemoveAddressAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitRemoveAddressAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitRemoveAddressAction>";
            }
        };
    }
}
