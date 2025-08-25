
package com.commercetools.api.models.subscription;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The health status of the Subscription that indicates whether notifications are being delivered.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface SubscriptionHealthStatus extends JsonEnum {

    /**
    <p>Delivers notifications as expected.</p> */
    SubscriptionHealthStatus HEALTHY = SubscriptionHealthStatusEnum.HEALTHY;
    /**
    <p>Notifications cannot be delivered with the current configuration. Common causes are deleting the Destination queue, deleting access credentials, or removing necessary permissions. You can fix the configuration by re-creating the configuration on the Destination side, or by setting a new configuration with the <span>Change Destination</span> update action. After the configuration is fixed, undelivered notifications will be delivered and the <code>status</code> will change to <a href="https://docs.commercetools.com/apis/ctp:api:type:SubscriptionHealthStatus" rel="nofollow">Healthy</a>. <code>ConfigurationError</code> is automatically turned into <code>ConfigurationErrorDeliveryStopped</code> after some time. For more information, see <span>Delivery Guarantees</span>.</p> */
    SubscriptionHealthStatus CONFIGURATION_ERROR = SubscriptionHealthStatusEnum.CONFIGURATION_ERROR;
    /**
    <p>Does not deliver notifications with the current configuration and the delivery of the notifications is no longer attempted. After the configuration is fixed, undelivered notifications are not retained and will not be delivered. The <code>status</code> will change to <a href="https://docs.commercetools.com/apis/ctp:api:type:SubscriptionHealthStatus" rel="nofollow">Healthy</a> as soon as new notifications can be delivered.</p> */
    SubscriptionHealthStatus CONFIGURATION_ERROR_DELIVERY_STOPPED = SubscriptionHealthStatusEnum.CONFIGURATION_ERROR_DELIVERY_STOPPED;
    /**
    <p>Does not deliver notifications temporarily due to reasons other than a configuration error. For example, the Destination has a temporary outage.</p> */
    SubscriptionHealthStatus TEMPORARY_ERROR = SubscriptionHealthStatusEnum.TEMPORARY_ERROR;
    /**
    <p>Does not deliver notifications with the current configuration and the delivery of the notifications is no longer attempted. Undelivered notifications are not retained and will not be delivered. The <code>status</code> will not automatically change to <a href="https://docs.commercetools.com/apis/ctp:api:type:SubscriptionHealthStatus" rel="nofollow">Healthy</a>. To return your subscriptions to a <a href="https://docs.commercetools.com/apis/ctp:api:type:SubscriptionHealthStatus" rel="nofollow">Healthy</a> status, contact the <span>Composable Commerce support team</span>.</p> */
    SubscriptionHealthStatus MANUALLY_SUSPENDED = SubscriptionHealthStatusEnum.MANUALLY_SUSPENDED;

    /**
     * possible values of SubscriptionHealthStatus
     */
    enum SubscriptionHealthStatusEnum implements SubscriptionHealthStatus {
        /**
         * Healthy
         */
        HEALTHY("Healthy"),

        /**
         * ConfigurationError
         */
        CONFIGURATION_ERROR("ConfigurationError"),

        /**
         * ConfigurationErrorDeliveryStopped
         */
        CONFIGURATION_ERROR_DELIVERY_STOPPED("ConfigurationErrorDeliveryStopped"),

        /**
         * TemporaryError
         */
        TEMPORARY_ERROR("TemporaryError"),

        /**
         * ManuallySuspended
         */
        MANUALLY_SUSPENDED("ManuallySuspended");
        private final String jsonName;

        private SubscriptionHealthStatusEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    /**
     * the JSON value
     * @return json value
     */
    @JsonValue
    String getJsonName();

    /**
     * the enum value
     * @return name
     */
    String name();

    /**
     * convert value to string
     * @return string representation
     */
    String toString();

    /**
     * factory method for a enum value of SubscriptionHealthStatus
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
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

            public String toString() {
                return value;
            }
        });
    }

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<SubscriptionHealthStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static SubscriptionHealthStatus[] values() {
        return SubscriptionHealthStatusEnum.values();
    }

}
