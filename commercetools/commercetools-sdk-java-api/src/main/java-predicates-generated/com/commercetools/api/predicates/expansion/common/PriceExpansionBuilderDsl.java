
package com.commercetools.api.predicates.expansion.common;

import static com.commercetools.api.predicates.expansion.ExpansionUtil.appendOne;

import java.util.Collections;
import java.util.List;

import com.commercetools.api.predicates.expansion.ExpansionDsl;

public class PriceExpansionBuilderDsl implements ExpansionDsl {

    private final List<String> path;

    private PriceExpansionBuilderDsl(final List<String> path) {
        this.path = path;
    }

    public static PriceExpansionBuilderDsl of() {
        return new PriceExpansionBuilderDsl(Collections.emptyList());
    }

    public static PriceExpansionBuilderDsl of(final List<String> path) {
        return new PriceExpansionBuilderDsl(path);
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

    public com.commercetools.api.predicates.expansion.recurrence_policy.RecurrencePolicyReferenceExpansionBuilderDsl recurrencePolicy() {
        return com.commercetools.api.predicates.expansion.recurrence_policy.RecurrencePolicyReferenceExpansionBuilderDsl
                .of(appendOne(path, "recurrencePolicy"));
    }
}
