
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.CentPrecisionMoneyDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Discounts the Product Price by a fixed amount, defined by the <code>money</code> field.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountValueAbsoluteDraftImpl.class)
public interface ProductDiscountValueAbsoluteDraft extends ProductDiscountValueDraft {

    String ABSOLUTE = "absolute";

    /**
    *  <p>Money values in different currencies. An absolute <a href="ctp:api:type:ProductDiscount">ProductDiscount</a> will only match a price if this array contains a value with the same currency. For example, if it contains 10€ and 15$, the matching € price will be decreased by 10€ and the matching $ price will be decreased by 15$.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("money")
    public List<CentPrecisionMoneyDraft> getMoney();

    @JsonIgnore
    public void setMoney(final CentPrecisionMoneyDraft... money);

    public void setMoney(final List<CentPrecisionMoneyDraft> money);

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

    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueAbsoluteDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountValueAbsoluteDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountValueAbsoluteDraft>";
            }
        };
    }
}
