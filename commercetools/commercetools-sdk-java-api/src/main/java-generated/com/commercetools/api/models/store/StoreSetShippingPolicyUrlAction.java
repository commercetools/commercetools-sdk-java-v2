
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreShippingPolicyUrlSetMessage" rel="nofollow">StoreShippingPolicyUrlSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetShippingPolicyUrlAction storeSetShippingPolicyUrlAction = StoreSetShippingPolicyUrlAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setShippingPolicyUrl")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetShippingPolicyUrlActionImpl.class)
public interface StoreSetShippingPolicyUrlAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreSetShippingPolicyUrlAction
     */
    String SET_SHIPPING_POLICY_URL = "setShippingPolicyUrl";

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @return shippingPolicyUrl
     */

    @JsonProperty("shippingPolicyUrl")
    public String getShippingPolicyUrl();

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @param shippingPolicyUrl value to be set
     */

    public void setShippingPolicyUrl(final String shippingPolicyUrl);

    /**
     * factory method
     * @return instance of StoreSetShippingPolicyUrlAction
     */
    public static StoreSetShippingPolicyUrlAction of() {
        return new StoreSetShippingPolicyUrlActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreSetShippingPolicyUrlAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSetShippingPolicyUrlAction of(final StoreSetShippingPolicyUrlAction template) {
        StoreSetShippingPolicyUrlActionImpl instance = new StoreSetShippingPolicyUrlActionImpl();
        instance.setShippingPolicyUrl(template.getShippingPolicyUrl());
        return instance;
    }

    public StoreSetShippingPolicyUrlAction copyDeep();

    /**
     * factory method to create a deep copy of StoreSetShippingPolicyUrlAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreSetShippingPolicyUrlAction deepCopy(@Nullable final StoreSetShippingPolicyUrlAction template) {
        if (template == null) {
            return null;
        }
        StoreSetShippingPolicyUrlActionImpl instance = new StoreSetShippingPolicyUrlActionImpl();
        instance.setShippingPolicyUrl(template.getShippingPolicyUrl());
        return instance;
    }

    /**
     * builder factory method for StoreSetShippingPolicyUrlAction
     * @return builder
     */
    public static StoreSetShippingPolicyUrlActionBuilder builder() {
        return StoreSetShippingPolicyUrlActionBuilder.of();
    }

    /**
     * create builder for StoreSetShippingPolicyUrlAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetShippingPolicyUrlActionBuilder builder(final StoreSetShippingPolicyUrlAction template) {
        return StoreSetShippingPolicyUrlActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSetShippingPolicyUrlAction(Function<StoreSetShippingPolicyUrlAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreSetShippingPolicyUrlAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreSetShippingPolicyUrlAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetShippingPolicyUrlAction>";
            }
        };
    }
}
