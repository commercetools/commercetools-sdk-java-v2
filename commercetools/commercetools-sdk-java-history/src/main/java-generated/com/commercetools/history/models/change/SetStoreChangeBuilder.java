
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetStoreChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetStoreChange setStoreChange = SetStoreChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetStoreChangeBuilder implements Builder<SetStoreChange> {

    private String change;

    private com.commercetools.history.models.common.Reference previousValue;

    private com.commercetools.history.models.common.Reference nextValue;

    /**
     *  <p>Shape of the action for <code>setStore</code></p>
     * @param change
     * @return Builder
     */

    public SetStoreChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *
     * @return Builder
     */

    public SetStoreChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param previousValue
     * @return Builder
     */

    public SetStoreChangeBuilder previousValue(final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *
     * @return Builder
     */

    public SetStoreChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.ReferenceBuilder, com.commercetools.history.models.common.ReferenceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param nextValue
     * @return Builder
     */

    public SetStoreChangeBuilder nextValue(final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Reference getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    public SetStoreChange build() {
        Objects.requireNonNull(change, SetStoreChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetStoreChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetStoreChange.class + ": nextValue is missing");
        return new SetStoreChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetStoreChange without checking for non null required values
     */
    public SetStoreChange buildUnchecked() {
        return new SetStoreChangeImpl(change, previousValue, nextValue);
    }

    public static SetStoreChangeBuilder of() {
        return new SetStoreChangeBuilder();
    }

    public static SetStoreChangeBuilder of(final SetStoreChange template) {
        SetStoreChangeBuilder builder = new SetStoreChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
