
package io.vrap.rmf.base.client.utils.json.modules;

import java.time.ZonedDateTime;

import io.vrap.rmf.base.client.utils.json.modules.deserializers.ZonedDateTimeDeserializer;

import tools.jackson.databind.module.SimpleModule;

public class ZonedDateTimeDeserializationModule extends SimpleModule {

    private static final long serialVersionUID = 0L;

    public ZonedDateTimeDeserializationModule() {
        addDeserializer(ZonedDateTime.class, new ZonedDateTimeDeserializer());
    }

}
