
package com.commercetools.checkout.models.payment_integration;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets or unsets the key of a PaymentIntegration.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetKeyUpdateAction setKeyUpdateAction = SetKeyUpdateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetKeyUpdateActionImpl.class)
public interface SetKeyUpdateAction extends PaymentIntegrationUpdateAction {

    /**
     * discriminator value for SetKeyUpdateAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of SetKeyUpdateAction
     */
    public static SetKeyUpdateAction of() {
        return new SetKeyUpdateActionImpl();
    }

    /**
     * factory method to create a shallow copy SetKeyUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetKeyUpdateAction of(final SetKeyUpdateAction template) {
        SetKeyUpdateActionImpl instance = new SetKeyUpdateActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public SetKeyUpdateAction copyDeep();

    /**
     * factory method to create a deep copy of SetKeyUpdateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetKeyUpdateAction deepCopy(@Nullable final SetKeyUpdateAction template) {
        if (template == null) {
            return null;
        }
        SetKeyUpdateActionImpl instance = new SetKeyUpdateActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for SetKeyUpdateAction
     * @return builder
     */
    public static SetKeyUpdateActionBuilder builder() {
        return SetKeyUpdateActionBuilder.of();
    }

    /**
     * create builder for SetKeyUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetKeyUpdateActionBuilder builder(final SetKeyUpdateAction template) {
        return SetKeyUpdateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetKeyUpdateAction(Function<SetKeyUpdateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetKeyUpdateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetKeyUpdateAction>() {
            @Override
            public String toString() {
                return "TypeReference<SetKeyUpdateAction>";
            }
        };
    }
}
