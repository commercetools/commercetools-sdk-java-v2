
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCookiePolicyUrlSetMessage" rel="nofollow">StoreCookiePolicyUrlSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetCookiePolicyUrlAction storeSetCookiePolicyUrlAction = StoreSetCookiePolicyUrlAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCookiePolicyUrl")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetCookiePolicyUrlActionImpl.class)
public interface StoreSetCookiePolicyUrlAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreSetCookiePolicyUrlAction
     */
    String SET_COOKIE_POLICY_URL = "setCookiePolicyUrl";

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @return cookiePolicyUrl
     */

    @JsonProperty("cookiePolicyUrl")
    public String getCookiePolicyUrl();

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @param cookiePolicyUrl value to be set
     */

    public void setCookiePolicyUrl(final String cookiePolicyUrl);

    /**
     * factory method
     * @return instance of StoreSetCookiePolicyUrlAction
     */
    public static StoreSetCookiePolicyUrlAction of() {
        return new StoreSetCookiePolicyUrlActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreSetCookiePolicyUrlAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSetCookiePolicyUrlAction of(final StoreSetCookiePolicyUrlAction template) {
        StoreSetCookiePolicyUrlActionImpl instance = new StoreSetCookiePolicyUrlActionImpl();
        instance.setCookiePolicyUrl(template.getCookiePolicyUrl());
        return instance;
    }

    public StoreSetCookiePolicyUrlAction copyDeep();

    /**
     * factory method to create a deep copy of StoreSetCookiePolicyUrlAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreSetCookiePolicyUrlAction deepCopy(@Nullable final StoreSetCookiePolicyUrlAction template) {
        if (template == null) {
            return null;
        }
        StoreSetCookiePolicyUrlActionImpl instance = new StoreSetCookiePolicyUrlActionImpl();
        instance.setCookiePolicyUrl(template.getCookiePolicyUrl());
        return instance;
    }

    /**
     * builder factory method for StoreSetCookiePolicyUrlAction
     * @return builder
     */
    public static StoreSetCookiePolicyUrlActionBuilder builder() {
        return StoreSetCookiePolicyUrlActionBuilder.of();
    }

    /**
     * create builder for StoreSetCookiePolicyUrlAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetCookiePolicyUrlActionBuilder builder(final StoreSetCookiePolicyUrlAction template) {
        return StoreSetCookiePolicyUrlActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSetCookiePolicyUrlAction(Function<StoreSetCookiePolicyUrlAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreSetCookiePolicyUrlAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreSetCookiePolicyUrlAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetCookiePolicyUrlAction>";
            }
        };
    }
}
