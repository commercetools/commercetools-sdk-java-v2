
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
     *  <p>To set the money value in high precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public StandalonePriceChangeValueActionBuilder value(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     *  <p>To set the money value in high precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public StandalonePriceChangeValueActionBuilder withValue(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     *  <p>To set the money value in high precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</p>
     * @param value value to be set
     * @return Builder
     */

    public StandalonePriceChangeValueActionBuilder value(final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>If set to <code>true</code> the update action applies to the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedStandalonePrice" rel="nofollow">StagedStandalonePrice</a>. If set to <code>false</code>, the update action applies to the current <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @param staged value to be set
     * @return Builder
     */

    public StandalonePriceChangeValueActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     *  <p>To set the money value in high precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</p>
     * @return value
     */

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    /**
     *  <p>If set to <code>true</code> the update action applies to the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedStandalonePrice" rel="nofollow">StagedStandalonePrice</a>. If set to <code>false</code>, the update action applies to the current <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds StandalonePriceChangeValueAction with checking for non-null required values
     * @return StandalonePriceChangeValueAction
     */
    public StandalonePriceChangeValueAction build() {
        Objects.requireNonNull(value, StandalonePriceChangeValueAction.class + ": value is missing");
        return new StandalonePriceChangeValueActionImpl(value, staged);
    }

    /**
     * builds StandalonePriceChangeValueAction without checking for non-null required values
     * @return StandalonePriceChangeValueAction
     */
    public StandalonePriceChangeValueAction buildUnchecked() {
        return new StandalonePriceChangeValueActionImpl(value, staged);
    }

    /**
     * factory method for an instance of StandalonePriceChangeValueActionBuilder
     * @return builder
     */
    public static StandalonePriceChangeValueActionBuilder of() {
        return new StandalonePriceChangeValueActionBuilder();
    }

    /**
     * create builder for StandalonePriceChangeValueAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceChangeValueActionBuilder of(final StandalonePriceChangeValueAction template) {
        StandalonePriceChangeValueActionBuilder builder = new StandalonePriceChangeValueActionBuilder();
        builder.value = template.getValue();
        builder.staged = template.getStaged();
        return builder;
    }

}
