
package com.commercetools.importapi.json;

import com.commercetools.importapi.models.productvariants.Attributes;
import com.fasterxml.jackson.databind.module.SimpleModule;

import io.vrap.rmf.base.client.utils.json.modules.ModuleOptions;

/**
 * Module to configure the default jackson {@link com.fasterxml.jackson.databind.ObjectMapper} e.g. to deserialize attributes and custom fields
 */
public class ImportApiModule extends SimpleModule {
    private static final long serialVersionUID = 0L;

    public ImportApiModule(ModuleOptions options) {
        setMixInAnnotation(Attributes.class, AttributesMixin.class);
    }
}
