
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeValueRelativeChangeValueBuilder {

    private Integer permyriad;

    public ChangeValueRelativeChangeValueBuilder permyriad(final Integer permyriad) {
        this.permyriad = permyriad;
        return this;
    }

    public Integer getPermyriad() {
        return this.permyriad;
    }

    public ChangeValueRelativeChangeValue build() {
        return new ChangeValueRelativeChangeValueImpl(permyriad);
    }

    public static ChangeValueRelativeChangeValueBuilder of() {
        return new ChangeValueRelativeChangeValueBuilder();
    }

    public static ChangeValueRelativeChangeValueBuilder of(final ChangeValueRelativeChangeValue template) {
        ChangeValueRelativeChangeValueBuilder builder = new ChangeValueRelativeChangeValueBuilder();
        builder.permyriad = template.getPermyriad();
        return builder;
    }

}
