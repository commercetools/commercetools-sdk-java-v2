
package com.commercetools.history.models.label;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitLabelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitLabel businessUnitLabel = BusinessUnitLabel.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitLabelBuilder implements Builder<BusinessUnitLabel> {

    private String key;

    private String name;

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @param key value to be set
     * @return Builder
     */

    public BusinessUnitLabelBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the Business Unit.</p>
     * @param name value to be set
     * @return Builder
     */

    public BusinessUnitLabelBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a>.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the Business Unit.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds BusinessUnitLabel with checking for non-null required values
     * @return BusinessUnitLabel
     */
    public BusinessUnitLabel build() {
        Objects.requireNonNull(key, BusinessUnitLabel.class + ": key is missing");
        Objects.requireNonNull(name, BusinessUnitLabel.class + ": name is missing");
        return new BusinessUnitLabelImpl(key, name);
    }

    /**
     * builds BusinessUnitLabel without checking for non-null required values
     * @return BusinessUnitLabel
     */
    public BusinessUnitLabel buildUnchecked() {
        return new BusinessUnitLabelImpl(key, name);
    }

    /**
     * factory method for an instance of BusinessUnitLabelBuilder
     * @return builder
     */
    public static BusinessUnitLabelBuilder of() {
        return new BusinessUnitLabelBuilder();
    }

    /**
     * create builder for BusinessUnitLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitLabelBuilder of(final BusinessUnitLabel template) {
        BusinessUnitLabelBuilder builder = new BusinessUnitLabelBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        return builder;
    }

}
