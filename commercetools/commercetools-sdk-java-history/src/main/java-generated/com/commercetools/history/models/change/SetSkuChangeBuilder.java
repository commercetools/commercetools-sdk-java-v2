
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetSkuChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetSkuChange setSkuChange = SetSkuChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .catalogData("{catalogData}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetSkuChangeBuilder implements Builder<SetSkuChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    private String catalogData;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetSkuChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetSkuChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetSkuChangeBuilder nextValue(final String nextValue) {
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

    public SetSkuChangeBuilder catalogData(final String catalogData) {
        this.catalogData = catalogData;
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
     * builds SetSkuChange with checking for non-null required values
     * @return SetSkuChange
     */
    public SetSkuChange build() {
        Objects.requireNonNull(change, SetSkuChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetSkuChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetSkuChange.class + ": nextValue is missing");
        Objects.requireNonNull(catalogData, SetSkuChange.class + ": catalogData is missing");
        return new SetSkuChangeImpl(change, previousValue, nextValue, catalogData);
    }

    /**
     * builds SetSkuChange without checking for non-null required values
     * @return SetSkuChange
     */
    public SetSkuChange buildUnchecked() {
        return new SetSkuChangeImpl(change, previousValue, nextValue, catalogData);
    }

    /**
     * factory method for an instance of SetSkuChangeBuilder
     * @return builder
     */
    public static SetSkuChangeBuilder of() {
        return new SetSkuChangeBuilder();
    }

    /**
     * create builder for SetSkuChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetSkuChangeBuilder of(final SetSkuChange template) {
        SetSkuChangeBuilder builder = new SetSkuChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.catalogData = template.getCatalogData();
        return builder;
    }

}
