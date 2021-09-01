
package com.commercetools.api.models.discount_code;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeSetDescriptionActionBuilder implements Builder<DiscountCodeSetDescriptionAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    public DiscountCodeSetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public DiscountCodeSetDescriptionActionBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public DiscountCodeSetDescriptionAction build() {
        return new DiscountCodeSetDescriptionActionImpl(description);
    }

    /**
     * builds DiscountCodeSetDescriptionAction without checking for non null required values
     */
    public DiscountCodeSetDescriptionAction buildUnchecked() {
        return new DiscountCodeSetDescriptionActionImpl(description);
    }

    public static DiscountCodeSetDescriptionActionBuilder of() {
        return new DiscountCodeSetDescriptionActionBuilder();
    }

    public static DiscountCodeSetDescriptionActionBuilder of(final DiscountCodeSetDescriptionAction template) {
        DiscountCodeSetDescriptionActionBuilder builder = new DiscountCodeSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
