
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.DiscountedLineItemPortion;
import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountedLineItemPriceDraftImpl.class)
public interface DiscountedLineItemPriceDraft {

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.
    *  For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    @NotNull
    @Valid
    @JsonProperty("includedDiscounts")
    public List<DiscountedLineItemPortion> getIncludedDiscounts();

    public void setValue(final Money value);

    @JsonIgnore
    public void setIncludedDiscounts(final DiscountedLineItemPortion... includedDiscounts);

    public void setIncludedDiscounts(final List<DiscountedLineItemPortion> includedDiscounts);

    public static DiscountedLineItemPriceDraft of() {
        return new DiscountedLineItemPriceDraftImpl();
    }

    public static DiscountedLineItemPriceDraft of(final DiscountedLineItemPriceDraft template) {
        DiscountedLineItemPriceDraftImpl instance = new DiscountedLineItemPriceDraftImpl();
        instance.setValue(template.getValue());
        instance.setIncludedDiscounts(template.getIncludedDiscounts());
        return instance;
    }

    public static DiscountedLineItemPriceDraftBuilder builder() {
        return DiscountedLineItemPriceDraftBuilder.of();
    }

    public static DiscountedLineItemPriceDraftBuilder builder(final DiscountedLineItemPriceDraft template) {
        return DiscountedLineItemPriceDraftBuilder.of(template);
    }

    default <T> T withDiscountedLineItemPriceDraft(Function<DiscountedLineItemPriceDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPriceDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountedLineItemPriceDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountedLineItemPriceDraft>";
            }
        };
    }
}
