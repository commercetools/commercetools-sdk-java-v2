
package com.commercetools.api.models.discount_code;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class DiscountCodeChangeGroupsActionBuilder implements Builder<DiscountCodeChangeGroupsAction> {

    private java.util.List<String> groups;

    public DiscountCodeChangeGroupsActionBuilder groups(final String... groups) {
        this.groups = new ArrayList<>(Arrays.asList(groups));
        return this;
    }

    public DiscountCodeChangeGroupsActionBuilder groups(final java.util.List<String> groups) {
        this.groups = groups;
        return this;
    }

    public DiscountCodeChangeGroupsActionBuilder plusGroups(final String... groups) {
        if (this.groups == null) {
            this.groups = new ArrayList<>();
        }
        this.groups.addAll(Arrays.asList(groups));
        return this;
    }

    public java.util.List<String> getGroups() {
        return this.groups;
    }

    public DiscountCodeChangeGroupsAction build() {
        Objects.requireNonNull(groups, DiscountCodeChangeGroupsAction.class + ": groups is missing");
        return new DiscountCodeChangeGroupsActionImpl(groups);
    }

    /**
     * builds DiscountCodeChangeGroupsAction without checking for non null required values
     */
    public DiscountCodeChangeGroupsAction buildUnchecked() {
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
