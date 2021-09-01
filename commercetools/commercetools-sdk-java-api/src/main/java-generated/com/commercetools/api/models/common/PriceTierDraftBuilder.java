
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PriceTierDraftBuilder implements Builder<PriceTierDraft> {

    private Long minimumQuantity;

    private com.commercetools.api.models.common.Money value;

    public PriceTierDraftBuilder minimumQuantity(final Long minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
        return this;
    }

    public PriceTierDraftBuilder value(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    public PriceTierDraftBuilder value(final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    public Long getMinimumQuantity() {
        return this.minimumQuantity;
    }

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    public PriceTierDraft build() {
        Objects.requireNonNull(minimumQuantity, PriceTierDraft.class + ": minimumQuantity is missing");
        Objects.requireNonNull(value, PriceTierDraft.class + ": value is missing");
        return new PriceTierDraftImpl(minimumQuantity, value);
    }

    /**
     * builds PriceTierDraft without checking for non null required values
     */
    public PriceTierDraft buildUnchecked() {
        return new PriceTierDraftImpl(minimumQuantity, value);
    }

    public static PriceTierDraftBuilder of() {
        return new PriceTierDraftBuilder();
    }

    public static PriceTierDraftBuilder of(final PriceTierDraft template) {
        PriceTierDraftBuilder builder = new PriceTierDraftBuilder();
        builder.minimumQuantity = template.getMinimumQuantity();
        builder.value = template.getValue();
        return builder;
    }

}
