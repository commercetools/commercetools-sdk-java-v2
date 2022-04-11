
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ExtensionUpdateActionBuilder {

    public com.commercetools.api.models.extension.ExtensionChangeDestinationActionBuilder changeDestinationBuilder() {
        return com.commercetools.api.models.extension.ExtensionChangeDestinationActionBuilder.of();
    }

    public com.commercetools.api.models.extension.ExtensionChangeTriggersActionBuilder changeTriggersBuilder() {
        return com.commercetools.api.models.extension.ExtensionChangeTriggersActionBuilder.of();
    }

    public com.commercetools.api.models.extension.ExtensionSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.extension.ExtensionSetKeyActionBuilder.of();
    }

    public com.commercetools.api.models.extension.ExtensionSetTimeoutInMsActionBuilder setTimeoutInMsBuilder() {
        return com.commercetools.api.models.extension.ExtensionSetTimeoutInMsActionBuilder.of();
    }

    public static ExtensionUpdateActionBuilder of() {
        return new ExtensionUpdateActionBuilder();
    }
}
