
package com.commercetools.api.models.subscription;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The health status of the Subscription that indicates whether messages are being delivered to the Destination.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface SubscriptionHealthStatus extends JsonEnum {

    /**
    	<p>Delivers messages as expected.</p>

    */
    SubscriptionHealthStatus HEALTHY = SubscriptionHealthStatusEnum.HEALTHY;
    /**
    	<p>Messages cannot be delivered with the current configuration. Common causes are deleting the Destination queue, deleting access credentials, or removing the necessary permissions. The configuration can be fixed by re-creating the configuration on the Destination side, or by setting a new configuration with the <a href="/../api/projects/subscriptions#change-destination">Change Destination</a> update action. If the configuration is fixed, undelivered messages will be delivered and the <code>status</code> will change to <a href="ctp:api:type:SubscriptionHealthStatus">Healthy</a>. <code>ConfigurationError</code> is automatically turned into <code>ConfigurationErrorDeliveryStopped</code> after some time. For more information, see <a href="#delivery-guarantees">Delivery Guarantees</a>.</p>

    */
    SubscriptionHealthStatus CONFIGURATION_ERROR = SubscriptionHealthStatusEnum.CONFIGURATION_ERROR;
    /**
    	<p>Does not deliver messages with the current configuration and the delivery of the messages is no longer attempted. If the configuration is fixed, undelivered messages are not retained and will not be delivered. The <code>status</code> will change to <a href="ctp:api:type:SubscriptionHealthStatus">Healthy</a> as soon as new messages can be delivered.</p>

    */
    SubscriptionHealthStatus CONFIGURATION_ERROR_DELIVERY_STOPPED = SubscriptionHealthStatusEnum.CONFIGURATION_ERROR_DELIVERY_STOPPED;
    /**
    	<p>Does not deliver messages temporarily due to reasons other than a configuration error. For example, the Destination has a temporary outage.</p>

    */
    SubscriptionHealthStatus TEMPORARY_ERROR = SubscriptionHealthStatusEnum.TEMPORARY_ERROR;

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
        TEMPORARY_ERROR("TemporaryError");
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
