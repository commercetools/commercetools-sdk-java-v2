
package com.commercetools.api.models.discount_code;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeResourceIdentifierBuilder implements Builder<DiscountCodeResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public DiscountCodeResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public DiscountCodeResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public DiscountCodeResourceIdentifier build() {
        return new DiscountCodeResourceIdentifierImpl(id, key);
    }

    /**
     * builds DiscountCodeResourceIdentifier without checking for non null required values
     */
    public DiscountCodeResourceIdentifier buildUnchecked() {
        return new DiscountCodeResourceIdentifierImpl(id, key);
    }

    public static DiscountCodeResourceIdentifierBuilder of() {
        return new DiscountCodeResourceIdentifierBuilder();
    }

    public static DiscountCodeResourceIdentifierBuilder of(final DiscountCodeResourceIdentifier template) {
        DiscountCodeResourceIdentifierBuilder builder = new DiscountCodeResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
