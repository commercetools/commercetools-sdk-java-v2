
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product_discount.ProductDiscountReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountedPriceDraftImpl.class)
public interface DiscountedPriceDraft {

    /**
    *  <p>Sets the money value for the discounted price.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    /**
    *  <p>Relates the referenced <a href="ctp:api:type:ProductDiscount">ProductDiscount</a> to the discounted price.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("discount")
    public ProductDiscountReference getDiscount();

    public void setValue(final Money value);

    public void setDiscount(final ProductDiscountReference discount);

    public static DiscountedPriceDraft of() {
        return new DiscountedPriceDraftImpl();
    }

    public static DiscountedPriceDraft of(final DiscountedPriceDraft template) {
        DiscountedPriceDraftImpl instance = new DiscountedPriceDraftImpl();
        instance.setValue(template.getValue());
        instance.setDiscount(template.getDiscount());
        return instance;
    }

    public static DiscountedPriceDraftBuilder builder() {
        return DiscountedPriceDraftBuilder.of();
    }

    public static DiscountedPriceDraftBuilder builder(final DiscountedPriceDraft template) {
        return DiscountedPriceDraftBuilder.of(template);
    }

    default <T> T withDiscountedPriceDraft(Function<DiscountedPriceDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DiscountedPriceDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountedPriceDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountedPriceDraft>";
            }
        };
    }
}
