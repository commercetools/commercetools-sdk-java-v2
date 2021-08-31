
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetMetaKeywordsChangeBuilder implements Builder<SetMetaKeywordsChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString previousValue;

    private com.commercetools.history.models.common.LocalizedString nextValue;

    public SetMetaKeywordsChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetMetaKeywordsChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetMetaKeywordsChangeBuilder previousValue(
            final com.commercetools.history.models.common.LocalizedString previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetMetaKeywordsChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocalizedStringBuilder, com.commercetools.history.models.common.LocalizedStringBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public SetMetaKeywordsChangeBuilder nextValue(
            final com.commercetools.history.models.common.LocalizedString nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.LocalizedString getNextValue() {
        return this.nextValue;
    }

    public SetMetaKeywordsChange build() {
        Objects.requireNonNull(change, SetMetaKeywordsChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetMetaKeywordsChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetMetaKeywordsChange.class + ": nextValue is missing");
        return new SetMetaKeywordsChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetMetaKeywordsChange without checking for non null required values
     */
    public SetMetaKeywordsChange buildUnchecked() {
        return new SetMetaKeywordsChangeImpl(change, previousValue, nextValue);
    }

    public static SetMetaKeywordsChangeBuilder of() {
        return new SetMetaKeywordsChangeBuilder();
    }

    public static SetMetaKeywordsChangeBuilder of(final SetMetaKeywordsChange template) {
        SetMetaKeywordsChangeBuilder builder = new SetMetaKeywordsChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
