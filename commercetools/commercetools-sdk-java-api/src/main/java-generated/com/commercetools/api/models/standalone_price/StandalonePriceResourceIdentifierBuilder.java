
package com.commercetools.api.models.standalone_price;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StandalonePriceResourceIdentifierBuilder implements Builder<StandalonePriceResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public StandalonePriceResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public StandalonePriceResourceIdentifierBuilder key(@Nullable final String key) {
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

    public StandalonePriceResourceIdentifier build() {
        return new StandalonePriceResourceIdentifierImpl(id, key);
    }

    /**
     * builds StandalonePriceResourceIdentifier without checking for non null required values
     */
    public StandalonePriceResourceIdentifier buildUnchecked() {
        return new StandalonePriceResourceIdentifierImpl(id, key);
    }

    public static StandalonePriceResourceIdentifierBuilder of() {
        return new StandalonePriceResourceIdentifierBuilder();
    }

    public static StandalonePriceResourceIdentifierBuilder of(final StandalonePriceResourceIdentifier template) {
        StandalonePriceResourceIdentifierBuilder builder = new StandalonePriceResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
