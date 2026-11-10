
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCheckoutUrlTemplateSetMessage" rel="nofollow">StoreCheckoutUrlTemplateSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetCheckoutUrlTemplateAction storeSetCheckoutUrlTemplateAction = StoreSetCheckoutUrlTemplateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setCheckoutUrlTemplate")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetCheckoutUrlTemplateActionImpl.class)
public interface StoreSetCheckoutUrlTemplateAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreSetCheckoutUrlTemplateAction
     */
    String SET_CHECKOUT_URL_TEMPLATE = "setCheckoutUrlTemplate";

    /**
     *  <p>Value to set. Must be an <span>RFC 6570</span> URI template containing the <code>checkoutId</code> variable. If empty, any existing value is removed.</p>
     * @return checkoutUrlTemplate
     */

    @JsonProperty("checkoutUrlTemplate")
    public String getCheckoutUrlTemplate();

    /**
     *  <p>Value to set. Must be an <span>RFC 6570</span> URI template containing the <code>checkoutId</code> variable. If empty, any existing value is removed.</p>
     * @param checkoutUrlTemplate value to be set
     */

    public void setCheckoutUrlTemplate(final String checkoutUrlTemplate);

    /**
     * factory method
     * @return instance of StoreSetCheckoutUrlTemplateAction
     */
    public static StoreSetCheckoutUrlTemplateAction of() {
        return new StoreSetCheckoutUrlTemplateActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreSetCheckoutUrlTemplateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSetCheckoutUrlTemplateAction of(final StoreSetCheckoutUrlTemplateAction template) {
        StoreSetCheckoutUrlTemplateActionImpl instance = new StoreSetCheckoutUrlTemplateActionImpl();
        instance.setCheckoutUrlTemplate(template.getCheckoutUrlTemplate());
        return instance;
    }

    public StoreSetCheckoutUrlTemplateAction copyDeep();

    /**
     * factory method to create a deep copy of StoreSetCheckoutUrlTemplateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreSetCheckoutUrlTemplateAction deepCopy(
            @Nullable final StoreSetCheckoutUrlTemplateAction template) {
        if (template == null) {
            return null;
        }
        StoreSetCheckoutUrlTemplateActionImpl instance = new StoreSetCheckoutUrlTemplateActionImpl();
        instance.setCheckoutUrlTemplate(template.getCheckoutUrlTemplate());
        return instance;
    }

    /**
     * builder factory method for StoreSetCheckoutUrlTemplateAction
     * @return builder
     */
    public static StoreSetCheckoutUrlTemplateActionBuilder builder() {
        return StoreSetCheckoutUrlTemplateActionBuilder.of();
    }

    /**
     * create builder for StoreSetCheckoutUrlTemplateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetCheckoutUrlTemplateActionBuilder builder(final StoreSetCheckoutUrlTemplateAction template) {
        return StoreSetCheckoutUrlTemplateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSetCheckoutUrlTemplateAction(Function<StoreSetCheckoutUrlTemplateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreSetCheckoutUrlTemplateAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreSetCheckoutUrlTemplateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetCheckoutUrlTemplateAction>";
            }
        };
    }
}
