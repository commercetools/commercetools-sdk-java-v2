
package com.commercetools.api.models.discount_code;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DiscountCodeChangeIsActiveActionBuilder implements Builder<DiscountCodeChangeIsActiveAction> {

    private Boolean isActive;

    /**
    *  <p>New value to set. Set to <code>true</code> to activate the DiscountCode for all matching Discounts.</p>
    */

    public DiscountCodeChangeIsActiveActionBuilder isActive(final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public Boolean getIsActive() {
        return this.isActive;
    }

    public DiscountCodeChangeIsActiveAction build() {
        Objects.requireNonNull(isActive, DiscountCodeChangeIsActiveAction.class + ": isActive is missing");
        return new DiscountCodeChangeIsActiveActionImpl(isActive);
    }

    /**
     * builds DiscountCodeChangeIsActiveAction without checking for non null required values
     */
    public DiscountCodeChangeIsActiveAction buildUnchecked() {
        return new DiscountCodeChangeIsActiveActionImpl(isActive);
    }

    public static DiscountCodeChangeIsActiveActionBuilder of() {
        return new DiscountCodeChangeIsActiveActionBuilder();
    }

    public static DiscountCodeChangeIsActiveActionBuilder of(final DiscountCodeChangeIsActiveAction template) {
        DiscountCodeChangeIsActiveActionBuilder builder = new DiscountCodeChangeIsActiveActionBuilder();
        builder.isActive = template.getIsActive();
        return builder;
    }

}
