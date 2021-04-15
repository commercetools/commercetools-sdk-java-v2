
package com.commercetools.api.models.payment;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PaymentAddInterfaceInteractionActionBuilder {

    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public PaymentAddInterfaceInteractionActionBuilder type(
            final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public PaymentAddInterfaceInteractionActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public PaymentAddInterfaceInteractionAction build() {
        return new PaymentAddInterfaceInteractionActionImpl(type, fields);
    }

    public static PaymentAddInterfaceInteractionActionBuilder of() {
        return new PaymentAddInterfaceInteractionActionBuilder();
    }

    public static PaymentAddInterfaceInteractionActionBuilder of(final PaymentAddInterfaceInteractionAction template) {
        PaymentAddInterfaceInteractionActionBuilder builder = new PaymentAddInterfaceInteractionActionBuilder();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
