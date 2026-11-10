
package com.commercetools.api.models.store;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>This update action produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreOrderUrlTemplateSetMessage" rel="nofollow">StoreOrderUrlTemplateSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetOrderUrlTemplateAction storeSetOrderUrlTemplateAction = StoreSetOrderUrlTemplateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setOrderUrlTemplate")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StoreSetOrderUrlTemplateActionImpl.class)
public interface StoreSetOrderUrlTemplateAction extends StoreUpdateAction {

    /**
     * discriminator value for StoreSetOrderUrlTemplateAction
     */
    String SET_ORDER_URL_TEMPLATE = "setOrderUrlTemplate";

    /**
     *  <p>Value to set. Must be an <span>RFC 6570</span> URI template containing the <code>orderId</code> variable. If empty, any existing value is removed.</p>
     * @return orderUrlTemplate
     */

    @JsonProperty("orderUrlTemplate")
    public String getOrderUrlTemplate();

    /**
     *  <p>Value to set. Must be an <span>RFC 6570</span> URI template containing the <code>orderId</code> variable. If empty, any existing value is removed.</p>
     * @param orderUrlTemplate value to be set
     */

    public void setOrderUrlTemplate(final String orderUrlTemplate);

    /**
     * factory method
     * @return instance of StoreSetOrderUrlTemplateAction
     */
    public static StoreSetOrderUrlTemplateAction of() {
        return new StoreSetOrderUrlTemplateActionImpl();
    }

    /**
     * factory method to create a shallow copy StoreSetOrderUrlTemplateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StoreSetOrderUrlTemplateAction of(final StoreSetOrderUrlTemplateAction template) {
        StoreSetOrderUrlTemplateActionImpl instance = new StoreSetOrderUrlTemplateActionImpl();
        instance.setOrderUrlTemplate(template.getOrderUrlTemplate());
        return instance;
    }

    public StoreSetOrderUrlTemplateAction copyDeep();

    /**
     * factory method to create a deep copy of StoreSetOrderUrlTemplateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StoreSetOrderUrlTemplateAction deepCopy(@Nullable final StoreSetOrderUrlTemplateAction template) {
        if (template == null) {
            return null;
        }
        StoreSetOrderUrlTemplateActionImpl instance = new StoreSetOrderUrlTemplateActionImpl();
        instance.setOrderUrlTemplate(template.getOrderUrlTemplate());
        return instance;
    }

    /**
     * builder factory method for StoreSetOrderUrlTemplateAction
     * @return builder
     */
    public static StoreSetOrderUrlTemplateActionBuilder builder() {
        return StoreSetOrderUrlTemplateActionBuilder.of();
    }

    /**
     * create builder for StoreSetOrderUrlTemplateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetOrderUrlTemplateActionBuilder builder(final StoreSetOrderUrlTemplateAction template) {
        return StoreSetOrderUrlTemplateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStoreSetOrderUrlTemplateAction(Function<StoreSetOrderUrlTemplateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<StoreSetOrderUrlTemplateAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<StoreSetOrderUrlTemplateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StoreSetOrderUrlTemplateAction>";
            }
        };
    }
}
