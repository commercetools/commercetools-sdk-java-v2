
package com.commercetools.api.models.common;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PriceTierBuilder implements Builder<PriceTier> {

    private Long minimumQuantity;

    private com.commercetools.api.models.common.TypedMoney value;

    public PriceTierBuilder minimumQuantity(final Long minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
        return this;
    }

    public PriceTierBuilder value(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    public Long getMinimumQuantity() {
        return this.minimumQuantity;
    }

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    public PriceTier build() {
        Objects.requireNonNull(minimumQuantity, PriceTier.class + ": minimumQuantity is missing");
        Objects.requireNonNull(value, PriceTier.class + ": value is missing");
        return new PriceTierImpl(minimumQuantity, value);
    }

    /**
     * builds PriceTier without checking for non null required values
     */
    public PriceTier buildUnchecked() {
        return new PriceTierImpl(minimumQuantity, value);
    }

    public static PriceTierBuilder of() {
        return new PriceTierBuilder();
    }

    public static PriceTierBuilder of(final PriceTier template) {
        PriceTierBuilder builder = new PriceTierBuilder();
        builder.minimumQuantity = template.getMinimumQuantity();
        builder.value = template.getValue();
        return builder;
    }

}
