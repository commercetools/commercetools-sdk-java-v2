
package com.commercetools.ml.models.image_search_config;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeStatusUpdateActionBuilder implements Builder<ChangeStatusUpdateAction> {

    private com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status;

    public ChangeStatusUpdateActionBuilder status(
            final com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus status) {
        this.status = status;
        return this;
    }

    public com.commercetools.ml.models.image_search_config.ImageSearchConfigStatus getStatus() {
        return this.status;
    }

    public ChangeStatusUpdateAction build() {
        Objects.requireNonNull(status, ChangeStatusUpdateAction.class + ": status is missing");
        return new ChangeStatusUpdateActionImpl(status);
    }

    /**
     * builds ChangeStatusUpdateAction without checking for non null required values
     */
    public ChangeStatusUpdateAction buildUnchecked() {
        return new ChangeStatusUpdateActionImpl(status);
    }

    public static ChangeStatusUpdateActionBuilder of() {
        return new ChangeStatusUpdateActionBuilder();
    }

    public static ChangeStatusUpdateActionBuilder of(final ChangeStatusUpdateAction template) {
        ChangeStatusUpdateActionBuilder builder = new ChangeStatusUpdateActionBuilder();
        builder.status = template.getStatus();
        return builder;
    }

}
