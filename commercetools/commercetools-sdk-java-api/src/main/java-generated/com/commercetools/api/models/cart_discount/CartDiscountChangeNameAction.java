
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeNameAction cartDiscountChangeNameAction = CartDiscountChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountChangeNameActionImpl.class)
public interface CartDiscountChangeNameAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountChangeNameAction
     */
    String CHANGE_NAME = "changeName";

    /**
     *  <p>New value to set.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>New value to set.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of CartDiscountChangeNameAction
     */
    public static CartDiscountChangeNameAction of() {
        return new CartDiscountChangeNameActionImpl();
    }

    /**
     * factory method to copy an instance of CartDiscountChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountChangeNameAction of(final CartDiscountChangeNameAction template) {
        CartDiscountChangeNameActionImpl instance = new CartDiscountChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for CartDiscountChangeNameAction
     * @return builder
     */
    public static CartDiscountChangeNameActionBuilder builder() {
        return CartDiscountChangeNameActionBuilder.of();
    }

    /**
     * create builder for CartDiscountChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountChangeNameActionBuilder builder(final CartDiscountChangeNameAction template) {
        return CartDiscountChangeNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountChangeNameAction(Function<CartDiscountChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountChangeNameAction>";
            }
        };
    }
}
