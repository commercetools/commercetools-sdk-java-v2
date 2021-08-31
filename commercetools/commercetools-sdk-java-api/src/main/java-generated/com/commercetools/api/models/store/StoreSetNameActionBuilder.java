
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StoreSetNameActionBuilder implements Builder<StoreSetNameAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    public StoreSetNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public StoreSetNameActionBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public StoreSetNameAction build() {
        return new StoreSetNameActionImpl(name);
    }

    /**
     * builds StoreSetNameAction without checking for non null required values
     */
    public StoreSetNameAction buildUnchecked() {
        return new StoreSetNameActionImpl(name);
    }

    public static StoreSetNameActionBuilder of() {
        return new StoreSetNameActionBuilder();
    }

    public static StoreSetNameActionBuilder of(final StoreSetNameAction template) {
        StoreSetNameActionBuilder builder = new StoreSetNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
