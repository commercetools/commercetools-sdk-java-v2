
package com.commercetools.api.models.standalone_price;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the key on a Standalone Price. Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceKeySetMessage" rel="nofollow">StandalonePriceKeySet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetKeyAction standalonePriceSetKeyAction = StandalonePriceSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceSetKeyActionImpl.class)
public interface StandalonePriceSetKeyAction extends StandalonePriceUpdateAction {

    /**
     * discriminator value for StandalonePriceSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of StandalonePriceSetKeyAction
     */
    public static StandalonePriceSetKeyAction of() {
        return new StandalonePriceSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceSetKeyAction of(final StandalonePriceSetKeyAction template) {
        StandalonePriceSetKeyActionImpl instance = new StandalonePriceSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public StandalonePriceSetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceSetKeyAction deepCopy(@Nullable final StandalonePriceSetKeyAction template) {
        if (template == null) {
            return null;
        }
        StandalonePriceSetKeyActionImpl instance = new StandalonePriceSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for StandalonePriceSetKeyAction
     * @return builder
     */
    public static StandalonePriceSetKeyActionBuilder builder() {
        return StandalonePriceSetKeyActionBuilder.of();
    }

    /**
     * create builder for StandalonePriceSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetKeyActionBuilder builder(final StandalonePriceSetKeyAction template) {
        return StandalonePriceSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceSetKeyAction(Function<StandalonePriceSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceSetKeyAction>";
            }
        };
    }
}
