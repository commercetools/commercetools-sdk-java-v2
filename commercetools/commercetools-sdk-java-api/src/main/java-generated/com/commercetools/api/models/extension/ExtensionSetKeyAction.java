
package com.commercetools.api.models.extension;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionSetKeyAction extensionSetKeyAction = ExtensionSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExtensionSetKeyActionImpl.class)
public interface ExtensionSetKeyAction extends ExtensionUpdateAction {

    /**
     * discriminator value for ExtensionSetKeyAction
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
     * @return instance of ExtensionSetKeyAction
     */
    public static ExtensionSetKeyAction of() {
        return new ExtensionSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy ExtensionSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExtensionSetKeyAction of(final ExtensionSetKeyAction template) {
        ExtensionSetKeyActionImpl instance = new ExtensionSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public ExtensionSetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of ExtensionSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExtensionSetKeyAction deepCopy(@Nullable final ExtensionSetKeyAction template) {
        if (template == null) {
            return null;
        }
        ExtensionSetKeyActionImpl instance = new ExtensionSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ExtensionSetKeyAction
     * @return builder
     */
    public static ExtensionSetKeyActionBuilder builder() {
        return ExtensionSetKeyActionBuilder.of();
    }

    /**
     * create builder for ExtensionSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionSetKeyActionBuilder builder(final ExtensionSetKeyAction template) {
        return ExtensionSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExtensionSetKeyAction(Function<ExtensionSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static ExtensionSetKeyAction ofUnset() {
        return ExtensionSetKeyAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExtensionSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExtensionSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ExtensionSetKeyAction>";
            }
        };
    }
}
