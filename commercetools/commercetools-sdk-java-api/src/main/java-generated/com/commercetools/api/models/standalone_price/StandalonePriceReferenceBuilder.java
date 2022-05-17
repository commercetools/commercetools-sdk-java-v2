
package com.commercetools.api.models.standalone_price;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StandalonePriceReferenceBuilder implements Builder<StandalonePriceReference> {

    private String id;

    @Nullable
    private com.commercetools.api.models.standalone_price.StandalonePrice obj;

    public StandalonePriceReferenceBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public StandalonePriceReferenceBuilder obj(
            Function<com.commercetools.api.models.standalone_price.StandalonePriceBuilder, com.commercetools.api.models.standalone_price.StandalonePriceBuilder> builder) {
        this.obj = builder.apply(com.commercetools.api.models.standalone_price.StandalonePriceBuilder.of()).build();
        return this;
    }

    public StandalonePriceReferenceBuilder obj(
            @Nullable final com.commercetools.api.models.standalone_price.StandalonePrice obj) {
        this.obj = obj;
        return this;
    }

    public String getId() {
        return this.id;
    }

    @Nullable
    public com.commercetools.api.models.standalone_price.StandalonePrice getObj() {
        return this.obj;
    }

    public StandalonePriceReference build() {
        Objects.requireNonNull(id, StandalonePriceReference.class + ": id is missing");
        return new StandalonePriceReferenceImpl(id, obj);
    }

    /**
     * builds StandalonePriceReference without checking for non null required values
     */
    public StandalonePriceReference buildUnchecked() {
        return new StandalonePriceReferenceImpl(id, obj);
    }

    public static StandalonePriceReferenceBuilder of() {
        return new StandalonePriceReferenceBuilder();
    }

    public static StandalonePriceReferenceBuilder of(final StandalonePriceReference template) {
        StandalonePriceReferenceBuilder builder = new StandalonePriceReferenceBuilder();
        builder.id = template.getId();
        builder.obj = template.getObj();
        return builder;
    }

}
