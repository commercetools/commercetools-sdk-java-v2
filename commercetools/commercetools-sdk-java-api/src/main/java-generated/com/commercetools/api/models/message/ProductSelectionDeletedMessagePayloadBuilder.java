
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSelectionDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionDeletedMessagePayload productSelectionDeletedMessagePayload = ProductSelectionDeletedMessagePayload.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSelectionDeletedMessagePayloadBuilder implements Builder<ProductSelectionDeletedMessagePayload> {

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ProductSelectionDeletedMessagePayloadBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */

    public ProductSelectionDeletedMessagePayloadBuilder name(
            final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public ProductSelectionDeletedMessagePayload build() {
        Objects.requireNonNull(name, ProductSelectionDeletedMessagePayload.class + ": name is missing");
        return new ProductSelectionDeletedMessagePayloadImpl(name);
    }

    /**
     * builds ProductSelectionDeletedMessagePayload without checking for non null required values
     */
    public ProductSelectionDeletedMessagePayload buildUnchecked() {
        return new ProductSelectionDeletedMessagePayloadImpl(name);
    }

    public static ProductSelectionDeletedMessagePayloadBuilder of() {
        return new ProductSelectionDeletedMessagePayloadBuilder();
    }

    public static ProductSelectionDeletedMessagePayloadBuilder of(
            final ProductSelectionDeletedMessagePayload template) {
        ProductSelectionDeletedMessagePayloadBuilder builder = new ProductSelectionDeletedMessagePayloadBuilder();
        builder.name = template.getName();
        return builder;
    }

}
