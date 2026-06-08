
package com.commercetools.api.models.discount_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * DiscountGroupSetNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupSetNameAction discountGroupSetNameAction = DiscountGroupSetNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupSetNameActionImpl.class)
public interface DiscountGroupSetNameAction extends DiscountGroupUpdateAction {

    /**
     * discriminator value for DiscountGroupSetNameAction
     */
    String SET_NAME = "setName";

    /**
     *  <p>New value to set. If empty, any existing value will be removed.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>New value to set. If empty, any existing value will be removed.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of DiscountGroupSetNameAction
     */
    public static DiscountGroupSetNameAction of() {
        return new DiscountGroupSetNameActionImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupSetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupSetNameAction of(final DiscountGroupSetNameAction template) {
        DiscountGroupSetNameActionImpl instance = new DiscountGroupSetNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public DiscountGroupSetNameAction copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupSetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupSetNameAction deepCopy(@Nullable final DiscountGroupSetNameAction template) {
        if (template == null) {
            return null;
        }
        DiscountGroupSetNameActionImpl instance = new DiscountGroupSetNameActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for DiscountGroupSetNameAction
     * @return builder
     */
    public static DiscountGroupSetNameActionBuilder builder() {
        return DiscountGroupSetNameActionBuilder.of();
    }

    /**
     * create builder for DiscountGroupSetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupSetNameActionBuilder builder(final DiscountGroupSetNameAction template) {
        return DiscountGroupSetNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupSetNameAction(Function<DiscountGroupSetNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupSetNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupSetNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupSetNameAction>";
            }
        };
    }
}
