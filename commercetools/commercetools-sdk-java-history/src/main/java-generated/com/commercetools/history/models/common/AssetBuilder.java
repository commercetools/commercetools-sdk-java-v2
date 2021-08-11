
package com.commercetools.history.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AssetBuilder implements Builder<Asset> {

    private String id;

    private com.commercetools.history.models.common.LocalizedString name;

    private com.commercetools.history.models.common.LocalizedString description;

    private com.commercetools.history.models.common.CustomFields custom;

    private String key;

    public AssetBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public AssetBuilder name(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public AssetBuilder name(final com.commercetools.history.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public AssetBuilder description(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public AssetBuilder description(final com.commercetools.history.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public AssetBuilder custom(
            Function<com.commercetools.history.models.common.CustomFieldsBuilder, com.commercetools.history.models.common.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.history.models.common.CustomFieldsBuilder.of()).build();
        return this;
    }

    public AssetBuilder custom(final com.commercetools.history.models.common.CustomFields custom) {
        this.custom = custom;
        return this;
    }

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

    public Asset build() {
        Objects.requireNonNull(id, Asset.class + ": id is missing");
        Objects.requireNonNull(name, Asset.class + ": name is missing");
        Objects.requireNonNull(description, Asset.class + ": description is missing");
        Objects.requireNonNull(custom, Asset.class + ": custom is missing");
        Objects.requireNonNull(key, Asset.class + ": key is missing");
        return new AssetImpl(id, name, description, custom, key);
    }

    /**
     * builds Asset without checking for non null required values
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
