
package com.commercetools.api.models.standalone_price;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceChangeValueActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceChangeValueAction standalonePriceChangeValueAction = StandalonePriceChangeValueAction.builder()
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceChangeValueActionBuilder implements Builder<StandalonePriceChangeValueAction> {

    private com.commercetools.api.models.common.Money value;

    @Nullable
    private Boolean staged;

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public StandalonePriceChangeValueActionBuilder value(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public StandalonePriceChangeValueActionBuilder value(final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>If set to <code>true</code> the update action applies to the StagedStandalonePrice. If set to <code>false</code>, the update action applies to the current StandalonePrice.</p>
     */

    public StandalonePriceChangeValueActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public StandalonePriceChangeValueAction build() {
        Objects.requireNonNull(value, StandalonePriceChangeValueAction.class + ": value is missing");
        return new StandalonePriceChangeValueActionImpl(value, staged);
    }

    /**
     * builds StandalonePriceChangeValueAction without checking for non null required values
     */
    public StandalonePriceChangeValueAction buildUnchecked() {
        return new StandalonePriceChangeValueActionImpl(value, staged);
    }

    public static StandalonePriceChangeValueActionBuilder of() {
        return new StandalonePriceChangeValueActionBuilder();
    }

    public static StandalonePriceChangeValueActionBuilder of(final StandalonePriceChangeValueAction template) {
        StandalonePriceChangeValueActionBuilder builder = new StandalonePriceChangeValueActionBuilder();
        builder.value = template.getValue();
        builder.staged = template.getStaged();
        return builder;
    }

}
