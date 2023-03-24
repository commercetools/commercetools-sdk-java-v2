
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AssetBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Asset asset = Asset.builder()
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .description(descriptionBuilder -> descriptionBuilder)
 *             .custom(customBuilder -> customBuilder)
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssetBuilder implements Builder<Asset> {

    private String id;

    private com.commercetools.history.models.common.LocalizedString name;

    private com.commercetools.history.models.common.LocalizedString description;

    private com.commercetools.history.models.common.CustomFields custom;

    private String key;

    /**
     *
     * @param id value to be set
     * @return Builder
     */

    public AssetBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     * @param builder function to build the name value
     * @return Builder
     */

    public AssetBuilder name(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param name value to be set
     * @return Builder
     */

    public AssetBuilder name(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *
     * @param builder function to build the description value
     * @return Builder
     */

    public AssetBuilder description(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param description value to be set
     * @return Builder
     */

    public AssetBuilder description(final com.commercetools.history.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *
     * @param builder function to build the custom value
     * @return Builder
     */

    public AssetBuilder custom(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *
     * @param custom value to be set
     * @return Builder
     */

    public AssetBuilder custom(final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *
     * @param key value to be set
     * @return Builder
     */

    public AssetBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.history.models.common.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.history.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public com.commercetools.history.models.common.CustomFields getCustom() {
        return this.custom;
    }

    public String getKey() {
        return this.key;
    }

    /**
     * builds Asset with checking for non-null required values
     * @return Asset
     */
    public Asset build() {
        Objects.requireNonNull(id, Asset.class + ": id is missing");
        Objects.requireNonNull(name, Asset.class + ": name is missing");
        Objects.requireNonNull(description, Asset.class + ": description is missing");
        Objects.requireNonNull(custom, Asset.class + ": custom is missing");
        Objects.requireNonNull(key, Asset.class + ": key is missing");
        return new AssetImpl(id, name, description, custom, key);
    }

    /**
     * builds Asset without checking for non-null required values
     * @return Asset
     */
    public Asset buildUnchecked() {
        return new AssetImpl(id, name, description, custom, key);
    }

    public static AssetBuilder of() {
        return new AssetBuilder();
    }

    public static AssetBuilder of(final Asset template) {
        AssetBuilder builder = new AssetBuilder();
        builder.id = template.getId();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.custom = template.getCustom();
        builder.key = template.getKey();
        return builder;
    }

}
