
package com.commercetools.api.models.discount_code;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.discount_code.DiscountCodeChangeGroupsAction;
import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeChangeGroupsActionBuilder {

    private java.util.List<String> groups;

    public DiscountCodeChangeGroupsActionBuilder groups(final String... groups) {
        this.groups = new ArrayList<>(Arrays.asList(groups));
        return this;
    }

    public DiscountCodeChangeGroupsActionBuilder groups(final java.util.List<String> groups) {
        this.groups = groups;
        return this;
    }

    public java.util.List<String> getGroups() {
        return this.groups;
    }

    public DiscountCodeChangeGroupsAction build() {
        return new DiscountCodeChangeGroupsActionImpl(groups);
    }

    public static DiscountCodeChangeGroupsActionBuilder of() {
        return new DiscountCodeChangeGroupsActionBuilder();
    }

    public static DiscountCodeChangeGroupsActionBuilder of(final DiscountCodeChangeGroupsAction template) {
        DiscountCodeChangeGroupsActionBuilder builder = new DiscountCodeChangeGroupsActionBuilder();
        builder.groups = template.getGroups();
        return builder;
    }

}
