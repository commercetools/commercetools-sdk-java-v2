
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountChangePredicateActionImpl.class)
public interface ProductDiscountChangePredicateAction extends ProductDiscountUpdateAction {

    String CHANGE_PREDICATE = "changePredicate";

    /**
    *  <p>A valid ProductDiscount Predicate.</p>
    */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    public void setPredicate(final String predicate);

    public static ProductDiscountChangePredicateAction of() {
        return new ProductDiscountChangePredicateActionImpl();
    }

    public static ProductDiscountChangePredicateAction of(final ProductDiscountChangePredicateAction template) {
        ProductDiscountChangePredicateActionImpl instance = new ProductDiscountChangePredicateActionImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    public static ProductDiscountChangePredicateActionBuilder builder() {
        return ProductDiscountChangePredicateActionBuilder.of();
    }

    public static ProductDiscountChangePredicateActionBuilder builder(
            final ProductDiscountChangePredicateAction template) {
        return ProductDiscountChangePredicateActionBuilder.of(template);
    }

    default <T> T withProductDiscountChangePredicateAction(Function<ProductDiscountChangePredicateAction, T> helper) {
        return helper.apply(this);
    }
}
