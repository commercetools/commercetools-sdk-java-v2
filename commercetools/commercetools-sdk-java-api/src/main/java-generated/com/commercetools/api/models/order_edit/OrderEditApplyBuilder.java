
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditApplyBuilder {

    private Integer editVersion;

    private Integer resourceVersion;

    public OrderEditApplyBuilder editVersion(final Integer editVersion) {
        this.editVersion = editVersion;
        return this;
    }

    public OrderEditApplyBuilder resourceVersion(final Integer resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    public Integer getEditVersion() {
        return this.editVersion;
    }

    public Integer getResourceVersion() {
        return this.resourceVersion;
    }

    public OrderEditApply build() {
        return new OrderEditApplyImpl(editVersion, resourceVersion);
    }

    public static OrderEditApplyBuilder of() {
        return new OrderEditApplyBuilder();
    }

    public static OrderEditApplyBuilder of(final OrderEditApply template) {
        OrderEditApplyBuilder builder = new OrderEditApplyBuilder();
        builder.editVersion = template.getEditVersion();
        builder.resourceVersion = template.getResourceVersion();
        return builder;
    }

}
