
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AssetBuilder {

    private String id;

    private com.commercetools.history.models.LocalizedString name;

    private com.commercetools.history.models.LocalizedString description;

    private com.commercetools.history.models.CustomFields custom;

    private String key;

    public AssetBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public AssetBuilder name(final com.commercetools.history.models.LocalizedString name) {
        this.name = name;
        return this;
    }

    public AssetBuilder description(final com.commercetools.history.models.LocalizedString description) {
        this.description = description;
        return this;
    }

    public AssetBuilder custom(final com.commercetools.history.models.CustomFields custom) {
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

    public com.commercetools.history.models.LocalizedString getName() {
        return this.name;
    }

    public com.commercetools.history.models.LocalizedString getDescription() {
        return this.description;
    }

    public com.commercetools.history.models.CustomFields getCustom() {
        return this.custom;
    }

    public String getKey() {
        return this.key;
    }

    public Asset build() {
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
