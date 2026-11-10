
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StorePrivacyPolicyUrlSetMessage" rel="nofollow">StorePrivacyPolicyUrlSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetPrivacyPolicyUrlAction storeSetPrivacyPolicyUrlAction = StoreSetPrivacyPolicyUrlAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setPrivacyPolicyUrl")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetPrivacyPolicyUrlActionImpl.class)
public interface StoreSetPrivacyPolicyUrlAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreSetPrivacyPolicyUrlAction
     */
    String SET_PRIVACY_POLICY_URL = "setPrivacyPolicyUrl";

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @return privacyPolicyUrl
     */

    @JsonProperty("privacyPolicyUrl")
    public String getPrivacyPolicyUrl();

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @param privacyPolicyUrl value to be set
     */

    public void setPrivacyPolicyUrl(final String privacyPolicyUrl);

    /**
     * factory method
     * @return instance of StoreSetPrivacyPolicyUrlAction
     */
    public static StoreSetPrivacyPolicyUrlAction of() {
        return new StoreSetPrivacyPolicyUrlActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreSetPrivacyPolicyUrlAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSetPrivacyPolicyUrlAction of(final StoreSetPrivacyPolicyUrlAction template) {
        StoreSetPrivacyPolicyUrlActionImpl instance = new StoreSetPrivacyPolicyUrlActionImpl();
        instance.setPrivacyPolicyUrl(template.getPrivacyPolicyUrl());
        return instance;
    }

    public StoreSetPrivacyPolicyUrlAction copyDeep();

    /**
     * factory method to create a deep copy of StoreSetPrivacyPolicyUrlAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreSetPrivacyPolicyUrlAction deepCopy(@Nullable final StoreSetPrivacyPolicyUrlAction template) {
        if (template == null) {
            return null;
        }
        StoreSetPrivacyPolicyUrlActionImpl instance = new StoreSetPrivacyPolicyUrlActionImpl();
        instance.setPrivacyPolicyUrl(template.getPrivacyPolicyUrl());
        return instance;
    }

    /**
     * builder factory method for StoreSetPrivacyPolicyUrlAction
     * @return builder
     */
    public static StoreSetPrivacyPolicyUrlActionBuilder builder() {
        return StoreSetPrivacyPolicyUrlActionBuilder.of();
    }

    /**
     * create builder for StoreSetPrivacyPolicyUrlAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetPrivacyPolicyUrlActionBuilder builder(final StoreSetPrivacyPolicyUrlAction template) {
        return StoreSetPrivacyPolicyUrlActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSetPrivacyPolicyUrlAction(Function<StoreSetPrivacyPolicyUrlAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreSetPrivacyPolicyUrlAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreSetPrivacyPolicyUrlAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetPrivacyPolicyUrlAction>";
            }
        };
    }
}
