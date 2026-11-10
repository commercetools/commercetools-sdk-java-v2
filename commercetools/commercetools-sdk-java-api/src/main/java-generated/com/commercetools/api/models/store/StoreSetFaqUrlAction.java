
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreFaqUrlSetMessage" rel="nofollow">StoreFaqUrlSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetFaqUrlAction storeSetFaqUrlAction = StoreSetFaqUrlAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setFaqUrl")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetFaqUrlActionImpl.class)
public interface StoreSetFaqUrlAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreSetFaqUrlAction
     */
    String SET_FAQ_URL = "setFaqUrl";

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @return faqUrl
     */

    @JsonProperty("faqUrl")
    public String getFaqUrl();

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @param faqUrl value to be set
     */

    public void setFaqUrl(final String faqUrl);

    /**
     * factory method
     * @return instance of StoreSetFaqUrlAction
     */
    public static StoreSetFaqUrlAction of() {
        return new StoreSetFaqUrlActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreSetFaqUrlAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSetFaqUrlAction of(final StoreSetFaqUrlAction template) {
        StoreSetFaqUrlActionImpl instance = new StoreSetFaqUrlActionImpl();
        instance.setFaqUrl(template.getFaqUrl());
        return instance;
    }

    public StoreSetFaqUrlAction copyDeep();

    /**
     * factory method to create a deep copy of StoreSetFaqUrlAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreSetFaqUrlAction deepCopy(@Nullable final StoreSetFaqUrlAction template) {
        if (template == null) {
            return null;
        }
        StoreSetFaqUrlActionImpl instance = new StoreSetFaqUrlActionImpl();
        instance.setFaqUrl(template.getFaqUrl());
        return instance;
    }

    /**
     * builder factory method for StoreSetFaqUrlAction
     * @return builder
     */
    public static StoreSetFaqUrlActionBuilder builder() {
        return StoreSetFaqUrlActionBuilder.of();
    }

    /**
     * create builder for StoreSetFaqUrlAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetFaqUrlActionBuilder builder(final StoreSetFaqUrlAction template) {
        return StoreSetFaqUrlActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSetFaqUrlAction(Function<StoreSetFaqUrlAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreSetFaqUrlAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreSetFaqUrlAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetFaqUrlAction>";
            }
        };
    }
}
