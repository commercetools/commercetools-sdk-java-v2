
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
     *  <p>Value to set.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public StoreSetNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public StoreSetNameActionBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param name value to be set
     * @return Builder
     */

    public StoreSetNameActionBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds StoreSetNameAction with checking for non-null required values
     * @return StoreSetNameAction
     */
    public StoreSetNameAction build() {
        return new StoreSetNameActionImpl(name);
    }

    /**
     * builds StoreSetNameAction without checking for non-null required values
     * @return StoreSetNameAction
     */
    public StoreSetNameAction buildUnchecked() {
        return new StoreSetNameActionImpl(name);
    }

    /**
     * factory method for an instance of StoreSetNameActionBuilder
     * @return builder
     */
    public static StoreSetNameActionBuilder of() {
        return new StoreSetNameActionBuilder();
    }

    /**
     * create builder for StoreSetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StoreSetNameActionBuilder of(final StoreSetNameAction template) {
        StoreSetNameActionBuilder builder = new StoreSetNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
