
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetProductVariantKeyChangeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetProductVariantKeyChange setProductVariantKeyChange = SetProductVariantKeyChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .catalogData("{catalogData}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetProductVariantKeyChangeBuilder implements Builder<SetProductVariantKeyChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    private String catalogData;

    /**
     * set the value to the change
     * @param change value to be set
     * @return Builder
     */

    public SetProductVariantKeyChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public SetProductVariantKeyChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     * @return Builder
     */

    public SetProductVariantKeyChangeBuilder nextValue(final String nextValue) {
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

    public SetProductVariantKeyChangeBuilder catalogData(final String catalogData) {
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
     * builds SetProductVariantKeyChange with checking for non-null required values
     * @return SetProductVariantKeyChange
     */
    public SetProductVariantKeyChange build() {
        Objects.requireNonNull(change, SetProductVariantKeyChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetProductVariantKeyChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetProductVariantKeyChange.class + ": nextValue is missing");
        Objects.requireNonNull(catalogData, SetProductVariantKeyChange.class + ": catalogData is missing");
        return new SetProductVariantKeyChangeImpl(change, previousValue, nextValue, catalogData);
    }

    /**
     * builds SetProductVariantKeyChange without checking for non-null required values
     * @return SetProductVariantKeyChange
     */
    public SetProductVariantKeyChange buildUnchecked() {
        return new SetProductVariantKeyChangeImpl(change, previousValue, nextValue, catalogData);
    }

    /**
     * factory method for an instance of SetProductVariantKeyChangeBuilder
     * @return builder
     */
    public static SetProductVariantKeyChangeBuilder of() {
        return new SetProductVariantKeyChangeBuilder();
    }

    /**
     * create builder for SetProductVariantKeyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetProductVariantKeyChangeBuilder of(final SetProductVariantKeyChange template) {
        SetProductVariantKeyChangeBuilder builder = new SetProductVariantKeyChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        builder.catalogData = template.getCatalogData();
        return builder;
    }

}
