
package com.commercetools.api.predicates.expansion.common;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class ScopedPriceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private ScopedPriceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static ScopedPriceExpansionBuilderDsl of() {
        return new ScopedPriceExpansionBuilderDsl(Collections.emptyList());
    }

    public static ScopedPriceExpansionBuilderDsl of(final List<String> path) {
        return new ScopedPriceExpansionBuilderDsl(path);
    }

    @Override
    public List<String> getPath() {
        return path;
    }

    public com.commercetools.api.predicates.expansion.customer_group.CustomerGroupReferenceExpansionBuilderDsl customerGroup() {
        return com.commercetools.api.predicates.expansion.customer_group.CustomerGroupReferenceExpansionBuilderDsl
                .of(appendOne(path, "customerGroup"));
    }

    public com.commercetools.api.predicates.expansion.channel.ChannelReferenceExpansionBuilderDsl channel() {
        return com.commercetools.api.predicates.expansion.channel.ChannelReferenceExpansionBuilderDsl
                .of(appendOne(path, "channel"));
    }

    public com.commercetools.api.predicates.expansion.common.DiscountedPriceExpansionBuilderDsl discounted() {
        return com.commercetools.api.predicates.expansion.common.DiscountedPriceExpansionBuilderDsl
                .of(appendOne(path, "discounted"));
    }

    public com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl custom() {
        return com.commercetools.api.predicates.expansion.type.CustomFieldsExpansionBuilderDsl
                .of(appendOne(path, "custom"));
    }
}
