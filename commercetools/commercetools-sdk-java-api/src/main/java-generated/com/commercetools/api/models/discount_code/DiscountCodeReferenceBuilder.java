
package com.commercetools.api.models.discount_code;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeReferenceBuilder implements Builder<DiscountCodeReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.discount_code.DiscountCode obj;

    public DiscountCodeReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public DiscountCodeReferenceBuilder obj(
            Function<com.commercetools.api.models.discount_code.DiscountCodeBuilder, com.commercetools.api.models.discount_code.DiscountCodeBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeBuilder.of()).build();
        return this;
    }

    public DiscountCodeReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.discount_code.DiscountCode obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.discount_code.DiscountCode getObj() {
        return this.obj;
    }

    public DiscountCodeReference build() {
        Objects.requireNonNull(id, DiscountCodeReference.class + ": id is missing");
        return new DiscountCodeReferenceImpl(id, obj);
    }

    /**
     * builds DiscountCodeReference without checking for non null required values
     */
    public DiscountCodeReference buildUnchecked() {
        return new DiscountCodeReferenceImpl(id, obj);
    }

    public static DiscountCodeReferenceBuilder of() {
        return new DiscountCodeReferenceBuilder();
    }

    public static DiscountCodeReferenceBuilder of(final DiscountCodeReference template) {
        DiscountCodeReferenceBuilder builder = new DiscountCodeReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
