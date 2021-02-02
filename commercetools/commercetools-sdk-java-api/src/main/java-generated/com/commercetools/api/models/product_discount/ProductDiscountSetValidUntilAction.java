
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductDiscountSetValidUntilActionImpl.class)
public interface ProductDiscountSetValidUntilAction extends ProductDiscountUpdateAction {

    String SET_VALID_UNTIL = "setValidUntil";

    /**
    *  <p>The time from which the discount should be ineffective.
    *  Please take Eventual Consistency into account for calculated undiscounted values.</p>
    */

    @JsonProperty("validUntil")
    public ZonedDateTime getValidUntil();

    public void setValidUntil(final ZonedDateTime validUntil);

    public static ProductDiscountSetValidUntilAction of() {
        return new ProductDiscountSetValidUntilActionImpl();
    }

    public static ProductDiscountSetValidUntilAction of(final ProductDiscountSetValidUntilAction template) {
        ProductDiscountSetValidUntilActionImpl instance = new ProductDiscountSetValidUntilActionImpl();
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    public static ProductDiscountSetValidUntilActionBuilder builder() {
        return ProductDiscountSetValidUntilActionBuilder.of();
    }

    public static ProductDiscountSetValidUntilActionBuilder builder(final ProductDiscountSetValidUntilAction template) {
        return ProductDiscountSetValidUntilActionBuilder.of(template);
    }

    default <T> T withProductDiscountSetValidUntilAction(Function<ProductDiscountSetValidUntilAction, T> helper) {
        return helper.apply(this);
    }
}
