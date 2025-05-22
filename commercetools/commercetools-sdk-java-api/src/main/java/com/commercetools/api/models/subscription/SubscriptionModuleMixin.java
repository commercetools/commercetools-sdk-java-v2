
package com.commercetools.api.models.subscription;

import com.commercetools.api.RegisterSimpleModuleMixin;
import com.commercetools.api.SimpleModuleMixin;
import com.fasterxml.jackson.databind.module.SimpleModule;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

@RegisterSimpleModuleMixin
public class SubscriptionModuleMixin implements SimpleModuleMixin {
    public void mixin(SimpleModule module, ModuleOptions options) {
        module.setMixInAnnotation(DeliveryPayload.class, DeliveryPayloadMixin.class);
    }
}
