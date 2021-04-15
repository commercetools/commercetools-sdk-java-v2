
package com.commercetools.api.models.subscription;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface SubscriptionHealthStatus {

    SubscriptionHealthStatus HEALTHY = SubscriptionHealthStatusEnum.HEALTHY;

    SubscriptionHealthStatus CONFIGURATION_ERROR = SubscriptionHealthStatusEnum.CONFIGURATION_ERROR;

    SubscriptionHealthStatus CONFIGURATION_ERROR_DELIVERY_STOPPED = SubscriptionHealthStatusEnum.CONFIGURATION_ERROR_DELIVERY_STOPPED;

    SubscriptionHealthStatus TEMPORARY_ERROR = SubscriptionHealthStatusEnum.TEMPORARY_ERROR;

    enum SubscriptionHealthStatusEnum implements SubscriptionHealthStatus {
        HEALTHY("Healthy"),

        CONFIGURATION_ERROR("ConfigurationError"),

        CONFIGURATION_ERROR_DELIVERY_STOPPED("ConfigurationErrorDeliveryStopped"),

        TEMPORARY_ERROR("TemporaryError");
        private final String jsonName;

        private SubscriptionHealthStatusEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }
    }

    @JsonValue
    String getJsonName();

    String name();

    @JsonCreator
    public static SubscriptionHealthStatus findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new SubscriptionHealthStatus() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }
        });
    }

    public static Optional<SubscriptionHealthStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    public static SubscriptionHealthStatus[] values() {
        return SubscriptionHealthStatusEnum.values();
    }
}
