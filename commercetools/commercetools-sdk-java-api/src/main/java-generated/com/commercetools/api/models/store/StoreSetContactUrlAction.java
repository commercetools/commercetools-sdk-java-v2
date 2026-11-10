
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreContactUrlSetMessage" rel="nofollow">StoreContactUrlSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetContactUrlAction storeSetContactUrlAction = StoreSetContactUrlAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setContactUrl")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetContactUrlActionImpl.class)
public interface StoreSetContactUrlAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreSetContactUrlAction
     */
    String SET_CONTACT_URL = "setContactUrl";

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @return contactUrl
     */

    @JsonProperty("contactUrl")
    public String getContactUrl();

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @param contactUrl value to be set
     */

    public void setContactUrl(final String contactUrl);

    /**
     * factory method
     * @return instance of StoreSetContactUrlAction
     */
    public static StoreSetContactUrlAction of() {
        return new StoreSetContactUrlActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreSetContactUrlAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSetContactUrlAction of(final StoreSetContactUrlAction template) {
        StoreSetContactUrlActionImpl instance = new StoreSetContactUrlActionImpl();
        instance.setContactUrl(template.getContactUrl());
        return instance;
    }

    public StoreSetContactUrlAction copyDeep();

    /**
     * factory method to create a deep copy of StoreSetContactUrlAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreSetContactUrlAction deepCopy(@Nullable final StoreSetContactUrlAction template) {
        if (template == null) {
            return null;
        }
        StoreSetContactUrlActionImpl instance = new StoreSetContactUrlActionImpl();
        instance.setContactUrl(template.getContactUrl());
        return instance;
    }

    /**
     * builder factory method for StoreSetContactUrlAction
     * @return builder
     */
    public static StoreSetContactUrlActionBuilder builder() {
        return StoreSetContactUrlActionBuilder.of();
    }

    /**
     * create builder for StoreSetContactUrlAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetContactUrlActionBuilder builder(final StoreSetContactUrlAction template) {
        return StoreSetContactUrlActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSetContactUrlAction(Function<StoreSetContactUrlAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreSetContactUrlAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreSetContactUrlAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetContactUrlAction>";
            }
        };
    }
}
