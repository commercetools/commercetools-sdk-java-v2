
package com.commercetools.api.models.state;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.state.StateSetDescriptionAction;
import com.commercetools.api.models.state.StateUpdateAction;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StateSetDescriptionActionBuilder {

    private com.commercetools.api.models.common.LocalizedString description;

    public StateSetDescriptionActionBuilder description(
            final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    public StateSetDescriptionAction build() {
        return new StateSetDescriptionActionImpl(description);
    }

    public static StateSetDescriptionActionBuilder of() {
        return new StateSetDescriptionActionBuilder();
    }

    public static StateSetDescriptionActionBuilder of(final StateSetDescriptionAction template) {
        StateSetDescriptionActionBuilder builder = new StateSetDescriptionActionBuilder();
        builder.description = template.getDescription();
        return builder;
    }

}
