
package com.commercetools.api.models.discount_code;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.discount_code.DiscountCodeSetCartPredicateActionImpl;
import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetCartPredicateActionImpl.class)
public interface DiscountCodeSetCartPredicateAction extends DiscountCodeUpdateAction {

    /**
    *  <p>If the <code>cartPredicate</code> parameter is not included, the field will be emptied.</p>
    */

    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    public void setCartPredicate(final String cartPredicate);

    public static DiscountCodeSetCartPredicateAction of() {
        return new DiscountCodeSetCartPredicateActionImpl();
    }

    public static DiscountCodeSetCartPredicateAction of(final DiscountCodeSetCartPredicateAction template) {
        DiscountCodeSetCartPredicateActionImpl instance = new DiscountCodeSetCartPredicateActionImpl();
        instance.setCartPredicate(template.getCartPredicate());
        return instance;
    }

    public static DiscountCodeSetCartPredicateActionBuilder builder() {
        return DiscountCodeSetCartPredicateActionBuilder.of();
    }

    public static DiscountCodeSetCartPredicateActionBuilder builder(final DiscountCodeSetCartPredicateAction template) {
        return DiscountCodeSetCartPredicateActionBuilder.of(template);
    }

    default <T> T withDiscountCodeSetCartPredicateAction(Function<DiscountCodeSetCartPredicateAction, T> helper) {
        return helper.apply(this);
    }
}
