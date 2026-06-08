
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ZoneSetKeyAction zoneSetKeyAction = ZoneSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ZoneSetKeyActionImpl.class)
public interface ZoneSetKeyAction extends ZoneUpdateAction {

    /**
     * discriminator value for ZoneSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ZoneSetKeyAction
     */
    public static ZoneSetKeyAction of() {
        return new ZoneSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy ZoneSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ZoneSetKeyAction of(final ZoneSetKeyAction template) {
        ZoneSetKeyActionImpl instance = new ZoneSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public ZoneSetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of ZoneSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ZoneSetKeyAction deepCopy(@Nullable final ZoneSetKeyAction template) {
        if (template == null) {
            return null;
        }
        ZoneSetKeyActionImpl instance = new ZoneSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ZoneSetKeyAction
     * @return builder
     */
    public static ZoneSetKeyActionBuilder builder() {
        return ZoneSetKeyActionBuilder.of();
    }

    /**
     * create builder for ZoneSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ZoneSetKeyActionBuilder builder(final ZoneSetKeyAction template) {
        return ZoneSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withZoneSetKeyAction(Function<ZoneSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ZoneSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneSetKeyAction>";
            }
        };
    }
}
