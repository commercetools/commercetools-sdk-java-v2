
package com.commercetools.api.models.state;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StateResourceIdentifierBuilder implements Builder<StateResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    public StateResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    public StateResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public StateResourceIdentifier build() {
        return new StateResourceIdentifierImpl(id, key);
    }

    /**
     * builds StateResourceIdentifier without checking for non null required values
     */
    public StateResourceIdentifier buildUnchecked() {
        return new StateResourceIdentifierImpl(id, key);
    }

    public static StateResourceIdentifierBuilder of() {
        return new StateResourceIdentifierBuilder();
    }

    public static StateResourceIdentifierBuilder of(final StateResourceIdentifier template) {
        StateResourceIdentifierBuilder builder = new StateResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
