
package com.commercetools.api.models.product_discount;

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
@JsonDeserialize(as = ProductDiscountValueAbsoluteDraftImpl.class)
public interface ProductDiscountValueAbsoluteDraft extends ProductDiscountValueDraft {

    String ABSOLUTE = "absolute";

    @NotNull
    @Valid
    @JsonProperty("money")
    public List<Money> getMoney();

    @JsonIgnore
    public void setMoney(final Money... money);

    public void setMoney(final List<Money> money);

    public static ProductDiscountValueAbsoluteDraft of() {
        return new ProductDiscountValueAbsoluteDraftImpl();
    }

    public static ProductDiscountValueAbsoluteDraft of(final ProductDiscountValueAbsoluteDraft template) {
        ProductDiscountValueAbsoluteDraftImpl instance = new ProductDiscountValueAbsoluteDraftImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    public static ProductDiscountValueAbsoluteDraftBuilder builder() {
        return ProductDiscountValueAbsoluteDraftBuilder.of();
    }

    public static ProductDiscountValueAbsoluteDraftBuilder builder(final ProductDiscountValueAbsoluteDraft template) {
        return ProductDiscountValueAbsoluteDraftBuilder.of(template);
    }

    default <T> T withProductDiscountValueAbsoluteDraft(Function<ProductDiscountValueAbsoluteDraft, T> helper) {
        return helper.apply(this);
    }
}
