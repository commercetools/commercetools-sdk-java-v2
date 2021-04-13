
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AssetChangeValueBuilder {

    private String id;

    private com.commercetools.history.models.common.LocalizedString name;

    public AssetChangeValueBuilder id(final String id) {
        this.id = id;
        return this;
    }

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
