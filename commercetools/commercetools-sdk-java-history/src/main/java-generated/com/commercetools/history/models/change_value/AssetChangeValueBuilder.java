
package com.commercetools.history.models.change_value;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssetChangeValueBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssetChangeValue assetChangeValue = AssetChangeValue.builder()
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssetChangeValueBuilder implements Builder<AssetChangeValue> {

    private String id;

    private com.commercetools.history.models.common.LocalizedString name;

    /**
     *
     */

    public AssetChangeValueBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     */

    public AssetChangeValueBuilder name(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public AssetChangeValueBuilder name(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    public AssetChangeValue build() {
        Objects.requireNonNull(id, AssetChangeValue.class + ": id is missing");
        Objects.requireNonNull(name, AssetChangeValue.class + ": name is missing");
        return new AssetChangeValueImpl(id, name);
    }

    /**
     * builds AssetChangeValue without checking for non null required values
     */
    public AssetChangeValue buildUnchecked() {
        return new AssetChangeValueImpl(id, name);
    }

    public static AssetChangeValueBuilder of() {
        return new AssetChangeValueBuilder();
    }

    public static AssetChangeValueBuilder of(final AssetChangeValue template) {
        AssetChangeValueBuilder builder = new AssetChangeValueBuilder();
        builder.id = template.getId();
        builder.name = template.getName();
        return builder;
    }

}
