
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetDirectDiscountsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetDirectDiscountsAction cartSetDirectDiscountsAction = CartSetDirectDiscountsAction.builder()
 *             .plusDiscounts(discountsBuilder -> discountsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetDirectDiscountsActionImpl.class)
public interface CartSetDirectDiscountsAction extends CartUpdateAction {

    String SET_DIRECT_DISCOUNTS = "setDirectDiscounts";

    /**
     *
     */
    @NotNull
    @Valid
    @JsonProperty("discounts")
    public List<DirectDiscountDraft> getDiscounts();

    @JsonIgnore
    public void setDiscounts(final DirectDiscountDraft... discounts);

    public void setDiscounts(final List<DirectDiscountDraft> discounts);

    public static CartSetDirectDiscountsAction of() {
        return new CartSetDirectDiscountsActionImpl();
    }

    public static CartSetDirectDiscountsAction of(final CartSetDirectDiscountsAction template) {
        CartSetDirectDiscountsActionImpl instance = new CartSetDirectDiscountsActionImpl();
        instance.setDiscounts(template.getDiscounts());
        return instance;
    }

    public static CartSetDirectDiscountsActionBuilder builder() {
        return CartSetDirectDiscountsActionBuilder.of();
    }

    public static CartSetDirectDiscountsActionBuilder builder(final CartSetDirectDiscountsAction template) {
        return CartSetDirectDiscountsActionBuilder.of(template);
    }

    default <T> T withCartSetDirectDiscountsAction(Function<CartSetDirectDiscountsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetDirectDiscountsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetDirectDiscountsAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetDirectDiscountsAction>";
            }
        };
    }
}
