
package com.commercetools.api.models.product_selection;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * IndividualProductSelectionTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     IndividualProductSelectionType individualProductSelectionType = IndividualProductSelectionType.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class IndividualProductSelectionTypeBuilder implements Builder<IndividualProductSelectionType> {

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>The name of the ProductSelection which is recommended to be unique.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public IndividualProductSelectionTypeBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The name of the ProductSelection which is recommended to be unique.</p>
     * @param name value to be set
     * @return Builder
     */

    public IndividualProductSelectionTypeBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The name of the ProductSelection which is recommended to be unique.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     * builds IndividualProductSelectionType with checking for non-null required values
     * @return IndividualProductSelectionType
     */
    public IndividualProductSelectionType build() {
        Objects.requireNonNull(name, IndividualProductSelectionType.class + ": name is missing");
        return new IndividualProductSelectionTypeImpl(name);
    }

    /**
     * builds IndividualProductSelectionType without checking for non-null required values
     * @return IndividualProductSelectionType
     */
    public IndividualProductSelectionType buildUnchecked() {
        return new IndividualProductSelectionTypeImpl(name);
    }

    /**
     * factory method for an instance of IndividualProductSelectionTypeBuilder
     * @return builder
     */
    public static IndividualProductSelectionTypeBuilder of() {
        return new IndividualProductSelectionTypeBuilder();
    }

    /**
     * create builder for IndividualProductSelectionType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static IndividualProductSelectionTypeBuilder of(final IndividualProductSelectionType template) {
        IndividualProductSelectionTypeBuilder builder = new IndividualProductSelectionTypeBuilder();
        builder.name = template.getName();
        return builder;
    }

}
