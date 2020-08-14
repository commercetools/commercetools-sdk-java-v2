package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionTrigger;
import com.commercetools.api.models.extension.ExtensionUpdateAction;
import com.commercetools.api.models.extension.ExtensionChangeTriggersAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ExtensionChangeTriggersActionBuilder {

    
    private java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers;

    public ExtensionChangeTriggersActionBuilder triggers( final java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    
    public java.util.List<com.commercetools.api.models.extension.ExtensionTrigger> getTriggers(){
        return this.triggers;
    }

    public ExtensionChangeTriggersAction build() {
        return new ExtensionChangeTriggersActionImpl(triggers);
    }

    public static ExtensionChangeTriggersActionBuilder of() {
        return new ExtensionChangeTriggersActionBuilder();
    }

    public static ExtensionChangeTriggersActionBuilder of(final ExtensionChangeTriggersAction template) {
        ExtensionChangeTriggersActionBuilder builder = new ExtensionChangeTriggersActionBuilder();
        builder.triggers = template.getTriggers();
        return builder;
    }

}
