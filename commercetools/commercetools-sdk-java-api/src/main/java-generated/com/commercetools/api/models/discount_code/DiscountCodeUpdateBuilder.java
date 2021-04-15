
package com.commercetools.api.models.discount_code;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DiscountCodeUpdateBuilder {

    private Long version;

    private java.util.List<com.commercetools.api.models.discount_code.DiscountCodeUpdateAction> actions;

    public DiscountCodeUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public DiscountCodeUpdateBuilder actions(
            final com.commercetools.api.models.discount_code.DiscountCodeUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    public DiscountCodeUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.discount_code.DiscountCodeUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.discount_code.DiscountCodeUpdateAction> getActions() {
        return this.actions;
    }

    public DiscountCodeUpdate build() {
        return new DiscountCodeUpdateImpl(version, actions);
    }

    public static DiscountCodeUpdateBuilder of() {
        return new DiscountCodeUpdateBuilder();
    }

    public static DiscountCodeUpdateBuilder of(final DiscountCodeUpdate template) {
        DiscountCodeUpdateBuilder builder = new DiscountCodeUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
