
package com.commercetools.api.models.discount_code;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeSetNameActionBuilder implements Builder<DiscountCodeSetNameAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    public DiscountCodeSetNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public DiscountCodeSetNameActionBuilder name(
            @Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public DiscountCodeSetNameAction build() {
        return new DiscountCodeSetNameActionImpl(name);
    }

    /**
     * builds DiscountCodeSetNameAction without checking for non null required values
     */
    public DiscountCodeSetNameAction buildUnchecked() {
        return new DiscountCodeSetNameActionImpl(name);
    }

    public static DiscountCodeSetNameActionBuilder of() {
        return new DiscountCodeSetNameActionBuilder();
    }

    public static DiscountCodeSetNameActionBuilder of(final DiscountCodeSetNameAction template) {
        DiscountCodeSetNameActionBuilder builder = new DiscountCodeSetNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
