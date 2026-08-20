
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreTermsOfServiceUrlSetMessage" rel="nofollow">StoreTermsOfServiceUrlSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetTermsOfServiceUrlAction storeSetTermsOfServiceUrlAction = StoreSetTermsOfServiceUrlAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setTermsOfServiceUrl")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetTermsOfServiceUrlActionImpl.class)
public interface StoreSetTermsOfServiceUrlAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreSetTermsOfServiceUrlAction
     */
    String SET_TERMS_OF_SERVICE_URL = "setTermsOfServiceUrl";

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @return termsOfServiceUrl
     */

    @JsonProperty("termsOfServiceUrl")
    public String getTermsOfServiceUrl();

    /**
     *  <p>Value to set. Must be an absolute <code>https</code> URL. If empty, any existing value is removed.</p>
     * @param termsOfServiceUrl value to be set
     */

    public void setTermsOfServiceUrl(final String termsOfServiceUrl);

    /**
     * factory method
     * @return instance of StoreSetTermsOfServiceUrlAction
     */
    public static StoreSetTermsOfServiceUrlAction of() {
        return new StoreSetTermsOfServiceUrlActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreSetTermsOfServiceUrlAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSetTermsOfServiceUrlAction of(final StoreSetTermsOfServiceUrlAction template) {
        StoreSetTermsOfServiceUrlActionImpl instance = new StoreSetTermsOfServiceUrlActionImpl();
        instance.setTermsOfServiceUrl(template.getTermsOfServiceUrl());
        return instance;
    }

    public StoreSetTermsOfServiceUrlAction copyDeep();

    /**
     * factory method to create a deep copy of StoreSetTermsOfServiceUrlAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreSetTermsOfServiceUrlAction deepCopy(@Nullable final StoreSetTermsOfServiceUrlAction template) {
        if (template == null) {
            return null;
        }
        StoreSetTermsOfServiceUrlActionImpl instance = new StoreSetTermsOfServiceUrlActionImpl();
        instance.setTermsOfServiceUrl(template.getTermsOfServiceUrl());
        return instance;
    }

    /**
     * builder factory method for StoreSetTermsOfServiceUrlAction
     * @return builder
     */
    public static StoreSetTermsOfServiceUrlActionBuilder builder() {
        return StoreSetTermsOfServiceUrlActionBuilder.of();
    }

    /**
     * create builder for StoreSetTermsOfServiceUrlAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetTermsOfServiceUrlActionBuilder builder(final StoreSetTermsOfServiceUrlAction template) {
        return StoreSetTermsOfServiceUrlActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSetTermsOfServiceUrlAction(Function<StoreSetTermsOfServiceUrlAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreSetTermsOfServiceUrlAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreSetTermsOfServiceUrlAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetTermsOfServiceUrlAction>";
            }
        };
    }
}
