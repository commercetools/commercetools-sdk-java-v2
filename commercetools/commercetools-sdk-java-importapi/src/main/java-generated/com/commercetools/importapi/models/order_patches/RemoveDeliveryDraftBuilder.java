
package com.commercetools.importapi.models.order_patches;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveDeliveryDraftBuilder {

    private String id;

    public RemoveDeliveryDraftBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public RemoveDeliveryDraft build() {
        return new RemoveDeliveryDraftImpl(id);
    }

    public static RemoveDeliveryDraftBuilder of() {
        return new RemoveDeliveryDraftBuilder();
    }

    public static RemoveDeliveryDraftBuilder of(final RemoveDeliveryDraft template) {
        RemoveDeliveryDraftBuilder builder = new RemoveDeliveryDraftBuilder();
        builder.id = template.getId();
        return builder;
    }

}
