
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
@JsonDeserialize(as = CartDiscountValueAbsoluteDraftImpl.class)
public interface CartDiscountValueAbsoluteDraft extends CartDiscountValueDraft {

    String ABSOLUTE = "absolute";

    @NotNull
    @Valid
    @JsonProperty("money")
    public List<Money> getMoney();

    @JsonIgnore
    public void setMoney(final Money... money);

    public void setMoney(final List<Money> money);

    public static CartDiscountValueAbsoluteDraft of() {
        return new CartDiscountValueAbsoluteDraftImpl();
    }

    public static CartDiscountValueAbsoluteDraft of(final CartDiscountValueAbsoluteDraft template) {
        CartDiscountValueAbsoluteDraftImpl instance = new CartDiscountValueAbsoluteDraftImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    public static CartDiscountValueAbsoluteDraftBuilder builder() {
        return CartDiscountValueAbsoluteDraftBuilder.of();
    }

    public static CartDiscountValueAbsoluteDraftBuilder builder(final CartDiscountValueAbsoluteDraft template) {
        return CartDiscountValueAbsoluteDraftBuilder.of(template);
    }

    default <T> T withCartDiscountValueAbsoluteDraft(Function<CartDiscountValueAbsoluteDraft, T> helper) {
        return helper.apply(this);
    }
}
