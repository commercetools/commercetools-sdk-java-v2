
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
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .catalogData("{catalogData}")
 *             .priceId("{priceId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddPriceChangeBuilder implements Builder<AddPriceChange> {

    private String change;

    private com.commercetools.history.models.common.Price nextValue;

    private String catalogData;

    private String priceId;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public AddPriceChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddPriceChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.PriceBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param builder function to build the nextValue value
     * @return Builder
     */

    public AddPriceChangeBuilder withNextValue(
            Function<com.commercetools.history.models.common.PriceBuilder, com.commercetools.history.models.common.Price> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.PriceBuilder.of());
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public AddPriceChangeBuilder nextValue(final com.commercetools.history.models.common.Price nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    /**
     *  <ul>
     *   <li><code>staged</code>, if the staged ProductCatalogData was updated.</li>
     *   <li><code>current</code>, if the current ProductCatalogData was updated.</li>
     *  </ul>
     * @param catalogData value to be set
     * @return Builder
     */

    public AddPriceChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     *  <p><code>id</code> of the Embedded Price.</p>
     * @param priceId value to be set
     * @return Builder
     */

    public AddPriceChangeBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     * value of change}
     * @return change
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public com.commercetools.history.models.common.Price getNextValue() {
        return this.nextValue;
    }

    /**
     *  <ul>
     *   <li><code>staged</code>, if the staged ProductCatalogData was updated.</li>
     *   <li><code>current</code>, if the current ProductCatalogData was updated.</li>
     *  </ul>
     * @return catalogData
     */

    public String getCatalogData() {
        return this.catalogData;
    }

    /**
     *  <p><code>id</code> of the Embedded Price.</p>
     * @return priceId
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     * builds AddPriceChange with checking for non-null required values
     * @return AddPriceChange
     */
    public AddPriceChange build() {
        Objects.requireNonNull(change, AddPriceChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddPriceChange.class + ": nextValue is missing");
        Objects.requireNonNull(catalogData, AddPriceChange.class + ": catalogData is missing");
        Objects.requireNonNull(priceId, AddPriceChange.class + ": priceId is missing");
        return new AddPriceChangeImpl(change, nextValue, catalogData, priceId);
    }

    /**
     * builds AddPriceChange without checking for non-null required values
     * @return AddPriceChange
     */
    public AddPriceChange buildUnchecked() {
        return new AddPriceChangeImpl(change, nextValue, catalogData, priceId);
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
        builder.nextValue = template.getNextValue();
        builder.catalogData = template.getCatalogData();
        builder.priceId = template.getPriceId();
        return builder;
    }

}
