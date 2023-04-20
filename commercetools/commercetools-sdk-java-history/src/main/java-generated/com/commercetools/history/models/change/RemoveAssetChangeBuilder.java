
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveAssetChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveAssetChange removeAssetChange = RemoveAssetChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveAssetChangeBuilder implements Builder<RemoveAssetChange> {

    private String change;

    private com.commercetools.history.models.common.Asset previousValue;

    /**
     *  <p>Update action for <code>removeAsset</code></p>
     * @param change value to be set
     * @return Builder
     */

    public RemoveAssetChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveAssetChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.AssetBuilder, com.commercetools.history.models.common.AssetBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AssetBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemoveAssetChangeBuilder withPreviousValue(
            Function<com.commercetools.history.models.common.AssetBuilder, com.commercetools.history.models.common.Asset> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.AssetBuilder.of());
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public RemoveAssetChangeBuilder previousValue(final com.commercetools.history.models.common.Asset previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Update action for <code>removeAsset</code></p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.Asset getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds RemoveAssetChange with checking for non-null required values
     * @return RemoveAssetChange
     */
    public RemoveAssetChange build() {
        Objects.requireNonNull(change, RemoveAssetChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveAssetChange.class + ": previousValue is missing");
        return new RemoveAssetChangeImpl(change, previousValue);
    }

    /**
     * builds RemoveAssetChange without checking for non-null required values
     * @return RemoveAssetChange
     */
    public RemoveAssetChange buildUnchecked() {
        return new RemoveAssetChangeImpl(change, previousValue);
    }

    /**
     * factory method for an instance of RemoveAssetChangeBuilder
     * @return builder
     */
    public static RemoveAssetChangeBuilder of() {
        return new RemoveAssetChangeBuilder();
    }

    /**
     * create builder for RemoveAssetChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveAssetChangeBuilder of(final RemoveAssetChange template) {
        RemoveAssetChangeBuilder builder = new RemoveAssetChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
