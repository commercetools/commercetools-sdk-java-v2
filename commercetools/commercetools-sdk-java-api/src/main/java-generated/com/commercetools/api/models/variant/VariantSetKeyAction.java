
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the key of the Variant. Generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantKeySetMessage" rel="nofollow">VariantKeySet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetKeyAction variantSetKeyAction = VariantSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantSetKeyActionImpl.class)
public interface VariantSetKeyAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. Must be unique.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Value to set. Must be unique.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of VariantSetKeyAction
     */
    public static VariantSetKeyAction of() {
        return new VariantSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantSetKeyAction of(final VariantSetKeyAction template) {
        VariantSetKeyActionImpl instance = new VariantSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public VariantSetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of VariantSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantSetKeyAction deepCopy(@Nullable final VariantSetKeyAction template) {
        if (template == null) {
            return null;
        }
        VariantSetKeyActionImpl instance = new VariantSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for VariantSetKeyAction
     * @return builder
     */
    public static VariantSetKeyActionBuilder builder() {
        return VariantSetKeyActionBuilder.of();
    }

    /**
     * create builder for VariantSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetKeyActionBuilder builder(final VariantSetKeyAction template) {
        return VariantSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantSetKeyAction(Function<VariantSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantSetKeyAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantSetKeyAction>";
            }
        };
    }
}
