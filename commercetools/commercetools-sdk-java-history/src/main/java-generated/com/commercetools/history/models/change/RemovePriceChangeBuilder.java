
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemovePriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemovePriceChange removePriceChange = RemovePriceChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .priceId("{priceId}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemovePriceChangeBuilder implements Builder<RemovePriceChange> {

    private String change;

    private String catalogData;

    private String priceId;

    private com.commercetools.history.models.common.Price previousValue;

    private com.commercetools.history.models.common.Price nextValue;

    /**
     *  <p>Update action for removing prices</p>
     * @param change value to be set
     * @return Builder
     */

    public RemovePriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the catalogData
     * @param catalogData value to be set
     * @return Builder
     */

    public RemovePriceChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     * set the value to the priceId
     * @param priceId value to be set
     * @return Builder
     */

    public RemovePriceChangeBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     * set the value to the previousValue using the builder function
     * @param builder function to build the previousValue value
     * @return Builder
     */

    public RemovePriceChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the previousValue
     * @param previousValue value to be set
     * @return Builder
     */

    public RemovePriceChangeBuilder previousValue(final com.commercetools.history.models.common.Price previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public RemovePriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public RemovePriceChangeBuilder nextValue(final com.commercetools.history.models.common.Price nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Update action for removing prices</p>
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     * value of catalogData}
     * @return catalogData
     */

    public String getCatalogData() {
        return this.catalogData;
    }

    /**
     * value of priceId}
     * @return priceId
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     * value of previousValue}
     * @return previousValue
     */

    public com.commercetools.history.models.common.Price getPreviousValue() {
        return this.previousValue;
    }

    /**
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.Price getNextValue() {
        return this.nextValue;
    }

    /**
     * builds RemovePriceChange with checking for non-null required values
     * @return RemovePriceChange
     */
    public RemovePriceChange build() {
        Objects.requireNonNull(change, RemovePriceChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, RemovePriceChange.class + ": catalogData is missing");
        Objects.requireNonNull(priceId, RemovePriceChange.class + ": priceId is missing");
        Objects.requireNonNull(previousValue, RemovePriceChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemovePriceChange.class + ": nextValue is missing");
        return new RemovePriceChangeImpl(change, catalogData, priceId, previousValue, nextValue);
    }

    /**
     * builds RemovePriceChange without checking for non-null required values
     * @return RemovePriceChange
     */
    public RemovePriceChange buildUnchecked() {
        return new RemovePriceChangeImpl(change, catalogData, priceId, previousValue, nextValue);
    }

    /**
     * factory method for an instance of RemovePriceChangeBuilder
     * @return builder
     */
    public static RemovePriceChangeBuilder of() {
        return new RemovePriceChangeBuilder();
    }

    /**
     * create builder for RemovePriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemovePriceChangeBuilder of(final RemovePriceChange template) {
        RemovePriceChangeBuilder builder = new RemovePriceChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.priceId = template.getPriceId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
