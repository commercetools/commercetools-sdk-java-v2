
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreRefundPolicyUrlSetMessage" rel="nofollow">StoreRefundPolicyUrlSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetRefundPolicyUrlAction storeSetRefundPolicyUrlAction = StoreSetRefundPolicyUrlAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setRefundPolicyUrl")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetRefundPolicyUrlActionImpl.class)
public interface StoreSetRefundPolicyUrlAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreSetRefundPolicyUrlAction
     */
    String SET_REFUND_POLICY_URL = "setRefundPolicyUrl";

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @return refundPolicyUrl
     */

    @JsonProperty("refundPolicyUrl")
    public String getRefundPolicyUrl();

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @param refundPolicyUrl value to be set
     */

    public void setRefundPolicyUrl(final String refundPolicyUrl);

    /**
     * factory method
     * @return instance of StoreSetRefundPolicyUrlAction
     */
    public static StoreSetRefundPolicyUrlAction of() {
        return new StoreSetRefundPolicyUrlActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreSetRefundPolicyUrlAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSetRefundPolicyUrlAction of(final StoreSetRefundPolicyUrlAction template) {
        StoreSetRefundPolicyUrlActionImpl instance = new StoreSetRefundPolicyUrlActionImpl();
        instance.setRefundPolicyUrl(template.getRefundPolicyUrl());
        return instance;
    }

    public StoreSetRefundPolicyUrlAction copyDeep();

    /**
     * factory method to create a deep copy of StoreSetRefundPolicyUrlAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreSetRefundPolicyUrlAction deepCopy(@Nullable final StoreSetRefundPolicyUrlAction template) {
        if (template == null) {
            return null;
        }
        StoreSetRefundPolicyUrlActionImpl instance = new StoreSetRefundPolicyUrlActionImpl();
        instance.setRefundPolicyUrl(template.getRefundPolicyUrl());
        return instance;
    }

    /**
     * builder factory method for StoreSetRefundPolicyUrlAction
     * @return builder
     */
    public static StoreSetRefundPolicyUrlActionBuilder builder() {
        return StoreSetRefundPolicyUrlActionBuilder.of();
    }

    /**
     * create builder for StoreSetRefundPolicyUrlAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetRefundPolicyUrlActionBuilder builder(final StoreSetRefundPolicyUrlAction template) {
        return StoreSetRefundPolicyUrlActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSetRefundPolicyUrlAction(Function<StoreSetRefundPolicyUrlAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreSetRefundPolicyUrlAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreSetRefundPolicyUrlAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetRefundPolicyUrlAction>";
            }
        };
    }
}
