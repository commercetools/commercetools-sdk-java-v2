
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountValueFixedDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValueFixedDraft cartDiscountValueFixedDraft = CartDiscountValueFixedDraft.builder()
 *             .plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountValueFixedDraftImpl.class)
public interface CartDiscountValueFixedDraft extends CartDiscountValueDraft {

    String FIXED = "fixed";

    /**
     <>
     */
    @NotNull
    @Valid
    @JsonProperty("money")
    public List<Money> getMoney();

    @JsonIgnore
    public void setMoney(final Money... money);

    public void setMoney(final List<Money> money);

    public static CartDiscountValueFixedDraft of() {
        return new CartDiscountValueFixedDraftImpl();
    }

    public static CartDiscountValueFixedDraft of(final CartDiscountValueFixedDraft template) {
        CartDiscountValueFixedDraftImpl instance = new CartDiscountValueFixedDraftImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    public static CartDiscountValueFixedDraftBuilder builder() {
        return CartDiscountValueFixedDraftBuilder.of();
    }

    public static CartDiscountValueFixedDraftBuilder builder(final CartDiscountValueFixedDraft template) {
        return CartDiscountValueFixedDraftBuilder.of(template);
    }

    default <T> T withCartDiscountValueFixedDraft(Function<CartDiscountValueFixedDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueFixedDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValueFixedDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValueFixedDraft>";
            }
        };
    }
}
