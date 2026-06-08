
package com.commercetools.api.models.subscription;

import com.commercetools.api.RegisterSimpleModuleMixin;
import com.commercetools.api.SimpleModuleMixin;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

import tools.jackson.databind.module.SimpleModule;

@RegisterSimpleModuleMixin
public class SubscriptionModuleMixin implements SimpleModuleMixin {
    public void mixin(SimpleModule module, ModuleOptions options) {
        module.setMixInAnnotation(DeliveryPayload.class, DeliveryPayloadMixin.class);
    }
}
