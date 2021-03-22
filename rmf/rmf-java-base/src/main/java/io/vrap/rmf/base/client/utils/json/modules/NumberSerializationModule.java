package io.vrap.rmf.base.client.utils.json.modules;

import com.fasterxml.jackson.databind.module.SimpleModule;
import io.vrap.rmf.base.client.utils.json.modules.serializers.DoubleSerializer;

public class NumberSerializationModule extends SimpleModule {
    public NumberSerializationModule() {
        addSerializer(new DoubleSerializer());
    }
}
