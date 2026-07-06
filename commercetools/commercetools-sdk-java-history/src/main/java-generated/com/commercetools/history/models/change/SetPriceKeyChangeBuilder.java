
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetPriceKeyChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPriceKeyChange setPriceKeyChange = SetPriceKeyChange.builder()
 *             .change("{change}")
 *             .catalogData("{catalogData}")
 *             .variant("{variant}")
 *             .priceId("{priceId}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetPriceKeyChangeBuilder implements Builder<SetPriceKeyChange> {

    private String change;

    private String catalogData;

    private String variant;

    private String priceId;

    private String previousValue;

    private String nextValue;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetPriceKeyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Product data that was updated.</p>
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @param catalogData value to be set
     * @return Builder
     */

    public SetPriceKeyChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
        return this;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @param variant value to be set
     * @return Builder
     */

    public SetPriceKeyChangeBuilder variant(final String variant) {
        this.variant = variant;
        return this;
    }

    /**
     *  <p><code>id</code> of the Embedded <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a>.</p>
     * @param priceId value to be set
     * @return Builder
     */

    public SetPriceKeyChangeBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetPriceKeyChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetPriceKeyChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
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
     *  <p>Product data that was updated.</p>
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @return catalogData
     */

    public String getCatalogData() {
        return this.catalogData;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @return variant
     */

    public String getVariant() {
        return this.variant;
    }

    /**
     *  <p><code>id</code> of the Embedded <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a>.</p>
     * @return priceId
     */

    public String getPriceId() {
        return this.priceId;
    }

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */

    public String getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */

    public String getNextValue() {
        return this.nextValue;
    }

    /**
     * builds SetPriceKeyChange with checking for non-null required values
     * @return SetPriceKeyChange
     */
    public SetPriceKeyChange build() {
        Objects.requireNonNull(change, SetPriceKeyChange.class + ": change is missing");
        Objects.requireNonNull(catalogData, SetPriceKeyChange.class + ": catalogData is missing");
        Objects.requireNonNull(variant, SetPriceKeyChange.class + ": variant is missing");
        Objects.requireNonNull(priceId, SetPriceKeyChange.class + ": priceId is missing");
        Objects.requireNonNull(previousValue, SetPriceKeyChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetPriceKeyChange.class + ": nextValue is missing");
        return new SetPriceKeyChangeImpl(change, catalogData, variant, priceId, previousValue, nextValue);
    }

    /**
     * builds SetPriceKeyChange without checking for non-null required values
     * @return SetPriceKeyChange
     */
    public SetPriceKeyChange buildUnchecked() {
        return new SetPriceKeyChangeImpl(change, catalogData, variant, priceId, previousValue, nextValue);
    }

    /**
     * factory method for an instance of SetPriceKeyChangeBuilder
     * @return builder
     */
    public static SetPriceKeyChangeBuilder of() {
        return new SetPriceKeyChangeBuilder();
    }

    /**
     * create builder for SetPriceKeyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPriceKeyChangeBuilder of(final SetPriceKeyChange template) {
        SetPriceKeyChangeBuilder builder = new SetPriceKeyChangeBuilder();
        builder.change = template.getChange();
        builder.catalogData = template.getCatalogData();
        builder.variant = template.getVariant();
        builder.priceId = template.getPriceId();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
