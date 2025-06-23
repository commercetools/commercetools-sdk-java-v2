
package com.commercetools.api.models.discount_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Setting a key generates the DiscountGroupKeySet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupSetKeyAction discountGroupSetKeyAction = DiscountGroupSetKeyAction.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupSetKeyActionImpl.class)
public interface DiscountGroupSetKeyAction extends DiscountGroupUpdateAction {

    /**
     * discriminator value for DiscountGroupSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>New value to set.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>New value to set.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of DiscountGroupSetKeyAction
     */
    public static DiscountGroupSetKeyAction of() {
        return new DiscountGroupSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupSetKeyAction of(final DiscountGroupSetKeyAction template) {
        DiscountGroupSetKeyActionImpl instance = new DiscountGroupSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public DiscountGroupSetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupSetKeyAction deepCopy(@Nullable final DiscountGroupSetKeyAction template) {
        if (template == null) {
            return null;
        }
        DiscountGroupSetKeyActionImpl instance = new DiscountGroupSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for DiscountGroupSetKeyAction
     * @return builder
     */
    public static DiscountGroupSetKeyActionBuilder builder() {
        return DiscountGroupSetKeyActionBuilder.of();
    }

    /**
     * create builder for DiscountGroupSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupSetKeyActionBuilder builder(final DiscountGroupSetKeyAction template) {
        return DiscountGroupSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupSetKeyAction(Function<DiscountGroupSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupSetKeyAction>";
            }
        };
    }
}
