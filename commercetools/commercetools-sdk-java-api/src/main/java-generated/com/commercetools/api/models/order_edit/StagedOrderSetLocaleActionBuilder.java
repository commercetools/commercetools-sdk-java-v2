
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetLocaleActionBuilder implements Builder<StagedOrderSetLocaleAction> {

    @Nullable
    private String locale;

    public StagedOrderSetLocaleActionBuilder locale(@Nullable final String locale) {
        this.locale = locale;
        return this;
    }

    @Nullable
    public String getLocale() {
        return this.locale;
    }

    public StagedOrderSetLocaleAction build() {
        return new StagedOrderSetLocaleActionImpl(locale);
    }

    /**
     * builds StagedOrderSetLocaleAction without checking for non null required values
     */
    public StagedOrderSetLocaleAction buildUnchecked() {
        return new StagedOrderSetLocaleActionImpl(locale);
    }

    public static StagedOrderSetLocaleActionBuilder of() {
        return new StagedOrderSetLocaleActionBuilder();
    }

    public static StagedOrderSetLocaleActionBuilder of(final StagedOrderSetLocaleAction template) {
        StagedOrderSetLocaleActionBuilder builder = new StagedOrderSetLocaleActionBuilder();
        builder.locale = template.getLocale();
        return builder;
    }

}
