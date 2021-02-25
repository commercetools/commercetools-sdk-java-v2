
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartDiscountValueFixedDraftImpl.class)
public interface CartDiscountValueFixedDraft extends CartDiscountValueDraft {

    String FIXED = "fixed";

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
}
