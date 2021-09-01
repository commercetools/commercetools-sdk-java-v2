
package com.commercetools.api.models.state;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StateSetDescriptionActionBuilder implements Builder<StateSetDescriptionAction> {

    private com.commercetools.api.models.common.LocalizedString description;

    public StateSetDescriptionActionBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public StateSetDescriptionActionBuilder description(
            final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public StateSetDescriptionAction build() {
        Objects.requireNonNull(description, StateSetDescriptionAction.class + ": description is missing");
        return new StateSetDescriptionActionImpl(description);
    }

    /**
     * builds StateSetDescriptionAction without checking for non null required values
     */
    public StateSetDescriptionAction buildUnchecked() {
        return new StateSetDescriptionActionImpl(description);
    }

    public static StateSetDescriptionActionBuilder of() {
        return new StateSetDescriptionActionBuilder();
    }

    public static StateSetDescriptionActionBuilder of(final StateSetDescriptionAction template) {
        StateSetDescriptionActionBuilder builder = new StateSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
