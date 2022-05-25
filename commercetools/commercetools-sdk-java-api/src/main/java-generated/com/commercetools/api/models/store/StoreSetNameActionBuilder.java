
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSetNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSetNameAction storeSetNameAction = StoreSetNameAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreSetNameActionBuilder implements Builder<StoreSetNameAction> {

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>The updated name of the store</p>
     */

    public StoreSetNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The updated name of the store</p>
     */

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
