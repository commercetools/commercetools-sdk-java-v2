
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreImprintUrlSetMessage" rel="nofollow">StoreImprintUrlSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetImprintUrlAction storeSetImprintUrlAction = StoreSetImprintUrlAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setImprintUrl")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetImprintUrlActionImpl.class)
public interface StoreSetImprintUrlAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreSetImprintUrlAction
     */
    String SET_IMPRINT_URL = "setImprintUrl";

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @return imprintUrl
     */

    @JsonProperty("imprintUrl")
    public String getImprintUrl();

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @param imprintUrl value to be set
     */

    public void setImprintUrl(final String imprintUrl);

    /**
     * factory method
     * @return instance of StoreSetImprintUrlAction
     */
    public static StoreSetImprintUrlAction of() {
        return new StoreSetImprintUrlActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreSetImprintUrlAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSetImprintUrlAction of(final StoreSetImprintUrlAction template) {
        StoreSetImprintUrlActionImpl instance = new StoreSetImprintUrlActionImpl();
        instance.setImprintUrl(template.getImprintUrl());
        return instance;
    }

    public StoreSetImprintUrlAction copyDeep();

    /**
     * factory method to create a deep copy of StoreSetImprintUrlAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreSetImprintUrlAction deepCopy(@Nullable final StoreSetImprintUrlAction template) {
        if (template == null) {
            return null;
        }
        StoreSetImprintUrlActionImpl instance = new StoreSetImprintUrlActionImpl();
        instance.setImprintUrl(template.getImprintUrl());
        return instance;
    }

    /**
     * builder factory method for StoreSetImprintUrlAction
     * @return builder
     */
    public static StoreSetImprintUrlActionBuilder builder() {
        return StoreSetImprintUrlActionBuilder.of();
    }

    /**
     * create builder for StoreSetImprintUrlAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetImprintUrlActionBuilder builder(final StoreSetImprintUrlAction template) {
        return StoreSetImprintUrlActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSetImprintUrlAction(Function<StoreSetImprintUrlAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreSetImprintUrlAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreSetImprintUrlAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetImprintUrlAction>";
            }
        };
    }
}
