
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddPriceChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddPriceChange addPriceChange = AddPriceChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .priceId("{priceId}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddPriceChangeBuilder implements Builder<AddPriceChange> {

    private String change;

    private String catalogData;

    private String priceId;

    private com.commercetools.history.models.common.Price nextValue;

    /**
     *  <p>Update action for adding prices</p>
     * @param change value to be set
     * @return Builder
     */

    public AddPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     * set the value to the catalogData
     * @param catalogData value to be set
     * @return Builder
     */

    public AddPriceChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     * set the value to the priceId
     * @param priceId value to be set
     * @return Builder
     */

    public AddPriceChangeBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     * set the value to the nextValue using the builder function
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     * set the value to the nextValue
     * @param nextValue value to be set
     * @return Builder
     */

    public AddPriceChangeBuilder nextValue(final com.commercetools.history.models.common.Price nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <p>Update action for adding prices</p>
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
     * value of nextValue}
     * @return nextValue
     */

    public com.commercetools.history.models.common.Price getNextValue() {
        return this.nextValue;
    }

    /**
     * builds AddPriceChange with checking for non-null required values
     * @return AddPriceChange
     */
    public AddPriceChange build() {
        Objects.requireNonNull(change, AddPriceChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, AddPriceChange.class + ": catalogData is missing");
        Objects.requireNonNull(priceId, AddPriceChange.class + ": priceId is missing");
        Objects.requireNonNull(nextValue, AddPriceChange.class + ": nextValue is missing");
        return new AddPriceChangeImpl(change, catalogData, priceId, nextValue);
    }

    /**
     * builds AddPriceChange without checking for non-null required values
     * @return AddPriceChange
     */
    public AddPriceChange buildUnchecked() {
        return new AddPriceChangeImpl(change, catalogData, priceId, nextValue);
    }

    /**
     * factory method for an instance of AddPriceChangeBuilder
     * @return builder
     */
    public static AddPriceChangeBuilder of() {
        return new AddPriceChangeBuilder();
    }

    /**
     * create builder for AddPriceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddPriceChangeBuilder of(final AddPriceChange template) {
        AddPriceChangeBuilder builder = new AddPriceChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.priceId = template.getPriceId();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
