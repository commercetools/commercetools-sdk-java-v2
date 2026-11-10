
package com.commercetools.importapi.json;

import com.commercetools.importapi.models.productvariants.Attribute;
import com.commercetools.importapi.models.productvariants.Attributes;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

import tools.jackson.databind.module.SimpleModule;

/**
 * Module to configure the default jackson {@link tools.jackson.databind.ObjectMapper} e.g. to deserialize attributes and custom fields
 */
public class ImportApiModule extends SimpleModule {
    private static final long serialVersionUID = 0L;

    public ImportApiModule(ModuleOptions options) {
        setMixInAnnotation(Attributes.class, AttributesMixin.class);
        setMixInAnnotation(Attribute.class, AttributeMixin.class);
    }
}
