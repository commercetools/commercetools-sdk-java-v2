package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetNameAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountCodeSetNameActionBuilder {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    public DiscountCodeSetNameActionBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName(){
        return this.name;
    }

    public DiscountCodeSetNameAction build() {
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
