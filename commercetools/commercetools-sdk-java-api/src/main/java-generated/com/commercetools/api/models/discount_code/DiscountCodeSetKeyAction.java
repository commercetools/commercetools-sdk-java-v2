
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This action generates a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCodeKeySetMessage" rel="nofollow">DiscountCodeKeySet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetKeyAction discountCodeSetKeyAction = DiscountCodeSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetKeyActionImpl.class)
public interface DiscountCodeSetKeyAction extends DiscountCodeUpdateAction {

    /**
     * discriminator value for DiscountCodeSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Unique value to set. If empty, any existing value will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of DiscountCodeSetKeyAction
     */
    public static DiscountCodeSetKeyAction of() {
        return new DiscountCodeSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeSetKeyAction of(final DiscountCodeSetKeyAction template) {
        DiscountCodeSetKeyActionImpl instance = new DiscountCodeSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public DiscountCodeSetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of DiscountCodeSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeSetKeyAction deepCopy(@Nullable final DiscountCodeSetKeyAction template) {
        if (template == null) {
            return null;
        }
        DiscountCodeSetKeyActionImpl instance = new DiscountCodeSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for DiscountCodeSetKeyAction
     * @return builder
     */
    public static DiscountCodeSetKeyActionBuilder builder() {
        return DiscountCodeSetKeyActionBuilder.of();
    }

    /**
     * create builder for DiscountCodeSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeSetKeyActionBuilder builder(final DiscountCodeSetKeyAction template) {
        return DiscountCodeSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeSetKeyAction(Function<DiscountCodeSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeSetKeyAction>";
            }
        };
    }
}
